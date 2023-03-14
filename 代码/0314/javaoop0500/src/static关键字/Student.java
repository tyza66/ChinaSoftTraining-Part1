package static关键字;

public class Student {
    /*
    static关键字： 静态的
    1. static 属性： 类变量  ，没加static修饰的，就是实例变量， 一般使用类名打点调用
    2. static 方法: 静态方法里面不能调用非静态内容； 一般通过类名打点调用
    3. static{}  静态块： 当第一次使用到该类的时候，他就会自动执行；常用于做一些初始化工作;不能调用非静态内容

    类变量：属于该类所有，前面有static修饰，他和该类的实例之间是一对多的关系，一旦他的值确定，该类的实例的该属性都唯一的对应他的值
     */

    String name;//实例变量
    static String schoolName;//类变量

    //静态代码块
    static{
        System.out.println(schoolName+"我是静态代码块，踩踩我什么时候执行？");
    }

    //普通方法
    public static void study(){
        System.out.println("学生在"+schoolName+"学习");
    }
}

class TestStudent{
    public static void main(String[] args) {
        Student s1=new Student();
        /*s1.name="张山";
        s1.schoolName="渤海大学";

        Student s2=new Student();
        s2.name="李四";
        s2.schoolName="北京大学";//对schoolName重新赋值了

        //建议通过类名打点调用 也可以通过对象名来调用
        Student.schoolName="清华大学";

        System.out.println(s1.name+" "+s1.schoolName);
        System.out.println(s2.name+" "+s2.schoolName);
        //建议通过类名打点调用
        Student.study();
        s2.study();*/


    }
}