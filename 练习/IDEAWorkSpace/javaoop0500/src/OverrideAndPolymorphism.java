public class OverrideAndPolymorphism {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.giao();
        if (a instanceof Dog) {
            ((Dog)a).eat();
        }

        //如果大类型转换成小的类型的话就会报错
        Animal b = new Animal();
        //((Dog)b).giao();
    }
}

class Animal {
    String name;
    int age;

    public void giao() {
        System.out.println("动物在giao");
    }
}

class Dog extends Animal {
    @Override
    public void giao() {
        System.out.println("狗在giao");
    }

    public void eat() {
        System.out.println("狗在吃");
    }
}
