package com.mypack.test;

import org.junit.Test;

import java.sql.*;

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
    //commit  rollback 转账

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

    @Test
    public void updateMoney(){
        String driverClassName="oracle.jdbc.OracleDriver";
        String username="scott";
        String password="tiger";
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String sql1="update emp set sal=sal-500 where ename='ALLEN'";
        String sql2="update emp set sal=sal+500 where ename='SMITH'";

        Connection connection=null;
        Statement stmt=null;

        try {
            Class.forName(driverClassName);
            connection= DriverManager.getConnection(url, username, password);
            //开启手动提交事务 默认是自动提交
            connection.setAutoCommit(false);

            stmt = connection.createStatement();
            stmt.executeUpdate(sql1);
            stmt.executeUpdate(sql2);
            connection.commit();//手动提交事务  如果执行到这一行，说明没报异常
        }catch(Exception e){
            e.printStackTrace();
            try {
                if (connection != null) {
                    connection.rollback();//事务的回滚
                }
            }catch (Exception e1){
                e1.printStackTrace();
            }
        }finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (connection != null) {
                    connection.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }

    @Test
    public void testGetCount(){
        String driverClassName="oracle.jdbc.OracleDriver";
        String username="scott";
        String password="tiger";
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String sql="select count(*) from stu";

        Connection conn=null;
        Statement stmt=null;
        ResultSet rs = null;

        try {
            //1. 注册驱动
            Class.forName(driverClassName);
            //2. 获取连接
            conn = DriverManager.getConnection(url, username, password);
            //如果不为null，说明能连上oracle数据库
            System.out.println(conn);
            //   3. 创建Statement对象   找一辆车
            stmt = conn.createStatement();
            //4. 执行操作  executeQuery() 执行查询的操作
            rs = stmt.executeQuery(sql);
            //5. 处理结果集
           if(rs.next()){
               int count = rs.getInt(1);
               System.out.println("一共有"+count+"条记录");
           }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            //6. 关闭资源 最近使用先关
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
            }catch(Exception e){
                e.printStackTrace();
            }

        }
    }
}
