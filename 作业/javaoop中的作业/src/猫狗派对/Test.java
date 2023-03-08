package 猫狗派对;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("mao",2);
        Dog dog = new Dog("gou",3);
        cat.giao();
        cat.eat();
        cat.play();
        dog.giao();
        dog.eat();
        dog.play();
    }
}
