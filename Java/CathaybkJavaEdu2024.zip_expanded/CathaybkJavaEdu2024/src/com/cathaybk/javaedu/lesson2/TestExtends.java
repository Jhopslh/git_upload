package com.cathaybk.javaedu.lesson2;

public class TestExtends {

    public static void main(String[] args) {

        Father father = new Father();

        Son son = new Son("Peter");
        System.out.println(son.getName());
    }

}
