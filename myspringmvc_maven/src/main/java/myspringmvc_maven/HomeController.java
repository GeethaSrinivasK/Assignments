package myspringmvc_maven;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dao.UserDao;
@Controller
public class HomeController {
	
	@RequestMapping("/show")
	public String showmessage(Model themodel)
	{
		UserDetails us=new UserDetails();
		themodel.addAttribute("userd",us);
		return "main-page";
	}
	
	@RequestMapping("/check")
	public String check(@Valid@ModelAttribute("userd") UserDetails usd,BindingResult br)
	{
		if(br.hasErrors())
			return "main-page";
		else {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("appliactionContext.xml");
		UserDao user=ctx.getBean("eDao",UserDao.class);
	
		  UserDetails usr=user.checkUser(usd);
	if(usr!=null)
	 return "process-form";	
	else
		return "main-page";
		
		}
		
	}
}
