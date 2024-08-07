package com.cathaybk.javaedu.lesson1;

public class Method {

    public static void main(String[] args) {
        int a = 5;
        System.out.println("計算前 " + a);
        a = multiply(a, 2);
        System.out.println("計算後 " + a);
    }

    public static int multiply(int input) {
        return input * 2;
    }

    public static int multiply(int input, int multiplier) {
        return input * multiplier;
    }

}
