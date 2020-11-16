package com.sunsoft;

public class Employee {
	private int empId;
	private String name;
	private String dept;
	private String designation;
	
	public Employee(int empId, String name, String dept, String designation) {
		super();
		this.empId = empId;
		this.name = name;
		this.dept = dept;
		this.designation = designation;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	
}
