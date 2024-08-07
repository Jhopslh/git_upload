package com.cathaybk.javaedu.lesson2;

import java.io.IOException;

public class ExceptionDemo {

    public static void main(String[] args) {
        try {
            demo();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void demo() throws Exception {
        try {
            throw new IOException("This is IOException");
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            System.out.println("finally");
        }
    }

}
