package Assignment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:office.properties")
public class Office implements Address {

	@Value("${officename}")
	private String officeaddress;
	
	@Value("${phoneno}")
	private String phoneno;
	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return officeaddress+" "+phoneno;
	}

}
