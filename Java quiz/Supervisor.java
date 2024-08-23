package com.cathaybk.practice.nt01900440.b;

public class Supervisor extends Employee {

	private int payment;
	
	public Supervisor(String name, String department,int salary) {
		super(name,department,salary);
		this.payment=salary;}

	public void printInfo() {
		super.printInfo();
		StringBuilder sb = new StringBuilder();
		sb.append("總計:").append(payment);
		System.out.println(sb.toString());
	}

	public int getPayment() {
		return payment;
	}

	public void setPayment(int payment) {
		this.payment = payment;
	}

}
