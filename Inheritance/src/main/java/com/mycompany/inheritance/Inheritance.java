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
        System.out.println(name);
        System.out.println(code);
    }
        
    
}

class Officer extends Staff{
    
    public void Display(){
        name = "Parashar";
        code = 21;
        System.out.println(name);
        System.out.println(code);
    }
    char grade = 'A';
}
public class Inheritance {

    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.Display();
        Officer o = new Officer();
        o.Display();
        System.out.println(o.grade);
        
    }
}
