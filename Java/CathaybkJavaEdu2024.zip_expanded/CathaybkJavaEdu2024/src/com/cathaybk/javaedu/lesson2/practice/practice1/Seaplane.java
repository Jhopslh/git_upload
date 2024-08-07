package com.cathaybk.javaedu.lesson2.practice.practice1;

public class Seaplane extends Airplane implements Swimmer {

    public String name;

    public Seaplane(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println("海上飛機 " + name + " 航行海面");
    }

    @Override
    public void fly() {
        System.out.println("海上飛機 " + name + " 直線起飛");
    }

}
