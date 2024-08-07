package com.cathaybk.javaedu.lesson1;

/**
 * <pre>
 * 物件比較 pools
 * </pre>
 */
public class EqStringPool {

    public static void main(String[] args) {
        String a = "1";
        String b = "1";
        
        if (a == b) {
            System.out.println("相等");
        } else {
            System.out.println("不相等");
        }
    }

}
