<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Removing Track ${id}</title>
</head>
<body>
<h1>Are you sure you want to remove the following?</h1>
<h2>${track.name} - ${track.artist} - ${track.album}</h2>
<form action="remove" method="POST">
<input name="answer" type="submit" value="Yes">
<input name="answer" type="submit" value="No">
</form>
</body>
</html>