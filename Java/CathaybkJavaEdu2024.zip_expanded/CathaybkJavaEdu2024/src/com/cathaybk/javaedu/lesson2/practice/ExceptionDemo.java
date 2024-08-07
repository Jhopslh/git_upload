package com.cathaybk.javaedu.lesson2.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;

@SuppressWarnings({ "unused", "resource" })
public class ExceptionDemo {

	public static void main(String[] args) {
        try {
		FileReader file = new FileReader("C:/testException.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Catch Block, Error Message:"+ e.getMessage());
        } finally {
            System.out.println("Finally Block");
        }

    }

}
