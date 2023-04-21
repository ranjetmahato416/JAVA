<%-- 
    Document   : Login
    Created on : Feb 28, 2023, 4:41:07 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Login Form</title>
    </head>
    <body>
        <form action="LoginProcess.jsp" method="POSt">
            <table>
                <tr>
                    <td>UserName: </td>
                    <td><input type="text" name="uname" placeholder="Enter your UserName"><!-- comment --></td>
                </tr>
                <tr>
                    <td>
                        Password:
                    </td>
                    <td><input type="password" name="password" placeholder="Enter Password"><!-- comment --></td>
                </tr>
                <tr>
                    <td>
                        <button type="submit">Submit</button>
                    </td>
                </tr>
            </table>
        </form>
        
    </body>
</html>
