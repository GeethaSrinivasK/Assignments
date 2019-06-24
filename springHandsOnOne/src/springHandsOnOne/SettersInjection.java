package springHandsOnOne;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SettersInjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("setters-applicationContext.xml");
		
		CricketCoach ch=context.getBean("myCoach",CricketCoach.class);
		
		System.out.println(" email Address -->"+ch.getEmailAddress());
		System.out.println("team -->"+ch.getTeam());
		System.out.println(ch.getFortune());

	}

}
