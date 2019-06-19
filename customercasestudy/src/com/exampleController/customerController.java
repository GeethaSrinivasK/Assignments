package com.exampleController;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exampleModel.Customer;
import com.exampleService.CustomerService;
import com.exampleService.CustomerServiceImpl;

/**
 * Servlet implementation class customerController
 */
@WebServlet("/customerController.do")
public class customerController extends HttpServlet {
	
    
	private String cname;
	private String citem;
	private String address;

	private CustomerServiceImpl csr;
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		csr = new CustomerServiceImpl();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}

	
protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
       response.setContentType("text/html");
       PrintWriter out = response.getWriter();
       if(request.getParameter("submit")!=null)
       {
       cname=request.getParameter("cName");
       citem=request.getParameter("cItem");
       address=request.getParameter("cAddress");
        if(citem.equals("select"))
        {
        	request.setAttribute("ERROR","Please select item from dropdown" );
    		
    		RequestDispatcher view=request.getRequestDispatcher("/add_customer.jsp");
    		view.forward(request,response);
        }
        
        else
        {
        	Customer cs=new Customer(cname, citem, address);
        	int i=csr.createCustomer(cs);
        	if(i==0)
        	{
        		request.setAttribute("ERROR","unable to insert data" );
        		
        		RequestDispatcher view=request.getRequestDispatcher("/add_customer.jsp");
        		view.forward(request,response);
        	}
        	else
        	{
                 request.setAttribute("C",cs );
        		
        		RequestDispatcher view=request.getRequestDispatcher("/success.jsp");
        		view.forward(request,response);
        	}
        }
       }
       if(request.getParameter("edit")!=null)
       { 
    	    int cid=Integer.parseInt(request.getParameter("cid"));
    	    request.setAttribute("getdata" ,cid);
    		
    		RequestDispatcher view=request.getRequestDispatcher("/update.jsp");
    		view.forward(request,response);
       }
       if(request.getParameter("update")!=null)
       {
    	  int  cid=Integer.parseInt(request.getParameter("cid"));
    	   cname=request.getParameter("cName");
           citem=request.getParameter("cItem");
           address=request.getParameter("cAddress");
           
           
            	int i=csr.updateCustomer(cid,cname,citem,address);
            	if(i==0)
            	{
                 request.setAttribute("ERROR","Unable to update data" );
        		
                 RequestDispatcher view=request.getRequestDispatcher("/update.jsp");
        		view.forward(request,response);
            	}
            	else
            	{
            		request.setAttribute("Success","Updated Succesfully" );
            		
            		RequestDispatcher view=request.getRequestDispatcher("/list_customers.view");
            		view.forward(request,response);
            	}
            }
            
         
            if(request.getParameter("delete")!=null)
            { 
         	    int cid=Integer.parseInt(request.getParameter("cid"));
         	   
                 
                 	int i=csr.deleteCustomer(cid);
                 	if(i==0)
                 	{
                      request.setAttribute("ERROR","Unable to delete data" );
             		
             		RequestDispatcher view=request.getRequestDispatcher("/delete.jsp");
             		view.forward(request,response);
                 	}
                 	else
                 	{
                 		request.setAttribute("success","deleted Succesfully" );
                 		
                 		RequestDispatcher view=request.getRequestDispatcher("/list_customers.view");
                 		view.forward(request,response);
                 	}
                 
            
            
       }
       
	}
}
 