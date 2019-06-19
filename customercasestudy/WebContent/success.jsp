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
	    String str=(String)request.getAttribute("success");
	
	
	if(str!=null)
		{%>
		<font color='blue'><%=str%></font><br/>
		
	<% }%>
	
	<jsp:useBean id="C" scope="request" class="com.exampleModel.Customer" >

</jsp:useBean>
<jsp:getProperty property="cName" name="C"/>

<a href="list_customers.view">list customers</a><br/>
</body>
</html>