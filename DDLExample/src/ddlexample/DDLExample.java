/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ddlexample;

import java.sql.*;

/**
 *
 * @author Dell
 */
public class DDLExample {

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
//            int result1 = stmt.executeUpdate("CREATE TABLE students(name VARCHAR(20), email VARCHAR(50), address VARCHAR(50))");
//            int result2 = stmt.executeUpdate("ALTER TABLE students ADD(mobile VARCHAR(15))");
//            int result3 = stmt.executeUpdate("TRUNCATE TABLE students");
//            int result4 = stmt.executeUpdate("DROP TABLE students");
//            int result5 = stmt.executeUpdate("INSERT INTO students VALUES('Ashmita','Ashmita@gmail.com','MangalBazar'),('Bibek','bibek@gmail.com','HArisidhdhi'),('bibash','bibash@gmail.com','Rolpa')");
//            int result6 = stmt.executeUpdate("UPDATE students SET name = 'Bibash' WHERE address = 'Rolpa'");
            int result7 = stmt.executeUpdate("DELETE FROM students WHERE address='MangalBazar'");
//            System.out.println(result1 + " Table Created");
//            System.out.println(result2 + "Column Added.");
//            System.out.println(result3 + "Rows Deleted");
//            System.out.println(result4 + "Table Deleted");
//            System.out.println(result5 + " Data Inserted");
//            System.out.println(result6 + " Data Updated"); 
            System.out.println(result7 + " Data Deleted");
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Connection Failed! "+e);
        }
    }

}
