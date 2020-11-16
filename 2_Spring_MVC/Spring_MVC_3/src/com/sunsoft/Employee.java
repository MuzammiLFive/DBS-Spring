package com.sunsoft;

public class Employee {
	private int empId;
	private String name;
	private int basic;
	private int hra;
	private int da;
	private int it;
	private int deductions;
	private int gross_sal;
	private int net_sal;
	
	public Employee(int empId, String name, int basic, int hra, int da, int it, int deductions) {
		super();
		this.empId = empId;
		this.name = name;
		this.basic = basic;
		this.hra = hra;
		this.da = da;
		this.it = it;
		this.deductions = deductions;
		this.setGross_sal();
		this.setNet_sal();
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
	public int getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	public int getHra() {
		return hra;
	}
	public void setHra(int hra) {
		this.hra = hra;
	}
	public int getDa() {
		return da;
	}
	public void setDa(int da) {
		this.da = da;
	}
	public int getIt() {
		return it;
	}
	public void setIt(int it) {
		this.it = it;
	}
	public int getDeductions() {
		return deductions;
	}
	public void setDeductions(int deductions) {
		this.deductions = deductions;
	}
	
	public int getGross_sal() {
		return gross_sal;
	}
	public void setGross_sal() {
		this.gross_sal = this.getBasic() + this.getDa() + this.getHra();
	}
	public int getNet_sal() {
		return net_sal;
	}
	public void setNet_sal() {
		this.net_sal = this.getGross_sal() - this.getIt() - this.getDeductions();
	}
}
