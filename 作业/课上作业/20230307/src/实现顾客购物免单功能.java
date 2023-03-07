import java.util.Scanner;

public class 实现顾客购物免单功能 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int id = 0;
        int i1 = 0, i2 = 0, i3 = 0, i4 = 0;
        System.out.println("请输入4位会员卡号：");
        id = input.nextInt();
        i1 = id / 1000;
        i2 = id % 1000 / 100;
        i3 = id % 100 / 10;
        i4 = id % 10;
        if((i1+i2+i3+i4)/4==5){
            System.out.println("恭喜你获得免单资格！");
        }else{
            System.out.println("很遗憾，你必须全额付款！");
        }
    }
}
