package com.cathaybk.javaedu.lesson3.practice;

import java.util.Random;

public class DiceArray1 {

	public static void main(String[] args) {
								// index 0 1 2 3 4 5 6 7 8 9 10
								// 統計對象 2 3 4 5 6 7 8 9 10 11 12
		String[] results = new String[] { "", "", "", "", "", "", "", "", "", "", "" };
		Random r = new Random();

		for (int i = 0; i < 20; i++) {
			int a = r.nextInt(6) + 1;
			int b = r.nextInt(6) + 1;
			int sum = a + b;
			results[sum - 2] = results[sum - 2]+"*";
		}
		for (int i = 0; i < 11; i++) {
			String result = results[i];
			if (result.equals("")) {
				System.out.println();
			} else {
				System.out.println((i + 2) + result);
			}

		}
		/*int[] results = new int[11] ;
		Random random = new Random();
		for (int i = 0; i < 20; i++) {
			int a = random.nextInt(6) + 1;
			int b = random.nextInt(6) + 1;
			int sum = a + b;
			results[sum - 2] += 1;
		}
		for (int i = 0; i < results.length; i++) {
			int result = results[i];
			if (result!=0) {
				String time="";
				for(int j = 0; j < result; j++) {
					time+= "*";
				}
				System.out.println((i + 2) + time);
			}

		}*/
	}
}
