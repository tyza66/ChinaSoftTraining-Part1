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
    public void queryOne() {
        String driverClassName = "oracle.jdbc.OracleDriver";
        String user = "scott";
        String password = "tiger";
        String url = "jdbc:oracle:thin:@localhost:1521:helowin";
        try {
            Class.forName(driverClassName);
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement(); //用于执行静态的sql语句
            System.out.println(stmt);
            ResultSet rs = stmt.executeQuery("select * from STU");  //update增删改
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                Date birthday = rs.getDate("birthday");
                String address = rs.getString("address");
                String photo = rs.getString("photo");
                Student student = new Student(id, name, age, birthday, address, photo);
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
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

