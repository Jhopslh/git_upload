package com.cathaybk.javaedu.lesson1.practice;

import java.util.Random;

public class AdvancedGame {

	public static void main(String[] args) {
		int aWin = 0, bWin = 0;
		Random random = new Random();
		while (aWin < 2 && bWin < 2) {
			int a = random.nextInt(3);
			int b = random.nextInt(3);
			String result;
			if (a - b == 1) {
				result = "A";
				aWin++;
			} else if (a - b == -1) {
				result = "B";
				bWin++;
			} else if (a - b == 2) {
				result = "B";
				bWin++;
			} else if (a - b == -2) {
				result = "A";
				aWin++;
			} else {
				result = "平手";
			}

			String aResult = fist(a);
			String bResult = fist(b);
			

			System.out.printf("A 出拳：%s、B 出拳：%s，%s贏 \n", aResult, bResult, result);

		}
	}

	public static String fist(int aOrb) {
		switch (aOrb) {
		case 0:
			return "剪刀";
		case 1:
			return "石頭";
		default:
			return "布";
		}

	}
}