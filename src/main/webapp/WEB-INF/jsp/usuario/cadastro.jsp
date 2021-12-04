<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Usuario</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"></head>
<body>
	<h1>CADASTRO DE USUARIO</h1>
   <div class="container">
      <form action="/usuario/incluir" method="post">
	      <div class="form-group">
	        <label>Nome:</label>
	        <input type="text" value="Jose Mario Alves Fae" class="form-control" placeholder="Entre com o seu nome" name="nome">
	      </div>
	      <div class="form-group">
	        <label>E-mail:</label>
	        <input type="email" value="josemario@jose.com.br" class="form-control" placeholder="Entre com o seu email" name="email">
	      </div>
	      <div class="form-group">
	        <label>Senha:</label>
	        <input type="password" value="12345678" class="form-control" placeholder="Digite sua senha" name="senha">
	      </div>
	      <button type="submit" class="btn btn-primary">Cadastrar</button>
      </form>
   </div>
</body>
</html> 