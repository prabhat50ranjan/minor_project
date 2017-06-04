package Prediction;

import Prediction.DataNormalization;
import Prediction.ZeroMeanOneVarianceNormalization;
import Prediction.ZeroToOneNormalization;
import Prediction.PCA;
import Prediction.PCAHelper;

/**
 *
 * @author Avi
 */
public class DataPreprocessing {
    
    private DataNormalization dataNormalization;
    private PCA pca = null;
    private boolean normalizationOnly = false;
    
    public DataPreprocessing(boolean normalizationOnly) {
        dataNormalization = new ZeroToOneNormalization();
        this.normalizationOnly = normalizationOnly;
    }
    
    public DataPreprocessing(DataNormalization dataNormalization, boolean normalizationOnly) {
        this.dataNormalization = dataNormalization;
        this.normalizationOnly = normalizationOnly;
    }
    
    public double[][] preprocessData(final double[][] data, float cummulativeThreshold) {
        double[][] normalizedData = dataNormalization.normalizeData(data);
        
        if (normalizationOnly)
            return normalizedData;
        
        if (pca == null) {
            pca = new PCA(normalizedData, cummulativeThreshold);
        }
        
        return pca.getDataInReducedPrincipalComponents();
    }
    
    public double[] preprocessData(final double[] data) {
        double[] normalizedData = dataNormalization.normalizeNewData(data);
        
        if (normalizationOnly)
            return normalizedData;
        
        if (pca == null)
            return null;
        
        return pca.calculateDataInPCA(normalizedData);
    }
    
    public double[] undoPreprocess(final double[] data) {
        return dataNormalization.toOriginalData(data);
    }
    
    public double undoPreprocess(int index, double data) {
        return dataNormalization.toOriginalData(index, data);
    }
}
