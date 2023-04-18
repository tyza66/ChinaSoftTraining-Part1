package com.sdm.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Author: tyza66
 * Date: 2023/04/18 9:50
 * Github: https://github.com/tyza66
 */
public class DBUtil {
    public static String driverClassName = "oracle.jdbc.OracleDriver";
    public static String user = "scott";
    public static String password = "tiger";
    public static String url = "jdbc:oracle:thin:@localhost:1521:helowin";

    public static Connection getConnection() {
        try {
            Class.forName(driverClassName);
            return java.sql.DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //查询的时候需要关闭三个 增删改的时候只需要关闭两个
    public static void close(ResultSet rs, Statement stmt, Connection conn) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void close(Statement stmt, Connection conn) {
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
