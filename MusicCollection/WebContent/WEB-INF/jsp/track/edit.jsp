<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Editing Track: ${track.id}</title>
</head>	
<body>
<form method="POST" action="edit">
Name: <input name="name" type="text" value="${track.name}"><br/>
Artist: <input name="artist" type="text" value="${track.artist}"><br/>
Album: <input name="album" type="text" value="${track.album}"><br/>
<input type="submit" value="Update">
</form>
</body>
</html>