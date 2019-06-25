package springDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;


public class SwimCoach implements Coach {

	
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}

	public SwimCoach() {
		super();
	}

	@Override
	public String getDailyworkOut() {
		// TODO Auto-generated method stub
		return "swim Coach workkout";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	/*@PostConstruct
	public void doMyInitStuff() {
		
		System.out.println(">>Inside doMyInitStuff() ");
	}
	
	@PreDestroy
	public void doMyCleanUpStuff()
	{
		System.out.println(">>Inside doMyCleanUpStuff()");
	}
	*/
}
