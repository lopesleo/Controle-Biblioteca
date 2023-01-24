<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <link rel="stylesheet" href="./css/menu.css">
<title>menu</title>
</head>
<body>

<p> Usuário: ${cliente.nome} <br> <br> <br>
    <div class="container-menu">
    <div><a href="/Biblioteca/ServletGeneroListar?nextpage=listargeneros.jsp">listar generos</a></div>
    <div><a href="/Biblioteca/ServletGeneroListar?nextpage=frmlivro.jsp">cadastrar livro</a></div>
    <div><a href="/Biblioteca/ServletLivroListar?nextpage=listarlivros.jsp">Listar Livros</a></div>
    <div><a href="frmgenero.jsp">Cadastrar Gêneros</a></div>
</div>
</body>
</html>