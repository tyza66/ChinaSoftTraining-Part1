package jdk8新特性.接口的默认方法;

public class TestFormala {

    public static void main(String[] args) {
        Formula formula=new Formula() {
            @Override
            public double claculate(int a) {
                return sqrt(a*100);//对默认函数进行调用
            }
        };
        System.out.println(formula.claculate(100));
        System.out.println(formula.sqrt(100));
    }
}
