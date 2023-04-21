/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlets;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

/**
 *
 * @author Dell
 */
public class FirstServlet extends HttpServlet{
   public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
       response.setContentType("text/html");
       PrintWriter out  = response.getWriter();
       out.println("Your Data.");
       String name = request.getParameter("name");
       String address = request.getParameter("address");
       out.println("<h2>Name: "+name+"</h2>");
       out.println("<h2>Address: "+address+"</h2>");
       
   }
    
}
