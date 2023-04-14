package com.mypack.test;

import java.sql.*;

public class Test2 {
    /*
    1.注册驱动           注册物流公司
    2. 获取连接          修路（从公司到仓库的路）
    3. 创建Statement对象   找一辆车
    4. 执行操作            拉货
    5. 处理结果集           处理拉回来的货物
    6. 关闭资源             货物不要了，车毁了，路不要了

    常用的API: java。sql包

     */
    public static void main(String[] args) {
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
            while(rs.next()){
                //判断是否还有下一条数
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                Date birthday = rs.getDate("birthday");
                String address = rs.getString("address");
                String photo = rs.getString("photo");
                System.out.println("id："+id+" name:"+name+" age: "+age+" birthday:"+birthday+" adddress: "+address+" photo:"+photo);
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
