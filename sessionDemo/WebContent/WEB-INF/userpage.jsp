<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User page</title>
</head>
<body>

<%
/*Object o=session.getAttribute("ses");
out.println("hello"+o.toString()+"<br/>");
out.println(session.isNew());*/

Cookie[] cookies=request.getCookies();
for(int i=0;i<cookies.length;i++)
{
	out.println(cookies[i].getName()+"------->"+cookies[i].getValue());
}
%>
<a href="anotherpage.jsp">Another page</a>
</body>
</html>