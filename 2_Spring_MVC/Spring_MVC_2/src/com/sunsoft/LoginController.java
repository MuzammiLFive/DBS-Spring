package com.sunsoft;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String HelloWorld(@RequestParam ("name") String name, @RequestParam ("password") String password, Model m) {
		
		if(password.equals("admin")) {
			ArrayList<Employee> employees = new ArrayList<Employee>();
			
			employees.add(new Employee(1, "Muzammil", "MOT", "Senior Officer"));
			employees.add(new Employee(2, "Shilpa", "MOT", "Senior Officer"));
			employees.add(new Employee(3, "Nithisha", "MOT", "Senior Officer"));
			m.addAttribute("employees", employees);
			return "details";
		} else {
			String message = "Sorry, username or password invalid";
			m.addAttribute("message", message);
			return "errorpage";
		}
	}
}
