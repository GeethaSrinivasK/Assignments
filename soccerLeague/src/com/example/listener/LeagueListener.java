package com.example.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import comm.example.model.League;

import java.util.*;
public class LeagueListener implements ServletContextListener {

	String str=null;
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		ServletContext context=sce.getServletContext();
		
	str=(String)context.getInitParameter("league-file");
		String[] arr=str.split(",");
		List<League> l=new ArrayList<League>();
		l.add(new League(Integer.parseInt(arr[0]),arr[1],arr[2]));
		context.setAttribute("leaguelist",l);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
	str=null;
	System.out.println("Context Destroyed");
	}

	
}
