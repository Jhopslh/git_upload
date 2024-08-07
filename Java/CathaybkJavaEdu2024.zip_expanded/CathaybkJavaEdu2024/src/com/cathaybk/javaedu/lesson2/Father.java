package com.cathaybk.javaedu.lesson2;

/**
 * <pre>
 * 建構子與繼承
 * </pre>
 */
public class Father {

    public Father() {
        System.out.println("建構子印出內容");
    }

    public Father(String input) {
        System.out.println(input);
    }

    public Father(int input, String inputStr) {
        System.out.println(input);
    }

}