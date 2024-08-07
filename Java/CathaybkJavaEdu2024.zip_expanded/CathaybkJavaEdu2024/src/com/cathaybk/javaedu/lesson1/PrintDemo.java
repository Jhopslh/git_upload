package com.cathaybk.javaedu.lesson1;

public class PrintDemo {

    public static void main(String[] args) {
        System.out.printf("----- println -----\n");
        System.out.println("Demo1: 會打印內容");
        System.out.println("Demo2: 會自動換行");
        System.out.println(); // 可以不傳入參數

        System.out.printf("----- print -----\n");
        System.out.print("Demo1: 會打印內容");
        System.out.print("Demo2: 不會自動換行");
        // System.out.print(); // 必須傳入參數

        System.out.printf("\n\n----- printf -----\n");
        // System.out.printf(); // 必須傳入參數
        System.out.printf("Demo1: 可以格式化打印內容，\t<-可以複製到記事本確認前面被加了Tab, \n<-跑到下一行了");
        System.out.printf("Demo2: 沒有換行符號所以沒被換行!!%n"); // %n: 根據系統產生換行字元Windows(\r\n)、Linux(\n)、MasOS(\r)
        System.out.printf("Demo3: 打印長度5的數字%5d，接著打印長度5的文字%s\n", 12345, "abcde");
        System.out.printf("Demo4: 打印長度5的數字%5d，接著打印長度5的文字%S\n", 123, "abc"); // %S: 大寫字串
    }
}
