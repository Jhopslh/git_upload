package com.cathaybk.javaedu.lesson2;

public class TryCatchDemo {

    public static void main(String[] args) throws Exception {
        tryCatch();
        try {
            throwMethod();
        } catch (Exception e) {
            System.out.println("Wrong!!");
        } finally {
            System.out.println("媽我在這!!!");
        }
    }

    public static void tryCatch() {
        try {
            int wrongParse = Integer.parseInt("kkk");
            System.out.println(wrongParse);
        } catch (NumberFormatException nfe) {
            System.out.println("出錯囉");
        }
    }

    public static void throwMethod() throws Exception {
        throw new Exception();
    }

}
