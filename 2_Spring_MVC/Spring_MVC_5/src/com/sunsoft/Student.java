package com.sunsoft;

public class Student {
	private int id;
	private String name;
	private int standard;
	
	public Student(int id, String name, int standard) {
		super();
		this.id = id;
		this.name = name;
		this.standard = standard;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", standard=" + standard + "]";
	}
}
