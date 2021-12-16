<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Colares</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<!--   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"> -->
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<h1 align="center">CADASTRO DE COLAR</h1>
	<div class="container">
		<form action="/anel/incluir" method="post">
			<div class="form-group">
				<label>Descrição:</label> <input type="text"
					value="Corrente com pingente" class="form-control" name="descricao">
			</div>
			<div class="form-group">
				<label>Preço:</label> <input type="text" value="220"
					class="form-control" name="preco">
			</div>

			<div class="form-group">
				<label>Comprimento:</label> <input type="text" value="40"
					class="form-control" name="tamanho">
			</div>
			<div class="form-group">
				<label>Tipo de Pedra/Ornamento:</label> <input type="text"
					value="Crucifixo" class="form-control" name="pedra">
			</div>

			<div class="form-check form-check-inline">
				<input class="form-check-input" type="radio" name="corrente"
					id="inlineRadio1" checked> <label
					class="form-check-label" for="inlineRadio1">Corrente?</label>
			</div>
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>
</html>
