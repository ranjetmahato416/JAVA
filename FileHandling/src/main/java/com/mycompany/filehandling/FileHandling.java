/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.filehandling;
import java.io.*;

/**
 *
 * @author Dell
 */
public class FileHandling {

    public static void main(String[] args) {
        String fname1 = "C:\\Users\\Dell\\Documents\\NetBeansProjects\\JavaTest.txt";
        String fname2 = "C:\\Users\\Dell\\Documents\\NetBeansProjects\\TestFile.txt";
        String line = null;
        try{
            
            FileReader fileReader = new FileReader(fname1);
            
            // always wrap the FileReader in BufferedReader
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter myWriter = new FileWriter(fname2);            
            
            
            
            while((line = bufferedReader.readLine()) != null)
            {
                myWriter.write(line);
            }
            System.out.println("Written Successfully");
            
            // always close the file after its use
            bufferedReader.close();
            myWriter.close();
        }catch(IOException ex){
            System.out.println("Exception "+ex);
            ex.printStackTrace();
        }
    }
}
