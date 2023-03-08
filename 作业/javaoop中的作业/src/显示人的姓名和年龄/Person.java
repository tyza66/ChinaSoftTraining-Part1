package 显示人的姓名和年龄;

public class Person {
    String name;
    int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("姓名："+name+",年龄："+age);
    }
}
