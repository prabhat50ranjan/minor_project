<%-- 
    Document   : register
    Created on : Feb 26, 2017, 2:14:49 AM
    Author     : PRABHAT RANJAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.Date"%> 
<%@ page  import="java.sql.*" %>
        Today is: <% 
    final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   final String DB_URL = "jdbc:mysql://localhost/prabhat";

   //  Database credentials
   final String USER = "root";
   final String PASS = "root";
   
  
   Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      out.println("Inserting records into the table...");
      stmt = conn.createStatement();
      
      String sql = "INSERT INTO signup " +
                   "VALUES ('prabhat', 'prabhat50ranjan@gmail.com', '12345678')";
      stmt.executeUpdate(sql);
     
     
      out.println("Inserted records into the table...");

   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
//end main
//end JDBCExample
  %>  
    
