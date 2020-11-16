package com.sunsoft.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sunsoft.dao.UserDao;
import com.sunsoft.model.UserData;

@RestController
public class LoginController {
	@Autowired
	UserDao userDao;
	
	@RequestMapping(value="/login",  method=RequestMethod.POST)
	public String authenticate(@RequestParam ("username") String username, @RequestParam ("password") String password) {
		List<UserData> users = userDao.getUsers();
		for (int i=0; i<users.size(); i++) {
			UserData user = users.get(i);
			if (user.getUsername().equals(username)) {
				if (user.getPassword().equals(password)) {
					return "Welcome!";
				} else {
					return "Wrong Password.";
				}
			}
		}
		return "UnAuthorized User.";
	}
}
