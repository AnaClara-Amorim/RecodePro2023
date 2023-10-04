<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Cadastro de Animais</title>
</head>

<body>
	<% 
		
		String nome = request.getParameter("nome");
		String telefone = request.getParameter("telefone");
		String email = request.getParameter("email");
	
		%>
	<h1>Cadastro de Clientes</h1>
	<fieldset>
		<legend>Dados do Cliente Cadastrado</legend>
		<p>O seguinte cliente foi cadastrado com sucesso:</p>
		<p>
			Nome:
			<%=nome %><br> Telefone:
			<%=telefone %><br> E-mail:
			<%=email %>
		</p>

		<p>Valores via expression</p>
		${param.nome} ${param.telefone} ${param.email}
	</fieldset>
</body>

</body>
</html>