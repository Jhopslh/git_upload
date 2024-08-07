package com.cathaybk.javaedu.lesson3.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StatementDemo {

    public static void main(String[] args) {
        /*
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver"); //載入Driver
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
         */

        //JDBC url
        String connUrl = "jdbc:oracle:thin:@//localhost:1521/XE";

        //取得連線、Statement物件
        try (Connection conn = DriverManager.getConnection(connUrl, "student", "student123456");
                Statement stmt = conn.createStatement();) {

            String ID = "hello";
            String PWD = "hello";

            //要寫入的SQL字串
            String sqlStr = "select * from STUDENT.MEMBER where ID = '" + ID + "' and PWD = '" + PWD + "'";
            //印出實際執行的SQL指令
            System.err.println("SQL指令：  " + sqlStr);

            //ResultSet物件儲存查詢結果
            ResultSet rs = stmt.executeQuery(sqlStr);

            //使用StringBuilder做字串串接
            StringBuilder sb = new StringBuilder();

            while (rs.next()) {
                sb.append("查詢結果：{ ID： ").append(rs.getString(1)).append("   PWD：").append(rs.getString(2)).append("   NAME：")
                        .append(rs.getString("NAME")).append(" }");
                System.out.println(sb.toString());
                sb.setLength(0);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
