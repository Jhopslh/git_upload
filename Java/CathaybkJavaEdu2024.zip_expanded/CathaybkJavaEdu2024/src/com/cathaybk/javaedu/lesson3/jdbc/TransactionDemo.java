package com.cathaybk.javaedu.lesson3.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TransactionDemo {

    public static final String UPDATE_MEMBER_SQL = "update STUDENT.MEMBER set NAME = ? where ID = ? and PWD = ?";

    public static final String INSERT_CARS_SQL = "insert into STUDENT.CARS (MANUFACTURER, TYPE, MIN_PRICE, PRICE) values (?, ?, ?, )";

    public static final String CONN_URL = "jdbc:oracle:thin:@//88.8.125.32:1521/XE";

    public static void main(String[] args) {
        doQuery();
        doUpdate();
        doQuery();
    }

    public static void doUpdate() {
        try (Connection conn = DriverManager.getConnection(CONN_URL, "STUDENT", "CATHAYBK654321");) {
            try (PreparedStatement pstmt = conn.prepareStatement(UPDATE_MEMBER_SQL);) {
                conn.setAutoCommit(false);
                pstmt.setString(1, "ted");
                pstmt.setString(2, "TED");
                pstmt.setString(3, "ted123");
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

    public static void doQuery() {

        try (Connection conn = DriverManager.getConnection(CONN_URL, "STUDENT", "CATHAYBK654321");
                PreparedStatement pstmt = conn.prepareStatement("select * from STUDENT.MEMBER where ID = ? and PWD = ?");) {

            pstmt.setString(1, "TED");
            pstmt.setString(2, "ted123");

            //ResultSet物件儲存查詢結果
            ResultSet rs = pstmt.executeQuery();

            //使用StringBuilder做字串串接
            StringBuilder sb = new StringBuilder();
            sb.append("查詢結果：");
            while (rs.next()) {
                sb.append("{ ID： ").append(rs.getString("ID")).append("   PWD：").append(rs.getString("PWD")).append("   NAME：")
                        .append(rs.getString("NAME")).append(" }");
                System.out.println(sb.toString());
                sb.setLength(0);
            }
            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

}
