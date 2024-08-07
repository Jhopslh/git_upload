package com.cathaybk.javaedu.lesson2.oop.practice;

/**
 * <pre>
 * 小試身手
 * </pre>
 */
public class Son extends Father {

    public static void main(String[] args) {
        new Son("father.");
        //        new Son();
    }

    public Son() {
        System.out.println("Hello");
    }

    public Son(String msg) {
        super("my son.");
        //        super();
        System.out.println("Hello, " + msg);
    }

}
