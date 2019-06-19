package com.example.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
/**
 * Servlet implementation class LoginController
 */
@WebServlet("/loginController.do")
public class LoginController extends HttpServlet {
	
    private Connection connection;

	public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doProcess(request,response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			doProcess(request, response);
		} catch (SQLException | NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException, NamingException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	    connection=getMyConnection();
	   String  username=request.getParameter("username");
	   String pass=request.getParameter("password");
	   String utype=request.getParameter("uType");
	    PreparedStatement pst=connection.prepareStatement("select * from userdetail where uname=? AND password=? And utype=?");
	    pst.setString(1, username);
	    pst.setString(2, pass);
	    pst.setString(3, utype);
	    ResultSet rs=pst.executeQuery();
	    int item=0;
	    while(rs.next())
	    {
	    	item++;
	    }
	    if(item>0)
	    {
	    	/*HttpSession session=request.getSession();
	    	session.setAttribute("ses",request.getParameter("username"));*/
	    	Cookie ck1=new Cookie("c1",username);
	    	Cookie ck2=new Cookie("c2",pass);
	    	response.addCookie(ck1);
	    	response.addCookie(ck2);
	    	RequestDispatcher view=request.getRequestDispatcher("/WEB-INF/userpage.jsp");
	    	view.forward(request, response);
	    }
	    else
	    {
	    	out.println("<font color='red>username/password incorrect</font><br/>");
	    	RequestDispatcher view=request.getRequestDispatcher("home.jsp");
	    	view.forward(request, response);
	    }
	}
	
	public Connection getMyConnection() throws SQLException, NamingException
	{
		Context ctx=new InitialContext();
		javax.sql.DataSource ds=(DataSource)ctx.lookup("java:/comp/env/jdbc/ibm");
		return ds.getConnection();
		
	}
}
