package com.cathaybk.javaedu.lesson3.practice;

import java.util.Random;

public class AdvancedGameAdvanced {

	public static void main(String[] args) {
		Random r = new Random();
		int aWin = 0;
		int bWin = 0;
		String winner;
		String[] result = new String[] { "剪刀", "石頭", "布" };
		while (aWin < 2 && bWin < 2) {
			String a = result[r.nextInt(2)];
			String b = result[r.nextInt(2)];
			if (a == "剪刀" && b == "石頭") {
				bWin++;
				winner = "B";
			} else if (a == "剪刀" && b == "布") {
				aWin++;
				winner = "A";
			} else if (a == "石頭" && b == "布") {
				bWin++;
				winner = "B";
			} else if (a == "石頭" && b == "剪刀") {
				aWin++;
				winner = "A";
			} else if (a == "布" && b == "剪刀") {
				bWin++;
				winner = "B";
			} else {
				aWin++;
				winner = "A";
			}
			System.out.printf("A 出拳:%s、B 出拳:%s,%s贏\n", a, b, winner);

		}
		String finalwinner;
		if (aWin == 2) {
			finalwinner = "A";
		} else {
			finalwinner = "B";

		}
		System.out.print("最後贏家:" + finalwinner);
	}

}
