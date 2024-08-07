package com.cathaybk.javaedu.lesson3.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatementDemo {

    public static void main(String[] args) {
        String connUrl = "jdbc:oracle:thin:@//88.8.125.32:1521/XE";

        try (Connection conn = DriverManager.getConnection(connUrl, "STUDENT", "CATHAYBK654321");
                PreparedStatement pstmt = conn.prepareStatement("select * from STUDENT.MEMBER where ID = ? and PWD = ?");
                ) {

            pstmt.setString(1, "hello");
            pstmt.setString(2, "hello");

            // ResultSet物件儲存查詢結果
            ResultSet rs = pstmt.executeQuery();

            // 使用StringBuilder做字串串接
            StringBuilder sb = new StringBuilder();
            sb.append("查詢結果：");
            while (rs.next()) {
                // "{ ID： " + rs.getString("ID") + "   PWD：..."
                sb.append("{ ID： ").append(rs.getString("ID")).append("   PWD：").append(rs.getString(2)).append("   NAME：")
                        .append(rs.getString("NAME")).append(" }");
                System.out.println(sb.toString());
                sb.setLength(0);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
