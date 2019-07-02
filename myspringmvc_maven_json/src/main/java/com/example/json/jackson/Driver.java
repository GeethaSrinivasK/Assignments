package com.example.json.jackson;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			
			ObjectMapper map=new ObjectMapper();
			
			Student thestudent=map.readValue(new File("demo-title.json"),Student.class);
			System.out.println(thestudent.getFirstname()+" "+thestudent.getLastname());
			System.out.println(thestudent.getAddress().getCity());
			System.out.println(thestudent.getCountry());
			for(String s:thestudent.getLanguages())
			System.out.println(s);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
