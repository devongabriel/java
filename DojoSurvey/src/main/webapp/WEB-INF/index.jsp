<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java Dojo Survey</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>

	<div class="container">
		<form action="/process" method="post">
			<div class="form-group">
				<label for="exampleFormControlInput1">Your Name</label> <input
					type="name" class="form-control" id="surveyform"
					placeholder="Jane Doe" name="name">
			</div>
			<div class="form-group">
				<label for="exampleFormControlSelect1">Dojo Location</label> <select
					class="form-control" id="surveyform" name="location">
					<option>Seattle</option>
					<option>Silicon Valley</option>
					<option>Berkeley</option>
					<option>Boise</option>
					<option>Los Angeles</option>
					<option>Orange County</option>
					<option>Tulsa</option>
					<option>Tyson's Corner</option>
					<option>Dallas</option>
					<option>Chicago</option>
				</select>
			</div>
			<div class="form-group">
				<label for="exampleFormControlSelect2">Favorite Language</label> <select
					multiple class="form-control" id="surveyform" name="language">
					<option>.Net/C#</option>
					<option>Python</option>
					<option>Ruby on Rails</option>
					<option>Mean</option>
					<option>Java</option>
				</select>
			</div>
			<div class="form-group">
				<label for="exampleFormControlTextarea1">Comment (optional)
				</label>
				<textarea class="form-control" id="surveyform" rows="3"
					name="comment"></textarea>
			</div>
			<input class="btn btn-primary" type="submit" value="Submit">
		</form>
	</div>


</body>
</html>