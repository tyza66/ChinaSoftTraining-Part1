package 抽象类和接口;

public interface Singer {
    /*
    接口：
    1. 接口使用interface来定义
    2. 接口里面只能有常量和抽象方法; 接口里面的抽象方法没有方法体，前面的abstart关键字可以省略
    3. 接口里面不能有普通方法,接口也是抽象的，不能被实例化
    4. 一个类可以同时继承一个父类和实现多个接口，实现使用implements关键字


     */
     int age=23;

     public  void sing();

    /* public void sleep(){
         System.out.println("人在睡觉");
     }*/

}
