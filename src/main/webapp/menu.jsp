<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>menu</title>
</head>
<body>

<p> Usuário: ${cliente.nome} <br> <br> <br>

<a href="/Biblioteca/ServletGeneroListar?nextpage=listargeneros.jsp">listar generos</a><br>
<a href="/Biblioteca/ServletGeneroListar?nextpage=frmlivro.jsp">cadastrar livro</a><br>
<a href="/Biblioteca/ServletLivroListar?nextpage=listarlivros.jsp">Listar Livros</a><br>
<a href="frmgenero.jsp">Cadastrar Gêneros</a><br>
</body>
</html>