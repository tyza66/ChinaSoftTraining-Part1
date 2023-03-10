package 构造方法;

public class Worker {

    //属性
    String name;//姓名
    int age;//年龄
    double salary;//薪资

    //构造方法
    /*
    构造方法： 主要用于构造对象使用的，跟在new关键字后面使用
    构造方法的名称跟类名一致，他没有返回值类型，void也没有
    如果系统里面没有任何构造方法，系统会默认提供一个无参的构造方法;
    如果系统里面有有参的构造方法，系统将不再默认提供一个无参的构造方法
    建议：有参的和无参的构造方法 要不都写上，要不都不写

    可以分为 无参的构造方法和有参的构造方法
     */
    public Worker(){
        //System.out.println("Worker的无参构造方法");
    }

    public Worker(String name,int age,double salary){
        System.out.println("Worker的有参的构造方法");
        //有参的构造方法里面赋值的逻辑
        //当参数和属性有冲突的时候，在属性前加this加以区分
        this.name=name;
        this.age=age;
        this.salary=salary;
    }


    //普通方法
    public void work(){
        System.out.println("工人再工作");
    }
    public void getSalary(){
        System.out.println("工人在领薪资");
    }

    public void show(){
        System.out.println("姓名："+name+" 年龄："+age+" 薪资："+salary);
    }
}
