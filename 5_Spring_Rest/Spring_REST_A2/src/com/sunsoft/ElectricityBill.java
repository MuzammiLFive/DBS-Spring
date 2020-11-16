package com.sunsoft;

public class ElectricityBill {
	private int meterNo;
	private int monthlyConsumed;
	private int cpu;
	private String dueDate;
	
	private int bill;

	public ElectricityBill(int meterNo, int monthlyConsumed, int cpu, String dueDate) {
		super();
		this.meterNo = meterNo;
		this.monthlyConsumed = monthlyConsumed;
		this.cpu = cpu;
		this.dueDate = dueDate;
		this.setBill(monthlyConsumed, cpu);
	}

	public int getMeterNo() {
		return meterNo;
	}

	public void setMeterNo(int meterNo) {
		this.meterNo = meterNo;
	}

	public int getMonthlyConsumed() {
		return monthlyConsumed;
	}

	public void setMonthlyConsumed(int monthlyConsumed) {
		this.monthlyConsumed = monthlyConsumed;
	}

	public int getCpu() {
		return cpu;
	}

	public void setCpu(int cpu) {
		this.cpu = cpu;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	
	public void setBill(int m, int n ) {
		this.bill = (int) (m*n);
	}
	
	public int getBill() {
		return this.bill;
	}

	@Override
	public String toString() {
		return "ElectricityBill [meterNo=" + meterNo + ", monthlyConsumed=" + monthlyConsumed + ", cpu=" + cpu
				+ ", dueDate=" + dueDate + ", bill=" + bill + "]";
	}
}
