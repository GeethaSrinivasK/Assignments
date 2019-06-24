package springHandsOnOne;

public class TennisCoach implements Coach {

	private String emailAddress;
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



	public TennisCoach() {
		super();
	}



	private String team;
	
	
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
