package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {

	@GetMapping("/")
	public String showMessage()
	{
		return "index";
	}
	
	@RequestMapping("/showform")
	public String Show()
	{
		return "form";
	}
}
