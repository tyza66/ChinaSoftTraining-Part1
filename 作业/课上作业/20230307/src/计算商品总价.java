import java.util.Scanner;

public class 计算商品总价 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a=0;
        int n=0;
        System.out.print("请输入商品单价（元）：");
        a = input.nextDouble();
        System.out.print("请输入商品数量：");
        n = input.nextInt();
        System.out.println("商品的总价是："+a*n+"元");
    }
}
