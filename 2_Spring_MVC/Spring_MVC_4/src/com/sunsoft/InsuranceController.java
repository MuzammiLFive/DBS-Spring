package com.sunsoft;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InsuranceController {
	ArrayList<Insurance> InsList = new ArrayList<Insurance>();
	
	@RequestMapping("/formsubmit")
	public String submitForm(@RequestParam ("id") int id, @RequestParam ("name") String name, @RequestParam ("tenure") int tenure, @RequestParam ("due") int due, Model m) {
		InsList.add(new Insurance(id,name,tenure,due));
		return "enterid";
	}
	@RequestMapping("/display")
	public String display(Model m) {
		String message = "";
		if (InsList.size()!=0) {
			for (int i=0; i<InsList.size(); i++) {
				message = message + "\n" + InsList.get(i).toString();
			}
		} else {
			message = "No Records";
		}
		m.addAttribute("message",message);
		return "getDetails";
	}
}
