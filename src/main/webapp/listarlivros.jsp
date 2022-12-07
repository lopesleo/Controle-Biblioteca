<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri= "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Listar Livros</title>
</head>
<body>

	<form action="/Biblioteca/ServletLivroListar" method="get">
		Nome do livro <input type="text" name="nome"> <br>
		<div class="button">
			<button type="submit">Listar</button>
		</div>
	</form>
	<table>
	<c:forEach var="livro" items="${livros}">
		<tr>
			<td>${livro.titulo}</td>
			<td>${livro.descricao}</td>
			<td>${livro.autor}</td>
			<td>${livro.ano}</td>
			<td>${livro.genero.nome}</td>
			<td><a href="/Biblioteca/ServletLivroListarUm?id=${livro.id}">Alterar</a></td>
			<td><a href="/Biblioteca/ServletLivroExcluir?id=${livro.id}">Excluir</a></td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>