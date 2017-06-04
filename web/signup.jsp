<html>
   
   <head>
       <style>
            #rcorner1{
            border-radius: 25px;
            background: #8AC007;
            padding: 50px;
            width: 1680px;
            height: 50px;
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
         .register{
             background-image:url("rrr.png");
         }
         
            
        
      </style>

       <style type="text/css">
#element1 {float:left;}
#form {float:right;}
</style>
      <title>SIGNUP</title>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dstreet.com</title>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
   <script src="/scripts/jquery.min.js"></script>
   <script src="bootstrap/js/bootstrap.min.js"></script>
      
     <script type="text/javascript">
        function validate()
      {
      
         if( document.myForm.Name.value == "" )
         {
            alert( "Please provide your name!" );
            document.myForm.Name.focus() ;
            return false;
         }
         
         if( document.myForm.EMail.value =
                 == "" )
         {
            alert( "Please provide your Email!" );
            document.myForm.EMail.focus() ;
            return false;
         }
         
         if( document.myForm.password.value ==
                 ="" ||
         document.myForm.password.value.length !== 5 )
         {
            alert( "Please provide a password in the format #####." );
            document.myForm.password.focus() ;
            return false;
         }
         
         
         return( true );
      }
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
          
         
         
      </ul>
   </div>
   
</nav>
        <div class="sucess">
        <br><br><br><br><br><br><br><br><br>
                                                     
       
    <center>


  <button type = "button" class = "btn btn-success">STOCK WATCHLIST</button>

<
<button type = "button" class = "btn btn-info">PORTFOLIO MANAGEMENT</button>


<button type = "button" class = "btn btn-warning">MARKETS</button>


<button type = "button" class = "btn btn-danger">CHARTING</button></center><br>




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
                     

                      
           // Elements elems= doc.select("div.fleft >ul >li >p");
            //Elements elem=elems.select("div.btitle clearfix");
            //Elements elems=doc.select("div.fleft.btitle");
             
            //Elements ul=elems.select("ul >li > a");
           
    
                for(Element ll :elems)
                {
                   String txt=ll.attr("src");
                   String title=ll.attr("alt");


                   
                   

                   out.write("<img src='"+txt+"' style='width:145px; height:82px;'>");
                   out.println("<br>"+title+"<br>");

                 //System.out.println(ll.attr("src"));
                          //System.out.println(txt);

               out.println(ll.html()); //get all elements inside div
               out.println("\n");
                }
         }catch(IOException ex) {
            System.out.println(ex.toString());
        }



%>

   
    
    </div>
    
    <div id="form" class="register" style="float:right; width:900px; height:500px;">   
    <form action="registrationn.jsp" name="myForm" role="form" onsubmit="return(validate());">
         <div id="element2" class="form-group" align="center">
             
              
           
                
            
             <label for="name"></label><font face="WildWest" size="6" color="#0033FF">Name</font><div style="width:400px;" ><input type="text" name="Name"class = "form-control" id = "name" placeholder = "Enter Name" /></div><br><br>
             
            <label for="email"></label><font face="WildWest" size="6" color="#0033FF">Email</font><div style="width:400px;"><input type="text" name="EMail" class = "form-control" id = "name" placeholder = "Enter your email address" /></div><br><br>

                <label for="password"></label><font face="WildWest" size="6" color="#0033FF">Password</font><div style="width:400px;"><input type="password" name="password"class = "form-control" id = "name" placeholder = "Enter your password" /></div><br><br>
   
            <button type = "submit" class = "btn btn-danger" />REGISTER</td>
            
            
         </div>
      </form>
   </div>
            
    
    
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>

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

           
               
        
      
   </body>
</html>