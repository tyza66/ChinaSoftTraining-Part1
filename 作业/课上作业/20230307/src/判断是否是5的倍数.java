import java.util.Scanner;

public class 判断是否是5的倍数 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        System.out.print("请输入一个正整数：");
        a = input.nextInt();
        if (a%5==0){
            System.out.println(a+"是5的倍数");
        }else {
            System.out.println(a+"不是5的倍数");
        }
    }
}
