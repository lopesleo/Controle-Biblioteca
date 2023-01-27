<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./css/genero.css">
<title>Cadastrar Generos</title>
</head>
<body>
<form action="/Biblioteca/ServletAdicionarGenero" method="get" >
<label>Genero
<input type="text" placeholder="buscar..." name="genero">

<div class="box">
	<input id="enviar" type="submit">
</div>

</label>

</body>
</html>