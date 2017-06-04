<%-- 
    Document   : registrationn.jsp
    Created on : Mar 9, 2017, 7:21:02 AM
    Author     : PRABHAT RANJAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    

    
    
<%@ page import="java.util.Date"%> 
<%@ page  import="java.sql.*" %>
         <% 
            String uname=request.getParameter("Name");
            out.println(uname);
    String uemail=request.getParameter("EMail");
    out.println(uemail);
    String upass=request.getParameter("password");
    out.println(upass);
    
  
    final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   final String DB_URL = "jdbc:mysql://localhost/prabhat";

   //  Database credentials
   final String USER = "root";
   final String PASS = "root";
   
  
   Connection conn = null;
   Statement stmt = null;
   String query="insert into signup values(?,?,?)";
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      PreparedStatement ps=conn.prepareStatement(query);
      ps.setString(1,uname);
      ps.setString(2,uemail);
      ps.setString(3,upass);
      ps.executeUpdate();
     // out.println("Inserted records into the table...");

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
   out.println("Goodbye!");
//end main
//end JDBCExample
  %>  
  
  <jsp:forward page="watchlist2.jsp" /> 
 
    
</html>
