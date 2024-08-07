package com.cathaybk.javaedu.lesson3.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Random;

public class AdvancedInsertTransaction {

	public static final String INSERT_CARS_SQL = "insert into STUDENT.CARS (MANUFACTURER, TYPE, MIN_PRICE, PRICE) values (?, ?, ?, ?)";

	public static final String CONN_URL = "jdbc:oracle:thin:@//localhost:1521/XE";

	public static final String USERID = "student";

	public static final String PASSWORD = "student123456";

	public static void main(String[] args) {

		try (Connection conn = DriverManager.getConnection(CONN_URL, USERID, PASSWORD);) {
			try (PreparedStatement pstmt = conn.prepareStatement(INSERT_CARS_SQL);) {
				for (int i = 1; i <= 2; i++) {

					Random r = new Random();
					int a = r.nextInt(1000) + 1;
					int b = r.nextInt(1000) + 1;
					conn.setAutoCommit(false);
					pstmt.setString(1, "CATHAYBK12345");
					pstmt.setInt(2, 12345 + i);
					while (a < b) {
						a = r.nextInt(1000) + 1;
					}
					pstmt.setInt(3, a);
					pstmt.setInt(4, b);
					pstmt.executeUpdate();
				}
				conn.commit();
				System.out.println("新增成功");

			} catch (Exception e) {
				e.printStackTrace();
				conn.rollback();
				System.out.println("新增失敗，原因:" + e.getMessage());
				try {
					conn.rollback();
				} catch (Exception sQLE) {
					sQLE.printStackTrace();
					System.out.println("rollback失敗，原因:" + sQLE.getMessage());
				}
			}
		} catch (Exception sQLE) {
			sQLE.printStackTrace();
		}

	}

}
