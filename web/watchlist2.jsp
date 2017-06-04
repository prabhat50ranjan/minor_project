<html>

   <head>
      <title>DSTREET</title>
      <script type = "text/javascript" 
         src = "https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
         
         <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <script src="bootstrap/scripts/jquery.min.js"></script>
        <link rel = "stylesheet" 
         href = "//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
			
      <script type = "text/javascript" 
         src = "https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
         
         <script type = "text/javascript" 
         src = "https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
  
   <script src="bootstrap/js/bootstrap.min.js"></script>
		
      <script type = "text/javascript" language = "javascript">
         $(document).ready(function() {
            $("#stage").click(function(event){
               $('#driver').load('prediction.jsp');
            });
         });
      </script>
      
      <script>
    $(document).on("click", "#predection", function () { // When HTML DOM "click" event is invoked on element with ID "somebutton", execute the following function...
        var data = {
            foo: document.getElementById('mydiv').value

        };
        $.get("predection", data, function (responseText) {   // Execute Ajax GET request on URL of "someservlet" and execute the following function with Ajax response text...

            document.getElementById('mydiv').value = responseText;
            //$("#mydiv").value(responseText);
            // Locate HTML DOM element with ID "somediv" and set its text content with the response text.


        });
    });

</script>
      
      
      <script>
          function loadtopgainer()
          {
              var xhttp=new XMLHttpRequest();
              xhttp.onreadystatechange=function()
              {
               if(this.readyState===4&&this.status===200)
               {
                   document.getElementById("container").innerHTML=this.responseText;
                   
               }
                  
                  
              };
              
              xhttp.open("GET","topgainer.jsp",true);
              xhttp.send();
              
          }
          
          
          
          
          </script>
      
      
      
      
      
      
      <script>
          function loadprediction()
          {
              var xhttp=new XMLHttpRequest();
              xhttp.onreadystatechange=function(){
                  
                  if(this.readyState===4&&this.status===200)
                  {
                      document.getElementById("container").innerHTML=this.responseText;
                  }
                  
              };
                xhttp.open("GET","prediction.jsp",true);      
                xhttp.send();
              
          }
          
          </script>
     
      
       
 <script>
function aboutme() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState===4&&this.status===200) {
      document.getElementById("container").innerHTML =
      this.responseText;
    }
  };
  xhttp.open("GET", "aboutme.jsp", true);
  xhttp.send();
}
</script>
      


<script type = "text/javascript" language = "javascript">
         $(document).ready(function() {    
               
               $('#predict').hover(function() {
               $( "#predict" ).effect( "shake", {
                  times:1,
                  distance:2
               }, 100, function() {
                  $( this ).css( "background", "white" );
               });
            });
        
        $('.panel.panel-info').hover(function() {
               $( ".panel.panel-info" ).effect( "shake", {
                  times:1,
                  distance:2
               }, 100, function() {
                  $( this ).css( "background", "white" );
               });
            });
            
            $('.portfolio').hover(function() {
               $( ".portfolio" ).effect( "shake", {
                  times:1,
                  distance: 2
               }, 100, function() {
                  $( this ).css( "background", "white" );
               });
            });
            
            
            $('.trading').hover(function() {
               $( ".trading" ).effect( "shake", {
                  times:1,
                  distance:2
               }, 100, function() {
                  $( this ).css( "background", "white" );
               });
               
             });
        
        
        
        $('.market').hover(function() {
               $( ".market" ).effect( "shake", {
                  times:1,
                  distance:2
               }, 100, function() {
                  $( this ).css( "background", "white" );
               });
            });
            
            
            $('.charting').hover(function() {
               $( ".panel panel-info" ).effect( "shake", {
                  times:1,
                  distance:2
               }, 100, function() {
                  $( this ).css( "background", "white" );
               });
            });
            
            
            
            

            
            
        
         });
      </script>
      
      
      
      
      
      
      
      
      
      
      <script>
         $(function() {
            var availableTags = [
               "hd",
               "ibm",
               "aapl",
               "nke",
               "mmm",
               "unh",
               "utx",
               "pfe",
               "dis",
               "jnj",
               "msft",
               "ge",
               "ko",
               "wmt",
               "mrk",
               "cat",
               "trv",
               "pg",
               "v",
               "dd",
               "xom",
               "mcd",
               "jpm",
               "ba",
               "gs",
               "csco",
               "cvx",
               "axp",
               "vz",
               "intc"
            ];
				
            $( "#tag" ).autocomplete({
               source: availableTags
            });
				
         });
      </script>
        
        
        
        <script>
         $(function() {
            $( "#button-1, #button-2, #button-3, #button-4, #button-5, #button-6, #button-7, #button-8, #button-9, #button-10, #button-11, #button-12, #button-13, #button-14" ).button();
            
         });
      </script>

	 <script>
         $(function() {
            $( "#button-1, #button-2, #button-3, #button-4" ).button();
            $( "#button-5" ).buttonset();
         });
      </script>	
		
        
        
        
        <link href = "https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css"
         rel = "stylesheet">
      <script src = "https://code.jquery.com/jquery-1.10.2.js"></script>
      <script src = "https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
      
        
      
      <script>
function insurance() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState===4&&this.status===200) {
      document.getElementById("container").innerHTML =
      this.responseText;
    }
  };
  xhttp.open("GET", "insurance.jsp", true);
  xhttp.send();
}
</script>
      
      
   <script>
function fixedincome() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState===4&&this.status===200) {
      document.getElementById("container").innerHTML =
      this.responseText;
    }
  };
  xhttp.open("GET", "fixedincome.jsp", true);
  xhttp.send();
}
</script>   
      
<script>
function mutualfunds() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState===4&&this.status===200) {
      document.getElementById("container").innerHTML =
      this.responseText;
    }
  };
  xhttp.open("GET", "mutualfunds.jsp", true);
  xhttp.send();
}
</script>
    
<script>
function tax() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState===4&&this.status===200) {
      document.getElementById("container").innerHTML =
      this.responseText;
    }
  };
  xhttp.open("GET", "tax.jsp", true);
  xhttp.send();
}
</script>
<script>
function investing() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState===4&&this.status===200) {
      document.getElementById("container").innerHTML =
      this.responseText;
    }
  };
  xhttp.open("GET", "investing.jsp", true);
  xhttp.send();
}
</script>
      

<script>
function topnews() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState===4&&this.status===200) {
      document.getElementById("container").innerHTML =
      this.responseText;
    }
  };
  xhttp.open("GET", "topnews.jsp", true);
  xhttp.send();
}
</script>

<script>
function latestnews() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState===4&&this.status===200) {
      document.getElementById("container").innerHTML =
      this.responseText;
    }
  };
  xhttp.open("GET", "latestnews.jsp", true);
  xhttp.send();
}
</script>

<script>
function mostreadnews() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState===4&&this.status===200) {
      document.getElementById("container").innerHTML =
      this.responseText;
    }
  };
  xhttp.open("GET", "mostreadnews.jsp", true);
  xhttp.send();
}
</script>

<script>
function newsvideo() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState===4&&this.status===200) {
      document.getElementById("container").innerHTML =
      this.responseText;
    }
  };
  xhttp.open("GET", "newsvideo.jsp", true);
  xhttp.send();
}
</script>
<script>
function energy() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState===4&&this.status===200) {
      document.getElementById("container").innerHTML =
      this.responseText;
    }
  };
  xhttp.open("GET", "energy.jsp", true);
  xhttp.send();
}
</script>
<script>
function financial() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState===4&&this.status===200) {
      document.getElementById("container").innerHTML =
      this.responseText;
    }
  };
  xhttp.open("GET", "financial.jsp", true);
  xhttp.send();
}
</script>
<script>
function healthcare() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState===4&&this.status===200) {
      document.getElementById("container").innerHTML =
      this.responseText;
    }
  };
  xhttp.open("GET", "healthcare.jsp", true);
  xhttp.send();
}
</script>

<script>
function informationtechnology() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState===4&&this.status===200) {
      document.getElementById("container").innerHTML =
      this.responseText;
    }
  };
  xhttp.open("GET", "informationtechnology.jsp", true);
  xhttp.send();
}
</script>

<script>
function telecomutilies() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState===4&&this.status===200) {
      document.getElementById("container").innerHTML =
      this.responseText;
    }
  };
  xhttp.open("GET", "telecomutilies.jsp", true);
  xhttp.send();
}
</script>
<script>
function fmcg() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState===4&&this.status===200) {
      document.getElementById("container").innerHTML =
      this.responseText;
    }
  };
  xhttp.open("GET", "fmcg.jsp", true);
  xhttp.send();
}
</script>
<script>
function realty() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState===4&&this.status===200) {
      document.getElementById("container").innerHTML =
      this.responseText;
    }
  };
  xhttp.open("GET", "realty.jsp", true);
  xhttp.send();
}
</script>
<script>
function basicmaterials() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState===4&&this.status===200) {
      document.getElementById("container").innerHTML =
      this.responseText;
    }
  };
  xhttp.open("GET", "basicmaterials.jsp", true);
  xhttp.send();
}
</script>

     <script>
function consumerdurables() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState===4&&this.status===200) {
      document.getElementById("container").innerHTML =
      this.responseText;
    }
  };
  xhttp.open("GET", "consumerdurables.jsp", true);
  xhttp.send();
}
</script>
<script>
function industrials() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState===4&&this.status===200) {
      document.getElementById("container").innerHTML =
      this.responseText;
    }
  };
  xhttp.open("GET", "industrials.jsp", true);
  xhttp.send();
}
</script>
<script>
function power() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState===4&&this.status===200) {
      document.getElementById("container").innerHTML =
      this.responseText;
    }
  };
  xhttp.open("GET", "power.jsp", true);
  xhttp.send();
}
</script>
<script>
function auto() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState===4&&this.status===200) {
      document.getElementById("container").innerHTML =
      this.responseText;
    }
  };
  xhttp.open("GET", "auto.jsp", true);
  xhttp.send();
}
</script>
<script>
function stockadvice() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState===4&&this.status===200) {
      document.getElementById("container").innerHTML =
      this.responseText;
    }
  };
  xhttp.open("GET", "stockadvice.jsp", true);
  xhttp.send();
}
</script>

<script>
function topcompanies() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState===4&&this.status===200) {
      document.getElementById("container").innerHTML =
      this.responseText;
    }
  };
  xhttp.open("GET", "topcompanies.jsp", true);
  xhttp.send();
}
</script>
<script>
function technology() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState===4&&this.status===200) {
      document.getElementById("container").innerHTML =
      this.responseText;
    }
  };
  xhttp.open("GET", "technology.jsp", true);
  xhttp.send();
}
</script>

<script>
function property() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState===4&&this.status===200) {
      document.getElementById("container").innerHTML =
      this.responseText;
    }
  };
  xhttp.open("GET", "property.jsp", true);
  xhttp.send();
}
</script>
<script>
function opinion() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState===4&&this.status===200) {
      document.getElementById("container").innerHTML =
      this.responseText;
    }
  };
  xhttp.open("GET", "opinion.jsp", true);
  xhttp.send();
}
</script>
<script>
function startups() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState===4&&this.status===200) {
      document.getElementById("container").innerHTML =
      this.responseText;
    }
  };
  xhttp.open("GET", "startups.jsp", true);
  xhttp.send();
}
</script>
<script>
function commodities() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState===4&&this.status===200) {
      document.getElementById("container").innerHTML =
      this.responseText;
    }
  };
  xhttp.open("GET", "commodities.jsp", true);
  xhttp.send();
}
</script>

<script>
function forum() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState===4&&this.status===200) {
      document.getElementById("container").innerHTML =
      this.responseText;
    }
  };
  xhttp.open("GET", "forum.jsp", true);
  xhttp.send();
}
</script>







        <style>
            
            



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
    width: 200px;
}

.vertical-menu a {
    background-color:#eee; 
    color: black; 
    display: block; 
    padding: 12px; 
    text-decoration: none; 
}

.vertical-menu a:hover {
    background-color:#1b6d85; 
}

.vertical-menu a.active {
    background-color: #4CAF50; 
    color: white;
}
            
     














            
        
      </style>

   
        
      
      
   </head>
   
   
   
   
	
  <body>
      
      
      <nav id="rcorner1" class = "navbar navbar-default navbar-fixed-top" role = "navigation">
   
   <div class = "navbar-header">
      <img style="border:0px solid red; height:46px; width:120px" src="stock.png" />
             <p class = "navbar-brand"><font face="arial" size="6" color="black">DSTREET</font></p>

      
      
      
   </div>
   
   
      <ul style="position:relative;margin-left:200px;"class = "nav navbar-nav navbar-middle">
          
          
          <div class = "ui-widget" style="width:1000px;">
              <form action="quotes.jsp">
             <label for = "tag"> <button class="btn btn-warning" style="position:relative;width:200px;height:50px;">STOCK QUOTES </button></label>
             <input name="comp" placeholder="search stock quotes of differentcompanies " style="position:relative;width:600px;height:50px;" type="text" id= "tag"> <button class="btn btn-info" style="position:relative;width:160px;height:40px;" type="submit">SEARCH</button>
              </form>
                
             
      </div>

         
         
      </ul>
   
   
</nav>
      
      <br><br>
  <div style="width:100%;height:200px;background-color:#CCFFFF">
      <button class = "btn bg-success" data-toggle = "modal" style="float:right;position:relative;margin-top:40px" data-target = "#myModal" style="width:100px;height:50px;">
   LOGIN
</button>
            <button class ="btn alert-success" data-toggle = "modal" style="float:right;position:relative;margin-top:40px" data-target = "#myModalregister" style="width:100px;height:90px;">
   REGISTER
</button>

         



<div class = "modal fade" id = "myModal" tabindex = "-1"  role = "dialog" 
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
         
      </div>
   </div>
  
</div>



<div class = "modal fade" id = "myModalregister" tabindex = "-1" role = "dialog" 
     aria-labelledby = "myModalLabel" aria-hidden = "true" >
   
   <div class = "modal-dialog">
      <div class = "modal-content">
         
         
         
         
         
          <div class = "modal-footer" style="background-color:#f7e9e9;">
             
            <div id="form" class="register" >   
    <form action="registrationn.jsp" name="myForm" role="form" ">
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
         
      </div>
   </div>
  
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

    
      
<div id="left" class="vertical-menu" style="float:left;width:20%; height:3460px; background-color:#4ec926;">
          
          
                
    <a class="active"><button class="btn btn-primary" style="position:relative;width:95%;margin-left:10px;height:100px;">PERSONAL FINANCE ADVICE</button></a><br><br>
    <ul><button id="button-1" onclick="insurance()" style="position:relative;width:300px;height:60px;">INSURANCE</button></ul>
  <ul><button id="button-1" onclick="fixedincome()" style="position:relative;width:300px;height:60px;">FIXED INCOME</button></ul>
  <ul><button id="button-1" onclick="mutualfunds()" style="position:relative;width:300px;height:60px;">MUTUAL FUNDS</button></ul>
  <ul><button id="button-1" onclick="tax()" style="position:relative;width:300px;height:60px;">TAX</ul>
  <ul><button id="button-1" onclick="investing()" style="position:relative;width:300px;height:60px;">INVESTING</button></ul>
  
    <br><br>  
    <a class="active"> <button class="btn btn-primary" style="position:relative;width:95%;margin-left:10px;height:100px;">NEWS SECTION</button></a><br><br>
  <ul><button id="button-1" onclick="topnews()" style="position:relative;width:300px;height:60px;">TOP NEWS</button></ul>
  <ul><button id="button-1" onclick="latestnews()" style="position:relative;width:300px;height:60px;">LATEST NEWS</button></ul>
  <ul><button id="button-1" onclick="mostreadnews()" style="position:relative;width:300px;height:60px;">MOST READ NEWS</button></ul>
  <ul><button id="button-1" onclick="newsvideo()" style="position:relative;width:300px;height:60px;">NEWS VIDEOS</button></ul>
     
  <br><br>    
      
      
      
 
  
 <a class="active"><button class="btn btn-primary" style="position:relative;width:95%;margin-left:10px;height:100px;"> INDUSTRY NEWS</button></a><br><br>
  <ul><button id="button-1" onclick="energy()" style="position:relative;width:300px;height:60px;">ENERGY</bitton></ul>
  <ul><button id="button-1" onclick="financial()" style="position:relative;width:300px;height:60px;">FINANCIAL</button></ul>
  <ul><button id="button-1" onclick="healthcare()" style="position:relative;width:300px;height:60px;">HEALTHCARE</button></ul>
  <ul><button id="button-1" onclick="informationtechnology()" style="position:relative;width:300px;height:60px;">INFORMATION TECHNOLOGY</button></ul>
  <ul><button id="button-1" onclick="telecomutilies()" style="position:relative;width:300px;height:60px;">TELECOM&UTILIIES</button></ul>
  <ul><button id="button-1" onclick="fmcg()" style="position:relative;width:300px;height:60px;">FMCG</button></ul>
  <ul><button id="button-1" onclick="realty()" style="position:relative;width:300px;height:60px;">REALTY</buttton></ul>
  <ul><button id="button-1" onclick="basicmaterials()" style="position:relative;width:300px;height:60px;">BASIC MATERIALS</button></ul>
  <ul><button id="button-1" onclick="consumerdurables()" style="position:relative;width:300px;height:60px;">CONSUMER DURABLES</button></ul>
  <ul><button id="button-1" onclick="industrials()" style="position:relative;width:300px;height:60px;">INDUSTRIALS</button></ul>
  <ul><button id="button-1" onclick="power()" style="position:relative;width:300px;height:60px;">POWER</button></ul>
  <ul><button id="button-1" onclick="auto()" style="position:relative;width:300px;height:60px;">AUTO</button></ul>
  
  <br><br>
  
  <a class="active"> <button id="button-1" onclick="stockadvice()" style="position:relative;margin-left:15px;width:94%;height:75px;">STOCK ADVICE</button></a>
 
 <a class="active"><button id="button-1" onclick="topcompanies()" style="position:relative;margin-left:15px;width:94%;height:75px;"> TOP COMPANIES IN INDIA</button></a>

  
 <a class="active"> <button id="button-1" onclick="technology()" style="position:relative;margin-left:15px;width:94%;height:75px;">TECHNOLOGY</button></a>
  <a class="active"><button id="button-1" onclick="property()" style="position:relative;margin-left:15px;width:94%;height:75px;">PROPERTY</button></a>
  
  <a class="active"><button id="button-1" onclick="opinion()" style="position:relative;margin-left:15px;width:94%;height:75px;">OPINION</button></a>
  
    <a class="active"><button id="button-1" onclick="startups()" style="position:relative;margin-left:15px;width:94%;height:75px;">STARTUPS</button></a>
      <a class="active"><button id="button-1" onclick="commodities()" style="position:relative;margin-left:15px;width:94%;height:75px;">COMMODITIES</button></a>
      <a class="active"> <button id="button-1" onclick="forum()" style="position:relative;margin-left:15px;width:94%;height:75px;">FORUM</button></a>



  
</div>

<div id="middle" class="all" style="float:left;margin-right:0px;height:1000px;width:80%;">





<div id = "container"  style = "position:relative;margin-right:0px;width:100%;height:3450px;">
    
    
    <div id ="predict" class="panel panel-info" style="border-style:outset; position: relative;float:left;margin-left:50px; width:22%; height:300px;">
        
        <div class = "panel-heading">
      
       STOCK PRICE PREDICTION TOOL
   
         </div>
		
    
        <div class="panel-body">
        
            <button onclick="loadprediction()" ><img src="prediction.jpg" alt="PREDICTION IMAGE"  id="prediction" style="position:relative;width:230px;height:113px;" ></img></button><br>
            <p1><font size="2" face="WildWest" color="black"><input type="button" id='predection' value='PREDICTION TOOL'/></font></p1>
        <input type="text" id="mydiv" readonly="">
            
        </div>
       </div>
    
    <div id = "middle" class="panel panel-info"  style = "border-style:outset;position:relative;margin-left:40px;float:left; width:70%;height:300px;">
        <div class="panel-heading">
     STOCK WATCHLIST<br>
   </div>
          
        <div class="panel-body">
      
                                          
                
     <button id="button-4" style="position:relative;margin-left:10px;width:180px;height:178px;margin-top:10px;">ADD STOCKS</button>
     <button id="button-5" style="position:relative;margin-left:10px;width:180px;height:178px;margin-top:10px;">REMOVE STOCKS</button>
     <button id="button-6" style="position:relative;margin-left:10px;width:180px;height:178px;margin-top:10px;">VIEW YOUR WATCHLIST</button>
     <button id="button-6" style="position:relative;margin-left:10px;width:180px;height:178px;margin-top:10px;">SET ALERT</button>
     <button id="button-6" style="position:relative;margin-left:0px;width:180px;height:178px;margin-top:10px;">NEWS FOR YOUR STOCKS</button>

     <br/>
           
    </div>
    </div>
    
    <br>
        <div id = "right" class="panel panel-info" style = "position: relative;margin-left:50px;margin-top:50px;border-style:outset;float:left; width:22%;height:300px;">
        
        <div class="panel-heading">
            
      TRADING
      </div>
      <br>
      <div class="panel-body">
   
      <button id="button-14" style="position:relative;margin-left:10px;width:120px;height:180px;">BUY STOCKS</button>
      <button id="button-14" style="position:relative;margin-left:10px;width:120px;height:180px;">SELL STOCKS</button>
      </div>
    </div>
    
    <div id ="left" class="panel panel-info" style = "position:relative;border-style:outset;margin-left:40px;margin-top:50px;float:left; width:70%; height:300px;">
        <div class="panel-heading">
      MARKET
   </div><br>
   
   <div class="panel-body">
      <button onclick="loadtopgainer()" id="button-2" href="#"style="position:relative;margin-left:10px;width:120px;height:180px;">BSE TOP GAINERS</button>
     <button id="button-3" href="#"style="position:relative;margin-left:10px;width:120px;height:180px;">BSE TOP LOSERS</button>
     <button id="button-3" href="#"style="position:relative;margin-left:10px;width:120px;height:180px;">NSE TOP GAINER</button>
     <button id="button-3" href="#"style="position:relative;margin-left:10px;width:120px;height:180px;">NSE TOP LOSERS</button>
   <button id="button-3" href="#"style="position:relative;margin-left:10px;width:120px;height:180px;">WORLD INDICES</button>
   <button id="button-3" href="#"style="position:relative;margin-left:10px;width:120px;height:180px;">TOP MUTUAL FUNDS</button>
   <button id="button-3" href="#"style="position:relative;margin-left:10px;width:120px;height:180px;">MOST ACTIVE STOCKS</button>
        </div>
    </div>
    
    
   <div id = "right" class="panel panel-info"  style = "position:relative;border-style:outset;margin-left:40px;float:left; width:97%;margin-top:50px;height:300px;">
        
        <div class="panel-heading"> 
      PORTFOLIO MANAGEMENT<br>
   
     </div>
        <div class="panel-body">
<button id="button-11" style="position:relative;margin-left:10px;width:150px;height:180px;">ADD MUTUAL FUNDS</button>
<button id="button-12" style="position:relative;margin-left:10px;width:150px;height:180px;">REMOVE MUTUAL FUNDS</button>
<button id="button-13" style="position:relative;margin-left:10px;width:150px;height:180px;">BUY MUTUAL FUNDS</button>
<button id="button-13" style="position:relative;margin-left:10px;width:150px;height:180px;">SELL MUTUAL FUNDS</button>
<button id="button-11" style="position:relative;margin-left:10px;width:150px;height:180px;">ADD ULIPS</button>
<button id="button-12" style="position:relative;margin-left:10px;width:150px;height:180px;">SELL ULIPS</button>
<button id="button-13" style="position:relative;margin-left:10px;width:150px;height:180px;">BUY ULIPS</button>
<button id="button-13" style="position:relative;margin-left:10px;width:150px;height:180px;">SELL ULIPS</button>
      </div>
      
    </div>

     

    <div id = "middle" class="panel panel-info" style = "background-color:#9999ff;position:relative;margin-left:50px;margin-top:50px;border-style:outset;float:left; width:94%;height:2400px;">
        
        <div class="panel-heading">
       TRENDING STOCK MARKET NEWS<br>
        </div><br>
        <div class="panel-body">
         
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


                   
                   
                  
                   out.write("<img src='"+txt+"' style='width:245px; height:90px;'>");
                   out.write("<font color=red size=6 face=WildWest>"+title+"</font>");
                 out.write("<br>");
                

               out.println(ll.html()); 
                
                }
         }catch(IOException ex) {
            System.out.println(ex.toString());
        }

 

%>

        </div>
    
   
        
        
        
    </div>
    
    </div>
    
    
    

    
    

<br>

 


</div>
      
 <div id="container" style="border-style:ridge;position:relative;margin-top:3470px;width:100%;background-color:#eee;height:300px;">
    
    
       <form action="newsletter.jsp">
             <label for = "tag"> </label>
             <input name="comp" placeholder="enter your email to subscribe " style="margin-top:100px;margin-left:200px;width:500px;height:50px;margin-right:10px;" type="text"> <br>
             <button id="button-1" style="position:relative;width:160px;height:40px;margin-left:750px;" type="submit">SUBMIT</button>
              </form>
    
     <a href="#"><button class="btn btn-danger"style="position:relative;margin-left:1650px;width:100px;margin-top:-80px;">TOP</button><a>
             <button id="button-1" onclick="aboutme()" style="position:relative;margin-top:-200px;"><img src="picture.jpg"style="width:300px;height:270px;"></img></button>
</div>
     




  </body>
 
	
</html>