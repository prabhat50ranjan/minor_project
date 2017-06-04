package Prediction;

/**
 *
 * @author Avi
 */
public class ZeroToOneNormalization implements DataNormalization {

    private double[] maximums;
    private double[] minimums;
    
    @Override
    public double[][] normalizeData(double[][] data) {
        findMaximums(data);
        findMinimums(data);
        
        double[][] normalizedData = new double[data.length][data[0].length];
        for (int field = 0; field < data.length; ++field)
            for (int r = 0; r < data[field].length; ++r) {
                normalizedData[field][r] = normalizeNewData(field, data[field][r]);
            }
        
        return normalizedData;
    }

    @Override
    public double normalizeNewData(int index, double newData) {
        double max = maximums[index];
        double min = minimums[index];
        
        return (newData - min) / (max - min);
    }

    @Override
    public double toOriginalData(int index, double normalizedData) {
        double max = maximums[index];
        double min = minimums[index];
        
        return normalizedData * (max - min) + min;
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
        
        for (int field = 0; field < normalizedData.length; ++field)
            originalData[field] = toOriginalData(field, normalizedData[field]);
        
        return originalData;
    }
    
    private void findMaximums(double[][] data) {
        maximums = new double[data.length];
        for (int i = 0; i < maximums.length; ++i)
            maximums[i] = findMaximum(data[i]);
    }
    
    private void findMinimums(double[][] data) {
        minimums = new double[data.length];
        for (int i = 0; i < minimums.length; ++i)
            minimums[i] = findMinimum(data[i]);
    }
    
    private double findMaximum(double[] data) {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < data.length; ++i)
            if (max < data[i])
                max = data[i];
        
        return max;
    }
    
    private double findMinimum(double[] data) {
        double min = Double.MAX_VALUE;
        for (int i = 0; i < data.length; ++i)
            if (min > data[i])
                min = data[i];
        
        return min;
    }
}
