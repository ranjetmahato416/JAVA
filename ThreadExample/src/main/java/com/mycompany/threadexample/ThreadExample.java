/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.threadexample;

/**
 *
 * @author Dell
 */
public class ThreadExample implements Runnable {

    public void run() {
        System.out.println("Thread is Running.");
    }
    
    public static void main(String[] args){
        ThreadExample t1 = new ThreadExample();
        Thread T = new Thread(t1);
        T.start();
        ThreadExample t2 = new ThreadExample();
        Thread T1 = new Thread(t2);
        T1.start();
        ThreadExample t3 = new ThreadExample();
        Thread T2 = new Thread(t3);
        T2.start();
        
    }
}
