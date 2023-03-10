package this关键字;

public class AAA {

    /*
    this关键字： 表示当前对象
    1. this。属性 ： 当参数名和属性名有冲突的时候io，再属性前加this加以区分
    2. this.方法()  :  表示调用的是普通方法,再一个方法调用另外一个普通方法
    3. this(): 表示调用无参的构造方法 ： 再一个构造方法里面调用另外一个无参的构造方法,只能放在逻辑的第一行
    4. this(参数值，参数值);表示调用有参的构造方法；在无参的构造方法里面调用有参的构造方法,也是只能放在逻辑的第一行
     */

    String name;
    int age;

    public AAA(){
        this("赵六",45);
        System.out.println("AAA的无参构造方法");
    }

    public AAA(String name,int age){
        //this();
        //this。属性 ： 当参数名和属性名有冲突的时候io，再属性前加this加以区分
        this.name=name;
        this.age=age;
    }


    public void aa(){

        System.out.println("aaaaaaaaaaa");
        this.bb();
    }

    public void bb(){
        System.out.println("bbbbbbbbbbbbb");
    }
}
