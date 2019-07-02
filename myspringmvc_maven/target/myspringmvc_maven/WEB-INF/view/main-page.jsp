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
Username:<form:input path="username"/><form:errors path="username"/>
Password:<form:input path="password"/><form:errors path="password"/>
<input type="submit" value="submit"/>
</form:form></body>
</html>