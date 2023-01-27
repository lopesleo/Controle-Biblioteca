<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Biblioteca</title>
	<link rel="stylesheet" href="./css/style.css">
</head>
<body>
	<form action="/Biblioteca/ServletClienteLogar" method="post">
		<div class="container-index">
		<label>Login:
			<input type="text" name="login"> <br>
		</label>
		
		<label>Senha:
			<input type="password" name="senha"> <br>
		</label>
		
	<input id="enviar" type="submit">
		</div>

	</form>
	<p> ${erro}
	<div class="registrar-index">
		<a href="/Biblioteca/frmcliente.jsp"> Registrar-se</a>
	</div>
</body>
</html>

