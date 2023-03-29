package jdk8新特性.接口的默认方法;

public interface Formula {

    double claculate(int a);
    //Java 8允许我们给接口添加一个非抽象的方法实现，只需要使用 default关键字即可，这个特征又叫做扩展方法，
    default double sqrt(int a){
        return Math.sqrt(a);//求平方根
    }
}
