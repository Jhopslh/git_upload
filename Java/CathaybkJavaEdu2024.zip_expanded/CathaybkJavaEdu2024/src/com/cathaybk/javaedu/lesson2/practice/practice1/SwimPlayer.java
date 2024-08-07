package com.cathaybk.javaedu.lesson2.practice.practice1;

public class SwimPlayer implements Swimmer {

    public String name;

    public SwimPlayer(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println(name + " 游泳");
    }

}
