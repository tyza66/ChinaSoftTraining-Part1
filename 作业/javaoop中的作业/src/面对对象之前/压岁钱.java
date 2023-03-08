package 面对对象之前;

import java.util.Scanner;

public class 压岁钱 {
    //功能描述：春节到了，小明期盼收到压岁钱。他想：如果收到的钱超过 1000 元，那 么捐助失学儿童；收到的钱在 500～1000 之间，那么购买航模；如果收到的钱不足 500 元，那么购买百科全书
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = 0;
        System.out.print("输入压岁钱的金额：");
        m = input.nextInt();
        if(m>1000){
            System.out.println("捐助失学儿童");
        }else if (m>500){
            System.out.println("购买航模");
        }else{
            System.out.println("购买百科全书");
        }
    }
}
