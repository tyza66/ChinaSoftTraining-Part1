package 面向对象;

public class Student {
    //类名，变量名，属性名，方法名一定要做到见文知义

    //属性 静态的，特征，内部的，与生俱来的
    //某种类型的变量
    int  id;//学生编号
    String name;//姓名
    int age;//年龄
    String address;//住址

    //方法  表示行为，能力，动作
    public void study(){
        System.out.println("学生在学习");
    }

    public void sleep(){
        System.out.println("学生再休息");
    }
}