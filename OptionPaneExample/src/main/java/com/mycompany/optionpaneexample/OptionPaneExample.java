/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.optionpaneexample;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Dell
 */
public class OptionPaneExample extends WindowAdapter {

    JFrame f;

    OptionPaneExample() {
        f = new JFrame();
        f.addWindowListener(this);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.setVisible(true);
        JOptionPane.showMessageDialog(f, "Behold humans.");
        JOptionPane.showMessageDialog(f, "Life Damage!!.", "Alert", JOptionPane.WARNING_MESSAGE);
        String name = JOptionPane.showInputDialog(f, "Enter Name");
        

    }

    public void windowClosing(WindowEvent e) {
        int a = JOptionPane.showConfirmDialog(f, "Are you sure?");
        if (a == JOptionPane.YES_OPTION) {
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }

    public static void main(String[] args) {
        new OptionPaneExample();
    }
}
