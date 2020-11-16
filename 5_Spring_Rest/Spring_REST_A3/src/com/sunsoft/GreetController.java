package com.sunsoft;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class GreetController {
	@RequestMapping(value="/greet" ,method=RequestMethod.GET)
	public String Hello(@RequestParam ("firstname") String firstName, @RequestParam("lastname") String lastName) {
		return firstName + " " + lastName;
	}
}
