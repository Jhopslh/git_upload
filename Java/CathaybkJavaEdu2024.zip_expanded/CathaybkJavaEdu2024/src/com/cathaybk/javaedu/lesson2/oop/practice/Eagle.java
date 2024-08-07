package com.cathaybk.javaedu.lesson2.oop.practice;

public class Eagle extends Bird {

    @Override
    public void fly(String msg) {
        System.out.println(" fly " + msg);
    }
    
    public void fly() {
        System.out.println("Eagle fly");
    }

    public static void main(String[] args) {
        Eagle eagle1 = new Eagle();
        eagle1.fly();
        eagle1.fly("high");
    }


}
