package com.cathaybk.javaedu.lesson3.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DefendSQLInjection {

    public static void main(String[] args) {
        String connUrl = "jdbc:oracle:thin:@//88.8.125.32:1521/XE";

        try (Connection conn = DriverManager.getConnection(connUrl, "STUDENT", "CATHAYBK654321");) {

            PreparedStatement pstmt = conn.prepareStatement("select * from STUDENT.MEMBER where ID = ? and PWD = ?");
            pstmt.setString(1, "");
            pstmt.setString(2, "'or 1 = '1");

            //ResultSet物件儲存查詢結果
            ResultSet rs = pstmt.executeQuery();

            //使用StringBuilder做字串串接
            StringBuilder sb = new StringBuilder();
            sb.append("查詢結果：");
            while (rs.next()) {
                sb.append("{ ID： ").append(rs.getString(1)).append("   PWD：").append(rs.getString(2)).append(" }");
            }
            System.out.println(sb.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
