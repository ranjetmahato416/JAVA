<%-- 
    Document   : Time
    Created on : Feb 28, 2023, 2:17:53 PM
    Author     : Dell
--%>

<%@page import = "java.io.*,java.util.*, jakarta.servlet.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Time</title>
    </head>
    <body>
        <h1>Current Time</h1>
        <%
            Date date = new Date();
            int hr = date.getHours();
            int minute = date.getMinutes();
            int second = date.getSeconds();
            out.print("<h2 align = \"left\">" + hr + ":" + minute + ":" + second + "</h2>");
        %>
    </body>
</html>
