<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@page isELIgnored="false" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	int valor1 = Integer.parseInt(request.getParameter("n1"));
	int valor2 = Integer.parseInt(request.getParameter("n2"));
	%>
	
   <p>valor de n1 = ${param.n1}</p>
	 
	<h1>
		A soma dos parameteros =
		<%=valor1 + valor2%>
	</h1>
	 


</body>
</html>