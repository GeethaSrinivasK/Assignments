<%@page import="javax.sql.*"%>
<%@page import="java.sql.*" %>
<%@page import="java.util.*" %>
<%@page import="javax.naming.Context" %>
<%@page import="javax.naming.InitialContext"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="./css/style.css"/>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<% List<String> li=null;
 %>
<%
try{
	Context ctx=new InitialContext();
	javax.sql.DataSource ds=(DataSource)ctx.lookup("java:/comp/env/jdbc/ibm");
	Connection connection=ds.getConnection();
	Statement st=connection.createStatement();
	ResultSet rs=st.executeQuery("select utype from userdetail");
    li=new ArrayList<String>();
	while(rs.next())
	{
		li.add(rs.getString("utype"));
		
	}
	
}
catch(Exception e){}
%>
</head>
<body>


<form action="loginController.do" method="post" id="form-1">
    <table>
	<tr><td><label id="label-1">UserName</label></td>
	<td><input id="input-1" name="username" autofocus="true" required="true" type="text"/></td></tr>
	<tr><td><label for="input-2">Password</label></td>
	<td><input id="input-2" name="password" type="password" required/></td></tr>
	<tr><td><label id="label-2">User Type</label></td>
	<td><select name="uType">
	<option value="unknown">Select.....</option>
	
	
	
	<%
	    
	
	for(String str:li)
		{%>
		
		<option value='<%=str%>'><%=str%></option>
		
		
	<% }%>
	</select></td></tr>
	<tr><td><input type="submit" value="Login" id="button-1"/></td></tr>
	</table>
</form>
</body>
</html>