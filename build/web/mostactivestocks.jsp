<%-- 
    Document   : topgainer
    Created on : Mar 20, 2017, 10:11:18 PM
    Author     : PRABHAT RANJAN
--%>



<%@page import="org.jsoup.select.Elements"%>
<%@page import="org.jsoup.nodes.Element"%>
<%@page import="org.jsoup.Jsoup"%>
<%@page import="org.jsoup.nodes.Document"%>
<%@page import="java.io.IOException"%>


    
    
   
    
  
 
  
       
          

    
    
    
    
              <%
    try
         {
         Document doc = Jsoup.connect("https://in.finance.yahoo.com/most-active").get();
        Elements elems= doc.select("table.yfinlist-table");
                 out.write("<table border='1'>");  
                  
                
                    for(Element e:elems)
                    {   
                       
                               
                           
                         
                         
                                
                          out.write("<tr>");  
                          out.write("<td>");  
                        out.println(e.html());
                        out.write("</td>");  
                        out.write("</tr>");  
               
                    
                    }
                    
                    out.write("</table>");  
                
         }catch(IOException ex) {
            System.out.println(ex.toString());
        }

   
    %>

          
         