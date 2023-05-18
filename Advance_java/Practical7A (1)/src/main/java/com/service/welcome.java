package com.service;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class welcome extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String name=req.getParameter("uname");

		out.print("welcome "+name);
		out.print("<br><a href='UI.html'>Go Back</a><br>");	
	}
		
	}
	
