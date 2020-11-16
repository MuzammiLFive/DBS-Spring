package com.sunsoft;

import java.util.HashMap;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bill")
public class ElectricityController {
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public String getMonthsBill(@PathVariable int id) {
		HashMap<Integer, ElectricityBill> bills = new HashMap<Integer, ElectricityBill>();
		
		bills.put(1, new ElectricityBill(1, 240, 7, "10-11-2020"));
		bills.put(2, new ElectricityBill(2, 110, 7, "21-11-2020"));
		bills.put(3, new ElectricityBill(3, 250, 7, "15-11-2020"));
		
		ElectricityBill b = null;
		if(bills.containsKey(id)) {
			b = bills.get(id);
		}
		
		return b.toString();
	}
}
