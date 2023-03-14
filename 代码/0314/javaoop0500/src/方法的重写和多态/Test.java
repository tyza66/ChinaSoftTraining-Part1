package 方法的重写和多态;

public class Test {

    public static void main(String[] args) {

        Dog d=new Dog();
        d.eat();//执行的是重写之后的而逻辑
        d.shout();//特有的方法执行

        Cat c=new Cat();
        c.eat();//重写的方法
        c.climbTree();//特有的方法
    }
}
