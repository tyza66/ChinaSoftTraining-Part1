package 面向对象;

public class TestStudent {

    public static void main(String[] args) {
        Student s1=new Student();//创建对象

        //调用属性 给属性赋值
        s1.id=1001;
        s1.name="张三";
        s1.age=23;
        s1.address="大连";

        System.out.println("编号："+s1.id+" 姓名："+s1.name+" 年龄："+s1.age+" 住址："+s1.address);

        //对象名.方法（）
        s1.study();
        s1.sleep();

        Student s2=new Student();
        s2.id=1002;
        s2.name="李四";
        s2.age=28;
        s2.address="北京";

        System.out.println("编号："+s2.id+" 姓名："+s2.name+" 年龄："+s2.age+" 住址："+s2.address);
        s2.study();
        s2.sleep();

    }
}
