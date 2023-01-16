/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.scannerclass;

import java.util.*;

/**
 *
 * @author Dell
 */
public class ScannerClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a = sc.nextInt();
        System.out.println("Enter Second Numbe:");
        int b = sc.nextInt();
        try {
            int sum = a + b;
            int subtract = a - b;
            int multiplication = a * b;
            int division = a / b;
            System.out.println("Addition:"+sum);
            System.out.println("Subtraction:"+subtract);
            System.out.println("Multiplication:"+multiplication);
            System.out.println("Division:"+division);
        } catch (Exception e) {
            System.out.println("Division by zero exception is caught.");
        }
        
    }
}
