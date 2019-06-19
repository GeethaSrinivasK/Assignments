<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Object o=session.getAttribute("ses");
out.println("hello"+o.toString()+"<br/>");
out.println(session.isNew());
%>

</body>
</html>