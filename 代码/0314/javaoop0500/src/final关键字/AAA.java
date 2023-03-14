package final关键字;

public class AAA {

    final String name="张三";

    public void aa(){
        System.out.println("aaaaaaaaaaaaaaa");
    }


}
class BBB extends AAA{
    public void aa(){
        System.out.println("bbbbbbbbbbbb");
    }
}

class Test{
    public static void main(String[] args) {
        /*
        final:最终的
       1. final 属性/变量： final修饰变量，该变量就是一个常量，不能被重新赋值
       final 属性也是一个常量，必须有初始值
       2. final 方法： 该方法不能被重写
       3. final 类： 修饰类的时候，该类不能被继承

         */
        final int i=3;
       // i=5;
        System.out.println(i);
    }
}
