<%-- 
    Document   : stockwatchlist
    Created on : May 2, 2017, 9:16:08 PM
    Author     : PRABHAT RANJAN
--%>

<%@page import="java.sql.*;"%>
<%@page import="java.io.*;"%>

<%

    String uname=(String)session.getAttribute("user");
   
    
   
    final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    final String DB_URL = "jdbc:mysql://localhost/prabhat";

  
    final String USER = "root";
    final String PASS = "root";
   
  
   Connection conn = null;
   Statement stmt = null;
   String query="select name,company from stocks";
   try{
     
      Class.forName("com.mysql.jdbc.Driver");

      
      out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      out.println("Connected database successfully...");
      
      
      out.println("Creating statement...");
      
      
      
      PreparedStatement ps=conn.prepareStatement(query);
       
       
      ResultSet rs = ps.executeQuery(query);
      
      while(rs.next()){
          
         
         String name=rs.getString("name");
         String comp = rs.getString("company");
         if(name.equalsIgnoreCase(uname)){
             out.write(comp);
             out.write("<br><br>");
         }
         else{
         out.write("");
         }
        
         
         
         
         
      }
      rs.close();
   }catch(SQLException se){
      
      se.printStackTrace();
   }catch(Exception e){
     
      e.printStackTrace();
   }finally{
      
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }
   }
   

%>