package 昨天作业;

import java.util.Scanner;

public class RectDemo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入矩形的长：");
        double chang=sc.nextDouble();
        System.out.println("请输入矩形的宽：");
        double kuan=sc.nextDouble();

        double zhou=(chang+kuan)*2;
        double mianji=chang*kuan;

        System.out.println("矩形的长是："+chang+"\t矩形的宽是："+kuan);
        System.out.println("矩形的周长是："+zhou);
        System.out.println("矩形的面积是："+mianji);
    }
}
