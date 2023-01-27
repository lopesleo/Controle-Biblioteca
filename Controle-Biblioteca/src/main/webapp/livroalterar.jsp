<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <title>Alterar Livro</title>
</head>
<body>
<h1>Alterar Livro</h1>
<form action="ServletLivroAlterar" method="get">
	 <input type="hidden" name="id" id="id" value="${livro.id}"><br>
  <label for="nome">Título</label><br>
  <input type="text" name="titulo" id="titulo" value="${livro.titulo}"><br>
   <label for="nome">Descrição</label><br>
  <input type="text" name="descricao" id="descricao" value="${livro.descricao}"><br>
   <label for="nome">Autor</label><br>
  <input type="text" name="autor" id="autor" value="${livro.autor}"><br>
   <label for="nome">Ano</label><br>
  <input type="text" name="ano" id="ano" value="${livro.ano}"><br>
  <label for="genero">Genero</label><br>
  <select name="idgenero" id="genero">
    <c:forEach var="genero" items="${generos}">
    <option value ="${genero.id}" <c:if test="${livro.genero.id == genero.id}" >selected</c:if>>${genero.nome}</option>
    </c:forEach>
  </select><br>
  <br>
  <input type="submit" value="Submit">
</form>
</body>
