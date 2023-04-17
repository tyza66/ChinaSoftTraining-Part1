package com.mypack.dao.impl;

import com.mypack.dao.StudentDao;
import com.mypack.pojo.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl  implements StudentDao {
    @Override
    public List<Student> queryAllStudents() {


        String driverClassName="oracle.jdbc.OracleDriver";
        String username="scott";
        String password="tiger";
        String url="jdbc:oracle:thin:@localhost:1521:orcl";

        String sql="select * from stu";
        Connection conn=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        try {
            Class.forName(driverClassName);
             conn = DriverManager.getConnection(url, username, password);
            //预编译sql语句
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            List<Student> list=new ArrayList<>();
            while (rs.next()) {
                int ids = rs.getInt(1);
                String name = rs.getString(2);
                int age = rs.getInt(3);
                Date birthday = rs.getDate(4);
                String address = rs.getString(5);
                String photo = rs.getString(6);
                Student s = new Student(ids, name, age, birthday, address, photo);
                list.add(s);

            }
            return list;
        }catch(Exception e){
            e.printStackTrace();
        }finally {
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
        return null;
    }

    @Override
    public Student queryStudentById(int id) {

        String driverClassName="oracle.jdbc.OracleDriver";
        String username="scott";
        String password="tiger";
        String url="jdbc:oracle:thin:@localhost:1521:orcl";

        //? 表示占位符  表示此处应该传一个参数
        String sql="select * from stu where id=?";
        Connection conn=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        try {
            Class.forName(driverClassName);
            conn = DriverManager.getConnection(url, username, password);
            //预编译sql语句


            pstmt = conn.prepareStatement(sql);
            //给占位符设置值 1 表示sql语句中的第一个? setInt() 表示设置int类型的值
            pstmt.setInt(1,id);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                int ids = rs.getInt(1);
                String name = rs.getString(2);
                int age = rs.getInt(3);
                Date birthday = rs.getDate(4);
                String address = rs.getString(5);
                String photo = rs.getString(6);
                Student s = new Student(ids, name, age, birthday, address, photo);
                return s;

            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
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
        return null;
    }
}
