package springDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:sport.proprties")
public class FootballCoach implements Coach{

	//property level injection
	
	//@Autowired
	private FortuneService myfortuneService;
	
	@Value("${foo.emailAddress}")
	private String emailAddress;
	
	@Value("${foo.team}")
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}


	public FootballCoach() {
		super();
	}
   
	
	//Constructor injection
	
	/*@Autowired
	public FootballCoach(FortuneService myfortuneService) {
		super();
		this.myfortuneService = myfortuneService;
	}*/
	
	//custom method injection
	
	
	/*@Autowired
	public void mtFortune(FortuneService myfortuneService)
	{
		this.myfortuneService = myfortuneService;
	}
*/
	@Override
	public String getDailyworkOut() {
		// TODO Auto-generated method stub
		return "practice football";
	}
   
	//setter injection
	
	@Autowired
	public void setMyfortuneService(@Qualifier("fileService")FortuneService myfortuneService) {
		this.myfortuneService = myfortuneService;
	}
	
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return myfortuneService.getFortune();
	}

	
	
    /* @PostConstruct
	public void generateRandomFortune()
	{
        myfortuneService.getRandomFortune();
		
	}
	
	
	@PreDestroy
	public void doSomeCleanupStuff()
	{
		System.out.println(">>Inside doSomeCleanupStuff()");
	}
	*/
}
