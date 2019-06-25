package springDemo;

import org.springframework.stereotype.Component;

@Component("theCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyworkOut() {
		// TODO Auto-generated method stub
		return "practice back headtoday!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
