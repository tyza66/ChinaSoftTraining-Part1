package com.mypack.test;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test4 {


    public void updateOne(int id,String name){
        String driverClassName="oracle.jdbc.OracleDriver";
        String username="scott";
        String password="tiger";
        String url="jdbc:oracle:thin:@localhost:1521:orcl";

        String sql="update stu set name='"+name+"' where id="+id;

        Connection conn=null;
        Statement stmt =null;
        try {
            Class.forName(driverClassName);
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();
            System.out.println(sql);
            int row = stmt.executeUpdate(sql);
            System.out.println("修改了" + row + "行");
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }


    }

    @Test
    public void testUpdateOne(){
        updateOne(4,"曹阿满");
    }

    @Test
    public void testCreateTable(){
        String driverClassName="oracle.jdbc.OracleDriver";
        String username="scott";
        String password="tiger";
        String url="jdbc:oracle:thin:@localhost:1521:orcl";

        String sql="create table emp3(empno number)";

        Connection conn=null;
        Statement stmt =null;
        try {
            Class.forName(driverClassName);
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();


            //创建表的时候，使用的时 execute() 方法
            //如果有结果集 ，返回的是true,如果是计数的话，则为false
            boolean flag = stmt.execute(sql);
            System.out.println(flag);
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }


    }
}
