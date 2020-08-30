<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to to-do</title>
</head>
<body>
<p>Welcome, ${name}</p>
<p>Your Todos are: </p>
<ol>
	<c:forEach items="${todos}" var="todo">
	<li>${todo.name} &nbsp; &nbsp;
	<a href="/delete-todo.do?todo=${todo.name}">Delete</a>
	</li>
	</c:forEach>
</ol>
<form action="/todo.do" method="post">
<input type="text" name="todo"/>
<input type="submit" value="Add"/>
</form>
</body>
</html>