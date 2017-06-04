package Prediction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Avi
 */
public class Maix {

	private static String JDBC_CONNECTION_URL ="jdbc:derby://localhost:1527/Stock";

	
	public static void main(String[] args) {
		try {

			CSVLoader loader = new CSVLoader(getCon());
			loader.loadCSV("//Users/Avi/Desktop/StockDB/AAPL.csv", "AAPL", true);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static Connection getCon() {
		Connection connection = null;
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			connection = DriverManager.getConnection(JDBC_CONNECTION_URL,"avi","root");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connection;
	}
}
