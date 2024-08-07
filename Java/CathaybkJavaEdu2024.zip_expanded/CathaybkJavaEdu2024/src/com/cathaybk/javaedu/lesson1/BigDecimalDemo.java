package com.cathaybk.javaedu.lesson1;

import java.math.BigDecimal;

/**
 * <pre>
 * BigDecimal 操作示範
 * </pre>
 */
public class BigDecimalDemo {

    public static void main(String[] args) {
        BigDecimal a1 = new BigDecimal("0.1");
        BigDecimal a2 = new BigDecimal("0.2");
        System.out.println("加：" + a1.add(a2).toPlainString());

        BigDecimal b1 = new BigDecimal("1.0");
        BigDecimal b2 = new BigDecimal("0.9");
        System.out.println("減：" + b1.subtract(b2).toPlainString());

        BigDecimal c1 = new BigDecimal("0.1");
        BigDecimal c2 = new BigDecimal("0.1");
        System.out.println("乘：" + c1.multiply(c2).toPlainString());

        BigDecimal d1 = new BigDecimal("2.7");
        BigDecimal d2 = new BigDecimal("0.3");
        System.out.println("除：" + d1.divide(d2).toPlainString());
        System.out.println("小數後兩位：" + d1.divide(d2, 2, BigDecimal.ROUND_HALF_UP).toPlainString());
    }
}
