package com.sunsoft.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sunsoft.dao.InsuranceDao;
import com.sunsoft.model.InsuranceData;

@RestController
public class InsuranceController {
	@Autowired
	InsuranceDao insuranceDao;
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String create(@RequestParam ("policyno") int pno, @RequestParam ("due") int due,  @RequestParam ("name") String name,  @RequestParam ("tenure") int tenure) {
		InsuranceData d = new InsuranceData(pno, due, name, tenure);
		insuranceDao.insertData(d);
		return "Created Successfully";
	}
	@RequestMapping(value="/read", method=RequestMethod.GET)
	public String read() {
		return insuranceDao.read().toString();
	}
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String update(@RequestParam ("policyno") int pno, @RequestParam ("due") int due,  @RequestParam ("name") String name,  @RequestParam ("tenure") int tenure) {
		InsuranceData d = new InsuranceData(pno, due, name, tenure);
		insuranceDao.insertData(d);
		return "Updated";
	}
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public String deleteById(@RequestParam ("id") int id) {
		insuranceDao.deleteById(id);
		return "successfully deleted";
	}
}
