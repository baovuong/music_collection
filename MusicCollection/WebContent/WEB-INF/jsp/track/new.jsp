<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Track</title>
</head>
<body>
<div id="status"></div>
<h1>New Track</h1>
<form method="POST" action="new">
	Name: <input name="name" type="text">
	Artist: <input name="artist" type="text">
	Album: <input name="album" type="text">
	<input type="submit">
</form>
</body>
</html>