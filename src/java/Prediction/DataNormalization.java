package Prediction;

import Prediction.BasicStatistics;

/**
 *
 * @author Avi
 */

public interface DataNormalization {
    double[][] normalizeData(double[][] data);
    double[] normalizeNewData(double[] data);
    double normalizeNewData(int index, double newData);
    
    double toOriginalData(int index, double normalizedData);
    double[] toOriginalData(double[] normalizedData);
}
