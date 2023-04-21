/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.areacalculate;

/**
 *
 * @author Dell
 */
class CalculateArea {
    double length;
    double bredth;

   CalculateArea(double l, double b){
       this.length = l;
       this.bredth = b;
   }

    public void Triangle() {
        double area = (this.length*this.bredth)/2;
        System.out.println(area);
    }

    public void Rectangle() {
        double area = (this.length*this.bredth);
        System.out.println(area);

    }
}

public class AreaCalculate {

    public static void main(String args[]) {
        CalculateArea a = new CalculateArea(3,4);
        a.Triangle();
        a.Rectangle();

        
        

//        Triangle tri = new Triangle();
       
    }
}
