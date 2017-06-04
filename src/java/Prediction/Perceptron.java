package Prediction;

/**
 *
 * @author Avi
 */

public class Perceptron {

    int numInput;
    double[] w;
    double[] wn1;   // weight of (n-1)th

    double bias;
    double biasn1;  // bias of (n-1)th
    double error;

    public Perceptron(int numInput) {
        this.numInput = numInput;
        w = new double[this.numInput];
        wn1 = new double[this.numInput];
        error = 0;
        bias = Math.random();
        biasn1 = 0;
        for (int i = 0; i < this.numInput; i++) {
            w[i] = Math.random();
        }
        for (int i = 0; i < this.numInput; i++) {
            wn1[i] = 0;
        }
    }

    public double getOutput(double[] x) {
        double net = 0;
        for (int i = 0; i < numInput; i++) {
            net += x[i] * w[i];
        }
        return getSigmoid(net + bias);
    }

    public double getSigmoid(double net) {
//        System.out.println("ann.Perceptron.getSigmoid(): "+1 / (1 + Math.exp(-net)));
        return 1 / (1 + Math.exp(-net));
    }
//    public double getSigmoid(double net){
//        if(net >= 0.5)
//            return 1;
//        return 0;
//    }

}
