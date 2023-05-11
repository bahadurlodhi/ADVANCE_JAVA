package com.Practical;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ComputeAverage extends HttpServlet {
		protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException , IOException{
			int firstnum,secondnum,thirdnum;
			resp.setContentType("text/html");		
			PrintWriter out=resp.getWriter();
			
			firstnum=Integer.parseInt(req.getParameter("fnumber"));
			secondnum=Integer.parseInt(req.getParameter("snumber"));
			thirdnum=Integer.parseInt(req.getParameter("tnumber"));
			
			out.print("<html> <body>");
			out.print("<b>This is Servlet Page </b>");		
			out.print("<h1>Average  is  "+(firstnum+secondnum+thirdnum)/3+" </h1>");		
			out.print("</body></html>");
		}
}