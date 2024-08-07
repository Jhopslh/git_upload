package com.cathaybk.javaedu.lesson2.practice.practice1;

public class Student implements IPrint {
	
	private String name;
	private int id;
	private int grade;
	public Student() {
		
	};
	public Student(String name, int id, int grade) {
		this.name=name;
		this.id=id;
		this.grade=grade;
	};
	public void print() {
		System.out.println("學生姓名:"+name+",學號:"+id+",年級:"+grade);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}
