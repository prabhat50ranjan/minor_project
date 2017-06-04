/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PRABHAT RANJAN
 */
public class Demo extends HttpServlet 
{
    final String DB_URL = "jdbc:mysql://localhost:3306/";
   final String USER = "root";
   final String PASS = "root";
   
   Connection conn = null;
   Statement stmt = null;

    

public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException,IOException
{
  response.setContentType("text/html");
  PrintWriter out=response.getWriter();
  try{
      
      
      conn = DriverManager.getConnection(DB_URL, USER, PASS);

      //STEP 4: Execute a query
     
      stmt = conn.createStatement();
      
      String sql = "CREATE DATABASE ANUBHAV";
      stmt.executeQuery(sql);
      out.println("Database created successfully...");
      
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      out.println("Goodbye!");
      //finally block used to close resources
      try{
         if(stmt!=null)
            stmt.close();
      }catch(SQLException se2){
      }// nothing we can do
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   


  
}

}
