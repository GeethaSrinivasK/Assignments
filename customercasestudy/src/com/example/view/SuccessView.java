package com.example.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.exampleService.CustomerServiceImpl;



/**
 * Servlet implementation class SuccessView
 */
@WebServlet({ "/SuccessView", "/list_customers.view" })
public class SuccessView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			doProcess(request,response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			doProcess(request,response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
protected void doProcess(HttpServletRequest request, 
		HttpServletResponse response) throws ServletException, IOException, SQLException {
		
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	
	CustomerServiceImpl emp=new CustomerServiceImpl();
	ResultSet rs=emp.getCustomers();
	out.println("<html><body><table border='1'><th>Customer name</th><th>Customer address</th><th>item</th><th>id</th><th>Update</th><th>Delete</th>");
	while(rs.next())
	{
		//request.setAttribute("id", rs.getInt(4));
		out.println("<tr><td>"+rs.getString(1)+"</td><td>"
		+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getInt(4)+
		"</td><td><form action='customerController.do'><input type='number' style='display:none'  name='cid' value="+
				rs.getInt(4)+"><input type='submit' value='Edit' name='edit'></form>"+
				"</td><td>"+"<form action='customerController.do'><input type='number' style='display:none'  name='cid' value="+rs.getInt(4)+"><input type='submit' value='delete' name='delete'></form></td></tr>");
		
	
	}
	

	
	
	}
}
