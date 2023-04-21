<%-- 
    Document   : LoginProcess
    Created on : Feb 28, 2023, 4:49:33 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Login Process</title>
    </head>
    <body>
        <%
            String uname = request.getParameter("uname");
            String password = request.getParameter("password");
            if (uname.equals("ranjet416") && password.equals("rnpd@1")) {
                out.println("Login Successfull.");
            } else {
                out.println("Login Failed.");
            }
        %>
    </body>
</html>
