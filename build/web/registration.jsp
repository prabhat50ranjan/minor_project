<%-- 
    Document   : registration
    Created on : Mar 2, 2017, 12:22:43 PM
    Author     : PRABHAT RANJAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@ page  import="java.sql.*" %>

        <%
             final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
             final String DB_URL = "jdbc:mysql://localhost/";

   //  Database credentials
    final String USER = "root";
    final String PASS = "root";
   
   
   Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);

      //STEP 4: Execute a query
      out.println("Creating database...");
      stmt = conn.createStatement();
      
      String sql = "CREATE DATABASE ";
      stmt.executeUpdate(sql);
      out.println("Database created successfully...");
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
   
            %>
    </body>
</html>
