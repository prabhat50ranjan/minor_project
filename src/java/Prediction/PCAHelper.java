package Prediction;

import java.util.ArrayList;
import org.la4j.Matrix;
import org.la4j.Vector;
import org.la4j.matrix.DenseMatrix;
import Prediction.Pair;

/**
 *
 * @author Avi
 */
public class PCAHelper {
    static public void bubbleSort(Pair<Vector, Double>[] array) {
        for (int i = 0; i < array.length; ++i)
            for (int j = array.length - 1; j > i ; --j) {
                Pair<Vector, Double> former = array[j - 1];
                Pair<Vector, Double> latter = array[j];
                
                if (former.second < latter.second) {
                    // swap the two
                    array[j - 1] = latter;
                    array[j] = former;
                }
            }
    }
    
    static public Pair<Vector, Double>[] convertLa4jEigenMatrixToPair(Matrix[] matrix) {
        //ArrayList<Pair<Vector, Double>> eigenVectorsValues = new ArrayList<>(matrix[0].columns());
        Pair<Vector, Double>[] eigenVectorsValues = new Pair[matrix[0].columns()];
        
        for (int row = 0; row < matrix[0].columns(); ++row) {
            Vector eigenvector = matrix[0].getColumn(row);
            double eigenvalue = matrix[1].get(row, row);
            
            //eigenVectorsValues.add(row, new Pair<>(eigenvector, eigenvalue));
            eigenVectorsValues[row] = new Pair<>(eigenvector, eigenvalue);
        }
        
        return eigenVectorsValues;
    }
    
    static public Matrix convertEigenPairsToLa4jMatrix(Pair<Vector, Double>[] eigenVectorsValues) {
        double[][] tmpMatrix = new double[eigenVectorsValues.length][];
        for (int i = 0; i < tmpMatrix.length; ++i)
            tmpMatrix[i] = eigenVectorsValues[i].first.toDenseVector().toArray();
        return DenseMatrix.from2DArray(tmpMatrix);
    }
}
