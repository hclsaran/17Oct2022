<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String username=request.getParameter("uname");
String email=request.getParameter("email");

session.setAttribute("abc", username);
session.setAttribute("def", email);
%>
<a href="sessionoutput.jsp">SessionOutput</a>
</body>
</html>