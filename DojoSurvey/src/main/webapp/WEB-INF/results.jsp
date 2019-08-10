<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojo Survey Form</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>

	<h1>Survey Form</h1>
	<hr>

	<div class="container">
		<h3>Submitted Information</h3>
		<h6>
			Name:
			<c:out value="${name}"/>
		</h6>
		<h6>
			Dojo Location:
			<c:out value="${location}"/></h6>
		<h6>
			Favorite Language:
			<c:out value="${language}"/>
		</h6>
		<h6>
			Comment(optional):
			<c:out value="${comment}"/></h6>
	</div>

</body>
</html>