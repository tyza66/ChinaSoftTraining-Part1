package 构造方法;

public class TestWorker {

    public static void main(String[] args) {

        //w 就是类的实例  对象名
        //无参构造方法用于创建对象使用，后面再给属性赋值
        Worker w=new Worker();
        w.name="老王";
        w.age=45;
        w.salary=3400;

        w.work();
        w.getSalary();
        w.show();

        //有参的构造方法一般有赋值的逻辑，用于 创建对象和给属性赋值一块实现
        Worker w2=new Worker("李四",49,8000);
        w2.show();
    }
}
