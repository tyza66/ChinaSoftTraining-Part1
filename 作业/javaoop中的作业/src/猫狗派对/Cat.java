package 猫狗派对;

public class Cat extends Animal {
    public Cat(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public void giao(){
        System.out.println("猫叫唤");
    }

    public void eat(){
        System.out.println("猫吃饭");
    }
}
