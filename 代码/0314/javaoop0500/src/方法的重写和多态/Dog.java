package 方法的重写和多态;

public class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("狗再吃");
    }

    //特有的方法
    public void shout(){
        System.out.println("狗在叫");
    }
}
