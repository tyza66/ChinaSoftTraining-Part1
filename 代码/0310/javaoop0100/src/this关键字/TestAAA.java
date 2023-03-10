package this关键字;

public class TestAAA {

    public static void main(String[] args) {

        AAA t=new AAA();
        t.aa();
        System.out.println(t.name+" "+t.age);
        System.out.println("----------------------------");
        AAA t2=new AAA("老李",23);
    }
}
