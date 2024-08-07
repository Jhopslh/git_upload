package com.cathaybk.javaedu.lesson1.practice;

/**
 * <pre>
 * 練習一：畫邊長5的正方形
 * </pre>
 */
public class Square {

    public static void main(String[] args) {
        int length = 5;
        for (int j = 0; j < length; j++) {
            for (int i = 0; i < length; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
