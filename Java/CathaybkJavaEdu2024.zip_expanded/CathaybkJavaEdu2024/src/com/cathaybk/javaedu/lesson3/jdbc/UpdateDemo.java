package com.cathaybk.javaedu.lesson3.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateDemo {

    public static void main(String[] args) {
        String connUrl = "jdbc:oracle:thin:@//88.8.125.32:1521/XE";

        try (Connection conn = DriverManager.getConnection(connUrl, "STUDENT", "CATHAYBK654321");) {

            System.out.println("修改前");
            query(conn);
            /*
            PreparedStatement pstmt = conn.prepareStatement("update STUDENT.MEMBER set NAME = ? where ID = ? and PWD = ?");
            pstmt.setString(1, "TED");
            pstmt.setString(2, "TED");
            pstmt.setString(3, "ted123");
            int count = pstmt.executeUpdate();
            
            System.out.println("異動筆數：" + count + "，修改後");
            query(conn);
             */
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void query(Connection conn) throws SQLException {

        PreparedStatement pstmt1 = conn.prepareStatement("select * from STUDENT.MEMBER where ID = ? and PWD = ?");
        pstmt1.setString(1, "TED");
        pstmt1.setString(2, "ted123");

        ResultSet rs = pstmt1.executeQuery();

        StringBuilder sb = new StringBuilder();

        while (rs.next()) {
//            System.out.println("{ ID： " + rs.getString("ID") + "   PWD：" + rs.getString(2) + "   Name：" + rs.getString(3) + " }");

            sb.append("{ ID： ").append(rs.getString("ID")).append("   PWD：").append(rs.getString(2)).append("   Name：")
                    .append(rs.getString(3)).append(" }");
            System.out.println(sb.toString());
            sb.setLength(0);
        }
    }

}
