<%-- 
    Document   : DataBaseConnection
    Created on : Feb 28, 2023, 6:13:22 PM
    Author     : Dell
--%>

<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP DataBase Connection</title>
    </head>
    <body>
        <h1>Database Connection</h1>
        <%Connection con;%>
        <%
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "password");
                if (con != null) {
                    out.println("Connection Succesful");
                    out.println("<br>");
                }

                Statement stmt = con.createStatement();
                int result1 = stmt.executeUpdate("insert into person values(6,'Ranjeet','ranjet@gmail.com',7656567)");
                    out.println("Data Inserted");
                    int result2 = stmt.executeUpdate("update person set email ='bbk@gmail.com' where id = 4");
                    out.println("Data updated.");
                    int result3 = stmt.executeUpdate("delete from person where id=6");
                    out.println("Data deleted.");
                    out.println("<br>");
                ResultSet resultSet = stmt.executeQuery("select * from person");
                int id;
                String name, email, mobile;
                while (resultSet.next()) {
                    id = resultSet.getInt("id");
                    name = resultSet.getString("name");
                    email = resultSet.getString("email");
                    mobile = resultSet.getString("mobile");
                    out.println("Id: "+id+" Name: "+name+" Email: "+email+" Mobile: "+mobile);
                    out.println("<br>");
                    
                }
                resultSet.close();
                stmt.close();
                con.close();
            } catch (Exception e) {
                out.println(e);
            }
        %>


    </body>
</html>
