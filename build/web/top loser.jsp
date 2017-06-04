<%-- 
    Document   : top loser
    Created on : Mar 20, 2017, 10:27:23 PM
    Author     : PRABHAT RANJAN
--%>




<%@page import="java.io.IOException"%>


<html>
   
   <head>
       <style>
           .dropbtn {
    background-color: #4CAF50;
    color: white;
    padding: 10px;
    font-size: 14px;
    border: none;
    cursor: pointer;
}


.dropdown {
    position: relative;
    display: inline-block;
}


.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}


.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
}


.dropdown-content a:hover {background-color: #f1f1f1}


.dropdown:hover .dropdown-content {
    display: block;
}


.dropdown:hover .dropbtn {
    background-color: #3e8e41;
}
           
            #rcorner1{
            border-radius: 25px;
            background: #8AC007;
            padding: 50px;
            width: 1680px;
            height: 50px;
         }
         #watch{
             border-radius: 25px;
            background:#CCFFFF;
            padding: 50px;
            width: 600px;
            height: 400px;
         }
         
         .background{
             background-image:url("background.jpg");
         }
         #userinfo{
             border-radius: 25px;
            background:#FF00CC;
            padding: 50px;
            width: 600px;
            height: 30px;
         }
         #choosing_for{
             border-radius: 25px;
            background:#28a4c9;
            padding: 50px;
            width: 600px;
            height: 400px;
         }
         #markets{
             border-radius: 25px;
            
            padding: 50px;
            width: 600px;
            height: 400px;
         }
         #form{
             border-radius: 25px;
           
            padding: 50px;
         }
         #namebox{
             border-radius: 25px;
             padding: 50px;
         }
         #rcorner2{
            border-radius: 25px;
            background: #330033;
            padding: 50px;
            width: 1680px;
            height: 50px;
         }
            .animated.swing{
                background-color:#3399FF;
            } 
            
            .footer{
                background-color:#FF00CC;
            }
            .news{
                background-color:#330033;
            }
            .sucess{
                
               background-color:#CCFFFF;
            }
            .navbar.navbar-default.navbar-fixed-top{
               
                background-color:#66FF66;
                box-shadow: 10px 10px;
            }
            
            
            .register{
                box-shadow: 10px 10px red; 
            }
             p{
            text-shadow: 2px 2px red;
         }
         .userfor{
             background-color:#269abc
         }
         .choose_table
         {
             background-color:#4cae4c;
         }
         .watchlist{
             background-color:#66FF66;
         }
         
            
        
      </style>

       <style type="text/css">
#element1 {float:left;}
#form {float:right;}
#choosing_for{
    float:left;
}
#markets{
    float:right;
}
</style>
      <title>TOP GAINER</title>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dstreet.com</title>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
   <script src="/scripts/jquery.min.js"></script>
   <script src="bootstrap/js/bootstrap.min.js"></script>
      
     
      
   </head>
   
   <body>
   
   
 
  <center> <div id="userinfo" class="userfor" width:40%>
                <%@page import="org.jsoup.Jsoup" import="java.io.IOException"%>
                  <%@page import="org.jsoup.nodes.Document;"%>
                   <%@page import="org.jsoup.nodes.Element;"%>
                  <%@page import="org.jsoup.select.Elements;"%>
       <%
     String name=(String)session.getAttribute("user");
   out.println("<font color=black size=6 face=WildWest>Welcome  "+name+"</font>");
           %>
           </center>
   <br><br><br><br><br><br><br>  
          
<%
    try
         {
         Document doc = Jsoup.connect("http://www.moneycontrol.com/stocks/marketstats/nseloser/index.php").get();
                     Elements elems= doc.select("div.bsr_table.hist_tbl_hm");
                    
                for(Element ee:elems){
                    
                                out.println(elems.html());
                                //out.println("<br><br>");
                                //out.println("\n");
               }
                
                
         }catch(IOException ex) {
            System.out.println(ex.toString());
        }

   
    %>

           
               
        
      
   </body>
</html>
