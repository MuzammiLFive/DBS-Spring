package com.sunsoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="insurance")
public class InsuranceData {
	@Id
	@Column(name="policyno")
	int policyno;
	
	@Column(name="due")
	int due;
	
	@Column(name="name")
	String name;
	
	@Column(name="tenure")
	int tenure;

	public int getPolicyno() {
		return policyno;
	}

	public void setPolicyno(int policyno) {
		this.policyno = policyno;
	}

	public int getDue() {
		return due;
	}

	public void setDue(int due) {
		this.due = due;
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

	public InsuranceData(int policyno, int due, String name, int tenure) {
		super();
		this.policyno = policyno;
		this.due = due;
		this.name = name;
		this.tenure = tenure;
	}

	public InsuranceData() {
		super();
	}

	
	
}
