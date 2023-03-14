public class StaticTest {
    public static String name;
    public static String schoolName;

    static{
        System.out.println("这里是静态代码段");
    }

    static void show(){
        System.out.println("我叫"+name+" 在"+schoolName);
    }
}

class Tset{
    public static void main(String[] args) {
        StaticTest staticTest = new StaticTest();
        StaticTest.schoolName = "渤海大学";
        staticTest.name ="孙小明";
        staticTest.show();
    }
}