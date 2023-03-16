package 我的日期;

public class Test2 {
    public static void main(String[] args) {
        MyDate m = new MyDate(2023,3,16);
        //直接输出的时候，对象会默认自动调用toString方法
        System.out.println(m);
    }
}
