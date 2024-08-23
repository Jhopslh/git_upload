package com.cathaybk.practice.nt01900440.b;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				try {

					System.out.println("輸入介於1-12間的整數m:");
					int m = scanner.nextInt(); // 讀取整行文本
					if (m < 1 || m > 12) {
						System.out.println("輸入無效");
						continue;
					}
					int y = 2024;
					System.out.println("　　　　 " + y + "年" + m + "月　　　");
					System.out.println("----------------------");
					System.out.println(" 日　一　二　三　四　五　六 ");
					System.out.println("======================");
					YearMonth yearMonth = YearMonth.of(y, m);
					LocalDate firstOfMonth = yearMonth.atDay(1);
					DayOfWeek fDayOfWeek = firstOfMonth.getDayOfWeek();
					int daysInMonth = yearMonth.lengthOfMonth();
					// firstDay作用:確定第一天是星期幾,要從第幾列開始印
					// 出來的值星期天會等於7,但它要放第一個,所以用%轉成0
					int firstDay = fDayOfWeek.getValue() % 7;
					// 第一天之前要印幾個空格
					for (int i = 0; i < firstDay; i++) {
						System.out.printf("%3s", " ");
					}
					// 開始印日期
					for (int i = 1; i <= daysInMonth; i++) {
						System.out.printf("%2d ", i);
						if ((i + firstDay) % 7 == 0) {
							System.out.println("\n");
						}
					}
					break;

				} catch (InputMismatchException e) {
					System.out.println("輸入無效,請輸入介於1-12間的整數:");
					scanner.nextLine();
				} catch (Exception e) {
					e.printStackTrace();
				}

			}

		}
	}
}
