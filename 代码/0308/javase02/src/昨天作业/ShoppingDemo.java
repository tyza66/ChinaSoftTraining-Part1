package 昨天作业;

import java.util.Scanner;

public class ShoppingDemo {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入商品单价：（元）");
        float price=sc.nextFloat();

        System.out.println("请输入商品数量：");
        int num=sc.nextInt();

        float total=price*num;
        System.out.println("购物的总价是："+total+"元");
    }
}
