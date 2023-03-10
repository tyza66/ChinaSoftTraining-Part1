package 继承;

public class TestAnimal {
    public static void main(String[] args) {

        Animal a=new Animal();
        a.name="金毛";
        a.age=3;
        a.eat();
        a.sleep();

        Dog d=new Dog();
        d.eat();
        d.sleep();
        d.shout();//特有的方法

        Cat c=new Cat();
        c.eat();
        c.sleep();

        Pig p=new Pig();
        p.eat();
        p.sleep();
    }
}
