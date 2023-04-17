package dao.impl;

import dao.StudentDao;
import pojo.Student;
import util.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: tyza66
 * Date: 2023/04/17 14:47
 * Github: https://github.com/tyza66
 */
public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> queryStudent() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            String driverClassName = "oracle.jdbc.OracleDriver";
            String user = "scott";
            String password = "tiger";
            String url = "jdbc:oracle:thin:@localhost:1521:helowin";
            String sql = "SELECT * FROM stu";
            Class.forName(driverClassName);
            conn = DriverManager.getConnection(url, user, password);
            //直接用一个sql语句预处理一下 预编译
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            List<Student> list = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                Date birthday = rs.getDate("birthday");
                String address = rs.getString("address");
                String photo = rs.getString("photo");
                list.add(new Student(id, name, age, birthday, address, photo));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public Student queryStudentById(int id) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            String driverClassName = "oracle.jdbc.OracleDriver";
            String user = "scott";
            String password = "tiger";
            String url = "jdbc:oracle:thin:@localhost:1521:helowin";
            String sql = "SELECT * FROM stu where id=?"; //使用？占位符 之后需要给占位符数值
            Class.forName(driverClassName);
            conn = DriverManager.getConnection(url, user, password);
            //直接用一个sql语句预处理一下 预编译
            pstmt = conn.prepareStatement(sql);
            //表示给第一个问号设置值
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                int id1 = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                Date birthday = rs.getDate("birthday");
                String address = rs.getString("address");
                String photo = rs.getString("photo");
                return new Student(id1, name, age, birthday, address, photo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public int deleteStudentById(int id) {
        Connection connection = DBUtil.getConnection();
        String sql = "delete from stu where id=?";
        try {
            //断言 ： 如果为真就继续执行 如果为假就终止
            assert connection != null;
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, id);
            int i = pstmt.executeUpdate();
            DBUtil.close(pstmt, connection);
            return i;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return 0;
    }

    @Override
    public List<Student> queryStudentByMohu(String mohu) {
        List<Student> students = new ArrayList<Student>();
        String sql = "SELECT * FROM stu where name LIKE ?";
        Connection conn = DBUtil.getConnection();
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "%" + mohu + "%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int id1 = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                Date birthday = rs.getDate("birthday");
                String address = rs.getString("address");
                String photo = rs.getString("photo");
                students.add(new Student(id1, name, age, birthday, address, photo));
            }
            DBUtil.close(rs, pstmt, conn);
            return students;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }


}
