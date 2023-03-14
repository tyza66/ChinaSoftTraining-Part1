package 方法的重载;

public class AAAA {

    int id;
    String name;
    int age;

    //构造方法
    //无参的构造方法
    /*
    overload: 方法的重载：用在一个类里面
    方法的名称相同，参数列表不同（参数个数不同或者个数相同对应位置类型不同）
    分为构造方法的重载和普通方法的重载
    普通方法的重载跟返回值类型没有关系
     */
    //构造方法的重载
    public AAAA(){}
    public AAAA(int id,String name,int age){
        //赋值的逻辑
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public AAAA(int id, String name) {
        this.id=id;
        this.name=name;
    }

    public AAAA(String name){
        this.name=name;
    }

    //普通方法的重载
    public void add(int n1,int n2){
        System.out.println(n1+n2);
    }

    public void add(int n1,int n2,int n3){
        System.out.println(n1+n2+n3);
    }
    //普通方法的重载跟返回值类型没有关系

  /*  public int add(int n1,int n2){
        return  n1+n2;
    }*/

    public void show(){
        System.out.println("id:"+id+" 姓名："+name+" 年龄："+age);
    }
}

class Test{
    public static void main(String[] args) {
        AAAA a1=new AAAA();
        AAAA a2=new AAAA(1,"张干",23);

        AAAA a3=new AAAA(2,"李四");
        AAAA a4=new AAAA("王五");

        a1.add(23,24);
        a1.add(24,56,78);
    }
}
