import java.util.Scanner;

public class 奥巴马买鸡蛋 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入鸡蛋的数量：");
        int n = input.nextInt();
        if(n<=5){
            System.out.println("奥巴马吃掉了鸡蛋");
        }else{
            System.out.println("奥巴马去退货了");
        }
    }
}
