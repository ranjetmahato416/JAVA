/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.loginform;
import javax.swing.*;
import java.awt.event.*;


/**
 *
 * @author Dell
 */
public class LoginForm {
   

    public static void main(String[] args) {
         JFrame f = new JFrame("Passsword Field Example.");
         JLabel label = new JLabel();
         label.setBounds(20,150,300,50);
         JPasswordField value = new JPasswordField();
         value.setBounds(100,75,100,30);
         JLabel l1 = new JLabel("UserName");
         l1.setBounds(20,20,80,30);
         JLabel l2 = new JLabel("Password");
         l2.setBounds(20,75,80,30);
         JButton b = new JButton("Login");
         b.setBounds(100,120,80,30);
         JTextField text = new JTextField();
         text.setBounds(100,20,100,30);
         f.add(value);f.add(l1);f.add(label);f.add(l2);f.add(b);f.add(text);
         f.setSize(500,500);
         f.setLayout(null);
         f.setVisible(true);
         b.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e){
             String data = "Username:" + text.getText();
             data += ", Password: "+new String(value.getPassword());
             label.setText(data);
             }
         });
        System.out.println("Hello World!");
    }
}
