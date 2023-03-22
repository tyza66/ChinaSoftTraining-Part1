package 内部类;

public class Test4 {
    public static void main(String[] args) {

      /*  Father f=new Son();
        f.say();

        Driver d=new Son();
        d.drive();*/
        // 子类代码很少，一般不多于4行，并且子类的实例只使用一次
        /*
        原则： 匿名内部类不能有构造方法。内部不能定义任何静态成员和静态方法
        不能是public,protected.private,static修饰的，只能创建类的一个实例
        匿名内部类一定是跟在new关键字后面的，用其隐含实现一个接口或者一个类
         */
        //定义 构造 写方法体一块实现
        //继承式的匿名内部类
        Father f=new Father(){

            @Override
            public void say() {
                System.out.println("Son Say.....");
            }
        };

        f.say();
        //接口式的匿名内部类
        Driver d=new Driver() {
            @Override
            public void drive() {
                System.out.println("Son drive.............");
            }
        };
        d.drive();
    }
}
class Father{
    public void say(){
        System.out.println("Father.............");
    }
}

interface Driver{
    public void drive();
}

/*
class Son extends Father implements Driver{

    @Override
    public void say() {
        System.out.println("Son..........");
    }

    @Override
    public void drive() {
        System.out.println("Son drive...............");
    }
}*/
