<%-- 
    Document   : Counter
    Created on : Feb 28, 2023, 2:32:28 PM
    Author     : Dell
--%>

<%@page import = "java.io.*,java.util.*, jakarta.servlet.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%! int clicks = 0;%>
        <% if (session.getAttribute("clicks") == null) {
                clicks = 0;
            }
            clicks++;
            session.setAttribute("clicks", clicks);
        %>
        <span>Total Number of hits: <%= clicks%></span><br>
    <a href="Counter.jsp">Click</a>
</body>
</html>
