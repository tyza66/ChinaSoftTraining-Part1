package 内部类;

public class Test1 {
    //成员内部类
    public static void main(String[] args) {

        /*
        内部类可以访问外部类的属性和方法、
        构造方式： 外部类.内部类 内部类实例=new 外部类实例.new 内部类构造方法
        当外部类的属性和内部类属性一致时，加 外部类类名.this.属性加以区分
         */
        Outer out=new Outer();
        Outer.Inner1 in1 = out.new Inner1();
        in1.sayB();

        Outer.Inner2 in2=out.new Inner2();
        in2.sayC();
    }
}
class Outer{
    private String name="zhansgna";
    private static String addr="上海";
    private int age=23;

    public void sayA(){
        System.out.println("Outer Say.................");
    }

    class Inner1{
        private String name="李四";

        public void sayB(){
            System.out.println(Outer.this.name+this.name+"再说话。。"+age);
        }
    }
    class Inner2{
        public void sayC(){
            System.out.println(addr+name+"Inner............");
            sayA();
        }
    }
}