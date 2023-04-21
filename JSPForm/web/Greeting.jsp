<%-- 
    Document   : Greeting
    Created on : Feb 28, 2023, 5:22:23 PM
    Author     : Dell
--%>

<%@page import = "java.io.*,java.util.*, jakarta.servlet.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Greeting</title>
    </head>
    <body>
        <h1>Greeting</h1>
         <%
            Date date = new Date();
            int hr = date.getHours();
            int minute = date.getMinutes();
            int second = date.getSeconds();
            if (hr < 12) {
                out.println("Good Morning");
            } else if (hr >= 12 && hr < 17) {
                out.println("Good AfterNoon.");
            } else if (hr >= 17 && hr <= 23) {
                out.println("Good Evening");
            }
        %>
    </body>
</html>
