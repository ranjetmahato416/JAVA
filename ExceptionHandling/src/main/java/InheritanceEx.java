/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
class SupClass{
    
    int salary = 10000;

}

class SubClass extends SupClass{
    int bonus = 5000;
    
    
}
public class InheritanceEx {
    public static void main(String[] args){
        SubClass c = new SubClass();
        //c.salary=600;
        System.out.println(c.bonus);
        System.out.println(c.salary);
        
    }
    
    
}
