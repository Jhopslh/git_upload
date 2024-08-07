package com.cathaybk.javaedu.lesson3;

public class Father {
    private String name;

    private String dept;

    private int age;

    public Father(String name, int age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    public void print() {
        System.out.println("Father Print");
    }

}
