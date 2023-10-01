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
	
	int valor1 = Integer.parseInt(request.getParameter("n1"));
	int valor2 = Integer.parseInt(request.getParameter("n2"));
	
	%>
	
	<h1>
	A soma dos parametros = <%=valor1 + valor2 %>
	</h1>
</body>
</html>