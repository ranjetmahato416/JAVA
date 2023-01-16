/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.radiobuttonexample;
import javax.swing.*;
import java.awt.event;

/**
 *
 * @author Dell
 */
public class RadioButtonExample extends JFrame implements ActionListener {
//    JRadioButton rb1, rb2;
//    JButton b;
    
    RadioButtonExample(){
        JRadioButton rb1 = new JRadioButton("Male");
        rb1.setBounds(100, 50, 100, 30);
        JRadioButton rb2 = new JRadioButton("Female");
        rb2.setBounds(100, 100, 100, 30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);bg.add(rb2);
        JButton b = new JButton("Click");
        b.setBounds(100,150,80,30);
        b.addActionListener(this);
        add(rb1);add(rb2);add(b);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
        
    }
    

    public static void main(String[] args) {
     
       
    
        System.out.println("Hello World!");
    }
}
