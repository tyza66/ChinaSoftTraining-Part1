package zy1;

import java.util.Scanner;

public class TestNumber {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int n1=sc.nextInt();
        System.out.println("请输入第二个数：");
        int n2=sc.nextInt();
        Number n=new Number(n1,n2);

        n.addition();
        n.subtration();
        n.multiplication();
        n.division();
    }
}
