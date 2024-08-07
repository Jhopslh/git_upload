package com.cathaybk.javaedu.lesson1;

/**
 * <pre>
 * 轉型
 * </pre>
 */
public class Casting {

    public static void main(String[] args) {
        int i = 55;
        double d = 11.1;
        double sum1 = i;

        // 自動轉型(隱含轉型)
        System.out.println(i + d);
        System.out.println(sum1);

        // 強制轉型 => !!! 須謹慎使用
        int sum2 = (int) (i + d);
        System.out.println(sum2);

        //        String str = "abc123";
        //        System.out.println(Integer.valueOf(str));
    }

}
