package springDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		FootballCoach tc=context.getBean("footballCoach",FootballCoach.class);
		
		System.out.println(tc.getDailyworkOut());
		System.out.println(tc.getDailyFortune());
		System.out.println(tc.getEmailAddress());
		System.out.println(tc.getTeam());
		context.close();
		
	*/
		
		
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(SportsConfig.class);
		
		Coach mycoach=ctx.getBean("swimCoach",Coach.class);
		
		System.out.println(mycoach.getDailyworkOut());
		System.out.println(mycoach.getDailyFortune());
		
	}

}
