<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- BootStrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<!-- BootStrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
<link type="text/css" rel="stylesheet" href="/css/main.css">
<title>Insert title here</title>
</head>
<body>
<div class="master-container">
<div class="row-wrap">
<h6>Dojo's and Ninja's</h6>
<p class="anchor-links"><a href="/ninjas/new">Create Ninja</a></p>
<hr>
</div>

<div class="container">
<h2>Create A New Dojo</h2>
 	<p>
 		<form:errors path="newDojoObject.*" class="alert alert-danger"></form:errors>
 	<p>
	<form:form action="/dojos/new" method="post" modelAttribute="newDojoObject">
	<p>
		<form:label path="name">Name</form:label>
		<form:input path="name" class="form-control col-6 mb-2" />
	</p>
	<input type="submit" value="creat dojo" class="btn btn-success" />
	</form:form>
</div>
</div>

</body>
</html>