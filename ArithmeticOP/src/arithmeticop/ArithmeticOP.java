/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package arithmeticop;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

/**
 *
 * @author Dell
 */
public class ArithmeticOP implements ActionListener {

    JLabel l1, l2, l3, l4;
    JTextField tf1, tf2, tf3;
    JButton b1, b2, b3, b4;
    public static Connection con;

    ArithmeticOP() {
        JFrame f = new JFrame("Arithmetic Operation");
        l1 = new JLabel("Enter first Number");
        l1.setBounds(10, 50, 150, 20);
        tf1 = new JTextField();
        tf1.setBounds(180, 50, 150, 20);
        l2 = new JLabel("Enter second Number");
        l2.setBounds(10, 100, 150, 20);
        tf2 = new JTextField();
        tf2.setBounds(180, 100, 150, 20);
        l3 = new JLabel("Result");
        l3.setBounds(50, 150, 150, 20);
        tf3 = new JTextField();
        tf3.setBounds(180, 150, 150, 20);
        tf3.setEditable(false);
        l4 = new JLabel("Choose Option");
        l4.setBounds(100, 190, 100, 20);
        b1 = new JButton("+");
        b1.setBounds(50, 220, 50, 50);
        b2 = new JButton("-");
        b2.setBounds(100, 220, 50, 50);
        b3 = new JButton("*");
        b3.setBounds(150, 220, 50, 50);
        b4 = new JButton("/");
        b4.setBounds(200, 220, 50, 50);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = 0;
        String operation = null;
        try {
            if (e.getSource() == b1) {
                c = a + b;
                operation = "Addition";
            } else if (e.getSource() == b2) {
                c = a - b;
                operation = "Subtraction";
            } else if (e.getSource() == b3) {
                c = a * b;
                operation = "Multiplication";
            } else if (e.getSource() == b4) {
                c = a / b;
                operation = "Division";
            }
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "password");
            if (con != null) {
                System.out.println("Connection Succesful");
            }
            Statement stmt = con.createStatement();
            int resultSet = stmt.executeUpdate("insert into arithmeticoperations values('"+a+"','"+b+"','"+c+"','"+operation+"')");
            System.out.println(resultSet+"Data Inserted");
            stmt.close();
            con.close();
        } catch (Exception ex) {
            System.out.println("Division by 0 exception is caught");
            System.out.println(ex+"Connection Failed");
        }
        String result = String.valueOf(c);
        tf3.setText(result);
    }

    public static void main(String[] args) {
        new ArithmeticOP();
    }
}
