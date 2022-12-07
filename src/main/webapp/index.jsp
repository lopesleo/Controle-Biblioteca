<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Biblioteca</title>
</head>
<body>
	<form action="/Biblioteca/ServletClienteLogar" method="post">
		<label>Login:
			<input type="text" name="login"> <br>
		</label>
		
		<label>Senha: 
			<input type="password" name="senha"> <br>
		</label>
		
	<input type="submit">
	</form>
	<p> ${erro}
	<a href="/Biblioteca/frmcliente.jsp"> Registrar-se</a>
</body>
</html>

