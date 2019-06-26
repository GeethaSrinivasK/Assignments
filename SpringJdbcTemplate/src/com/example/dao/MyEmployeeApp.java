package com.example.dao;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.Employee;
import com.example.service.EmployeeService;


public class MyEmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ClassPathXmlApplicationContext context=new 	ClassPathXmlApplicationContext("appliactionContext.xml");
		
		//EmployeeDao dao=context.getBean("eDao",EmployeeDao.class);
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeService dao=ctx.getBean("empservice",EmployeeService.class);
		Scanner sc=new Scanner(System.in);
		int ch;
		do {
			
			System.out.println("1.Add Employee");
			System.out.println("2.Find Employee by Id");
			System.out.println("3.display employees list");
			System.out.println("4.exit");
			System.out.println("5.Update");
			System.out.println("6.find by name");
			System.out.println("enter ur choice:");
			ch=sc.nextInt();
	    switch(ch)
	    {
	    case 1:
		System.out.println("Enter employee id:");
		int id=sc.nextInt();
		
		System.out.println("Enter Employee first name:");
		String fn=sc.next();
		
		System.out.println("Enter Employee last name:");
		String ln=sc.next();
		
		System.out.println("enter employee salary");
		int sal=sc.nextInt();
		
		Employee employee=new Employee(id,fn,ln,sal);
		dao.addemployee(employee);
		break;
		
	    case 2:
	    	System.out.println("Enter employee id to search:");
			int id1=sc.nextInt();
	    	Employee emp=dao.findById(id1);
	    	if(emp!=null)
	    		System.out.println(emp.toString());
	    	
	    	break;
	    
	    case 3: 
	    	    List<Employee> li=dao.getAllEmployees();
	    	    for(Employee e:li)
	    	    	System.out.println(e);
	    	    break;
	    	    
	    case 4:
	    System.out.println("byee!!!!!");System.exit(0);
	    
	     break;
	     
	     
	     
	    case 5:System.out.println("Enter employee id to update:");
		      int id2=sc.nextInt();
    	       Employee emp1=dao.findById(id2);
    	               if(emp1!=null)
    	               {
    	            	   System.out.println("Enter Employee first name to update:");
    	           		String fn1=sc.next();
    	           		
    	           		System.out.println("Enter Employee last name to update:");
    	           		String ln1=sc.next();
    	           		
    	           		System.out.println("enter employee salary to update");
    	           		int sal1=sc.nextInt();
    	           		
    	           		dao.updateEmployee(fn1, ln1, sal1, id2);
    	           		
    	           			System.out.println("updated information successfully");
    	           		
    	           		 }
    	               
    	               else
    	            	   System.out.println("No record found with that id!!!");
    	               break;
    	           
    	               
	    case 6:System.out.println("Enter employee first name to search:");
		String name=sc.next();
    	List<Employee> emp3=dao.findByName(name);
    	for(Employee e:emp3)
    		System.out.println(e);
    	
    	break;
	      }
	    
	        
	         
	    }while(ch!=4);
	}

}
