package com.practical;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class PostMethodExample extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
	throws IOException, ServletException
	{
		 res.setContentType("text/html");
		 PrintWriter out=res.getWriter();
		 String name=req.getParameter("name");
		 int age=Integer.parseInt(req.getParameter("age"));
		 out.print("<html><body>");
		 out.print("<h1>Your name is "+name+"age is "+age+"</h1>");
		 out.print("</body></html>");
	}

}
