package 分支结构;

import java.util.Scanner;

public class TestSwitch02 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数值：");
        int n1=sc.nextInt();
        System.out.println("请输入第二个数值：");
        int n2=sc.nextInt();

        System.out.println("请输入运算操作符：");
       // char ch=sc.next().charAt(0);
        String ch=sc.next();

        switch (ch){
            case "+":
                System.out.println(n1+"+"+n2+"="+(n1+n2)); break;
            case "-":
                System.out.println(n1+"-"+n2+"="+(n1-n2)); break;
            case "*":
                System.out.println(n1+"*"+n2+"="+(n1*n2)); break;
            case "/":
                System.out.println(n1+"/"+n2+"="+(n1/n2)); break;
            case "%":
                System.out.println(n1+"%"+n2+"="+(n1%n2)); break;

            default:
                System.out.println("该操作不合法");
        }
    }
}
