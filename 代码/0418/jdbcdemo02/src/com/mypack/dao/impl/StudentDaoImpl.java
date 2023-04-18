package com.mypack.dao.impl;

import com.mypack.dao.StudentDao;
import com.mypack.pojo.Student;
import com.mypack.util.DBUtil;
import com.mypack.util.DateUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl  implements StudentDao {
    @Override
    public List<Student> queryAllStudents() {



        String sql="select * from stu";
        Connection conn= DBUtil.getConnection();
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        try {

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
           DBUtil.close(rs,pstmt,conn);

        }
        return null;
    }

    @Override
    public Student queryStudentById(int id) {


        //? 表示占位符  表示此处应该传一个参数
        String sql="select * from stu where id=?";
        Connection conn=DBUtil.getConnection();
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        try {

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
           DBUtil.close(rs,pstmt,conn);
        }
        return null;
    }

    @Override
    public int deleteStudentById(int id) {
        String sql="delete from stu where id=?";
        Connection conn = DBUtil.getConnection();
        PreparedStatement pstmt=null;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            int row = pstmt.executeUpdate();
            return row;
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            DBUtil.close(pstmt,conn);
        }

        return 0;
    }

    @Override
    public List<Student> queryStudentByMohu(String mohu) {

        String sql="select * from stu where name like ?";
        Connection conn= DBUtil.getConnection();
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        try {

            //预编译sql语句
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,"%"+mohu+"%");
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
            DBUtil.close(rs,pstmt,conn);

        }
        return null;
    }

    @Override
    public int insertStudent(Student student) {

        String sql="insert into stu values (?,?,?,?,?,?)";
        Connection conn = DBUtil.getConnection();
        PreparedStatement pstmt=null;
        try {
            pstmt = conn.prepareStatement(sql);
            //设置参数值  ？顺序跟数据库表里面的顺序一致
            pstmt.setInt(1, student.getId());
            pstmt.setString(2, student.getName());
            pstmt.setInt(3, student.getAge());
            //注意：日期类型需要转换 java.sql.Date是和数据库里面的Date保持一致
            pstmt.setDate(4, DateUtil.toSqlDate(student.getBirthday()));
            pstmt.setString(5, student.getAddress());
            pstmt.setString(6, student.getPhoto());
            int row = pstmt.executeUpdate();
            return row;
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            DBUtil.close(pstmt,conn);
        }
        return 0;
    }
}
