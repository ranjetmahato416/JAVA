/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.inheritance;

/**
 *
 * @author Dell
 */
class Staff{
    int code;
    String name ;
    
}

class Teacher extends Staff{
    String subject;
    String publication;
    
    public void Display(){
        name = "Trilokya";
        code = 23;
        subject="Java";
        publication="KEC";
        System.out.println(name+code);
//        System.out.println(code);
        System.out.println(subject);
        System.out.println(publication);
    }
        
    
}

class Officer extends Staff{
    String Grade;
    
    public void Display(){
        name = "Parashar";
        code = 21;
        Grade= "A";
        System.out.println(name);
        System.out.println(code);
        System.out.println(Grade);        
    }
}
public class Inheritance {

    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.Display();
        Officer o = new Officer();
        o.Display();
        
    }
}
