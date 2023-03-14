package 方法的重写和多态;

public class Test2 {
    public static void main(String[] args) {

      /*  Animal a=new Animal();
        Dog d=new Dog();*/
        //向上转型  自动类型转换
      //  Animal a= new Dog();
        Animal a=new Cat();
        a.eat();//执行的是重写之后的逻辑
       // a.shout();//不能调用子类特有的方法

        /*
        用父类来代表子类，代表的是哪个子类，就表现出该子类的状态
        多态其实就是向上转型
        3个条件：
        1. 要有继承
        2. 要有方法的重写
        3. 用父类对象来代表子类对象
         *
         */

        /*
        数据类型：
         基本数据类型： 8种  byte short int long float double char boolean
         引用数据类型： 数组 String  类 接口

         小类型 大类型
         自动类型转换： 小类型自动转换成大类型，向上转型
             在类里面，子类 就是小类型  父类 就是大类型  ；子类和父类之间也可以自动类型转换

          强制类型转换： 大类型强制转换成小类型；有可能会造成精度损失
          instanceof 判断某个对象是否是某个类型的实例
         */

        System.out.println("----------------");
        Animal a2=new Cat();
        if(a2 instanceof  Dog){
            Dog d2= (Dog) a2;
            d2.eat();
            d2.shout();

        }else{
            System.out.println("a2不是Dog类型");
        }
    }
}


