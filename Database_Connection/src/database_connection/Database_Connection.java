/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package database_connection;

import java.sql.*;

/**
 *
 * @author Dell
 */
public class Database_Connection {

    public static Connection con;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "password");
            if (con != null) {
                System.out.println("Connection Succesful");
            }
            Statement stmt = con.createStatement();
            int result = stmt.executeUpdate("insert into person values(2,'Anjal','anjal@gmail.com',5678900),(3,'Ashmita','Ashmita@gmail.com',56789343),(4,'Bibek','bibek@gmail.com',5667500),(5,'Bibash','bibash@gmail.com',7878900)");
//            int result = stmt.executeUpdate("update person set email ='ashmita@gmail.com' where id = 3" );
//            int result = stmt.executeUpdate("delete from person where id=5");
            ResultSet resultSet = stmt.executeQuery("select * from person");
            int id;
            String name, email, mobile;
            while(resultSet.next()){
                id = resultSet.getInt("id");
                name = resultSet.getString("name");
                email = resultSet.getString("email");
                mobile = resultSet.getString("mobile");
                System.out.println("Id: "+id+" Name: "+name+" Email: "+email+" Mobile: "+mobile);
            }
            resultSet.close();
            stmt.close();
            con.close();
//            System.out.println(result + "deleted");

        } catch (Exception e) {
            System.out.println("Connection Failed!");
            System.out.println(e);
        }
    }

}
