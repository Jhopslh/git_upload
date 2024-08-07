package com.cathaybk.javaedu.lesson2.oop.practice;

public abstract class Bird implements Flyer {

    public void fly() {
        System.out.println("fly");
    }

    public abstract void fly(String msg);

}