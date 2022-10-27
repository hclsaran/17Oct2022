<%@ page language="java" import= "com.saran.model.Employee" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Application</title>
</head>
<body>

<p> You are succesfully signed in!!!</p>
<!-- Scriplet -->
<%

     Employee e=(Employee)request.getAttribute("abc");
     out.println("Welcome "+e.getEmpName());

%>


</body>
</html>