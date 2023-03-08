package 猫狗派对;

public class Dog extends Animal {
    public Dog(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public void giao(){
        System.out.println("狗叫唤");
    }

    public void eat(){
        System.out.println("狗吃饭");
    }
}
