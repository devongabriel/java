<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
<link rel="stylesheet" href="css/main.css">
<title>JAVA MVC Assignment</title>

</head>
<body>
<div class="container">
<div class="row">
<h6>JAVA MVC </h6>
</div>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<h4><c:out value="${book.title}"/></h4>
<p>Description: <c:out value="${book.description}"/></p>
<p>Language: <c:out value="${book.language}"/></p>
<p>Number of pages: <c:out value="${book.numberOfPages}"/></p>
<a href="/books/${book.id}/edit">Edit Book</a>
<form action="/books/${book.id}" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
</form>
</div>

</body>
</html>