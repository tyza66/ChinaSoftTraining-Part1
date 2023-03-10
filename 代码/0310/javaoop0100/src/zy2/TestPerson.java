package zy2;

public class TestPerson {

    public static void main(String[] args) {

        Person p1=new Person();
        p1.name="张三";
        p1.age=23;
        p1.display();

        Person p2=new Person("李四",34);
        p2.display();
    }
}
