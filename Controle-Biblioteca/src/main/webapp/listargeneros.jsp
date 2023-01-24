<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri= "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1 "http-equiv="Content-Type" content ="text/html">
<title>Biblioteca - Listar Genero</title>
</head>
<body>
<c:forEach var="genero" items ="${generos}">
<p> ${genero.id} - ${genero.nome}<br>
</c:forEach>
</body>
</html>