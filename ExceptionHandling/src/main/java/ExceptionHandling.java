/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class ExceptionHandling {
    public static void main(String[] args){
        try{
            int data;
            data= 200/0;
        
        }
        catch(ArithmeticException e){
            System.out.println("divide by zero"+e);
      
            
        }
        
    }
    
}
