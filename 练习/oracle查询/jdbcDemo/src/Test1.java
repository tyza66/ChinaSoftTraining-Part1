import java.sql.*;

/**
 * @author: tyza66
 * @Date: 2023/04/14 8:50
 * @Github: https://github.com/tyza66
 */
public class Test1 {
    public static void main(String[] args) {
        //常用的api在java.sql包
        String driverClassName = "oracle.jdbc.OracleDriver";
        String user = "scott";
        String password = "tiger";
        String url = "jdbc:oracle:thin:@localhost:1521:helowin";
        try {
            //1.注册驱动 就相当于注册物流公司
            Class.forName(driverClassName);
            //2.获取连接 修路（从公司到仓库的路）
            Connection conn = DriverManager.getConnection(url, user, password);
            //3.创建Statement对象 找一辆车
            Statement stmt = conn.createStatement();
            System.out.println(stmt);
            //4.执行操作 拉货 executeQuery是专门查询的
            ResultSet rs = stmt.executeQuery("select * from STU");
            //5.处理结果集 处理拉回来的货物
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                Date birthday = rs.getDate("birthday");
                String address = rs.getString("address");
                String photo = rs.getString("photo");
                System.out.println(""+id+" "+name+" "+age+" "+birthday+" "+address+" "+photo);
            }
            //6.关闭资源 货物不要了 车毁 路不要了 最近使用的先关闭
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
