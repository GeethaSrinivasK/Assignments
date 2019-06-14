package com.example.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.Employee;
import com.example.service.EmployeeService;
import com.example.service.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeController
 */
@WebServlet({ "/EmployeeController", "/controller.do" })
public class EmployeeController extends HttpServlet {
	
	
	private int eId;
	private String firstName, lastName;
	private int salary;

	private EmployeeServiceImpl eService;
	
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		eService = new EmployeeServiceImpl();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}

protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
	/*response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	if(request.getParameter("add")!=null)
	{
	eId = Integer.parseInt(request.getParameter("id"));

	firstName = request.getParameter("fn");
	lastName = request.getParameter("ln");
	salary = Integer.parseInt(request.getParameter("sal"));
	Employee employee = new Employee(eId, firstName, lastName, salary);

	int i=eService.createEmployee(employee);
	if(i==0)
	{
		request.setAttribute("ERROR","unable to add data" );
		
		RequestDispatcher view=request.getRequestDispatcher("/ErrorView");
		view.forward(request,response);
	}
	else
	{
       request.setAttribute("Success","data added successfully" );
		
		RequestDispatcher view=request.getRequestDispatcher("/list_employees.view");
		view.forward(request,response);
	}
	
	}
	
	if(request.getParameter("delete")!=null)
	{
		eId = Integer.parseInt(request.getParameter("id"));
		int i=eService.deleteEmployee(eId);
		if(i==0)
		{
			request.setAttribute("ERROR","unable to delete data" );
			
			RequestDispatcher view=request.getRequestDispatcher("/ErrorView");
			view.forward(request,response);
		}
		else
		{
	       request.setAttribute("Success","deleted successfully" );
			
			RequestDispatcher view=request.getRequestDispatcher("/list_employees.view");
			view.forward(request,response);
		}
	}
	
	if(request.getParameter("update")!=null)
	{
	eId = Integer.parseInt(request.getParameter("id"));

	firstName = request.getParameter("fn");
	lastName = request.getParameter("ln");
	salary = Integer.parseInt(request.getParameter("sal"));
	Employee employee = new Employee(eId, firstName, lastName, salary);

	int i=eService.updateEmployee(employee);
	if(i==0)
	{
		request.setAttribute("ERROR","unable to update data" );
		
		RequestDispatcher view=request.getRequestDispatcher("/ErrorView");
		view.forward(request,response);
	}
	else
	{
       request.setAttribute("Success","data updated successfully" );
		
		RequestDispatcher view=request.getRequestDispatcher("/list_employees.view");
		view.forward(request,response);
	}
	
	}*/
	
	
	
	PrintWriter out = response.getWriter();
	List<String> l=new ArrayList<String>();
	if(request.getParameter("button-1")!=null)
	{
	try {
	eId = Integer.parseInt(request.getParameter("e_id"));
	}
	catch(Exception e)
	{
		l.add("id field must benumeric");
	}
	firstName = request.getParameter("e_fname");
	if(firstName.length()<=0)
	{
		l.add("First Name field can't be blank");
	}
	lastName = request.getParameter("e_lname");
	if(lastName.length()<=0)
	{
		l.add("First Name field can't be blank");
	}
	
	try {
		salary = Integer.parseInt(request.getParameter("e_sal"));
		}
		catch(Exception e)
		{
			l.add("salary field must benumeric");
		}
	
	if(!l.isEmpty())
	{
		request.setAttribute("ERROR",l );
		RequestDispatcher view=request.getRequestDispatcher("add_employee.jsp");
		view.forward(request, response);
	}
	else {
		Employee employee = new Employee(eId, firstName, lastName, salary);
		eService.createEmployee(employee);
		request.setAttribute("E", employee);
		RequestDispatcher view=request.getRequestDispatcher("success.jsp");
		view.forward(request, response);
	}

	}
	
	
	if(request.getParameter("update")!=null)
	{
	try {
	eId = Integer.parseInt(request.getParameter("id"));
	}
	catch(Exception e)
	{
		l.add("id field must benumeric");
	}
	firstName = request.getParameter("fn");
	if(firstName.length()<=0)
	{
		l.add("First Name field can't be blank");
	}
	lastName = request.getParameter("ln");
	if(lastName.length()<=0)
	{
		l.add("First Name field can't be blank");
	}
	
	try {
		salary = Integer.parseInt(request.getParameter("sal"));
		}
		catch(Exception e)
		{
			l.add("salary field must benumeric");
		}
	
	if(!l.isEmpty())
	{
		request.setAttribute("ERROR",l );
		RequestDispatcher view=request.getRequestDispatcher("update.jsp");
		view.forward(request, response);
	}
	else {
		Employee employee = new Employee(eId, firstName, lastName, salary);
		int i=eService.updateEmployee(employee);
		RequestDispatcher view;
		if(i==0)
		{
			request.setAttribute("Errors", "unable to update updated");
			view=request.getRequestDispatcher("update.jsp");
			
		}
		else
		{
		request.setAttribute("Success", "updated successfully");
		view=request.getRequestDispatcher("success.jsp");
		}
		view.forward(request, response);
	}

	}
	if(request.getParameter("delete")!=null)
	{
	try {
	eId = Integer.parseInt(request.getParameter("id"));
	}
	catch(Exception e)
	{
		l.add("id field must be numeric");
	}
	
	
	
	
	if(!l.isEmpty())
	{
		request.setAttribute("ERROR",l );
		RequestDispatcher view=request.getRequestDispatcher("delete.jsp");
		view.forward(request, response);
	}
	else {
		RequestDispatcher view;
		int i=eService.deleteEmployee(eId);
		if(i==0)
		{
		request.setAttribute("ERRORS", "unable to delete");
	     view=request.getRequestDispatcher("delete.jsp");
		}
		else
		{
			request.setAttribute("Success", "Deleted Successfully");
		view=request.getRequestDispatcher("success.jsp");
		}
		view.forward(request, response);
	}

	}
	
	}	

}
