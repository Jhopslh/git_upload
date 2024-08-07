package com.cathaybk.javaedu.lesson2.practice.practice1;

public class ConStudent extends Student {
	private String program;

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public ConStudent() {
		System.out.println("沒有傳入參數的ComStudent建構子");
	}

	public ConStudent(String name, int id, int grade, String program) {
		super(name,id,grade);
		this.program = program;
	}
	@Override
	public void print() {
		super.print();
		System.out.println("程式語言:"+program);
	}
}
