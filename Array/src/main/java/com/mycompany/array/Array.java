/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.array;


/**
 *
 * @author Dell
 */
public class Array {
    
    
    public static void Comparison(double array[]){
        
        double max;
        double min;
        double sum; 
        max=min=sum= array[0];
        for(int i = 0; i < array.length; i++){
            if(min>array[i]){
            min = array[i];
            }
            if(max<array[i]){
                max = array[i];
            
            }
            sum = sum+ array[i];
            
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(sum);
        
    }
    
    

    public static void main(String[] args) {
        
//        double arr[]=new double[10];
        double arr[] = {23, 43, 56, 22, 90, 101};
        Comparison(arr);
       
//        System.out.println("Hello World!");
    }
}
