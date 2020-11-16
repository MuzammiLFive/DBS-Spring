package com.sunsoft;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String HelloWorld(@RequestParam ("name") String name, Model m) {
		String message = "Hello " + name;
		m.addAttribute("message", message);
		return "welcome";
	}
}
