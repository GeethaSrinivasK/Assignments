<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.exampleController.customerController" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="./css/style.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	    String str=(String)request.getAttribute("ERROR");
	
	
	if(str!=null)
		{%>
		<font color='red'><%=str%></font><br/>
		
	<% }%>
	<form id="form-1" action="customerController.do" method="post">
	
       <table>
		<tr><td><label id="label-1">Customer name</label></td>
		<td><input id="input-1" name="cName" type="text" required/></td></tr>
		<tr><td><label id="label-2">Address</label></td>
		<td><input id="input-2" name="cAddress" type="text" required/></td></tr>
		<tr><td><label id="label-3">Item</label></td>
		<td><select id="select" name="cItem" >
		    <option value="select">Select</option>
			<option value="laptop">Laptop</option>
			<option value="Oneplus">Oneplus</option>
			<option value="tablet">tablet</option>
		</select></td></tr>
		<tr><td>
		<input type="submit" value="Submit" name="submit" id="button-1"/>
		</td></tr>
		</table>

	</form>
	

</body>
</html>