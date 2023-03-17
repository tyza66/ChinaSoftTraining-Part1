package 异常;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        //自定义异常  继承Exception
        input();
    }

    public static void input(){
        System.out.println("请输入一个数字：");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        if(num==4){
            //直接抛出一个异常

            try {
                throw new MyException("您输入了我不喜欢的数字!!!");
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
        }else{
            System.out.println("您输入的数值是："+num);
        }
    }
}

class MyException extends Exception{

    public MyException(String message) {
        super(message);
    }
}