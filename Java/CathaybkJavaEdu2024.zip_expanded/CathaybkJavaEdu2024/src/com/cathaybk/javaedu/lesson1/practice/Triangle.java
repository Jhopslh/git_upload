package com.cathaybk.javaedu.lesson1.practice;

public class Triangle {

	public static void  main(String[] args)//進入點 
	{
		int length = 10;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}
}

//int length = 5;
//		        for (int j = 0; j < length; j++) {
//		            for (int i = 0; i < length; i++) {
//		                System.out.print("* ");
//		            }
//		            System.out.println();
//		        }