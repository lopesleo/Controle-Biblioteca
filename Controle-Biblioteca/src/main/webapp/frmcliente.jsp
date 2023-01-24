<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<link rel="stylesheet" href="./css/frmcliente.css">
<title>Registrar Cliente</title>
</head>
<body>
	<form action="/Biblioteca/ServletClienteAdicionar" method="get">
		<div class="container-index">
		<label>Nome: 
			<input type="text" name="nome"> <br>
		</label>
		
		<label>Login:
			<input type="text" name="login"> <br>
		</label>
		
		<label>Senha: 
			<input type="password" name="senha"> <br>
		</label>
		
	<input id="enviar" type="submit">
		</div>
	</form>
</body>
</html>