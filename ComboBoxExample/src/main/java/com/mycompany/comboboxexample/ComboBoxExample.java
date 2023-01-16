/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.comboboxexample;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Dell
 */
public class ComboBoxExample {
    JFrame f;
    ComboBoxExample(){
        f = new JFrame("ComboCheckBox Example");
        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400,100);
        JButton b = new JButton("Show");
        b.setBounds(200,100,75,20);
        String languages[] = {"Select Your Choice:", "C", "C++", "C#", "Java", "PHP"};
        final JComboBox cb = new JComboBox(languages);
        cb.setBounds(50,100,90,20);
        f.add(cb);f.add(label);f.add(b);
        f.setLayout(null);
        f.setSize(350,350);
        f.setVisible(true);
        b.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            String data = "Programming language Selected: "+ cb.getItemAt(cb.getSelectedIndex());
            label.setText(data);
        }});
        
    }
    

    public static void main(String[] args) {
        new ComboBoxExample();
        System.out.println("Hello World!");
    }
}
