package comm.example.springdemo;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	@RequestMapping("/showForm")
	public String showPage( Model theModel)
	
	{
		Student student=new Student();
		theModel.addAttribute("student",student);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm( @ModelAttribute("student") @Valid Student student,
			BindingResult bindingResult)
	{
		
		if(bindingResult.hasErrors())
		{
			return "student-form";
		}
		else
		{
			
			return "process-form";
		}
		
	}
	
	
	

}
