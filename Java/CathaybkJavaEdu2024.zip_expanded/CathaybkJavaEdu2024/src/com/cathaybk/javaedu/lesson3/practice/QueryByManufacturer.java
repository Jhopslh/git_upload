package com.cathaybk.javaedu.lesson3.practice;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QueryByManufacturer {

	public static void main(String[] args) {
		String connUrl = "jdbc:oracle:thin:@//localhost:1521/XE";
		try (Connection conn = DriverManager.getConnection(connUrl, "student", "student123456");
				PreparedStatement pstmt = conn.prepareStatement("select * from STUDENT.CARS where MANUFACTURER = ?");) {
			pstmt.setString(1, "Toyota");
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
			StringBuilder sb = new StringBuilder();
			if (!listMap.isEmpty()) {
				for (int i = 0; i < listMap.size(); i++) {
					BigDecimal price = new BigDecimal(listMap.get(i).get("PRICE"));
					BigDecimal min_price = new BigDecimal(listMap.get(i).get("MIN_PRICE"));
					sb.append("製造商：").append(listMap.get(i).get("MANUFACTURER")).append("，型號：")
							.append(listMap.get(i).get("TYPE")).append("，售價：$").append(price).append("，底價：$")
							.append(min_price).append("，售價高於底價:").append(price.subtract(min_price)).append("\n");
				}
			} else {
				sb.append("查無結果");
			}
			;
			System.out.println(sb.toString());
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
