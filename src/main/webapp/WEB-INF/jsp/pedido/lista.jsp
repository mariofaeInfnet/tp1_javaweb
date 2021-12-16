<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Meus Pedidos</title>
	<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"> -->
	 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container">	
		<br>
		<a href="/pedido">Novo pedido</a>
		<hr>
<%-- 		<c:if test="${not empty data}"> --%>
<!-- 			<div class="alert alert-success"> -->
<!-- 				 <strong>Parabéns</strong>, seu Pedido foi registrado! -->
<!-- 			</div> -->
<%-- 		</c:if> --%>
			
		<c:if test="${not empty listaPedidos}">
		
			<h4>Listagem de Pedidos (${listaPedidos.size()}):</h4>		
			<table class="table table-striped">
			    <thead>
			      <tr>
			        <th>Protocolo</th>
			        <th>Data</th>
			        <th>Cliente</th>
			        <th>Observacao</th>
			        <th>Qtde</th>
			       	<th></th>
			      </tr>
			    </thead>
			    <tbody>
			    	<c:forEach var="p" items="${listaPedidos}">
				      <tr>
				      	<td>${p.protocolo}</td>
				        <td>${p.data}</td>
				        <td>${p.cliente}</td>
				        <td>${p.observacao}</td>
				        <td>${p.produtos.size()}</td>
				        <td><a href="/pedido/${p.protocolo}/excluir">Cancelar</a></td>
				      </tr>
<!-- 				      vou criar outro for each aqui para listar os produtos de cada pedido -->
			      </c:forEach>
			    </tbody>
		  	</table>
	  	</c:if>
	  	<c:if test="${empty listaPedidos}">
	  		<h4>Não ha pedidos registrados!</h4>
	  	</c:if>
	</div>
</body>
</html>