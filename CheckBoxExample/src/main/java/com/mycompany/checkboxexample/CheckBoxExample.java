/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.checkboxexample;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Dell
 */
public class CheckBoxExample {

    public static void main(String[] args) {
        JFrame f = new JFrame("CheckBox Example");
        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);

        label.setSize(400, 100);
        JCheckBox checkBox1 = new JCheckBox("JAVA");

        checkBox1.setBounds(
                150, 100, 100, 50);
        JCheckBox checkBox2 = new JCheckBox("C++");

        checkBox2.setBounds(
                150, 150, 100, 50);
        f.add(checkBox1);

        f.add(checkBox2);

        f.add(label);

        checkBox1.addItemListener(new ItemListener() {

            public void itemStateChanged(ItemEvent e) {
                label.setText("Java CheckBox: " + (e.getStateChange() == 1 ? "Checked" : "unChecked"));
            }
        }
        );

        checkBox2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                label.setText("C++ CheckBox: " + (e.getStateChange() == 1 ? "Checked" : "Unchecked"));
            }
        });
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        System.out.println("Hello World!");
    }
}
