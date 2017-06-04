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
         Document doc = Jsoup.connect("http://www.moneycontrol.com/news/business/personal-finance-business/why-do-you-need-insurance-1253771.html").get();
        Elements elems= doc.select("div#left >article.article_box >p");
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

          
         