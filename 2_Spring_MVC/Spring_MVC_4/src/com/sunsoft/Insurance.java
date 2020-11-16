package com.sunsoft;

public class Insurance {
	private int id;
	private String name;
	private int tenure;
	private int due;
	public Insurance(int id, String name, int tenure, int due) {
		super();
		this.id = id;
		this.name = name;
		this.tenure = tenure;
		this.due = due;
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
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public int getDue() {
		return due;
	}
	public void setDue(int due) {
		this.due = due;
	}
	@Override
	public String toString() {
		return "Insurance [id=" + id + ", name=" + name + ", tenure=" + tenure + ", due=" + due + "]";
	}
}
