package com.cathaybk.javaedu.lesson3.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FinallyClose {

    public static void main(String[] args) {

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        //取得連線、Statement物件
        try {
            //JDBC url
            String connUrl = "jdbc:oracle:thin:@//88.8.125.32:1521/XE";
            // dosth......
            conn = DriverManager.getConnection(connUrl, "STUDENT", "CATHAYBK654321");
            stmt = conn.createStatement(); // throw Exception

            String ID = "hello";
            String PWD = "hello";

            //要寫入的SQL字串
            String sqlStr = "select * from STUDENT.MEMBER where ID = '" + ID + "' and PWD = '" + PWD + "'";
            //印出實際執行的SQL指令
            System.out.print("SQL指令：  ");
            System.err.println(sqlStr);

            //ResultSet物件儲存查詢結果
            rs = stmt.executeQuery(sqlStr);

            //使用StringBuilder做字串串接
            StringBuilder sb = new StringBuilder();

            while (rs.next()) {
                sb.append("{ ID： ").append(rs.getString(1)).append("   PWD：").append(rs.getString(2)).append(" }");
                System.out.println(sb.toString());
                sb.setLength(0);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}
