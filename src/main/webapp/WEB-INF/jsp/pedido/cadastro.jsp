<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>tela de compras</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<h1>Compras</h1>
	<div class="container">
		<form action="/pedido/incluir" method="post">


			<div class="form-group">
				<label>Observacao:</label> <input type="text" value="Embrulhar"
					class="form-control" name="observacao">
			</div>

			<div class="form-group">
				<label>Produtos</label>
			</div>
			
				<c:forEach var="p" items="${produtos}">
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox" name="prodIds"
							id="inlineRadio1" value="${p.id}"> <label
							class="form-check-label" for="inlineRadio1">${p.descricao}</label>
					</div>
				</c:forEach>
				
				<button type="submit" class="btn btn-primary">Concluir</button>
		</form>
	</div>
</body>
</html>
