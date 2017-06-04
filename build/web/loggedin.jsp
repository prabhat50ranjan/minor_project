<%-- 
    Document   : loggedin.jsp
    Created on : Mar 19, 2017, 12:24:23 PM
    Author     : PRABHAT RANJAN
--%>

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
      <title>user logged in</title>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dstreet.com</title>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
   <script src="/scripts/jquery.min.js"></script>
   <script src="bootstrap/js/bootstrap.min.js"></script>
      
     
      
   </head>
   
   <body>
   <nav id="rcorner1" class = "navbar navbar-default navbar-fixed-top" role = "navigation">
   
   <div class = "navbar-header">
      <img style="border:0px solid red; height:100px;" src="stock.png" />
             <p class = "navbar-brand"><font face="Comic sans MS" size="9" color="black">DSTREET.com</font></p>

      
      
      
   </div>
   
   <div>
      <ul class = "nav navbar-nav navbar-right">
          
        

        <a href="index.jsp"><button type = "button" class = "btn btn-danger">LOGOUT</button></a><br>
         
      </ul>
   </div>
   
</nav>
        <div class="sucess">
        <br><br><br><br><br><br><br><br><br>
                                                     
       
    <center>

       <a href="index.jsp"><button type = "button" class = "btn btn-warning">HOME</button></a>&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;

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




</br>

    <br>
    
    
    
    
    
    
    
    
    
    </br>
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
<li><a>
        <font face="WildWest" size="6" color="black">INFOSYS</font><br></br>
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
        <h1>
            
            <center><b> <div id="userinfo" class="userfor" width:40%>
       <%
     String name=(String)session.getAttribute("user");
   out.println("<font color=black size=6 face=WildWest>Welcome  "+name+"</font>");
           %>
       </b>
  </div></center>
        </h1>
    </td>
  </tr>
  <tr valign="top">
    <td bgcolor="#aaa" width="50">
      <div id="choosing_for" clas="choose_table" width:600px;>

       
   
<font color="black" size="6" face="WildWest">YOUR PORTFOLIO</font>
         <ul><a href="#"><font color="#FF0000" size="6" face="WildWest">STOCKS</font></a></ul>
   <ul><a href="#"><font color="#00FF00" size="6" face="WildWest">MUTUAL FUNDS</font></a></ul>
   <ul><a href="#"><font color="#0000FF" size="6" face="WildWest">ULIPS</font></a></ul>
   <ul><a href="#"><font color="#00FFFF" size="6" face="WildWest">LOANS</font></a></ul>
   
       
   </div>
    </td>
    <td bgcolor="#eee" width="100" height="200">
       
        <div id="watch" class="watchlist">
       <font color="black" size="6" face="WildWest">YOUR WATCHLIST</font>
   
   <ul><a href="watchlist.jsp"><font color="#FF0000" size="6" face="WildWest">VIEW WATHCHLIST</font></a></ul>
   <ul><a href="#"><font color="#00FF00" size="6" face="WildWest">ADD COMPANIES TO WATCHLIST</font></a></ul>
   <ul><a href="#"><font color="#0000FF" size="6" face="WildWest">REMOVE COMPANIES FROM WATCHLIST</font></a></ul>
   <ul><a href="#"><font color="#00FFFF" size="6" face="WildWest">MANAGE WATCHLIST</font></a></ul>
   
   </div>
        
        
        <div id="markets" class="market">
    <font color="black" size="6" face="WildWest">MARKETS TRENDING</font>   
    <ul><a href="worldindices.jsp"><font color="#FF0000" size="6" face="WildWest">WORLD INDICES</font></a>></ul>
   <ul><a href="topgainer.jsp"><font color="#00FF00" size="6" face="WildWest">STOCKS:GAINERS</font></a></ul>
   <ul><a href="top loser"><font color="#0000FF" size="6" face="WildWest">STOCKS:LOSERS</font></a></ul>
   <ul><a href="#"><font color="#00FFFF" size="6" face="WildWest">STOCKS:MOST ACTIVES</font></a></ul>
   <ul><a href="#"><font color="#FF00FF" size="6" face="WildWest">CURRENCIES</font></a></ul>
   <ul><a href="#"><font color="black" size="6" face="WildWest">TOP MUTUAL FUNDS</font></a></ul>   
   </div>
        
        
    </td>
  </tr>
  <tr>
    <td colspan="2" bgcolor="#b5dcb3">
      <center>
      <nav id="rcorner2" class = "navbar navbar-default" role = "navigation">
   
   <div class = "navbar-header">
      <a class = "navbar-brand" href = "#">Stock queries</a>
   </div>
   
   <div class="footer">
      <ul class = "nav navbar-nav">
         <li class = "active"><a href = "#">ask</a></li>
         <li><a href = "#">view</a></li>
			
         
			
      </ul>
   </div>
   
</nav>  
      </center>
    </td>
  </tr>
</table>



        
      
   </body>
</html>
