package 员工;

public class Employee {
    int id;
    String name;
    int age;
    int salary;

    public String toString(){
        return String.format("这个员工的id是%d,姓名为%s，年龄是%d，薪资是%d",id,name,age,salary);
    }
}
