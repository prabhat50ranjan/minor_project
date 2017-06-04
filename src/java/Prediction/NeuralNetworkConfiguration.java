package Prediction;

import java.util.Arrays;

/**
 *
 * @author Avi
 */
public class NeuralNetworkConfiguration {
    
    private double learningRate;
    private int maxIterations;
    private double trainingError;
    private double learningMomentum;
    private double deltaThreshold;
    
    private int numOfHiddenLayers;
    private int[] hiddenLayerNodes;

    private double trainingPercentage;

    public NeuralNetworkConfiguration(double learningRate, int maxIterations, double trainingError, double deltaThreshold, double learningMomentum, int numOfHiddenLayers, int[] hiddenLayerNodes, double trainingPercentage) {
        this.learningRate = learningRate;
        this.maxIterations = maxIterations;
        this.trainingError = trainingError;
        this.deltaThreshold = deltaThreshold;
        this.learningMomentum = learningMomentum;
        this.numOfHiddenLayers = numOfHiddenLayers;
        this.hiddenLayerNodes = new int[4];
        setHiddenLayerNodes(hiddenLayerNodes);
        this.trainingPercentage = trainingPercentage;
    }

    public NeuralNetworkConfiguration() {
        hiddenLayerNodes = new int[4];
    }

    public double getLearningRate() {
        return learningRate;
    }

    public void setLearningRate(double learningRate) {
        this.learningRate = learningRate;
    }

    public int getMaxIterations() {
        return maxIterations;
    }

    public void setMaxIterations(int maxIterations) {
        this.maxIterations = maxIterations;
    }

    public double getTrainingError() {
        return trainingError;
    }

    public void setTrainingError(double trainingError) {
        this.trainingError = trainingError;
    }

    public double getLearningMomentum() {
        return learningMomentum;
    }

    public void setLearningMomentum(double learningMomentum) {
        this.learningMomentum = learningMomentum;
    }

    public int getNumOfHiddenLayers() {
        return numOfHiddenLayers;
    }

    public void setNumOfHiddenLayers(int numOfHiddenLayers) {
        if (numOfHiddenLayers > 4 || numOfHiddenLayers < 1)
            return;
        
        this.numOfHiddenLayers = numOfHiddenLayers;
    }

    public int[] getHiddenLayerNodes() {
        return Arrays.copyOf(hiddenLayerNodes, numOfHiddenLayers);
    }

    public void setHiddenLayerNodes(int[] hiddenLayerNodes) {
        if (hiddenLayerNodes == null || hiddenLayerNodes.length < numOfHiddenLayers)
            return;
        
        for (int i = 0; i < numOfHiddenLayers; ++i)
            this.hiddenLayerNodes[i] = hiddenLayerNodes[i];
        
        for (int i = numOfHiddenLayers; i < 4; ++i)
            this.hiddenLayerNodes[i] = 0;
    }

    public double getTrainingPercentage() {
        return trainingPercentage;
    }

    public void setTrainingPercentage(double trainingPercentage) {
        this.trainingPercentage = trainingPercentage;
    }

    public double getDeltaThreshold() {
        return deltaThreshold;
    }

    public void setDeltaThreshold(double deltaThreshold) {
        this.deltaThreshold = deltaThreshold;
    }
    
    
}
