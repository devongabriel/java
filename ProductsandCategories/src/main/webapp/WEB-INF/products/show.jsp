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
<link type="text/css" rel="stylesheet" href="/css/main.css" >
<title>Insert title here</title>
</head>
<body>
	<div class="master-container">
		<div class="row-wrap">
			<h6>Products and Categories</h6>
				<hr>
		</div>

		<div class="container">
			<h2><c:out value="${product.name}"></c:out></h2>
	
				<div class="row">
					<div class="col">
					<h3>Categories</h3>
						<c:forEach items="${product.categories}" var="cat">
							<li><c:out value="${cat.name}"></c:out></li>
						</c:forEach>
			
					</div>
					<div class="col">
					<h3>Add Categories</h3>
						<form:form action="/addCategory" method="post" modelAttribute="middleTableObject">
							<form:select path="category" class="form-control">
								<c:forEach items="${allCategories}" var="cat">
									<form:option value="${cat.id}">
										<c:out value="${cat.name }"></c:out>
									</form:option>
								</c:forEach>
							</form:select>
							<form:hidden path="product" value="${product.id }" />
								<input type="submit" value="Add Category" class="btn btn-info">
						</form:form>
					</div>
				</div>
		</div>
	</div> 

</body>
</html>