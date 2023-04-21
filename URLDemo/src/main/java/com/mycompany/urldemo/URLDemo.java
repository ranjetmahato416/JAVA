/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.urldemo;

import java.net.URL;

/**
 *
 * @author Dell
 */
public class URLDemo {

    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.com:80/docs/books/tutorial" + "/index.html?name=networking#DOWNLOADING");
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Authority: " + url.getAuthority());
            System.out.println("Host Name: " + url.getHost());
            System.out.println("Port Number: " + url.getPort());
            System.out.println("Default Port Number: " + url.getDefaultPort());
            System.out.println("Query String: " + url.getQuery());
            System.out.println("Path: " + url.getPath());
            System.out.println("File: " + url.getFile());
            System.out.println("Reference: " + url.getRef());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
