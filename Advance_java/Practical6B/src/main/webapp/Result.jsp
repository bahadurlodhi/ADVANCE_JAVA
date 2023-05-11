<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fibonacci Series</title>
</head>
<body>
		<h1> The Fibonacci Series is  </h1>
		<h1>
		<%
			int num=Integer.parseInt(request.getParameter("number"));
		int a=0,b=1,c=0;
		for(int i=0;i<num;i++)
		{
			if(i<=1)
			{
				c=i;
			}
			else
			{
				c=a+b;
				a=b;
				b=c;
			}
			out.println(" "+c);
		}
		%>
		</h1>
</body>
</html>