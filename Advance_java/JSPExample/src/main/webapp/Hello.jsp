<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>This is JSP Page</h1>
<%--Declaration Tag --%>
<%! int a=10;
int b=20;
public int add()
{
return a+b;
}
%>
<%--Scriplets Tag --%>
<% 
   out.println("<h1>The value of a"+a+"</h1>");
   out.println("<h1>- Additon of given number is="+add()+"</h1>");
%>

</body>
</html>