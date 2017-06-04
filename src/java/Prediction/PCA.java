package Prediction;

import Prediction.BasicStatistics;
import Prediction.Pair;

import org.la4j.decomposition.EigenDecompositor;
import org.la4j.matrix.DenseMatrix;
import org.la4j.Matrix;
import org.la4j.Vector;

import java.util.ArrayList;

/**
 *
 * @author Avi
 */

public class PCA {    
    private final double[][] centralizedData;
    
    private final Pair<Vector, Double>[] originalEigenVectorsValues;
    private final Pair<Vector, Double>[] reducedEigenVectorsValues;
    
    public PCA(double[][] normalizedDataSet, double cummulativePercentageThreshold) {
        this.centralizedData = centralizeData(normalizedDataSet);
        double[][] covarianceMatrix = BasicStatistics.covarianceMatrix(centralizedData);
        //double[][] correlationMatrix = BasicStatistics.correlationMatrix(centralizedData);
        
        originalEigenVectorsValues = calculateEigenvectorsAndEigenvalues(covarianceMatrix);
        //originalEigenVectorsValues = calculateEigenvectorsAndEigenvalues(correlationMatrix);
        PCAHelper.bubbleSort(originalEigenVectorsValues);
        
        reducedEigenVectorsValues = reducePrincipalComponents(originalEigenVectorsValues, cummulativePercentageThreshold);
    }
    
    private double[][] centralizeData(double[][] normalizedDataSet) {
        double[][] centralizedData = new double[normalizedDataSet.length][normalizedDataSet[0].length];
        
        for (int i = 0; i < centralizedData.length; ++i) {
            double thisFieldMean = BasicStatistics.mean(normalizedDataSet[i]);
            
            for (int j = 0; j < normalizedDataSet[i].length; ++j) {
                centralizedData[i][j] = normalizedDataSet[i][j] - thisFieldMean;
            }
        }
        
        return centralizedData;
    }
    
    public Pair<Vector, Double>[] getEigenVectorsValues() {
        return originalEigenVectorsValues;
    }
    
    public Pair<Vector, Double>[] getReducedEigenVectorsValues() {
        return reducedEigenVectorsValues;
    }
    
    public double[][] getDataInReducedPrincipalComponents() {
        // convert to matrix
        Matrix eigenVectorsMatrix = PCAHelper.convertEigenPairsToLa4jMatrix(reducedEigenVectorsValues);
        
        // convert data to matrix
        Matrix dataMatrix = DenseMatrix.from2DArray(centralizedData);
        
        // convert to principal componenents
        Matrix dataSetInPC = eigenVectorsMatrix.multiply(dataMatrix);
        
        return dataSetInPC.toDenseMatrix().toArray();
    }
    
    public double[] calculateDataInPCA(final double[] data) {
        // convert to matrix
        Matrix eigenVectorsMatrix = PCAHelper.convertEigenPairsToLa4jMatrix(reducedEigenVectorsValues);
        
        // convert data to matrix
        Vector vector = Vector.fromArray(data);
        
        // convert to principal componenents
        Vector dataInPCA = eigenVectorsMatrix.multiply(vector);
        
        return dataInPCA.toDenseVector().toArray();
    }
    
    // making public for testing
    public Pair<Vector, Double>[] calculateEigenvectorsAndEigenvalues(double[][] matrix) {
        DenseMatrix covarianceMatrix = DenseMatrix.from2DArray(matrix);
        
        // decompose covarianceMatrix
        EigenDecompositor decompositor = new EigenDecompositor(covarianceMatrix);
        Matrix[] eigenvectors_values = decompositor.decompose();
        
        return PCAHelper.convertLa4jEigenMatrixToPair(eigenvectors_values);
    }
    
    private Pair<Vector, Double>[] reducePrincipalComponents(Pair<Vector, Double>[] sortedEigenVectorsValues, double cummulativePercentageThreshold) {
        double accumulateEigenValue = 0.0;
        for (int i = 0; i < sortedEigenVectorsValues.length; ++i)
            accumulateEigenValue += sortedEigenVectorsValues[i].second;
        
        ArrayList<Pair<Vector, Double>> reducedEigenVectorsValues = new ArrayList<>();
        
        double accumulateContributionRate = 0.0;
        int i = 0;
        while (accumulateContributionRate < cummulativePercentageThreshold) {
            reducedEigenVectorsValues.add(sortedEigenVectorsValues[i]);
            accumulateContributionRate += sortedEigenVectorsValues[i].second / accumulateEigenValue;
            ++i;
        }
        
        return (Pair<Vector, Double>[])reducedEigenVectorsValues.toArray(
                new Pair[reducedEigenVectorsValues.size()]);
    }
}
