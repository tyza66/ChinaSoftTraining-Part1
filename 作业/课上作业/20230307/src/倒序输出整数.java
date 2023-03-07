import java.util.Scanner;

public class 倒序输出整数 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int a1, a2, a3;
        System.out.print("请输入一个3位整数：");
        a = input.nextInt();
        a1 = a / 100;
        a2 = a % 100 / 10;
        a3 = a % 10;
        System.out.print("倒序组合输出的数字是：" + a3 + a2 + a1);
    }
}
