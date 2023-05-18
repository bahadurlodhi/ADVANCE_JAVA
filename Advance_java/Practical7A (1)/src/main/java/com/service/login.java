package com.service;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class login extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String name=req.getParameter("uname");
		String password=req.getParameter("pwd");
		if(name.equals("sistec")&&password.equals("test"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("/welcome");
			rd.forward(req,res);
		}
		else {
			RequestDispatcher rd=req.getRequestDispatcher("UI.html");
			String stmt = Validate(name,password);
			out.print(stmt);
					//out.print("<p>Invalid Credentials ???</p>");
					rd=req.getRequestDispatcher("UI.html");
					
		}
		
	}
	
	 public String Validate(String name,String password)
	 {
		 if(name.equals("sistec"))
		 {
			return("Invalid password");
		 }
		 else if(password.equals("test"))
		 {
			 return("Invalid username");
		 }
		 else
		 {
			 return("Both are invalid");
		 }
	 }
}	 

