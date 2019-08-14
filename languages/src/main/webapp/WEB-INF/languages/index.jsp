<%@ page isErrorPage="true" %>    
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<div class="row-wrap">
<h2>All Languages</h2>
</div>

<div class="container">
<a href="/new">New Book</a>
	<table class="highlight">
    <thead>
        <tr>
            <th>Name</th>
            <th>Creator</th>
            <th>Version</th>
            <th>Actions</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${Languages}" var="language">
        <tr>
            <td><c:out value="${language.name}" /></td>
            <td><c:out value="${language.creator}" /></td>
            <td><c:out value="${language.version}" /></td>
            <td>
            <a href="/languages/${language.id}/show">Show</a>
            | <a href="/languages/${language.id}/update">Update</a>
            <form style="display: inline-block" action="/languages/${language.id}/delete" method="post">
            	<input type="hidden" name="_method" value="Delete" />
            	<input type="submit" value="Delete" />
            </form>
            </td>
        </tr>
        </c:forEach>
    </tbody>
</table>
</div>
</div>

</body>
</html>