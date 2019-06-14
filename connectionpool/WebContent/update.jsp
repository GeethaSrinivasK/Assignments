<%@page import="java.util.List"%>
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
		List<String> l = (List<String>) request.getAttribute("ERROR");
		if (l != null) {
			
			for(String str:l)
			{%>
				<font color='red'><%=str%></font><br/>
			<% }%>

		<% }%>
		
		
		<%
	    String str=(String)request.getAttribute("ERRORS");
	
	
	if(str!=null)
		{%>
		<font color='red'><%=str%></font><br/>
		
	<% }%>
<center>
<form action="controller.do" method="post" >

	<table data-role="table" id="table-1" class="ui-responsive">
		
		<tbody>
			<tr>
				
				
					<td><label for="text-1">Enter id</label></td>
					<td><input name="id" type="text"/>
			              </td>
			</tr>
			
			<tr>
			<td><label>Enter first name</label></td>
			<td><input type="text" name="fn" /> </td>
			</tr>
			
			<tr>
			<td><label>Enter Last name</label></td>
			<td><input type="text" name="ln" /> </td>
			</tr>
			<tr>
			<td><label>Enter Salary</label></td>
			<td><input type="number" name="sal" min=1000 max=5000 /> </td>
			</tr>
			<tr><td><input type="submit" value="update" onclick="return validate" name="update"></td></tr>
		</tbody>
	</table>
</form>
</center>
</body>
</html>