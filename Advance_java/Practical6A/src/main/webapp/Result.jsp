<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Factorial</title>
</head>
<body>
	<%
		int num=Integer.parseInt(request.getParameter("number"));
		int fact=1;
		for(int i=1;i<=num;i++){
			fact=fact*i;
		}
	out.println("<h1>The Factorial is "+fact+"</h1>");
	%>
	<a href="UI.html">Go Back</a>
</body>
</html>