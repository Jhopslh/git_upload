package com.cathaybk.javaedu.lesson2;

public class AutoBoxing {

    public static void main(String[] args) {
        // Auto Boxing => 基本型別 int 用Integer包裝
        Integer i = 5; // int
        int ii = 5;

        // Auto Unboxing => i 直接視為基本型別運算
        System.out.println(i + 5);

    }

}
