<%-- 
    Document   : quotes
    Created on : Apr 29, 2017, 9:16:04 PM
    Author     : PRABHAT RANJAN
--%>



     <%@page import="java.io.BufferedReader"%>
<%@page import="org.jsoup.Jsoup" import="java.io.IOException"%>
                  <%@page import="org.jsoup.nodes.Document;"%>
                   <%@page import="org.jsoup.nodes.Element;"%>
                  <%@page import="org.jsoup.select.Elements;"%>
                  <%@page import="java.io.FileReader"%>
    
<%
   String company=request.getParameter("comp"); 
  if(company.equalsIgnoreCase("hd"))
  {
    
   String site = new String("hd.jsp");
   response.setStatus(response.SC_MOVED_TEMPORARILY);
   response.setHeader("Location", site); 
       
   
   
 

      
  }else if(company.equalsIgnoreCase("ibm"))
  {
      
       String site = new String("ibm.jsp");
   response.setStatus(response.SC_MOVED_TEMPORARILY);
   response.setHeader("Location", site); 
       
  }
   else if(company.equalsIgnoreCase("appl"))
  {
      
       String site = new String("appl.jsp");
   response.setStatus(response.SC_MOVED_TEMPORARILY);
   response.setHeader("Location", site); 
  }
         
      
  
  




   
  
else if(company.equalsIgnoreCase("nke"))
  {
      
      String site = new String("nke.jsp");
   response.setStatus(response.SC_MOVED_TEMPORARILY);
   response.setHeader("Location", site); 
     
   
  }
  else if(company.equalsIgnoreCase("mmm"))
  {
      
       
  
  String site = new String("mmm.jsp");
   response.setStatus(response.SC_MOVED_TEMPORARILY);
   response.setHeader("Location", site); 




  
  }

else if(company.equalsIgnoreCase("unh"))
  {
             
   
  String site = new String("unh.jsp");
   response.setStatus(response.SC_MOVED_TEMPORARILY);
   response.setHeader("Location", site); 
     
  }
else if(company.equalsIgnoreCase("utx"))
  {
      
      
  String site = new String("utx.jsp");
   response.setStatus(response.SC_MOVED_TEMPORARILY);
   response.setHeader("Location", site);  
  
  }
else if(company.equalsIgnoreCase("pfe"))
  {
      
       String site = new String("pfe.jsp");
   response.setStatus(response.SC_MOVED_TEMPORARILY);
   response.setHeader("Location", site);  
  
  
   
  }
else if(company.equalsIgnoreCase("dis"))
  {
      
        String site = new String("dis.jsp");
   response.setStatus(response.SC_MOVED_TEMPORARILY);
   response.setHeader("Location", site);  
  
   
  }
else if(company.equalsIgnoreCase("jnj"))
  {
      
       String site = new String("jnj.jsp");
   response.setStatus(response.SC_MOVED_TEMPORARILY);
   response.setHeader("Location", site); 
  
  }
  

else if(company.equalsIgnoreCase("msft"))
  {
      
      String site = new String("mstf.jsp");
   response.setStatus(response.SC_MOVED_TEMPORARILY);
   response.setHeader("Location", site); 
  
  }
  

else if(company.equalsIgnoreCase("ge"))
  {
      
       String site = new String("ge.jsp");
   response.setStatus(response.SC_MOVED_TEMPORARILY);
   response.setHeader("Location", site); 
  
  }
else if(company.equalsIgnoreCase("ko"))
  {
      
       String site = new String("ko.jsp");
   response.setStatus(response.SC_MOVED_TEMPORARILY);
   response.setHeader("Location", site); 
  
   
  }
  

else if(company.equalsIgnoreCase("wmt"))
  {
      String site = new String("wmt.jsp");
   response.setStatus(response.SC_MOVED_TEMPORARILY);
   response.setHeader("Location", site); 
  
      
  
   
  }
  
else if(company.equalsIgnoreCase("mrk"))
  {
      
       String site = new String("mrk.jsp");
   response.setStatus(response.SC_MOVED_TEMPORARILY);
   response.setHeader("Location", site); 
  
  
   
  }
  

else if(company.equalsIgnoreCase("cat"))
  {
      
       String site = new String("cat.jsp");
   response.setStatus(response.SC_MOVED_TEMPORARILY);
   response.setHeader("Location", site); 
      
  
   
  }
  
else if(company.equalsIgnoreCase("trv"))
  {
      
      String site = new String("trv.jsp");
   response.setStatus(response.SC_MOVED_TEMPORARILY);
   response.setHeader("Location", site); 
  
   
  }
  
else if(company.equalsIgnoreCase("pg"))
  {
      String site = new String("pg.jsp");
   response.setStatus(response.SC_MOVED_TEMPORARILY);
   response.setHeader("Location", site); 
       
  
   
  }

    %>


   
  



 


