import java.util.HashMap;

public class TeacherTest {
    public static void main(String[] args) {
        HashMap<String, String> t_c = new HashMap<>();
        t_c.put("Tom", "CoreJava");
        t_c.put("John", "Oracle");
        t_c.put("Susan", "Oracle");
        t_c.put("Jerry", "JDBC");
        t_c.put("Jim", "Unix");
        t_c.put("Kevin", "JSP");
        t_c.put("Lucy", "JSP");
        System.out.println("修改前");
        t_c.keySet().forEach(key -> {
            System.out.println(key + " " + t_c.get(key));
        });
        t_c.replace("Lucy","CoreJava");
        System.out.println("修改后");
        t_c.keySet().forEach(key -> {
            System.out.println(key + " " + t_c.get(key));
        });
        t_c.replace("Lucy","CoreJava");
        System.out.println("教授课程为JSP的老师");
        t_c.keySet().forEach(key -> {
            if (t_c.get(key).equals("JSP")) {
                System.out.println(key);
            }
        });
    }
}
