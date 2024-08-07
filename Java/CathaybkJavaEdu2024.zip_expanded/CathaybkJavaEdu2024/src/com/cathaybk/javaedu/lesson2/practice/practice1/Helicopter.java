package com.cathaybk.javaedu.lesson2.practice.practice1;

public class Helicopter extends Airplane {

    public String name;

    public Helicopter(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(name + " 垂直起飛");
    }

}
