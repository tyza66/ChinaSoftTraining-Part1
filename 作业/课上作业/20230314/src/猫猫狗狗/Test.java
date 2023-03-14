package 猫猫狗狗;

public class Test {
    public static void main(String[] args) {
        Cat c = new Cat("花色","博士猫");
        Dog d = new Dog("黑色","藏獒");
        c.eat();
        c.catchMouse();
        d.eat();
        d.lookHome();
    }
}
