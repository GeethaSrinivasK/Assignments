package springDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneSevice  implements FortuneService {

	public Random r=new Random();
	public String[] str=new String[3];
    
    public int index;
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		
		
		
		
		return str[index];
	}

	public void getRandomFortune()
	{
		try {
			File fs=new File("D:/sts work space/springhansOnTwo/src/fortune.txt");
			BufferedReader bf=new BufferedReader(new FileReader(fs));
			int i=0;
			String st;
			while((st=bf.readLine())!=null)
			{
			   
				str[i]=st;
				i++;
				
			}
		 index=r.nextInt(str.length);
		
			}
			catch(Exception e) {System.out.println(e);}
	}
	
}
