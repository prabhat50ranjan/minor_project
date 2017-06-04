<%-- 
    Document   : index3
    Created on : Apr 17, 2017, 8:48:24 PM
    Author     : PRABHAT RANJAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script type = "text/javascript" language = "javascript">
         $(document).ready(function() {
            $("#driver").click(function(event){
               $("#stage").load('prediction.jsp');
            });
         });
      </script>

        
       <link rel = "stylesheet" 
         href = "//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
			
      <script type = "text/javascript" 
         src = "https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
         
         <script type = "text/javascript" 
         src = "https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
		
      <script type = "text/javascript" 
     
      src = "https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.3/jquery-ui.min.js"></script>
      
  
      
      
      <script>
function myFunction() {
    var x = document.getElementById("mySearch").placeholder;
    document.getElementById("demo").innerHTML = x;
}
    </script>  
      <script>
         $(function() {
            var availableTags = [
               "ActionScript",
               "AppleScript",
               "Asp",
               "BASIC",
               "C",
               "C++",
               "Clojure",
               "COBOL",
               "ColdFusion",
               "Erlang",
               "Fortran",
               "Groovy",
               "Haskell",
               "Java",
               "JavaScript",
               "Lisp",
               "Perl",
               "PHP",
               "Python",
               "Ruby",
               "Scala",
               "Scheme"
            ];
				
            $( "#tag" ).autocomplete({
               source: availableTags
            });
				
         });
      </script>
        
        
        
        

		
		
        
        
        
        <link href = "https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css"
         rel = "stylesheet">
      <script src = "https://code.jquery.com/jquery-1.10.2.js"></script>
      <script src = "https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
      
        
      
      
        
        <style>
            
            .panel.panel-info{
                overflow:scroll;
            }         
            

hr {
    display: block;
    height: 1px;
    border: 0;
    border-top: 1px solid #ccc;
    margin: 1em 0;
    padding: 0;
}

.searchbar{
    
    overflow:scroll;
}

#form{
             border-radius: 25px;
           
            padding: 50px;
         }
         #namebox{
             border-radius: 25px;
             padding: 50px;
         }

.mydiv{ margin:10px;padding:12px; border:2px solid #666; width:100px; height:100px;}
      





            .div{
                float:left;width:20%;
            }
        

            
           .div{ margin-left:300px;   width:100px;height:100px} 
            
            
            
           
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
               
                background-color:#1b6d85;
               
                width:100%;
                height:20px;
            }
             
            
            
             .vertical-menu {
    width: 200px; /* Set a width if you like */
}

.vertical-menu a {
    background-color:#eee; /* Grey background color */
    color: black; /* Black text color */
    display: block; /* Make the links appear below each other */
    padding: 12px; /* Add some padding */
    text-decoration: none; /* Remove underline from links */
}

.vertical-menu a:hover {
    background-color:#1b6d85; /* Dark grey background on mouse-over */
}

.vertical-menu a.active {
    background-color: #4CAF50; /* Add a green color to the "active/current" link */
    color: white;
}
            
#container{
    
    overflow:scroll;
}        














            
        
      </style>

   
        
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>dstreet</title>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <script src="bootstrap/scripts/jquery.min.js"></script>
  
   <script src="bootstrap/js/bootstrap.min.js"></script>
   
   
  
  
      
   </head>
   
   
  
   </script>
        <title>DSTREET</title>
    </head>
    <body>
        
       
        <nav id="rcorner1" class = "navbar navbar-default navbar-fixed-top" role = "navigation">
   
   <div class = "navbar-header">
      <img style="border:0px solid red; height:46px; width:120px" src="stock.png" />
             <p class = "navbar-brand"><font face="arial" size="6" color="black">DSTREET</font></p>

      
      
      
   </div>
   
   <div>
      <ul class = "nav navbar-nav navbar-right">
          
          
          
         
         
      </ul>
   </div>
   
</nav>
        <br><br>
  <div style="width:100%;height:200px;background-color:#CCFFFF">
      <button class = "btn bg-success" data-toggle = "modal" style="float:right;position:relative;margin-top:40px" data-target = "#myModal" style="width:100px;height:50px;">
   LOGIN
</button>
            <button class ="btn alert-success" data-toggle = "modal" style="float:right;position:relative;margin-top:40px" data-target = "#myModalregister" style="width:100px;height:90px;">
   REGISTER
</button>

         


<!-- Modal -->
<div class = "modal fade" id = "myModal" tabindex = "-1" style="background-image:url(rrr.png);" role = "dialog" 
   aria-labelledby = "myModalLabel" aria-hidden = "true">
   
   <div class = "modal-dialog">
      <div class = "modal-content">
         
         
         
         
         
         <div class = "modal-footer" style="background-color:#3399FF">
             
             <div id="form" class="login" >   
    <form action="validate.jsp" name="myForm" role="form">
         <div id="element2" class="form-group" align="center">
             
              
           
                
            
             <label for="name"></label><font face="WildWest" size="6" color="#0033FF">Name</font><div style="width:400px;" ><input type="text" name="Name"class = "form-control" id = "name" placeholder = "Enter Name" /></div><br><br>
               

                <label for="password"></label><font face="WildWest" size="6" color="#0033FF">Password</font><div style="width:400px;"><input type="password" name="password"class = "form-control" id = "name" placeholder = "Enter your password" /></div><br><br>
   
             <button type = "submit" class = "btn btn-danger" />LOGIN</button>
            <button type = "button" class = "btn btn-default" data-dismiss = "modal">
               Close
            </button>
            
         </div>
      </form>
   </div>
             
             
            
            
           
         </div>
         
      </div><!-- /.modal-content -->
   </div><!-- /.modal-dialog -->
  
</div>



<div class = "modal fade" id = "myModalregister" tabindex = "-1" role = "dialog" 
     aria-labelledby = "myModalLabel" aria-hidden = "true" style="background-image:url(rrr.png);">
   
   <div class = "modal-dialog">
      <div class = "modal-content">
         
         
         
         
         
          <div class = "modal-footer" style="background-color:#f7e9e9;">
             
            <div id="form" class="register" >   
    <form action="registrationn.jsp" name="myForm" role="form" onsubmit="return(validate());">
         <div id="element2" class="form-group" align="center">
             
              
           
                
            
             <label for="name"></label><font face="WildWest" size="6" color="#0033FF">Name</font><div style="width:400px;" ><input type="text" name="Name"class = "form-control" id = "name" placeholder = "Enter Name" /></div><br><br>
             
            <label for="email"></label><font face="WildWest" size="6" color="#0033FF">Email</font><div style="width:400px;"><input type="text" name="EMail" class = "form-control" id = "name" placeholder = "Enter your email address" /></div><br><br>

                <label for="password"></label><font face="WildWest" size="6" color="#0033FF">Password</font><div style="width:400px;"><input type="password" name="password"class = "form-control" id = "name" placeholder = "Enter your password" /></div><br><br>
   
            <button type = "submit" class = "btn btn-danger" />REGISTER</button>
            
            <button type = "button" class = "btn btn-default" data-dismiss = "modal">
               Close
            </button>
         </div>
      </form>
   </div>
             
             
            
            
           
         </div>
         
      </div><!-- /.modal-content -->
   </div><!-- /.modal-dialog -->
  
</div>








</div>
            
       
      
<nav class = "navbar navbar-default" role = "navigation">
   
   <div class = "navbar-header">
      <a class = "navbar-brand"><font face="WildWest" size="6" color="#FF0033">LIVE STOCK VALUES</font></a>
   </div>
   
   <div>
      <ul class = "nav navbar-nav">
          <li><a ><font face="WildWest" size="6" color="black">NIFTY 50</font><br></br>
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



 <div id="left" class="vertical-menu" style="float:left;width:20%; height:1300px;">
  <a href="#" class="active">Home</a>
 
      
  
      <div class = "ui-widget" style="width:300px;height:800px;">
         <label for = "tag">Tags: </label>
         <input type="text" id= "tag">
         <button type="submit" onclick="index.jsp">SEARCH<button>
      </div>
      
      
      
      
 
  <a href="#">Link 2</a>
  
  
  <input type="search" id="mySearch" placeholder="Search for something..">

<p>Click the button to get the placeholder text of the search field.</p>

<button onclick="index.jsp">Try it</button>
<br><br>
  <a href="#">Link 3</a>
  <a href="#">Link 4</a>
  <a href="#">Link 5</a>
  <p>thijkfm,b xf,m.,fm zmnbngnd,sdn smvnf zknc,mfnd,svjnkdfgngkjn dkn kdv f</p>
  <a href="#">Link 6</a>
</div>


<div class="all_loading" id="container" style="position:relative;margin-top:20px;width:80%;margin-right:0px;margin-bottom:40px;background-color:#f7e9e9;">

<div id="middle">
<div id = "container"  style = "position:relative;margin-right:0px;width:80%;height:300px;">
    
    
    <div id ="predict"  style="position: relative;float:left;margin-left:50px; width:22%; height:300px;">
        
         
      STOCK PRICE PREDICTION TOOL
   
         
        
        <img src="prediction.jpg" alt="PREDICTION IMAGE" id="prediction" style="width:200px;height:200px"></img></a><br>
        
        
        <font size="3" face="WildWest">USE OUR POWERFUL STOCK PREDICTION TOOL</font>
        
        
        
        
        
    </div>
    
    <div id = "middle"  style = "position:relative;margin-left:30px;float:left; width:40%;height:300px;">
      
     STOCK WATCHLIST
   
          
     
     <b><font color=black size=2 face=WildWest>CONDITION OF YOUR LIST</font></b></br>
      <font color=black size=2 face=WildWest>TOP GAINERS</font><br />
      <font color=black size=2 face=WildWest>TOP LOSERS</font><br />
      <font color=black size=2 face=WildWest>FALLING STOCK PRICES</font><br>
      <font color=black size=2 face=WildWest>CHARTS</font><br>
      <font color=black size=2 face=WildWest>NEWS FOR YOUR LIST</font><br>
      <br/>
           
    
    <b><font color=black size=2 face=WildWest>Main Menu</font></b><br />
     <a href="djia.jsp"> <font color=black size=2 face=WildWest>DJIA</font></a><br />
      <font color=black size=2 face=WildWest>INFOSYS</font><br />
      <font color=black size=2 face=WildWest>TCS</font></br>
      
     
        
        
    </div>
    
    <br>
    <div id = "right"  style = "float:left; width:22%;height:300px;">
        
        
      PORTFOLIO MANAGEMENT
   
     
      
      <b><font color=black size=2 face=WildWest>STOCKS</font></b></br>
      <font color=black size=2 face=WildWest>MUTUAL FUNDS</font><br />
      <font color=black size=2 face=WildWest>ULIPS</font><br />
      
      
      
    </div>
    <div id = "right"  style = "float:left; width:22%;height:300px;">
        
        
      TRADING
   
        buy and sell stocks
    </div>
</div>

<br>
<div  id = "container"  style = "position:relative;margin-right:0px;width:80%;height:600px;background-color:#CCFFFF;">
    <div id ="left"  style = "float:left;margin-left:50px; width:30%; height:500px;">
        
      MARKET
   
   
   
      MARKET DETAILS COME HERE
   
        
    </div>
    <div id = "middle"  style = "float:left; width:30%;height:500px;">
        

            TRENDING STOCK MARKET NEWS
        
         
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
                   out.write("<br><font color=black size=4 face=WildWest>"+title+"</font><br>");

                

               out.println(ll.html()); 
                
                }
         }catch(IOException ex) {
            System.out.println(ex.toString());
        }



%>

   
    
   
        
        
        
    </div>

    <div id = "right" style = "float:left; width:30%;height:500px;">
        
      CHARTING
   
   
  
      This is a Basic panel
   
        

    </div>
</div>
 

</div>
</div>
    

      <div id = "stage" style = "background-color:#cc0;">
         STAGE
      </div>
		
      <input type = "button" id = "driver" value = "Load Data" />
        
    </body>
    
   
</html>
