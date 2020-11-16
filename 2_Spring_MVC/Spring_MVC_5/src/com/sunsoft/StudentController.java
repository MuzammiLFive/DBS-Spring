package com.sunsoft;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
	HashMap<Integer, Student> cls = new HashMap<Integer, Student>();
	
	@RequestMapping("/create")
	public String create(@RequestParam ("id") int id, @RequestParam ("name") String name, @RequestParam("standard") int standard, Model m) {
		String message = "";
		if (!cls.containsKey(id)) {
			cls.put(id, new Student(id, name, standard));
			message = "Created!";
		} else {
			message = "Already Present";
		}
		m.addAttribute("message", message);
		return "output";
	}
	
	@RequestMapping("/read")
	public String read(@RequestParam ("id") int id, Model m) {
		String message = "";
		if (cls.containsKey(id)) {
			message = cls.get(id).toString();
		} else {
			message = "No Student Found.";
		}
		m.addAttribute("message", message);
		return "output";
	}
	
	@RequestMapping("/update")
	public String update(@RequestParam ("id") int id, @RequestParam ("name") String name, @RequestParam("standard") int standard, Model m) {
		String message = "";
		if (cls.containsKey(id)) {
			cls.get(id).setName(name);
			cls.get(id).setStandard(standard);
			message = "Updated";
		} else {
			message = "No Student Found.";
		}
		m.addAttribute("message", message);
		return "output";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam ("id") int id, Model m) {
		String message = "";
		if (cls.containsKey(id)) {
			cls.remove(id);
			message = "Student Remooved";
		} else {
			message = "No Student Found";
		}
		m.addAttribute("message", message);
		return "output";
	}
}
