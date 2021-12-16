 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<nav class="navbar navbar-inverse">
	  <div class="container-fluid">
	    <div class="navbar-header">
	      <a class="navbar-brand" href="#"><img alt="Brand" src="C:\Users\jmafa\Pictures\logo-para-joalheria.jpg"></a>
	    </div>
	    <ul class="nav navbar-nav">
	      <li class="active"><a href="#">Home</a></li>
	      
	     <c:if test="${not empty user}">
	      <li><a href="/clientes">Clientes</a></li>
	      <li><a href="/usuarios">Usuários</a></li>
	      <li><a href="/brincos">Brincos</a></li>
	      <li><a href="/aneis">Anéis</a></li>
	      <li><a href="/colares">Colares</a></li>
	      <li><a href="/pedidos">Pedidos</a></li>
	     </c:if>
	     
	    </ul>
	    <ul class="nav navbar-nav navbar-right">
	    	<c:if test="${empty user}">
	      <li><a href="usuario/cadastro"><span class="glyphicon glyphicon-user"></span> Cadastrar-se</a></li>
	      	</c:if>
	      <c:if test="${empty user}">
	      	<li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Entrar</a></li>
	      </c:if>
	      <c:if test="${not empty user}">
	      	<li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Sair, ${user.nome}</a></li>
	      </c:if>
	    </ul>
	  </div>
	</nav>