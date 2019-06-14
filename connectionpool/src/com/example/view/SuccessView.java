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

import com.example.service.EmployeeServiceImpl;



/**
 * Servlet implementation class SuccessView
 */
@WebServlet({ "/SuccessView", "/list_employees.view" })
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
	
	EmployeeServiceImpl emp=new EmployeeServiceImpl();
	ResultSet rs=emp.getAllEmployees();
	out.println("<html><body><table border='1'><th>ID</th><th>Firstname</th><th>LastName</th><th>Salary</th>");
	while(rs.next())
	{
		out.println("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getInt(4)+"</td></tr>");
	}

	
	
	}
}
