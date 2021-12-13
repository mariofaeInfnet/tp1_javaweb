<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="br.edu.infnet.ecommerce.model.domain.Cliente"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>listagem de usuarios</title>
	<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"> -->
	 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container">	
		<br>

		<c:if test="${not empty nome}">
			<div class="alert alert-success">
				 <strong>OK, </strong> Usuário ${nome} cadastrado com sucesso!
			</div>
		</c:if>
			
		<c:if test="${not empty listaUsuarios}">
		
			<h4>Listagem de usuários (${listaUsuarios.size()}):</h4>		
			<table class="table table-striped">
			    <thead>
			      <tr>
			        <th>#</th>
			        <th>Nome</th>
			        <th>Email</th>
			        <th>Clientes</th>
			        <c:if test="${usuario.admin}">
			       	<th></th>
			       	</c:if>
			      </tr>
			    </thead>
			    <tbody>
			    	<c:forEach var="u" items="${listaUsuarios}">
				      <tr>
				      	<td>${u.id}</td>
				        <td>${u.nome}</td>
				        <td>${u.email}</td>
				        <td>${u.clientes.size()}</td>
				        <c:if test="${usuario.admin}">
				        <td><a href="/usuario/${u.id}/excluir">Excluir</a></td>
				        </c:if>
				      </tr>
			      </c:forEach>
			    </tbody>
		  	</table>
	  	</c:if>
	  			
	  	<c:if test="${empty listaUsuarios}">
	  		<h4>Não ha usuarios cadastrados!</h4>
	  	</c:if>
	</div>
</body>
</html>