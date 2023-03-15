package 抽象类和接口;

public abstract class Person {
    /*
    抽象类：
    1. 抽象类前面有abstract关键字，抽象类不能被实例化
    2. 抽象类里面可以有抽象方法,抽象类里面的抽象方法前面有abstract关键字；抽象方法没有方法体
    3. 有抽象方法的类必定是抽象类；抽象类不一定有抽象方法
    4. 抽象类的子类必须重写抽象类里面的抽象方法

    抽象类侧重与属性，接口侧重于方法，能力，约定
    接口和抽象类都表示抽象的，都不能直接实例化，必须使用他们的子类或实现类
    他们的子类或实现类必须重写他们里面定义的抽象方法
    一个类可以继承一个父类，也可以同时实现多个接口
     */

    String name;

    public void eat(){
        System.out.println("人在吃饭");
    }

    public abstract void work();/*{
        System.out.println("人在工作");
    }*/
}
