/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.areacalculate;

/**
 *
 * @author Dell
 */
class Rectangle{
        public void RectangleArea(double l, int b){
        double area = l * b;
        System.out.println(area);        
            }
        
        public void RectangleArea(float l, double b){
        double area = l * b;
        System.out.println(area);        
            }
            
    }

class Triangle{
        public void TriangleArea(double h, double b){
        double area = (h*b)/2;
        System.out.println(area);
        
    }
        
        
    }
public class AreaCalculate {
    
    
    
    public static void main(String[] args) {
        
       Rectangle rec = new Rectangle();
       rec.RectangleArea(4.45,3);
       
        Triangle tri = new Triangle();
        tri.TriangleArea(3,4);
    }
}
