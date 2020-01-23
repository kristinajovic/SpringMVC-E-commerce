package com.yrrhelp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCotroller {

	
	@RequestMapping("/")
	public String showHomePage() {
		System.out.println("In Home Page");
		return "home";
	}
	
	
}
