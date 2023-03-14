public class OverLoadTest {
    int id;
    String name;
    //这个是构造方法的重载
    public OverLoadTest() {

    }

    public OverLoadTest(int id) {
        this.id = id;
    }

    public OverLoadTest(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //这个是普通方法的重载
    public void add(int a,int b){
        System.out.println(a+b);
    }

    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
}

class Test2{
    public static void main(String[] args) {
        new OverLoadTest(1);
        new OverLoadTest(1,"giao");
        OverLoadTest o = new OverLoadTest();
        o.add(1,2);
        o.add(1,2,3);
    }
}