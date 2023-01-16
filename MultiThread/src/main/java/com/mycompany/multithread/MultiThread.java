/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.multithread;

/**
 *
 * @author Dell
 */
//class MultiThredingDemo extends Thread{
//    public void run(){
//        try{
//            System.out.println("Thread "+Thread.currentThread().getId()+" is running");
//        }catch (Exception e){
//            System.out.println("Exception is Caught");
//        }
//    }
//}

class MultiThreading2 implements Runnable{
     public void run(){
        try{
            System.out.println("Thread "+Thread.currentThread().getId()+" is running");
        }catch (Exception e){
            System.out.println("Exception is Caught");
        }
    } 
}

public class MultiThread {

    public static void main(String[] args) {
        int n = 4;
        for(int i = 0; i < n; i++){
            Thread object = new Thread(new MultiThreading2()); 
//              MultiThredingDemo object = new MultiThredingDemo();  
            object.start();
        }
        
    }
}
