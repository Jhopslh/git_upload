package com.cathaybk.javaedu.lesson1;

/**
 * <pre>
 * 浮點數誤差
 * </pre>
 */
public class FloatingError {

    public static void main(String[] args) {
        double a1 = 0.1;
        double a2 = 0.2;
        System.out.println("加：" + (a1 + a2));

        double b1 = 1.0;
        double b2 = 0.9;
        System.out.println("減：" + (b1 - b2));

        double c1 = 0.1;
        double c2 = 0.1;
        System.out.println("乘：" + (c1 * c2));

        double d1 = 2.7;
        double d2 = 0.3;
        System.out.println("除：" + (d1 / d2));
    }

}
