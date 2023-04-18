package com.mypack.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBUtil {


    private static String driverClassName="oracle.jdbc.OracleDriver";
    private static String username="scott";
    private static String password="tiger";
    private static String url="jdbc:oracle:thin:@localhost:1521:orcl";


    public static Connection getConnection(){
        try {
            Class.forName(driverClassName);
            return DriverManager.getConnection(url, username, password);
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    //查询的时候需要关闭3个
    public static void close(ResultSet rs, PreparedStatement pstmt,Connection conn){
        try {
            //最近使用先关
            if (rs != null) {
                rs.close();
            }
            if (pstmt != null) {
                pstmt.close();

            }
            if (conn != null) {
                conn.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    //增删改的时候需要关闭2个
    public static void close( PreparedStatement pstmt,Connection conn){
        try {
            //最近使用先关

            if (pstmt != null) {
                pstmt.close();

            }
            if (conn != null) {
                conn.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
