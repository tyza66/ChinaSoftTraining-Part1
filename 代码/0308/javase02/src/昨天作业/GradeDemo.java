package 昨天作业;

import java.util.Scanner;

public class GradeDemo {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("输入学员张三的Java成绩：");
        int num1=sc.nextInt();
        System.out.println("输入学员李四的Java成绩：");
        int num2=sc.nextInt();

        String str=(num1-num2)>0?"张三比李四的成绩高"+(num1-num2)+"分":"李四比张三的成绩高"+(num2-num1)+"分";
        System.out.println(str);
    }
}
