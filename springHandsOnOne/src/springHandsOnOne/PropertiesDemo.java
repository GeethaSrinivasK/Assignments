package springHandsOnOne;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("properties-applicationContext.xml");
		
		
		TennisCoach tc=ctx.getBean("myTennisCoach",TennisCoach.class);
		
		/*System.out.println(tc.getEmailAddress());
		System.out.println(tc.getTeam());*/
		
		TennisCoach coach=ctx.getBean("myTennisCoach",TennisCoach.class);
		
		boolean res=(coach==tc);
		System.out.println("coach and tc referring to same object --->"+res);
		System.out.println("memory location of tc  -->"+tc);
		System.out.println("memory location of coach  -->"+coach);
		
		
	}

}
