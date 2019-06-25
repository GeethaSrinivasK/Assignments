package Assignment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:home.properties")
public class Home implements Address {

	@Value("${flatname}")
	private String Flat;
	@Value("${phoneno}")
	private int Phoneno;
	
	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return Flat+" "+Phoneno;
	}

}
