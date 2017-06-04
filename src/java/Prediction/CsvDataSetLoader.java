package Prediction;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import Prediction.Pair;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
import au.com.bytecode.opencsv.CSVReader;
import Prediction.DateUtil;

/**
 *
 * @author Avi
 */
public class CsvDataSetLoader {
    static public TableDataSet loadDataSet(File dataFile, boolean hasHeaders) {
        TableDataSet dataSet = new TableDataSet();
        BufferedReader reader = null;
        
        try {
            reader = new BufferedReader(new FileReader(dataFile));
            String line = null;
            
            if (hasHeaders) {
                line = reader.readLine();
                String columnNames[] = readColumnNames(line);
                dataSet.setColumnNames(columnNames);
            }
            
            while ((line = reader.readLine()) != null) {
                Pair<String, double[]> row = readRow(line);
                dataSet.addRow(row);
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) { }
        }
        
        return dataSet;
    }
    
    static private String[] readColumnNames(String line) {
        return line.split(",");
    }
    
    static private Pair<String, double[]> readRow(String line) {
        String[] columns = line.split(",");
        String[] doubleData = Arrays.copyOfRange(columns, 1, columns.length);
        return new Pair<>(columns[0], readDoubleData(doubleData));
    }
    
    static private double[] readDoubleData(String[] data) {
        double[] doubleData = new double[data.length];
        for (int i = 0; i < doubleData.length; ++i)
            doubleData[i] = Double.parseDouble(data[i]);
        return doubleData;
    }
}