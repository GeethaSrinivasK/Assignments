package com.example.demo;

public class BaseBallCoach implements Coach {

	
	
	private FortuneService myfortuneService;
	
	
	
	public void setMyfortuneService(FortuneService myfortuneService) {
		this.myfortuneService = myfortuneService;
		System.out.println("setMyFortuneService setter is injected");
	}

	public BaseBallCoach() {
		super();
	}

	public BaseBallCoach(FortuneService myfortuneService) {
	
		this.myfortuneService = myfortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Daily workout";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return myfortuneService.getFortune();
	}

}
