package com.cathaybk.javaedu.lesson2.practice;

import java.security.PublicKey;
import java.util.Random;

public class ExceptionHandle {

	public static void main(String[] args) {
		Random random = new Random();
		int b = random.nextInt(100) + 1;
		try {
			if (b % 2 == 1) {
				System.out.println("奇數:" + b);
			} else {
				throw new Exception("偶數:" + b);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
