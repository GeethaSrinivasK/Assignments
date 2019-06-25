package springDemo;

import org.springframework.stereotype.Component;

@Component
public class DogCoach implements Coach{

	@Override
	public String getDailyworkOut() {
		// TODO Auto-generated method stub
		return "feed ur dog daily";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
