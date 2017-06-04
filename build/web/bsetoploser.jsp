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
         Document doc = Jsoup.connect("http://www.moneycontrol.com/stocks/marketstats/bseloser/index.php").get();
        Elements elems= doc.select("div.bsr_table.hist_tbl_hm >table >tbody >tr >td");
                 out.write("<table border='1'>");  
                  
                
                    for(Element e:elems)
                    {   
                       
                               
                                
                         
                                
                          out.write("<tr>");  
                          out.write("<td>");  
                        out.println(e.text());
                        out.write("</td>");  
                        out.write("</tr>");  
               
                    }
                    
                    out.write("</table>");  
                
         }catch(IOException ex) {
            System.out.println(ex.toString());
        }

   
    %>

          
         