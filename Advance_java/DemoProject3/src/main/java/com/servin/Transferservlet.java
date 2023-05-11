package com.servin;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Transferservlet extends HttpServlet {
	/**
	 * 
	 */
	
	protected void doPost(HttpServletRequest req,  HttpServletResponse resp)    throws ServletException,  IOException {
		System.out.println("Do get Method");
		String sname;
		int age;
		
		resp.setContentType("text/html");		
		PrintWriter out=resp.getWriter();
		
		sname=req.getParameter("uname");
		age=Integer.parseInt(req.getParameter("age"));
		
		out.print("<html> <body>");
		out.print("<b>This is Servlet Page </b>");		
		out.print("<h1>Your Name is  "+sname+" </h1>");	
		out.print("<h1>Your Age is  "+age+" </h1>");	
		out.print("</body></html>");
		
	}
}