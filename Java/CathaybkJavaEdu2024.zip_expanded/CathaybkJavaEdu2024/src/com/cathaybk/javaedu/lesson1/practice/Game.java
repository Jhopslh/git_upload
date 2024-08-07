package com.cathaybk.javaedu.lesson1.practice;

import java.util.Random;

/**
 * <pre>
 * 練習三：比大小
 * </pre>
 */
public class Game {

    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            // Math.random() 回傳 0.0 ~ 1.0 之間隨機 double，不包含 1.0
            int a = (int) (Math.random() * 100 + 1);

            // random.nextInt(p) 回傳 0 ~ 指定數(p)之間的隨機整數，不包含 p
            int b = random.nextInt(100) + 1;
            String result;
            if (a > b) {
                result = "大於";
            } else if (a < b) {
                result = "小於";
            } else {
                result = "等於";
            }
            System.out.printf("A 數字為：%d、B 數字為：%d，A %s B\n", a, b, result);
        }
    }

}
