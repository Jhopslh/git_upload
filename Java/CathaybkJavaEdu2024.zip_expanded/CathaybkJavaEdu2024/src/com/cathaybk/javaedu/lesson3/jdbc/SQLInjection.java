package com.cathaybk.javaedu.lesson3.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLInjection {

    public static void main(String[] args) {
        String connUrl = "jdbc:oracle:thin:@//88.8.125.32:1521/XE";

        try (Connection conn = DriverManager.getConnection(connUrl, "STUDENT", "CATHAYBK654321"); 
                Statement stmt = conn.createStatement()) {

            //組成惡意攻擊字串
            String ID = "";
            String PWD = "' or 1 = '1";

            //要寫入的SQL字串
            String sqlStr = "select * from STUDENT.MEMBER where ID = '" + ID + "' and PWD = '" + PWD + "'";

            //印出實際執行的SQL指令
            System.err.println("SQL指令：  " + sqlStr);

            //ResultSet物件儲存查詢結果
            ResultSet rs = stmt.executeQuery(sqlStr);

            //使用StringBuilder做字串串接
            StringBuilder sb = new StringBuilder();
            sb.append("查詢結果： \n");
            while (rs.next()) {
                sb.append("{ ID： ").append(rs.getString(1)).append("   PWD：").append(rs.getString(2)).append(" }");
                System.out.println(sb.toString());
                sb.setLength(0);
            }

        } catch (Exception e) {

        }
    }

}
