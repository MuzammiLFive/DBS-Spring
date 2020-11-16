package com.sunsoft;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	ArrayList<Employee> employees = new ArrayList<Employee>();
	
	@RequestMapping("/formsubmit")
	public String submitForm(@RequestParam ("empId") int empid, @RequestParam ("name") String name, @RequestParam ("basic") int basic, @RequestParam ("hra") int hra, @RequestParam ("da") int da, @RequestParam ("it") int it, @RequestParam ("deductions") int deductions, Model m) {
		employees.add(new Employee(empid, name, basic, hra, da, it, deductions));
		return "enterid";
	}
	@RequestMapping("/display")
	public String selectPage(@RequestParam ("empId") int id, Model m) {
		for (int i=0; i<employees.size(); i++) {
			if (employees.get(i).getEmpId() == id) {
				m.addAttribute("employee", employees.get(i));
				return "getdetails";
			}
		}
		return "errorpage";
	}
}
