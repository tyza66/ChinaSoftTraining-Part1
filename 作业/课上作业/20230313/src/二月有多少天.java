import java.sql.SQLOutput;
import java.util.Scanner;

public class 二月有多少天 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("输入你要查询的年份：");
        int y = input.nextInt();
        if((y%4==0&&y%100!=0)||y%400==0){
            System.out.println(y+"年是润年，润年的二月有29天");
        }else{
            System.out.println(y+"年是平年，平年的二月有28天");
        }
    }
}
