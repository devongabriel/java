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
<link type="text/css" href="css/main.css" rel="stylesheet">
<title>Lookify Java Assignment</title>
</head>
<body>
<div class="master-container">
<div class="row-wrap">
</div>

<div class="container">
<a href="/lookify/dashboard" class="dashboard-link">Dashboard</a> 
<form:form action="/lookify/process" method="post" modelAttribute="newSongObject">
	<p>
        <form:label path="title">Title</form:label>
        <form:errors path="title"/>
        <form:input class="form-control mb-2 col-6" path="title"/>
    </p>
	<p>
        <form:label path="artist">Artist</form:label>
        <form:errors path="artist"/>
        <form:input class="form-control mb-2 col-6" path="artist"/>
    </p>
	<p>
        <form:label path="rating">Rating</form:label>
        <form:errors path="rating"/>
        <form:select class="form-control mb-2 col-6" path="rating">
		    <option>1</option>
		    <option>2</option>
		    <option>3</option>
		    <option>4</option>
		    <option>5</option>
		    <option>6</option>
		    <option>7</option>
		    <option>8</option>
		    <option>9</option>
		    <option>10</option>
        </form:select>	    
    </p>
    <input type="submit" class="btn btn-outline-primary" value="Submit"/>
	</form:form>
</div>
</div>

</body>
</html>