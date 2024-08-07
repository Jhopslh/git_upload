package com.cathaybk.javaedu.lesson1;

/**
 * <pre>
 * 物件比較 equals 方法
 * </pre>
 */
public class EqEquals {

    public static void main(String[] args) {
        String a = new String("1");
        String b = new String("1");

        if (a.equals(b)) {
            System.out.println("相等");
        } else {
            System.out.println("不相等");
        }
    }

}
