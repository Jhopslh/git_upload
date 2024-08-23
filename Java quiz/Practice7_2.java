package com.cathaybk.practice.nt01900440.b;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Practice7_2 {
	public static final String CONN_URL = "jdbc:oracle:thin:@//localhost:1521/XE";
	public static final String USERID = "student";
	public static final String PASSWORD = "student123456";
	public static final String SELECT_SQL = "select * from STUDENT.CARS where MANUFACTURER = ? and TYPE = ?";
	public static final String INSERT_SQL = "insert into STUDENT.CARS (MANUFACTURER, TYPE, MIN_PRICE, PRICE) values (?, ?, ?, ?)";
	public static final String UPDATE_SQL = "update STUDENT.CARS set MIN_PRICE = ?,PRICE=? where MANUFACTURER = ? and TYPE = ?";
	public static final String DELETE_SQL = "delete from STUDENT.CARS where MANUFACTURER = ? and TYPE = ?";
	public static ResultSet rs;

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("請選擇以下指令輸入:select,insert,update,delete");
			String command = scanner.next();
			if (("select").equals(command)) {
				doSelect();
			} else if (("insert").equals(command)) {
				doInsert();
			} else if (("update").equals(command)) {
				doUpdate();
			} else {
				doDelete();
			}
		}
	}

	public static void doSelect() {
		try (Connection conn = DriverManager.getConnection(CONN_URL, USERID, PASSWORD);) {
			try (PreparedStatement pstmt = conn.prepareStatement(SELECT_SQL);

					Scanner scanner = new Scanner(System.in)) {
				// conn.setAutoCommit(false);
				System.out.println("請輸入製造商:");
				String manufacture = scanner.next();
				System.out.println("請輸入類型:");
				String type = scanner.next();
				pstmt.setString(1, manufacture);
				pstmt.setString(2, type);
				rs = pstmt.executeQuery();
				List<Map<String, String>> listMap = new ArrayList<>();
				while (rs.next()) {
					Map<String, String> map = new HashMap<>();
					map.put("MANUFACTURER", rs.getString("MANUFACTURER"));
					map.put("TYPE", rs.getString("TYPE"));
					map.put("MIN_PRICE", rs.getString("MIN_PRICE"));
					map.put("PRICE", rs.getString("PRICE"));
					listMap.add(map);
				}

				for (Map<String, String> mapFromList : listMap) {
					System.out.println(mapFromList);
				}
			}

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void doInsert() {
		try (Connection conn = DriverManager.getConnection(CONN_URL, USERID, PASSWORD);) {
			try (PreparedStatement pstmt = conn.prepareStatement(INSERT_SQL);
					Scanner scanner = new Scanner(System.in)) {
				System.out.println("請輸入製造商:");
				String manufacture = scanner.next();
				System.out.println("請輸入類型:");
				String type = scanner.next();
				System.out.println("請輸入底價:");
				String minPrice = scanner.next();
				System.out.println("售價:");
				String price = scanner.next();
				conn.setAutoCommit(false);
				pstmt.setString(1, manufacture);
				pstmt.setString(2, type);
				pstmt.setString(3, minPrice);
				pstmt.setString(4, price);
				pstmt.executeUpdate();
				conn.commit();
				System.out.println("新增成功");
			} catch (Exception e) {
				try {
					conn.rollback();
					System.out.println("新增失敗");
				} catch (SQLException sqle) {
					sqle.printStackTrace();
				}
				e.printStackTrace();
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}

	public static void doUpdate() {
		try (Connection conn = DriverManager.getConnection(CONN_URL, USERID, PASSWORD);) {
			try (PreparedStatement pstmt = conn.prepareStatement(UPDATE_SQL);
					Scanner scanner = new Scanner(System.in)) {
				System.out.println("請輸入製造商:");
				String manufacture = scanner.next();
				System.out.println("請輸入類型:");
				String type = scanner.next();
				System.out.println("請輸入底價:");
				String minPrice = scanner.next();
				System.out.println("售價:");
				String price = scanner.next();
				conn.setAutoCommit(false);
				pstmt.setString(1, minPrice);
				pstmt.setString(2, price);
				pstmt.setString(3, manufacture);
				pstmt.setString(4, type);
				pstmt.executeUpdate();
				conn.commit();
				System.out.println("更新成功");
			} catch (Exception e) {
				try {
					conn.rollback();
					System.out.println("更新失敗");
				} catch (SQLException sqle) {
					sqle.printStackTrace();
				}
				e.printStackTrace();
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}

	public static void doDelete() {
		try (Connection conn = DriverManager.getConnection(CONN_URL, USERID, PASSWORD);) {
			try (PreparedStatement pstmt = conn.prepareStatement(DELETE_SQL);
					Scanner scanner = new Scanner(System.in)) {
				System.out.println("請輸入製造商:");
				String manufacture = scanner.next();
				System.out.println("請輸入類型:");
				String type = scanner.next();
				conn.setAutoCommit(false);
				pstmt.setString(1, manufacture);
				pstmt.setString(2, type);
				pstmt.executeUpdate();
				conn.commit();
				System.out.println("刪除成功");
			} catch (Exception e) {
				try {
					conn.rollback();
					System.out.println("刪除失敗");
				} catch (SQLException sqle) {
					sqle.printStackTrace();
				}
				e.printStackTrace();
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}

}
