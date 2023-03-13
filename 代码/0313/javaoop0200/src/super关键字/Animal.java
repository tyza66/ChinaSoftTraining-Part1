package super关键字;

public class Animal {

    String name;
    int age;

    public Animal(){
        //System.out.println("Animal的无参构造方法");
    }

    public Animal(String name,int age){
        System.out.println("Animal的有参构造方法");
        this.name=name;
        this.age=age;
    }

    public void eat(){
        System.out.println("动物在吃");
    }
}
