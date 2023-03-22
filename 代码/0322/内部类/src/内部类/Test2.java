package 内部类;

public class Test2 {
    public static void main(String[] args) {
        //静态内部类

        AA.BB bb=new AA.BB();//静态内部类的构造方式
        bb.sayB();
    }
}
class AA{
    private String name="zhangsan";
    private static String addr="shanghai";

    public static void sayA(){
        System.out.println("Outer................");
    }

    static class BB{
        int age;

        public  void sayB(){
            //System.out.println(name);//会报错。静态内部类不能访问非静态内容
            System.out.println(addr+age);
            sayA();
        }
    }
}
