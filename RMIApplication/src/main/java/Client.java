/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.NotBoundException;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Client {
    public static void main(String[] args) throws RemoteException {
        Client c = new Client();
        c.connectRemote();
    }
    
    private void connectRemote() throws RemoteException{
        try{
            Scanner sc = new Scanner(System.in);
            Registry reg = LocateRegistry.getRegistry("localhost",9999);
            adder ad = (adder)reg.lookup("hyserver");
            System.out.println("Enter two numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Sum: "+ad.add(a,b));
        }catch(NotBoundException|RemoteException e){
            System.out.println(e);
        }
    }
    
}
