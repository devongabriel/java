<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ page isErrorPage="true" %>    
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
	<h2>Edit A Language</h2>
</div>

<div class="container">
	<form:form action="/languages/${editLanguageObject.id}" method="post" modelAttribute="editLanguageObject">
		<input type="hidden" name="_method" value="put">
	<p>
        <form:label path="name">Name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
	<p>
        <form:label path="creator">Creator</form:label>
        <form:errors path="creator"/>
        <form:input path="creator"/>
    </p>
	<p>
        <form:label path="version">Version</form:label>
        <form:errors path="version"/>
        <form:input path="version"/>
    </p>
    <input type="submit" class="btn waves-effect waves-light" value="Submit"/>
	</form:form>
</div>
</div>
</body>
</html>