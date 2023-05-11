<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <%
   int a=Integer.parseInt(request.getParameter("N1"));
   int b=Integer.parseInt(request.getParameter("N2"));
   int c=Integer.parseInt(request.getParameter("N3"));
   int sum= a+b+c;
   double  avg= sum/3;
   
   out.println("<h1>The sum is "+sum+"</h1>");
   
   out.println("<h1>The avg is "+avg+"</h1>");
   %>
</body>
</html>