package springHandsOnOne;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassPathXmlApplicationContext ctxt=new ClassPathXmlApplicationContext("applicationContext.xml");
		
				
		Coach base=ctxt.getBean("GolfCoach",Coach.class);
		
		System.out.println(base.getFortune());
	}

}
