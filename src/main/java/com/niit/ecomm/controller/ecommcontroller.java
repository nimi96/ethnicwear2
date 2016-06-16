package com.niit.ecomm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ecommcontroller {

	@RequestMapping("/")
	public String helloecomm()
	{
		return "index";
	}
	@RequestMapping("/signup")
	public String signUp()
	{
		return "signup";
	}
	
}
