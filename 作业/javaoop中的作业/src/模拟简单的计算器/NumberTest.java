package 模拟简单的计算器;

public class NumberTest {
    public static void main(String[] args) {
        Number number = new Number(1,2);
        System.out.println(number.addition());
        System.out.println(number.subtration());
        System.out.println(number.multiplication());
        System.out.println(number.division());
    }

}
