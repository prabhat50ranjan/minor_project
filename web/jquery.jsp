<%-- 
    Document   : jquery
    Created on : Apr 7, 2017, 12:47:52 PM
    Author     : PRABHAT RANJAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

   <head>
      <title>The jQuery Example</title>
      <script type = "text/javascript" 
         src = "https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>

      <script type = "text/javascript" language = "javascript">
         $(document).ready(function() {
            $("p").css("background-color", "yellow");
         });
      </script>
   </head>
	
   <body>
      <div>
         <p class = "myclass">This is a paragraph.</p>
         <p id = "myid">This is second paragraph.</p>
         <p>This is third paragraph.</p>
      </div>
   </body>
	
</html>