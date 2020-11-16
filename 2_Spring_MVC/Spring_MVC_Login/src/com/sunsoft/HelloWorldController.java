package com.sunsoft;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/login")
	public String helloWorld (@RequestParam ("name") String name, @RequestParam ("password") String password, Model m) {
		
		if (password.equals("admin")) {
			String message = "You are a valid user, Welcome "+name;
			m.addAttribute("message", message);
			return "hellopage";
		} else {
			String message = "Sorry, username or password invalid";
			m.addAttribute("message", message);
			return "errorpage";
		}
	}
}
