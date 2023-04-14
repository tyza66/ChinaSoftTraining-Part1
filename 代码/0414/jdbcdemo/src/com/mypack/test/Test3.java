package com.mypack.test;

import com.mypack.pojo.Student;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.sql.*;

public class Test3{


    @Test
    public void aa(){
        System.out.println("aaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void testQueryAll(){
        String driverClassName="oracle.jdbc.OracleDriver";
        String username="scott";
        String password="tiger";
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String sql="select * from stu";

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
            while(rs.next()) {
                //判断是否还有下一条数
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                Date birthday = rs.getDate("birthday");
                String address = rs.getString("address");
                String photo = rs.getString("photo");
                Student s = new Student(id, name, age, birthday, address, photo);
                System.out.println(s);
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

    @Test
    public void testQueryOneById(){
        queryOne(3);
    }


    public  void queryOne(int id){
        String driverClassName="oracle.jdbc.OracleDriver";
        String username="scott";
        String password="tiger";
        String url="jdbc:oracle:thin:@localhost:1521:orcl";

        String sql="select * from stu where id="+id;
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;

        try {
            Class.forName(driverClassName);
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();//用于执行静态的sql语句
            rs = stmt.executeQuery(sql);//executeQuery() 查询  executeUpdate() 执行增删改操作

            //查询单个结果时只有一条数据或者没有
            if (rs.next()) {
                int ids = rs.getInt(1);
                String name = rs.getString(2);
                int age = rs.getInt(3);
                Date birthday = rs.getDate(4);
                String address = rs.getString(5);
                String photo = rs.getString(6);
                Student s = new Student(ids, name, age, birthday, address, photo);
                System.out.println(s);

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

    @Test
    public void testInsertOne(){
        String driverClassName="oracle.jdbc.OracleDriver";
        String username="scott";
        String password="tiger";
        String url="jdbc:oracle:thin:@localhost:1521:orcl";

        String sql="insert into stu values(5,'马超',39,to_date('2020-12-23 13:09:12','yyyy-mm-dd hh24:mi:ss'),'郑州','eee')";

        Connection conn=null;
        Statement stmt=null;
        try {
            Class.forName(driverClassName);
            conn = DriverManager.getConnection(url, username, password);

            stmt = conn.createStatement();
            //增删改没有结果集
            int row = stmt.executeUpdate(sql);//executeUpdate()  表示增删改操作 返回值 表示受影响的行数

            System.out.println("添加了" + row + "行");
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
    public void testDeleteOne(){
        String driverClassName="oracle.jdbc.OracleDriver";
        String username="scott";
        String password="tiger";
        String url="jdbc:oracle:thin:@localhost:1521:orcl";

        String sql="delete from stu where id=5";

        Connection conn=null;
        Statement stmt=null;
        try {
            Class.forName(driverClassName);
            conn = DriverManager.getConnection(url, username, password);

            stmt = conn.createStatement();
            //增删改没有结果集
            int row = stmt.executeUpdate(sql);//executeUpdate()  表示增删改操作 返回值 表示受影响的行数

            System.out.println("删除了" + row + "行");
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
