package com.cathaybk.practice.nt01900440.b;

public class Employee implements IWork {
	
	private String name;
	private String department;
	private int salary;
	
	public Employee(String name,String department, int salary) {
		this.name=name;
		this.department=department;
		this.salary=salary;
	}

	public void printInfo() {
		StringBuilder sb = new StringBuilder();
		sb.append("薪資單\n").append("姓名: ").append(name).append(" 工作部門: ")
		.append(department).append("\n月薪:").append(salary);
		System.out.println(sb.toString());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
