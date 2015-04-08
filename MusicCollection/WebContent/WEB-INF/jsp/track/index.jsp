<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tracks</title>
</head>
<body>
<h1>Track Listing</h1>
<a href="tracks/new">Add New Track</a><br/>
<c:forEach var="track" items="${tracks}">
	${track.name} - ${track.artist} - ${track.album} 
	<a href="tracks/${track.id}/edit">edit</a>
	<a href="tracks/${track.id}/remove">remove</a>
	<br/>
</c:forEach>
</body>
</html>