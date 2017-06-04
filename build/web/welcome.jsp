<%-- 
    Document   : welcome
    Created on : Feb 26, 2017, 1:19:56 AM
    Author     : PRABHAT RANJAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Stock analysis</title>
    </head>
    <body>
        <%  
String name=request.getParameter("uname");  
out.print("welcome "+name);  
%> 
    </body>
</html>
