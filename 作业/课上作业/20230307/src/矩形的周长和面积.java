import java.util.Scanner;

public class 矩形的周长和面积 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double c=0,k=0;
        System.out.print("请输入矩阵的长:");
        c = input.nextDouble();
        System.out.print("请输入矩阵的宽:");
        k = input.nextDouble();
        System.out.println("=================================");
        System.out.println("矩阵的长："+c+"\t"+"矩阵的宽："+k);
        System.out.println("矩阵的周长为："+((c+k)*2));
        System.out.println("矩阵的周长为："+(c*k));
    }
}
