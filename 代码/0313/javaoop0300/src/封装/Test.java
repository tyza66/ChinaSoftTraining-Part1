package 封装;

public class Test {
    public static void main(String[] args) {

        Beauty b=new Beauty();

        //直接调用属性给属性设置值
        //b.name="貂蝉";
        b.setName("貂蝉");
        //b.age=66;
        //通过setXXX方法来实现给属性设置值
        b.setAge(23);

        //通过getXXX方法来实现给属性取值
        System.out.println("姓名： "+b.getName()+" 年龄："+b.getAge());

        //System.out.println("姓名："+b.name+" 年龄："+b.age);
    }
}
