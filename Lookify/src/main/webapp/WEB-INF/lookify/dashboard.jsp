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
<h6><a href="/lookify/new">Add New Song</a></h6> 
<h6><a href="/lookify/topten">Top Songs</a></h6>
<div class="form-row">
	<form action="/lookify/search">
		<input class="form" class="form-control" type="search" name="search" placeholder="Artist">
		<input class="form" class="btn btn-outline-info" type="submit" value="Search Artists">
	</form>
</div>
</div>

<div class="container">
<table class="table table-hover">
        <thead>
          <tr>
              <th>Name</th>
              <th>Rating</th>
              <th>Actions</th>
          </tr>
        </thead>

        <tbody>
        	<c:forEach items="${Songs}" var="song">
          <tr>
            <td><a href="<c:out value="${song.id}" />"><c:out value="${song.title}" /></a></td>
            <td><c:out value="${song.rating}" /></td>
            <td>
            <h6><a style="display:inline-block" href="/lookify/${song.id}/delete">Delete</a></h6>
            </td>
          </tr>
          </c:forEach>
        </tbody>
      </table> 
</div>
</div>

</body>
</html>