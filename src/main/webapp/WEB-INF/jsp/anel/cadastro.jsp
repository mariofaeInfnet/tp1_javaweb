<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Anéis</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<!--   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"> -->
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<h1 align="center">CADASTRO DE ANEL</h1>
	<div class="container">
		<form action="/anel/incluir" method="post">
			<div class="form-group">
				<label>Descrição:</label> <input type="text"
					value="Anel de brilhantes" class="form-control" name="descricao">
			</div>
			<div class="form-group">
				<label>Preço:</label> <input type="text" value="44"
					class="form-control" name="preco">
			</div>

			<div class="form-group">
				<label>Tamanho:</label> <input type="text" value="3"
					class="form-control" name="tamanho">
			</div>
			<div class="form-group">
				<label>Tipo de Pedra/Ornamento:</label> <input type="text"
					value="Cristal" class="form-control" name="pedra">
			</div>
<!-- 			<div class="form-group"> -->
<!-- 				<label>Publico:</label> -->
<!-- 			</div> -->
			<div class="form-check form-check-inline">
				<input class="form-check-input" type="radio" name="publico"
					id="inlineRadio1" value="feminino" checked> <label
					class="form-check-label" for="inlineRadio1">Feminino</label>
<!-- 			</div> -->
<!-- 			<div class="form-check form-check-inline"> -->
				<input class="form-check-input" type="radio" name="publico"
					id="inlineRadio2" value="masculino"> <label
					class="form-check-label" for="inlineRadio2">Masculino</label>
<!-- 			</div> -->
<!-- 			<div class="form-check form-check-inline"> -->
				<input class="form-check-input" type="radio" name="publico"
					id="inlineRadio3" value="unisex"> <label
					class="form-check-label" for="inlineRadio3">Unisex</label>
			</div>
			<div class="form-check">
				<input class="form-check-input" type="checkbox" value=""
					name="freteGratis"> <label class="form-check-label"
					for="flexCheckDefault"> Frete grátis? </label>
			</div>
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>
</html>
