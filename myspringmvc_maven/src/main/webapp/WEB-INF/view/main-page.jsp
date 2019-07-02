<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="check" method="post" modelAttribute="userd">
<table><tr><td>
Username:</td><td><form:input path="username"/></td><td><form:errors path="username"/></td></tr><tr>
<td>Password:</td><td><form:input path="password"/></td><td><form:errors path="password"/></td></tr>
<input type="submit" value="submit"/>
</form:form></body>
</html>