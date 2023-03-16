package lx4;

public class Test2 {

    public static void main(String[] args) {
        Cat c=new Cat("花色","波斯猫");
        c.eat();
        c.catchMouse();

        Dog d=new Dog("黑色","藏獒");
        d.eat();
        d.lookHome();

    }
}
