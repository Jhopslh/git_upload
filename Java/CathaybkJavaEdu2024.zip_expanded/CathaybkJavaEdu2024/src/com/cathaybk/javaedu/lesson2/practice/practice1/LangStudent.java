package com.cathaybk.javaedu.lesson2.practice.practice1;

public class LangStudent extends Student {
	public LangStudent() {
		System.out.println("沒有傳入參數的LangStudent建構子");
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	private String language;

	public LangStudent(String name, int id, int grade, String language) {
		super(name, id, grade);
		this.language = language;
	}
	public void print() {
		super.print();
		System.out.println("外語:"+language);
	}
}
