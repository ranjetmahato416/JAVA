/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.tableexample;

import javax.swing.*;

/**
 *
 * @author Dell
 */
public class TableExample {

    JFrame f;

    TableExample() {
        f = new JFrame();
        String data[][] = {{"!01", "Anjal", "6700"},
        {"102", "Ashmita", "4500"},
        {"109", "Parashar", "3200"}};

        String column[] = {"Id", "Name", "Salary"};
        JTable jt = new JTable(data, column);
        jt.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(300, 400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TableExample();
        System.out.println("Hello World!");
    }
}
