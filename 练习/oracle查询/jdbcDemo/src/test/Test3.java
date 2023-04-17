package test;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Author: tyza66
 * Date: 2023/04/17 8:43
 * Github: https://github.com/tyza66
 */
public class Test3 {
    @Test
    public void testCreateTable() {
        createTable("empp");
    }
    //创建表
    public void createTable(String tableName){
        String driverClassName = "oracle.jdbc.OracleDriver";
        String user = "scott";
        String password = "tiger";
        String url = "jdbc:oracle:thin:@localhost:1521:helowin";
        try {
            Class.forName(driverClassName);
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement(); //用于执行静态的sql语句
            //创建表的时候使用这个方法
            // 如果有结果集就返true 如果是行数就返回false
            boolean execute = stmt.execute("create  table " + tableName + " (empno number)");
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

