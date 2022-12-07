<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registrar Cliente</title>
</head>
<body>
	<form action="/Biblioteca/ServletClienteAdicionar" method="get">
		<label>Nome: 
			<input type="text" name="nome"> <br>
		</label>
		
		<label>Login:
			<input type="text" name="login"> <br>
		</label>
		
		<label>Senha: 
			<input type="password" name="senha"> <br>
		</label>
		
	<input type="submit">
	</form>
</body>
</html>