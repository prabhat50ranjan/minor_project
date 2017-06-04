

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       
   
        
        <%
            response.setIntHeader("Refresh",5);
            %>
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
         #rcorner2{
            border-radius: 25px;
            background: #CCFFFF;
            padding: 50px;
            width: 1680px;
            height: 50px;
            background-color:rgba(255,0,0,0.2);
         }
            .animated.swing{
                background-color:#3399FF;
            } 
            
            .footer{
                background-color:#FF00CC;
            }
            .news{
                background-color:white;
            }
              
            
            .sucess{
                
               background-color:#CCFFFF;
            }
            .navbar.navbar-default.navbar-fixed-top{
               
                background-color:#66FF66;
                box-shadow: 10px 10px;
            }
             p{
            text-shadow: 2px 2px red;
         }
            
            
        
      </style>

   
        <style type="text/css">
#element1 {float:left;}
#element2 {float:right;}

</style>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>dstreet.com</title>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
   <script src="bootstrap/scripts/jquery.min.js"></script>
   <script src="bootstrap/js/bootstrap.min.js"></script>
  
   </script>
    </head>
    <body>
    
<nav id="rcorner1" class = "navbar navbar-default navbar-fixed-top" role = "navigation">
   
   <div class = "navbar-header">
      <img style="border:0px solid red; height:100px;" src="stock.png" />
             <p class = "navbar-brand"><font face="Comic sans MS" size="9" color="black">DSTREET.com</font></p>

      
      
      
   </div>
   
   <div>
      <ul class = "nav navbar-nav navbar-right">
          <li class = "active"><a href = "login.jsp"><button type = "button" class = "btn btn-success">LOGIN</button></a></li>
          <li><a href = "signup.jsp"><button type = "button" class = "btn btn-info">REGISTER</button></a></li>
         
         
      </ul>
   </div>
   
</nav>
        
   <div class="sucess">
        <br><br><br><br><br><br><br><br><br>
                                                     
       
    <center>


  <div class="dropdown">
  <button class="dropbtn">WATCHLIST</button>
  <div class="dropdown-content">
    <a href="watchlist.jsp">VIEW WATCHLIST</a>
    <a href="#">ADD COMPANIES TO WATCHLIST</a>
    <a href="#">REMOVE COMPANIES FROM WATCHLIST</a>
    <a href="#">MANAGE WATCHLIST</a>
  </div>
</div>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;
<div class="dropdown">
  <button class="dropbtn">PORTFOLIO MANAGEMENT</button>
  <div class="dropdown-content">
    <a href="worldindices.jsp">STOCKS</a>
    <a href="topgainer.jsp">MUTUAL FUNDS</a>
    <a href="top loser.jsp">ULIPS</a>
    <a href="#">LOANS</a>
    
    
  </div>
  &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;
</div>

<div class="dropdown">
  <button class="dropbtn">MARKET</button>
  <div class="dropdown-content">
    <a href="worldindices.jsp">WORLD INDICES</a>
    <a href="topgainer.jsp">TOP GAINERS</a>
    <a href="top loser.jsp">TOP LOSERS</a>
    <a href="#">STOCKS:MOST ACTIVES</a>
    <a href="#">CURRENCIES</a>
    <a href="#">TOP MUTUAL FUNDS</a>
    <a href="#">COMMODOTIES</a>
    
  </div>
</div>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;

<button type = "button" class = "btn btn-danger">CHARTING</button></center>
   <br>
        </div>
<nav class = "navbar navbar-default" role = "navigation">
   
   <div class = "navbar-header">
      <a class = "navbar-brand"><font face="WildWest" size="6" color="#FF0033">LIVE STOCK VALUES</font></a>
   </div>
   
   <div>
      <ul class = "nav navbar-nav">
          <li class = "active"><a ><font face="WildWest" size="4" color="black">NIFTY 50</font><br></br>
                  <%@page import="org.jsoup.Jsoup" import="java.io.IOException"%>
                  <%@page import="org.jsoup.nodes.Document;"%>
                   <%@page import="org.jsoup.nodes.Element;"%>
                  <%@page import="org.jsoup.select.Elements;"%>
                  <%
   try
         {
         Document doc = Jsoup.connect("https://www.google.co.in/search?site=&source=hp&q=nifty+index&oq=nifty+&gs_l=hp.3.1.0i67k1l2j0i20k1j0i131k1j0i67k1l5j0i131k1.3433.7636.0.14315.13.11.1.1.1.0.212.1499.0j7j2.9.0....0...1c.1.64.hp..2.9.1181.0..0j0i131i67k1j35i39k1.KDkAoIqV4HY").get();
                     Elements elems= doc.select("div._FOc >span._Rnb.fmob_pr.fac-l");
                     for(Element e:elems)
                {
                  out.println(e.text());
                }
         }catch(IOException ex) {
            System.out.println(ex.toString());
        }



%>
                   
                </a></li>
         <li><a ><font face="WildWest" size="6" color="black">DOW JONES INDUSTRIAL AVERAGE</font><br></br>
             <%
   try
         {
         Document doc = Jsoup.connect("https://www.google.co.in/search?q=dow+jones+industrial+average+stock+quotes&oq=dow+jones+INDUSTRIAL+stock+quotes&gs_l=serp.3.0.0i7i30k1.2170492.2182680.0.2184679.24.18.0.0.0.0.267.2550.0j13j2.15.0....0...1c.1.64.serp..9.15.2540...0j0i13k1j0i13i5i30k1j35i39k1j0i67k1j0i30k1j0i8i30k1.9DBIvAvJWgU").get();
                     Elements elems= doc.select("div._FOc >span._Rnb.fmob_pr.fac-l");
                     for(Element e:elems)
                {
                  out.println(e.text());
                }
         }catch(IOException ex) {
            System.out.println(ex.toString());
        }



%>

             </a></li>
             <li><a ><font face="WildWest" size="6" color="black">NASDAQ</font><br></br>
             <%
   try
         {
         Document doc = Jsoup.connect("https://www.google.co.in/search?q=+nasdaq+stock+quotes&oq=+nasdaq+stock+quotes&gs_l=serp.3..0i7i30k1l4j0i20k1j0i7i30k1l5.892598.904077.0.905106.33.23.0.0.0.0.343.3283.0j14j3j1.18.0....0...1c.1.64.serp..17.16.2827...0i7i5i30k1j0i8i7i30k1j35i39k1j0i67k1.4RkMvm0CJQ4").get();
                     Elements elems= doc.select("div._FOc >span._Rnb.fmob_pr.fac-l");
                     for(Element e:elems)
                {
                  out.println(e.text());
                }
         }catch(IOException ex) {
            System.out.println(ex.toString());
        }



%>

<li><a ><font face="WildWest" size="6" color="black">BSE SENSEX</font><br></br>
             <%
   try
         {
         Document doc = Jsoup.connect("https://www.google.co.in/search?q=bse+sensex+stock+quotes&oq=bse+sensex+stock+quotes&gs_l=serp.3...635376.640713.0.640950.16.13.0.0.0.0.351.2290.0j11j0j1.12.0....0...1c.1.64.serp..4.10.1942...0j35i39k1j0i7i30k1j0i67k1j0i20k1j0i30k1j0i13k1j0i8i7i30k1j0i13i30k1j0i13i5i30k1.hXcrVD_jrBw").get();
                     Elements elems= doc.select("div._FOc >span._Rnb.fmob_pr.fac-l");
                     for(Element e:elems)
                {
                  out.println(e.text());
                }
         }catch(IOException ex) {
            System.out.println(ex.toString());
        }



%>
<li><a ><font face="WildWest" size="6" color="black">HAN SENG</font><br></br>
             <%
   try
         {
         Document doc = Jsoup.connect("https://www.google.co.in/search?q=hang+seng+stock+quotes&oq=HAN+stock+quotes&gs_l=serp.3.0.0i7i30k1l2j0i7i5i30k1l2.30640.33198.0.36425.7.7.0.0.0.0.216.1103.0j6j1.7.0....0...1c.1.64.serp..0.7.1095...0i8i7i30k1j35i39k1j0i67k1.waAFEjaRGcc").get();
                     Elements elems= doc.select("div._FOc >span._Rnb.fmob_pr.fac-l");
                     for(Element e:elems)
                {
                  out.println(e.text());
                }
         }catch(IOException ex) {
            System.out.println(ex.toString());
        }



%>
<li><a ><font face="WildWest" size="6" color="black">NIKKEI</font><br></br>
             <%
   try
         {
         Document doc = Jsoup.connect("https://www.google.co.in/search?q=nikkei+stock+quotes&oq=nikkei+stock+quotes&gs_l=serp.3..0j0i5i30k1j0i8i30k1l2.122764.126455.0.127129.17.11.0.0.0.0.328.1670.0j5j2j1.8.0....0...1c.1.64.serp..9.8.1662...0i7i30k1j35i39k1j0i67k1j0i13k1j0i8i7i30k1.0pb1AQeIZkg").get();
                     Elements elems= doc.select("div._FOc >span._Rnb.fmob_pr.fac-l");
                     for(Element e:elems)
                {
                  out.println(e.text());
                }
         }catch(IOException ex) {
            System.out.println(ex.toString());
        }



%>
<li><a ><font face="WildWest" size="6" color="black">TCS</font><br></br>
             <%
   try
         {
         Document doc = Jsoup.connect("https://www.google.co.in/search?q=tcs+stock+quotes&oq=tcs+stock+quotes&gs_l=serp.3..0i30k1.125331.127926.0.130397.9.6.0.0.0.0.226.756.0j4j1.5.0....0...1c.1.64.serp..4.5.749...0i7i30k1j0i13k1j0i8i7i30k1j0i7i5i30k1j0i8i13i30k1j35i39k1j0i67k1.e_0HwM87veU").get();
                     Elements elems= doc.select("div._FOc >span._Rnb.fmob_pr.fac-l");
                     for(Element e:elems)
                {
                  out.println(e.text());
                }
         }catch(IOException ex) {
            System.out.println(ex.toString());
        }



%>
<li><a ><font face="WildWest" size="6" color="black">INFOSYS</font><br></br>
             <%
   try
         {
         Document doc = Jsoup.connect("https://www.google.co.in/search?q=infosys+stock+quotes&oq=infosys+stock+&gs_l=serp.3.1.35i39k1l2j0i67k1j0i20k1j0l6.7825.8966.0.11864.6.6.0.0.0.0.185.532.0j3.3.0....0...1c.1.64.serp..3.3.529...0i22i30k1.dFPBEFJaQC0").get();
                     Elements elems= doc.select("div._FOc >span._Rnb.fmob_pr.fac-l");
                     for(Element e:elems)
                {
                  out.println(e.text());
                }
         }catch(IOException ex) {
            System.out.println(ex.toString());
        }



%>
</ul>
            
         </li>
			
      </ul>
   </div>
   
</nav>               


<table width="100%" border="0">
  <tr>
    <td colspan="2" bgcolor="#b5dcb3">
        <center><font face="WildWest" size="7" color="black">
      <div id="gainer" class="top_gainer">
       
      <h1>
      TOP GAINER
   <!--       
    try
         {
         Document doc = Jsoup.connect("http://www.moneycontrol.com/stocks/marketstats/hourly_gain/nse/curr_hour/").get();
                     Element elems= doc.select("section.colLft >div.clearfix >div.wbg.PA10.brdwht >div.clearfix.MT20 >div.bsr_table.bsr_table930.hist_tbl >table >tbody >tr >td.PR >span.gld13.disin >a").first();
                    
                //for(Element ee:elems){
                    
                                out.println(elems.text());
                                //out.println("<br><br>");
                                //out.println("\n");
                                //break;
              // }
                
                
         }catch(IOException ex) {
            System.out.println(ex.toString());
        }

   
    -->
    <br><br>
      </div>
      
      </h1>
    </td>
  </tr>
  <tr valign="top">
    <td bgcolor="#aaa" width="50">
      <div class="news" style="float:left; width:700px">
        <button type = "button" class = "btn btn-primary btn-lg btn-block" style="width:60%">
            TRENDING STOCK MARKET NEWS</button>
<%@page import="org.jsoup.Jsoup" import="java.io.IOException"%>
<%@page import="org.jsoup.nodes.Document;"%>
<%@page import="org.jsoup.nodes.Element;"%>
<%@page import="org.jsoup.select.Elements;"%>

<%
   try
         {
         Document doc = Jsoup.connect("http://www.moneycontrol.com/news/news-all.html").get();
                     Elements elems= doc.select("div.fleft >ul >li >a >img");
                     

                      
           
           
    
                for(Element ll :elems)
                {
                   String txt=ll.attr("src");
                   String title=ll.attr("alt");


                   
                   

                   out.write("<img src='"+txt+"' style='width:145px; height:82px;'>");
                   out.println("<br><font color=black size=4 face=WildWest>"+title+"</font><br>");

                

               out.println(ll.html()); 
               out.println("\n");
                }
         }catch(IOException ex) {
            System.out.println(ex.toString());
        }



%>

   
    
    </div>
    </td>
    <td bgcolor="#eee" width="100" height="200">
        <div style="width:1100px">
        <button type="button" class="btn btn-success">STOCK QUOTES</button><br>
        <input type="text" name="search" placeholder="SEARCH COMPANY" style="width:200px">
        <center><div id="prediction" class="predict" style="width:200px;">
        <a href="#"><img src="prediction.jpg" alt="PREDICTION IMAGE" style="height:500px; width:500px"></img></a>
        <p1><font size="3" face="WildWest" color="black">USE OUR POWERFUL STOCK PREDICTION TOOL</font></p1>
        
        
        </div>
        </div>
    
     
      
         
     
   <footer class="page-footer blue center-on-small-only">
       <!--Footer Links-->
    <div class="container-fluid">
        <div class="row">
            <!--First column-->
            <div class="col-md-3 offset-md-1">
                <h5 class="title">Footer Content</h5>
                <p>Here you can use rows and columns here to organize your footer content.</p>
            </div>
            <!--/.First column-->

            <hr class="hidden-md-up">

            <!--Second column-->
            <div class="col-md-2 offset-md-1">
                <h5 class="title">Links</h5>
                <ul>
                    <li><a href="#!">Link 1</a></li>
                    <li><a href="#!">Link 2</a></li>
                    <li><a href="#!">Link 3</a></li>
                    <li><a href="#!">Link 4</a></li>
                </ul>
            </div>
            <!--/.Second column-->

            <hr class="hidden-md-up">

            <!--Third column-->
            <div class="col-md-2">
                <h5 class="title">Links</h5>
                <ul>
                    <li><a href="#!">Link 1</a></li>
                    <li><a href="#!">Link 2</a></li>
                    <li><a href="#!">Link 3</a></li>
                    <li><a href="#!">Link 4</a></li>
                </ul>
            </div>
            <!--/.Third column-->

            <hr class="hidden-md-up">

            <!--Fourth column-->
            <div class="col-md-2">
                <h5 class="title">Links</h5>
                <ul>
                    <li><a href="#!">Link 1</a></li>
                    <li><a href="#!">Link 2</a></li>
                    <li><a href="#!">Link 3</a></li>
                    <li><a href="#!">Link 4</a></li>
                </ul>
            </div>
            <!--/.Fourth column-->
        </div>
    </div>
    <!--/.Footer Links-->

    <!--Copyright-->
    <div class="footer-copyright">
        <div class="container-fluid">
            © 2017 Copyright: <a href="https://www.MDBootstrap.com"  rel="nofollow"> MDBootstrap.com </a>

        </div>
    </div>
    <!--/.Copyright-->

</footer>
<!--/.Footer-->
  
   
   


    
          
     
    
  

    </body>
    
    
    
</html>