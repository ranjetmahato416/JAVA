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

   

    public void Area(double length, double bredth) {
        double area = length * bredth;
        System.out.println(area);
    }

    public void Area(double length, double bredth, double height) {
        double area = (length+bredth+height) / 2;
        area = Math.sqrt(area*(area-length)*(area-bredth)*(area-height));
        System.out.println(area);

    }
}

//class Triangle{
//        public void TriangleArea(double h, double b){
//        double area = (h*b)/2;
//        System.out.println(area);
//        
//    }
//    }
public class AreaCalculate {

    public static void main(String args[]) {

        CalculateArea area = new CalculateArea();
        area.Area(2.32,4.21);
        area.Area(2.45,3.22,4.32);
        

//        Triangle tri = new Triangle();
       
    }
}
