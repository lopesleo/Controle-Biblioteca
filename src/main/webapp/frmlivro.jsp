<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri= "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/Biblioteca/ServletAdicionarLivro" method="post" >
<label>Titulo
<input type="text" name="titulo">
</label>
<br>
<label>Descrição
<input type="text" name="descricao">
</label>
<br>
<label>Autor
<input type="text" name="autor">
</label>
<br>
<label>Ano
<input type="text" name="ano">
</label>
<br>
Categoria <select name="idgenero">
<c:forEach var="genero" items="${generos}">
			<option value ="${genero.id}"> ${genero.nome} </option>			
		</c:forEach>
	</select>
<input type="submit">
</form>

</body>
</html>