package 员工;

public class Test1 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.id = 1;
        e.name = "giao";
        e.age = 10;
        e.salary = 999;
        System.out.println(e.toString());
    }
}
