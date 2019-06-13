package comm.example.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddLeagueView
 */
@WebServlet(
		urlPatterns = { "/AddLeagueView.view" }, 
		initParams = { 
				@WebInitParam(name = "seson-list", value = "select,summer,winter,spring")
		})
public class AddLeagueView extends HttpServlet {
	
	private String seasonlist=null;
	private String[] seasonArr;
	
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		seasonlist=config.getInitParameter("seson-list");
		seasonArr=seasonlist.split(",");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	  doProcess(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<html><head>"
				+ "<link rel='stylesheet' type='text/css' href='./css/style.css'></head>");
		
		
		List<String> li=(List<String>)request.getAttribute("ERROR");
		if(li!=null)
		{
			out.println("<font color='red'>Please correct errors</font><br/>");
		for(String s:li)
		{
			
			out.println("<font color='red'>"+s+"</font><br/>");
			
		}
		}
		out.println("<br/>");
		
		
		
		
		out.println("<form action='add_league.do' method='post'>");
		out.println("Year<input type='text' name='year' ><br/><br/>");
		
	      out.println("Season<select name='season'>");
	      
	      
	      for(String s:seasonArr)
	      {
	    	  out.println("<option value='"+s+"'>"+s+"</option>");
	      }
	      out.println("</select><br/><br/>");
	      out.println("Title<input type='text' name='title'><br/>");
	      out.println("<input type='submit' value='Add League' ></form>");
	}
}
