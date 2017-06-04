/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Vector;
import org.neuroph.core.NeuralNetwork;
import org.neuroph.core.learning.SupervisedTrainingElement;
import org.neuroph.core.learning.TrainingElement;
import org.neuroph.core.learning.TrainingSet;
import org.neuroph.nnet.MultiLayerPerceptron;
import org.neuroph.nnet.learning.LMS;

public class CSVReader {

    public static void main(String[] args) {
  int maxIterations = 100000;
  //inputs/no. of layers/output

        NeuralNetwork neuralNet = new MultiLayerPerceptron(4, 3, 1);
        ((LMS) neuralNet.getLearningRule()).setMaxError(0.001);//0-1
        ((LMS) neuralNet.getLearningRule()).setLearningRate(0.7);//0-1
        
        ((LMS) neuralNet.getLearningRule()).setMaxIterations(maxIterations);//0-1
        String csvFile = CSVReader.class.getResource("/datasets/dowjone2.csv").getFile();
        String line = "";
        String cvsSplitBy = ",";
        TrainingSet trainingSet = new TrainingSet();
        int count = 0;
          double daxmax = 10000.0D;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(cvsSplitBy);
                try {
                   
                      
                        System.out.println(""+country[0]+","+country[1]+","+country[2]+","+country[3]+","+country[4]);
                        double d1=Double.parseDouble(country[0])/4;
                        double d2=Double.parseDouble(country[1])/4;
                        double d3=Double.parseDouble(country[2])/4;
                        double d4=Double.parseDouble(country[3])/4;
                        double d5=Double.parseDouble(country[4])/4;
                          trainingSet.addElement(new SupervisedTrainingElement(new double[]{d1 / daxmax, d2 / daxmax, d3 / daxmax, d4 / daxmax}, new double[]{d5 / daxmax}));
     //trainingSet.addElement(new TrainingElement(new double[]{9655.45D / daxmax, 9696.9D / daxmax, 9627.9D / daxmax, 9644.8D / daxmax}));
                        
                   

                } catch (Exception e) {
                    //  e.printStackTrace();
                }
                count++;

              //  System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
      
   neuralNet.learnInSameThread(trainingSet);
       TrainingSet testSet = new TrainingSet();
       //7614.45,7670.4,7552.75,7596.65,7556.3
       //18603.14063,18873.66016,18603.14063,18807.88086,18807.88086
       //18048.12971808402
    //    testSet.addElement(new TrainingElement(new double[]{7614.45D / daxmax, 7670.4D / daxmax, 7552.75D / daxmax, 7556.3D / daxmax}));
        testSet.addElement(new TrainingElement(new double[]{(18603.14063D / daxmax)/4,( 18873.66016D / daxmax)/4, (18603.14063D / daxmax)/4, (18807.88086D / daxmax)/4}));

        for (TrainingElement testElement : testSet.trainingElements()) {
            neuralNet.setInput(testElement.getInput());
            neuralNet.calculate();
            Vector<Double> networkOutput = neuralNet.getOutput();
            System.out.print("Input: " + testElement.getInput());
            System.out.println(" Output: " + networkOutput);
            System.out.println("Final Output: " + networkOutput.get(0)*4);
            
        }
   System.out.println("Time stamp N3:" + new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss:MM").format(new Date()));
       
        System.exit(0);
    }
    
    
    
    public  TrainingSet  loadCSVFile(String filename){
         String csvFile = CSVReader.class.getResource("/datasets/"+filename+"").getFile();
        String line = "";
        String cvsSplitBy = ",";
        TrainingSet trainingSet = new TrainingSet();
     
          double daxmax = 10000.0D;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(cvsSplitBy);
                try {
                   
                      
                        System.out.println(""+country[1]+","+country[2]+","+country[3]+","+country[4]+","+country[6]);
                        double d1=Double.parseDouble(country[1])/4;
                        double d2=Double.parseDouble(country[2])/4;
                        double d3=Double.parseDouble(country[3])/4;
                        double d4=Double.parseDouble(country[4])/4;
                        double d5=Double.parseDouble(country[6])/4;
                          trainingSet.addElement(new SupervisedTrainingElement(new double[]{d1 / daxmax, d2 / daxmax, d3 / daxmax, d4 / daxmax}, new double[]{d5 / daxmax}));
     
                        
                   

                } catch (Exception e) {
                    //  e.printStackTrace();
                }
               

              //  System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
      
        
        return trainingSet;
    
    }
    
    public NeuralNetwork initializeANN(TrainingSet trainingSet){
      int maxIterations = 10000;
    
        NeuralNetwork neuralNet = new MultiLayerPerceptron(4, 3, 1);
        ((LMS) neuralNet.getLearningRule()).setMaxError(0.001);//0-1
        ((LMS) neuralNet.getLearningRule()).setLearningRate(0.7);//0-1
       
        ((LMS) neuralNet.getLearningRule()).setMaxIterations(maxIterations);//0-1
         neuralNet.learnInSameThread(trainingSet);
         return neuralNet;
    }
    public TrainingSet createTestSet(double d1,double d2,double d3,double d4){
        double daxmax = 10000.0D;
     TrainingSet testSet = new TrainingSet();
     d1=d1/4;
     d2=d2/4;
     d3=d3/4;
     d4=d4/4;
    
       //7614.45,7670.4,7552.75,7596.65,7556.3
       //9655.45,9696.9,9627.9,9644.8,9647.5
    //    testSet.addElement(new TrainingElement(new double[]{7614.45D / daxmax, 7670.4D / daxmax, 7552.75D / daxmax, 7556.3D / daxmax}));
        testSet.addElement(new TrainingElement(new double[]{d1 / daxmax, d2 / daxmax, d3 / daxmax, d4 / daxmax}));

    return testSet;
    }
    public double getOutput(NeuralNetwork neuralNet, TrainingSet testSet){
        double output=0;
          for (TrainingElement testElement : testSet.trainingElements()) {
            neuralNet.setInput(testElement.getInput());
            neuralNet.calculate();
            Vector<Double> networkOutput = neuralNet.getOutput();
            System.out.print("Input: " + testElement.getInput());
            System.out.println(" Output: " + networkOutput);
            output=networkOutput.get(0)*10000;
        }
          return output*4;
    }
}
