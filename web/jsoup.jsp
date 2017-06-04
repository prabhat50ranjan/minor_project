<%-- 
    Document   : jsoup
    Created on : Mar 12, 2017, 11:27:40 PM
    Author     : PRABHAT RANJAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="org.jsoup.Jsoup" import="java.io.IOException"%>
<%@page import="org.jsoup.nodes.Document;"%>
<%@page import="org.jsoup.nodes.Element;"%>
<%@page import="org.jsoup.select.Elements;"%>

<%
   try
         {
         Document doc = Jsoup.connect("http://www.moneycontrol.com/news/news-all.html").get();
                     Elements elems= doc.select("div.fleft >ul >li >a >img");
                     

                      
           // Elements elems= doc.select("div.fleft >ul >li >p");
            //Elements elem=elems.select("div.btitle clearfix");
            //Elements elems=doc.select("div.fleft.btitle");
             
            //Elements ul=elems.select("ul >li > a");
           
    
                for(Element ll :elems)
                {
                   String txt=ll.attr("src");

                   
                   

                   out.println("txt is"+txt);
                   out.write("<img src='"+txt+"' style='width:145px; height:82px;'>");
                 //System.out.println(ll.attr("src"));
                          //System.out.println(txt);

               out.println(ll.html()); //get all elements inside div
               out.println("====================");
                }
         }catch(IOException ex) {
            System.out.println(ex.toString());
        }



%>

        