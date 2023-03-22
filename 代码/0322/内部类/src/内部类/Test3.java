package 内部类;

public class Test3 {
    public static void main(String[] args) {
        //方法内部类
        A a=new A();
        a.methodA();
    }
}
class A{
    public void methodA(){
         class B{
             public void methodB(){
                 System.out.println("method B...............");
             }
         }
         B b=new B();
         b.methodB();//构造内部类对象，并调用其方法
    }
}