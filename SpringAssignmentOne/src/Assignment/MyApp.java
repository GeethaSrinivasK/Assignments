package Assignment;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*ClassPathXmlApplicationContext ctxt=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		Human hc=ctxt.getBean("customer",Human.class);
		System.out.println(hc.getDetails());*/
		
		
		AnnotationConfigApplicationContext ap=new AnnotationConfigApplicationContext(AssignmentConfig.class);
		Human hc=ap.getBean("customer",Human.class);
		
		System.out.println(hc.getDetails());
	}

}
