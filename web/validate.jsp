<%-- 
    Document   : validate.jsp
    Created on : Mar 19, 2017, 10:59:50 AM
    Author     : PRABHAT RANJAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.sql.*"%>
<%
    

String uname=request.getParameter("Name");
            out.println(uname);
    session.setAttribute("user",uname);
    
    String upass=request.getParameter("password");
    out.println(upass);
  
   final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   final String DB_URL = "jdbc:mysql://localhost/prabhat";

  
   final String USER = "root";
   final String PASS = "root";
   
   
  
   Connection conn = null;
   Statement stmt = null;
   String query="select uname,upass from signup";
   
  
   try{
      
      Class.forName("com.mysql.jdbc.Driver");

      
     
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      
        
     
      stmt = conn.createStatement();
      PreparedStatement ps=conn.prepareStatement(query);
      //ps.setString(1,"prabhat");
     /// String sql = "SELECT upass FROM signup"+"WHERE uname='prabhat'";
      ResultSet rs=ps.executeQuery(query);  
      //STEP 5: Extract data from result set
      
         //Retrieve by column name
        // rs.absolute(1);
        while(rs.next())
        { 
            
         String pass=rs.getString("upass");
        String name=rs.getString("uname");
        String x=pass;
  if(uname.equalsIgnoreCase(name))
  {
     if(upass.equals(pass)){
     //session.setAttribute("user",pass);
     String site = new String("logged.jsp");
   response.setStatus(response.SC_MOVED_TEMPORARILY);
   response.setHeader("Location", site);
     }
     else
     {
          String site = new String("login_error.jsp");
   response.setStatus(response.SC_MOVED_TEMPORARILY);
   response.setHeader("Location", site);
     }//Display values
        //out.write("<br></br>USERNMAE"+name);
       
      
      
  }
   }
        String nx=(String)session.getAttribute("user");  
         out.print("Hello "+nx);  
        
       
         
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
   out.println("Goodbye!");


%>

