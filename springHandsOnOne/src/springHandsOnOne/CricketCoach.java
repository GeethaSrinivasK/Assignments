package springHandsOnOne;

public class CricketCoach implements Coach{

	
	private String emailAddress;
	private String team;
	
	private FortuneService myfortuneService;
	
	public CricketCoach()
	{
		super();
	}

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

	public FortuneService getMyfortuneService() {
		return myfortuneService;
	}

	public void setMyfortuneService(FortuneService myfortuneService) {
		this.myfortuneService = myfortuneService;
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return myfortuneService.getFortune();
	}
	
}
