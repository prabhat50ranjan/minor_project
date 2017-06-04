package Prediction;

import java.util.Arrays;
import java.util.ArrayList;
import Prediction.Pair;

/**
 *
 * @author Avi
 */

public class TableDataSet {
    
    private String[] columnNames;
    private ArrayList<Pair<String, double[]>> rows;
    private int numOfColumns = -1;
    
    public TableDataSet() {
        rows = new ArrayList<>();
    }
    
    public void setColumnNames(String[] columnNames) {
        if (numOfColumns == -1)
            numOfColumns = columnNames.length;
        else if (numOfColumns != columnNames.length)
            throw new RuntimeException("Column names don't match previously added rows");
        
        this.columnNames = columnNames;
    }
    
    public String[] getColumnNames() {
        return Arrays.copyOfRange(columnNames, 1, columnNames.length);
    }
    
    public Pair<String, double[]> getRow(int rowIndex) {
        return rows.get(rowIndex);
    }
    
    public void addRow(Pair<String, double[]> attributes) {
        if (numOfColumns == -1) {
            // first insertion
            numOfColumns = attributes.second.length + 1;
        } else if (numOfColumns != attributes.second.length + 1)
            throw new RuntimeException("Row doesn't match previously added rows");
        
        rows.add(attributes);
    }
    
    public double[] getColumn(int columnIndex) {
        if (columnIndex >= numOfColumns || columnIndex < 0)
            return null;
        
        double[] column = new double[rows.size()];
        for (int i = 0; i < rows.size(); ++i) {
            double[] col = rows.get(i).second;
            column[i] = col[columnIndex];
        }
        
        return column;
    }
    
    public double[] getColumn(String columnName) {
        if (columnNames == null)
            return null;
        
        int columnIndex = getColumnIndexOf(columnName);
        return getColumn(columnIndex);
    }
    
    public int getColumnIndexOf(String columnName) {
        int i = 0;
        for (String name : columnNames) {
            if (name.equals(columnName))
                return i;
            i++;
        }
        
        // not found
        return -1;
    }
    
    public int getNumOfColumns() {
        return numOfColumns;
    }
    
    public int getNumOfRows() {
        return rows.size();
    }
    
    public double[][] to2dArrayRecordEach() {
        double[][] array2d = new double[rows.size()][rows.get(0).second.length];
        
        for (int r = 0; r < array2d.length; ++r) 
            System.arraycopy(rows.get(r).second, 0, array2d[r], 0, rows.get(r).second.length);
        
        return array2d;
    }
    
    public double[][] to2dArrayFieldEach() {
        double[][] array2d = new double[rows.get(0).second.length][rows.size()];
        
        for (int i = 0; i < rows.size(); ++i) {
            double[] values = rows.get(i).second;
            
            for (int f = 0; f < values.length; ++f)
                array2d[f][i] = values[f];
        }
        
        return array2d;
    }
}
