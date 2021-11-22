<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="br.edu.infnet.ecommerce.model.domain.Cliente"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>listagem clientes</title>
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"> -->
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
<%-- 	<c:import url="/WEB-INF/jsp/menu.jsp"/> --%>

	<div class="container">	
		
		<a href="/cliente">Novo cliente</a>
	
		<hr>
		
		<c:if test="${not empty nome}">
			<div class="alert alert-success">
				 <strong>OK, </strong> Cliente ${nome} cadastrado com sucesso!
			</div>
		</c:if>
		
		<c:if test="${not empty listaClientes}">
		
			<h4>Listagem de clientes (${listaClientes.size()}):</h4>		
			<table class="table table-striped">
			    <thead>
			      <tr>
			        <th>#</th>
			        <th>Nome</th>
			        <th>Email</th>
			        <th></th>
			      </tr>
			    </thead>
			    <tbody>
			    	<c:forEach var="c" items="${listaClientes}">
				      <tr>
				      	<td>${c.id}</td>
				        <td>${c.nome}</td>
				        <td>${c.email}</td>
				        <td><a href="/cliente/${c.id}/excluir">Excluir</a></td>
				      </tr>
			      </c:forEach>
			    </tbody>
		  	</table>
	  	</c:if>
	  			
	  	<c:if test="${empty listaClientes}">
	  		<h4>Não ha clientes cadastrados!</h4>
	  	</c:if>
	</div>
</body>
</html>