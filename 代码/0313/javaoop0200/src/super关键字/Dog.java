package super关键字;

public class Dog extends Animal {

    /*
    super关键字： 用在子类里面，在子类调用父类相应的内容 ；表示父类对象
    1. super.属性  表示调用父类里面相应的属性名
    2. super.方法()  表示调用父类里面的普通方法
    3. super()  表示调用父类无参的构造方法，必须写在方法内部第一行
    4. super(参数值，参数值) 表示调用父类有参的构造方法，必须写在方法内部第一行
     */

    String kind;//特有的属性

    public Dog(){
        super();
        System.out.println("Dog的无参构造方法");
    }

    public Dog(String name,int age,String kind){

        //赋值的逻辑
        /*this.name=name;
        this.age=age;*/
        super(name,age);//和上面2行代码等效
        this.kind=kind;
    }

    //特有的方法
    public void shout(){
        System.out.println(super.name+"在叫");
        super.eat();
    }
}
