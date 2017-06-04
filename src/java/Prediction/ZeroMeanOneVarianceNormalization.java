package Prediction;

import Prediction.BasicStatistics;

/**
 *
 * @author Avi
 */

public class ZeroMeanOneVarianceNormalization implements DataNormalization {

    private double[] means;
    private double[] standardDeviation;
    
    @Override
    public double[][] normalizeData(double[][] data) {
        findMeans(data);
        findStandardDeviation(data);
        
        double[][] normalizedData = new double[data.length][data[0].length];
        for (int field = 0; field < data.length; ++field)
            for (int r = 0; r < data[field].length; ++r)
                normalizedData[field][r] = normalizeNewData(field, data[field][r]);
    
        return normalizedData;
    }
    
    @Override
    public double normalizeNewData(int index, double newData) {
        double mean = means[index];
        double variance = standardDeviation[index];
        
        return (newData - mean) / variance;
    }

    @Override
    public double toOriginalData(int index, double normalizedData) {
        double mean = means[index];
        double variance = standardDeviation[index];
    
        return normalizedData * variance + mean;
    }

    @Override
    public double[] normalizeNewData(double[] data) {
        double[] normalizedData = new double[data.length];
        for (int field = 0; field < data.length; ++field)
            normalizedData[field] = normalizeNewData(field, data[field]);
        
        return normalizedData;
    }

    @Override
    public double[] toOriginalData(double[] normalizedData) {
        double[] originalData = new double[normalizedData.length];
        for (int field = 0; field < originalData.length; ++field)
            originalData[field] = toOriginalData(field, normalizedData[field]);
        
        return originalData;
    }

    private void findMeans(double[][] data) {
        means = new double[data.length];
        for (int i = 0; i < means.length; ++i)
            means[i] = BasicStatistics.mean(data[i]);
    }
    
    private void findStandardDeviation(double[][] data) {
        standardDeviation = new double[data.length];
        for (int i = 0; i < standardDeviation.length; ++i)
            standardDeviation[i] = BasicStatistics.standardDeviation(data[i]);
    }
}
