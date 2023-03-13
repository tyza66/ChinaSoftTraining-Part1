package super关键字;

public class TestDog {
    public static void main(String[] args) {
        Dog d=new Dog();
        System.out.println("-------------------------");
        d.name="旺财";
        d.eat();//继承过来的方法
        d.shout();//特有的方法

        System.out.println("-------------------------");
        Dog d2=new Dog("阿呆",3,"金毛");

        System.out.println("姓名："+d2.name+" 年龄："+d2.age+" 品种："+d2.kind);
    }
}
