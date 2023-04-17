import org.junit.Test;
import pojo.Student;

import java.sql.*;

/**
 * @author: tyza66
 * @Date: 2023/04/14 10:45
 * @Github: https://github.com/tyza66
 */
public class Test2 {
    @Test
    public void TestQueryOneById() {
        queryOneById(1);
    }

    @Test
    public void TestAddOne() {
        addOne(new Student(3, "3", 3, new Date(2001, 8, 24), "3", "3"));
    }

    @Test
    public void TestUpdateById() {
        Student student3 = queryOneById(3);
        student3.setAge(999);
        updateById(student3);
    }

    @Test
    public void TestDeleteById() {
        deleteById(3);
    }
    //使用id进行查找
    public Student queryOneById(int id1) {
        String driverClassName = "oracle.jdbc.OracleDriver";
        String user = "scott";
        String password = "tiger";
        String url = "jdbc:oracle:thin:@localhost:1521:helowin";
        Student student = null;
        try {
            Class.forName(driverClassName);
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement(); //用于执行静态的sql语句
            ResultSet rs = stmt.executeQuery("select * from STU where id=" + id1);  //update增删改
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                Date birthday = rs.getDate("birthday");
                String address = rs.getString("address");
                String photo = rs.getString("photo");
                student = new Student(id, name, age, birthday, address, photo);
                System.out.println(student);
            }
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
            return student;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    //使用student对象添加一条
    public void addOne(Student s) {
        String driverClassName = "oracle.jdbc.OracleDriver";
        String user = "scott";
        String password = "tiger";
        String url = "jdbc:oracle:thin:@localhost:1521:helowin";
        try {
            Class.forName(driverClassName);
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement(); //用于执行静态的sql语句
            int i = stmt.executeUpdate("insert into stu values(" + s.getId() + "," + s.getName() + "," + s.getAge() + ",to_date('" + s.getBirthday().toString() + "','yyyy-mm-dd')" + "," + s.getAddress() + "," + s.getPhoto() + ")");
            if (i >= 1) {
                System.out.println("添加成功");
            }
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
    //使用id进行更新
    public void updateById(Student s) {
        String driverClassName = "oracle.jdbc.OracleDriver";
        String user = "scott";
        String password = "tiger";
        String url = "jdbc:oracle:thin:@localhost:1521:helowin";
        try {
            Class.forName(driverClassName);
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement(); //用于执行静态的sql语句
            int i = stmt.executeUpdate("update stu set name=" + s.getName() + ",age=" + s.getAge() + ",birthday=to_date('" + s.getBirthday().toString() + "','yyyy-mm-dd'),address=" + s.getAddress() + ",photo=" + s.getPhoto() + " where id=" + s.getId());
            if (i >= 1) {
                System.out.println("修改成功");
            }
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
    //使用id进行删除
    public void deleteById(int id) {
        String driverClassName = "oracle.jdbc.OracleDriver";
        String user = "scott";
        String password = "tiger";
        String url = "jdbc:oracle:thin:@localhost:1521:helowin";
        try {
            Class.forName(driverClassName);
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement(); //用于执行静态的sql语句
            int i = stmt.executeUpdate("delete from stu where id = " + id);
            if (i >= 1) {
                System.out.println("删除成功");
            }
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

