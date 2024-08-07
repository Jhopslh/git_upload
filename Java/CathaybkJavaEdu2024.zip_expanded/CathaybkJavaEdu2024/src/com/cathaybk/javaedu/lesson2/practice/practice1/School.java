package com.cathaybk.javaedu.lesson2.practice.practice1;

public class School {
    public static void main(String[] args) {
        LangStudent langStudent = new LangStudent();
        ConStudent conStudent = new ConStudent();
        System.out.println("--------------");
        Student student1 = new LangStudent("小明", 88888, 1, "英文");
        Student student2 = new ConStudent("小華", 77777, 2, "Java");
        student1.print();
        student2.print();
    }
}


