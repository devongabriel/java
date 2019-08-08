<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demo JSP</title>
</head>
<body>
 <!-- declaration tag for methods -->
	<%! 
	public int add (int a, int b){
		return a + b;
	}
	
	%>
	
	<!-- this is a tag for any java code -->
	<%! 
	int i = 2;
	int j = 4;
	%>
	
	<!-- shortcut that shows output for whatever returns from our method call -->
	<h3><%= add(i,j) %></h3>
	
	<%for (int index = 0; index < 5; index++){ %>
		<h1><%= index %></h1>
	<% } %>
	<!-- here we have to import the Date class, put the import into the first line of the jsp tag, use the import attribute  -->
	<p>The time is <%= new Date() %></p>
</body>
</html>