<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Usuario</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<h1>CADASTRO DE USUARIO</h1>
	<div class="container">
		<form action="/cep" method="post">
			<div class="form-group">
				<label>CEP: </label> <input type="text" th:value="endereco.cep"	class="form-control" placeholder="Digite seu cep e clique em buscar cep" name="cep">
				<button type="submit" class="btn btn-primary">Buscar CEP</button>
		</form>
		<hr>
	</div>
			<form action="/usuario/incluir" method="post">
				<div class="form-group">
					<label>Nome:</label> <input type="text"
						value="Aparecida Alves" class="form-control"
						placeholder="Entre com o seu nome" name="nome">
				</div>
				<div class="form-group">
					<label>E-mail:</label> <input type="email"
						value="aparecida@gmail.com" class="form-control"
						placeholder="Entre com o seu email" name="email">
				</div>
				<div class="form-group">
					<label>Senha:</label> <input type="password" value="123"
						class="form-control" placeholder="Digite sua senha" name="senha">
				</div>
				<c:import url="/WEB-INF/jsp/endereco.jsp" />
				<button type="submit" class="btn btn-primary">Cadastrar</button>
			</form>
</body>
</html>
