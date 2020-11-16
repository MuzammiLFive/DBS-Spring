package test;

public class Student {
	private String name;
	private int rollno;
	
	public void getName() {
		System.out.println(name);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void getRollno() {
		System.out.println(rollno);
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public Student() {
		super();
	}
	public Student(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}
	
	public void printThrowException() {
		throw new IllegalArgumentException();
	}
	public void validate(int x) {
		if (x<18) {
			throw new ArithmeticException("Not valid age to vote");
		}
		else {
			System.out.println("Valid age to vote");
		}
	}
}
