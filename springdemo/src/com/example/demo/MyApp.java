package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ClassPathXmlApplicationContext ctxt=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*Coach thecoach=ctxt.getBean("myTrackCoach",Coach.class);
		
	
		System.out.println(thecoach.getDailyWorkout());*/
		
		Coach base=ctxt.getBean("baseBallCoach",Coach.class);
		
		System.out.println(base.getDailyWorkout());
		System.out.println(base.getDailyFortune());
	}

}
