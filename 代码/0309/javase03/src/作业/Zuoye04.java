package 作业;

import java.util.Scanner;

public class Zuoye04 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        while(true) {
            System.out.println("---------------------");
            System.out.println("\t计算器");
            System.out.println("---------------------");
            System.out.println("1.\t加法运算");
            System.out.println("2.\t减法运算");
            System.out.println("3.\t乘法运算");
            System.out.println("4.\t整除运算");
            System.out.println("5.\t取余运算");
            System.out.println("0.\t退出系统");
            System.out.println("---------------------");
            System.out.println("请输入第一个数：");
            int n1=sc.nextInt();
            System.out.println("请输入第二个数：");
            int n2=sc.nextInt();
            System.out.println("请选择操作:");
            int num=sc.nextInt();
            if(num==0){
                System.out.println("退出系统");
                break;
            }

            switch (num){
                case 1 :
                    System.out.println(n1+n2); break;
                case 2:
                    System.out.println(n1-n2); break;
                case 3:
                    System.out.println(n1*n2); break;
                case 4:
                    System.out.println(n1/n2); break;
                case 5 :
                    System.out.println(n1%n2); break;

                default:
                    System.out.println("非法操作");

            }
        }

    }
}
