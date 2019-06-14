<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>success page</title>
</head>
<body>
<%
	    String str=(String)request.getAttribute("Success");
	
	
	if(str!=null)
		{%>
		<font color='red'><%=str%></font><br/>
		
	<% }%>
</body>
</html>