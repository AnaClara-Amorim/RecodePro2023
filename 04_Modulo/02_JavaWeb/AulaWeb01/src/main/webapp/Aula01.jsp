<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p> Olá, mundo JSP</p>
	<%
	int a = 20;
	
	int b = 10; 
	
	int soma = a + b;	
	%>
	
	<p>A soma dos valores é = <%= soma %> </p>

	<%-- 
	<%
	String nome = request.getParameter("nome");
	int idade = Integer.parseInt(request.getParameter("idade"));

	out.print("Idade enviada via url = " + idade + "<br>");
	out.print("Nome enviado via url = " + nome + "<br>");
	%>
	--%>
	<h1>
	<a href="Soma.jsp?n1=20&n2=40"> Clique aqui para calcular os parametros</a> 
	</h1>
</body>
</html>