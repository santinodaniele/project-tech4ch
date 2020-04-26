<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="tech4ch.generator.MuseumGenerator"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="summary">
		<input type="text" name="groupIndex" /> <br> <input
			type="submit" value="Submit">
	</form>
<%MuseumGenerator museumGenerator = new MuseumGenerator();
MuseumGenerator.initMuseum();
String index = request.getParameter("groupIndex");
%>
	<p><%=MuseumGenerator.museumGetVisitorSummary(index)%></p>
</body>
</html>


