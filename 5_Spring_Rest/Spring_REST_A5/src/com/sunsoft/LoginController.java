package com.sunsoft;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@RequestMapping(value="/verify", method=RequestMethod.POST)
	public ResponseEntity<String> verify(@RequestParam ("username") String name, @RequestParam ("password") String password) {
		HashMap<String, String> users = new HashMap<String, String>();
		users.put("muzammil", "admin");
		users.put("Raghu", "fresher");
		users.put("Abhi", "abhi5001");
		
		if (users.containsKey(name)) {
			if (users.get(name).equals(password)) {
				return new ResponseEntity<String>(HttpStatus.ACCEPTED);
			} else {
				return new ResponseEntity<String>(HttpStatus.UNAUTHORIZED);
			}
		} else {
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}
	}
}
