package com.mypack.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test1 {
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

        try {
            //1. 注册驱动
            Class.forName(driverClassName);
            //2. 获取连接
            Connection conn = DriverManager.getConnection(url, username, password);
            //如果不为null，说明能连上oracle数据库
            System.out.println(conn);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
