package Prediction;

/**
 *
 * @author Avi
 */
public class BasicStatistics {
    
    public static double mean(final double[] values) {
        double sum = 0.0;
        for (double value : values)
            sum += value;
        
        return sum / values.length;
    }
    
    public static double standardDeviation(final double[] values) {        
        return Math.sqrt(variance(values));
    }
    
    public static double variance(final double[] values) {
        double mean = mean(values);
        double[] meanSubstractedValues = values.clone();
        double sum = 0.0;
        
        for (int i = 0; i < meanSubstractedValues.length; ++i) {
            double tmp = mean - values[i];
            meanSubstractedValues[i] = tmp * tmp;
            sum += meanSubstractedValues[i];
        }
        
        //return mean(meanSubstractedValues);
        return sum / (meanSubstractedValues.length - 1);
    }
    
    public static double covariance(final double[] x, final double[] y) {
        double meanX = mean(x);
        double meanY = mean(y);
        
        double sum = 0.0;
        for (int i = 0; i < x.length; ++i)
            sum += (meanX - x[i]) * (meanY - y[i]);
        
        return sum / (x.length - 1);
    }
    
    public static double correlation(final double[] x, final double[] y) {
        double cov = covariance(x, y);
        double sdX = standardDeviation(x);
        double sdY = standardDeviation(y);
        
        //sdX = Math.sqrt(sdX * sdX * x.length / (x.length - 1));
        //sdY = Math.sqrt(sdY * sdY * y.length / (y.length - 1));
        
        return cov / (sdX * sdY);
    }
    
    public static double[][] covarianceMatrix(final double[][] values) {
        double covarianceMatrix[][] = new double[values.length][values.length];
        
        for (int row = 0; row < values.length; ++row) {
            double[] x = values[row];
            for (int col = 0; col < values.length; ++col) {
                double[] y = values[col];
                covarianceMatrix[row][col] = covariance(x, y);
            }
        }
        
        return covarianceMatrix;
    }
    
    public static double[][] correlationMatrix(final double[][] values) {
        double correlationMatrix[][] = new double[values.length][values.length];
        
        for (int row = 0; row < values.length; ++row) {
            double[] x = values[row];
            for (int col = 0; col < values.length; ++col) {
                double[] y = values[col];
                correlationMatrix[row][col] = correlation(x, y);
            }
        }
        
        return correlationMatrix;
    }
}
