package 抽象类和接口;

public class Test {

    public static void main(String[] args) {
       // Person p=new Person();

        Person p=new Student();
        p.eat();//继承的方法
        p.work();//重写后的方法，转行的是重写后的逻辑
        //p.exam();//不能调用特有的方法

        //Singer singer=new Singer();
        Singer s=new Student();//父接口
        //只能调用接口里面定义的抽象方法
        //s.work();
        //s.eat();
        s.sing();

        Player player=new Student();
        player.play();//只能调用重写Player接口里卖弄定义的方法

    }
}
