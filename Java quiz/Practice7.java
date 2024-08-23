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

public class Practice7 {
	public static final String CONN_URL = "jdbc:oracle:thin:@//localhost:1521/XE";
	public static final String USERID = "student";
	public static final String PASSWORD = "student123456";

	public static void main(String[] args) {
		try (Connection conn = DriverManager.getConnection(CONN_URL, USERID, PASSWORD);
				PreparedStatement pstmt = conn.prepareStatement("select * from STUDENT.CARS");) {
			ResultSet rs = pstmt.executeQuery();
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
		// TODO Auto-generated method stub
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
