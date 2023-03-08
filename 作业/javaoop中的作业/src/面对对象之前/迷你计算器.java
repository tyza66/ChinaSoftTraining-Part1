package 面对对象之前;

import java.util.Scanner;

public class 迷你计算器 {
    //使用 switch 语句实现迷你运算器，支持“+”、“-”、“*”、“/”，自己定义两个操作数，显示输出运算结果
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int js1 = 0;
        String f = "";
        int js2 = 0;
        int out = 0;
        System.out.print("请输入两位数的计算公式:");
        js1 = input.nextInt();
        f = input.next();
        js2 = input.nextInt();
        switch (f) {
            case "+":
                out = js1+js2;
                break;
            case "-":
                out = js1-js2;
                break;
            case "*":
                out = js1*js2;
                break;
            case "/":
                out = js1/js2;
                break;
        }
        System.out.println(out);
    }
}
