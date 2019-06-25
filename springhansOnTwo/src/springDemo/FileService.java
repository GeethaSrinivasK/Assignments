package springDemo;

import org.springframework.stereotype.Component;

@Component
public class FileService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "this is file service";
	}

	@Override
	public void getRandomFortune() {
		// TODO Auto-generated method stub

	}

}
