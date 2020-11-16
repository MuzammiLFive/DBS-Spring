package com.sunsoft;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
	@RequestMapping(value="/submit" ,method=RequestMethod.GET)
	public String getStatus(@RequestParam ("username") String name, @RequestParam("password") String password) {
		if (password.equals("admin")) {
			return "Valid";
		}
		else {
			return "Invalid";
		}
	}
}
