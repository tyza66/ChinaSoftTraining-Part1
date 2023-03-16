package 学生继承人类;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();
        //is-a关系
        Person p2 = new Student();
        //因为这个toString是根类Object类就有的，Strudent里面的是方法重写
        System.out.println(p2.toString());
    }
}