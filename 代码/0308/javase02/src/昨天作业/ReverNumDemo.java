package 昨天作业;

import java.util.Scanner;

public class ReverNumDemo {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个3位整数：");
        int num=sc.nextInt();

        int ge=num%10;//个位数
        int shi=num%100/10;//十位数
        int bai=num/100;//百位数

        int reverNum=ge*100+shi*10+bai;
        System.out.println("倒叙组合输出数字是："+reverNum);
    }
}
