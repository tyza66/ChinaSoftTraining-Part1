package 昨天作业;

import java.util.Scanner;

public class GuestNumberDemo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入东风汽车第一季度生产的产量（万辆）：");
        double num=sc.nextDouble();

        System.out.println("请输入东风汽车厂年生产产量（万辆）：");
        double num2=sc.nextDouble();

        double rate=(num/num2)*100;
        System.out.println("该厂第一季度生产量已完成总计划的："+rate+"%");
    }
}
