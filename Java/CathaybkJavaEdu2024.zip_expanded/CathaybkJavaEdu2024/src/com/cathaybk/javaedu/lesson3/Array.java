package com.cathaybk.javaedu.lesson3;

public class Array {
    public static void main(String[] args) {

        String[] strArr1 = new String[] { "123", "456", "789" };

        String[] strArr2 = new String[3];
        strArr2[0] = "123";
        strArr2[1] = "456";
        strArr2[2] = "789";
        strArr2[2] = strArr2[2] + "101";

        System.out.println(strArr1);
        System.out.println(strArr1.length);
        System.out.println(strArr2[1]);

        for (int i = 0; i < strArr1.length; i++) {
            System.out.println(strArr1[i]);
        }

        System.out.println("============================");
        for (String str : strArr2) {
            System.out.println(str);
        }

    }
}
