<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
<link rel="stylesheet" href="css/main.css">
<title>Languages Java Assignment</title>
</head>
<body>
<div class="master-container">
<div class="row">
</div>

<div class="container">
	<h3><c:out value="${Language.name}"/></h3>
	<p>Creator: <c:out value="${Language.creator}"/></p>
	<p>Version: <c:out value="${Language.version}"/></p>
<%-- 	<a href="/languages/${language.id}/edit">Edit Language</a> --%>
	<form action="/languages/${Language.id}" method="post">
	    <input type="hidden" name="_method" value="delete">
	    <input type="submit" value="Delete">
	</form>
</div>
</div>

</body>
</html>