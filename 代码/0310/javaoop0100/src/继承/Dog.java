package 继承;

public class Dog extends Animal{

  /*  String name;//名称
    int age;//年龄*/
    String kind;//品种 特有的属性

    /*public void eat(){
        System.out.println("动物在吃");
    }

    public void sleep(){
        System.out.println("动物在睡觉");
    }*/

    //特有的方法
    public void shout(){
        System.out.println("狗在叫");
    }
}
