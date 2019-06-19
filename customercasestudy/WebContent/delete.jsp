<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form id="form-1" action="customerController.do" method="post">
	
       <table>
       <tr><td><label id="label-1">Customer id</label></td>
		<td><input id="input-1" name="cid" type="number" required/></td></tr>
		<tr><td>
		<input type="submit" value="Delete" name="delete" id="button-1"/>
		</td></tr>
		</table>

	</form>
</body>
</html>