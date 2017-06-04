package DB;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Connect {

    public static Connection conn = null;


    public static Connection openConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/stock?user='root'&password=");

            
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return conn;
    }

   

  
  
}
