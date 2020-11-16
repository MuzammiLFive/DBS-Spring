package com.sunsoft;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldConstructor {
	
	@RequestMapping("/hello")
	public String helloWorld(Model m) {
		String message = "This is my first MVC project.";
		m.addAttribute("message", message);
		
		return "hellopage";
	}
}
