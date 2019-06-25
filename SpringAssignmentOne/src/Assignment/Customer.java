package Assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:customer.properties")
public class Customer implements Human {

	@Value("${cname}")
	private String customerName;
	
	@Value("${cid}")
	private int customerId;

   /* @Autowired
    @Qualifier("office")*/
	private Address address;
	
	public Customer(@Qualifier("home")Address address) {
		super();
		this.address=address;
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
	   String add=address.getAddress();
		return customerId+" "+customerName+" "+add;
	}
	
	
}
