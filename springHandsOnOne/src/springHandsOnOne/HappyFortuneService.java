package springHandsOnOne;

import java.util.Random;

public class HappyFortuneService implements FortuneService{

	
	public Random random=new Random();
	public String[] str = {"today is ur lucky day","run 500 mts","do practice"};
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		int i=random.nextInt(str.length);
		return str[i];
	}
	

}
