package springHandsOnOne;

public class GolfCoach implements Coach {

	
	private FortuneService myfortuneService;
	
	
	public GolfCoach() {
		super();
	}
	public GolfCoach(FortuneService myfortuneService) {
		
		this.myfortuneService = myfortuneService;
		System.out.println("constructor object is created");
	}
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return myfortuneService.getFortune();
	}

}
