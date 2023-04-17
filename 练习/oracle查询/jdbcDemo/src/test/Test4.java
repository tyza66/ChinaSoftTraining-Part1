package test;

import org.junit.Test;

import java.sql.*;

/**
 * Author: tyza66
 * Date: 2023/04/17 9:40
 * Github: https://github.com/tyza66
 */
public class Test4 {
    @Test
    public void testUpdateMoney(){
        updateMoney();
    }
    @Test
    public void testGetCount(){
        getCount();
    }
    //通过事务的形式进行操作
    public void updateMoney(){
        Connection conn = null;
        String driverClassName = "oracle.jdbc.OracleDriver";
        String user = "scott";
        String password = "tiger";
        String url = "jdbc:oracle:thin:@localhost:1521:helowin";
        String sql1 = "update emp set sal= sal-500 where ename = 'ALLEN'";
        String sql2 = "update emp set sal= sal+500 where ename = 'SMITH'";
        try {
            Class.forName(driverClassName);
            conn = DriverManager.getConnection(url, user, password);
            //开启手动提交事务 默认是自动的
            conn.setAutoCommit(false);
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql1);
            stmt.executeUpdate(sql2);
            //手动提交事务 如果执行到了这一行 就说明没有报异常
            conn.commit();
            if (stmt != null) {
                stmt.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }

    //获得多少条记录
    public void getCount(){
        Connection conn = null;
        String driverClassName = "oracle.jdbc.OracleDriver";
        String user = "scott";
        String password = "tiger";
        String url = "jdbc:oracle:thin:@localhost:1521:helowin";
        String sql = "select count(*) from emp";
        try {
            Class.forName(driverClassName);
            conn = DriverManager.getConnection(url, user, password);
            //开启手动提交事务 默认是自动的
            Statement stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery(sql);
            while (resultSet.next()) {
                int rows = resultSet.getInt(1);
                System.out.println("表中一共有"+rows+"条数据");
            }
            if (stmt != null) {
                stmt.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
