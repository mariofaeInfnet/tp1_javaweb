<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>listagem brincos</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container">
		<br> <a href="/brinco">Novo Brinco</a>
		<hr>
		<c:if test="${not empty descricao}">
			<div class="alert alert-success">
				<strong>OK, </strong> Brinco ${nome} cadastrado com sucesso!
			</div>
		</c:if>

		<c:if test="${not empty mensagem}">
			<div class="alert alert-danger">
				<strong>Atenção!</strong> ${mensagem}
			</div>
		</c:if>
		<c:if test="${not empty mensagem2}">
			<div class="alert alert-success">
				<strong>Perfeito!</strong> ${mensagem2}
			</div>
		</c:if>

		<c:if test="${not empty listaBrincos}">

			<h4>Listagem de Brincos (${listaBrinco.size()}):</h4>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>#</th>
						<th>Descricao</th>
						<th>Frete Grátis?</th>
						<th>Preço de venda</th>
						<th>Material</th>
						<th>Estilo</th>
						<th>Publico</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="a" items="${listaBrincos}">
						<tr>
							<td>${a.id}</td>
							<td>${a.descricao}</td>
							<td>${a.freteGratis}</td>
							<td>${a.material}</td>
							<td>${a.estilo}</td>
							<td>${a.publico}</td>
							<td><a href="/anel/${a.id}/excluir">Excluir</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>

		<c:if test="${empty listaBrincos}">
			<h4>Não ha brincos cadastrados!</h4>
		</c:if>
	</div>
</body>
</html>