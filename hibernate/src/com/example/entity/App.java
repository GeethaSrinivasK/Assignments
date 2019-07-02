package com.example.entity;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.Service.StudentService;
import com.example.Service.StudentServiceImpl;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choice=0;
		Scanner s=new Scanner(System.in);
		StudentService st=new StudentServiceImpl();
		do
		{
			
			System.out.println("1.Display");
			System.out.println("2.insert");
			System.out.println("3.Find by id");
			System.out.println("4.exit");
			System.out.println("5.find by name");
			System.out.println("6.update");
			System.out.println("7.Delete");
			System.out.println("Enter ur choice");
			choice=s.nextInt();
			switch(choice)
			{
			case 1:
				 List<Student> li= st.getStudents();
				 for(Student sts:li)
					 System.out.println(sts);
				break;
				
			case 2:System.out.println("Enter first name");
			      String fn=s.next();
			      System.out.println("Enter Last name");
			      String ln=s.next();
			      System.out.println("Enter email");
			      String email=s.next();
			      Student student=new Student(fn,ln,email);
			      st.createStudent(student);
			      System.out.println("Inserted successfully");break;
			case 3:System.out.println("Enter id");
			   int id=s.nextInt();
			  Student stu= st.getStudentbyId(id);
			  if(stu!=null)
				  System.out.println(stu);
			  else
				  System.out.println("Invalid");
			  
			  break;
			
			
			case 5:System.out.println("enter name");
			
			       String f=s.next();
			       List<Student> li1= st.FindByName(f);
					 for(Student sts:li1)
						 System.out.println(sts);
					  break;	
			case 6:System.out.println("enter id to update");
			        int id1=s.nextInt();
			        Student stu1= st.getStudentbyId(id1);
			       if(stu1!=null)
			       {
			    	   System.out.println("Enter first name");
					      String fn1=s.next();
					      System.out.println("Enter Last name");
					      String ln1=s.next();
					      System.out.println("Enter email");
					      String email1=s.next();
					      Student student1=new Student(fn1,ln1,email1);
					      st.updateStudent(student1);
			    	   
			       }
			case 4:System.out.println("byee!!!!");
			System.exit(0);
			}
		}while(choice!=4);
	}

}
