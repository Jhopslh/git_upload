package com.cathaybk.practice.nt01900440.b;

public class Sales extends Employee {
	
	private int bonus;
	private int payment;

	public Sales(String name, String department,int salary, int performance) {
		super(name,department,salary);
		this.bonus=(int) (performance*0.05);
		this.payment=salary;
		
	}
	
	public void printInfo() {
		super.printInfo();
		StringBuilder sb = new StringBuilder();
		sb.append("業績獎金: ").append(bonus).append("\n總計:").append(super.getSalary() + bonus);
		System.out.println(sb.toString());
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public int getPayment() {
		return payment;
	}

	public void setPayment(int payment) {
		this.payment = payment;
	}
}
