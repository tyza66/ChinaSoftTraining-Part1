import java.util.Scanner;

public class 计算学员总成绩及平均分 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double c=0,m=0,e=0;
        System.out.print("请输入语文成绩 ：");
        c = input.nextDouble();
        System.out.print("请输入数学成绩 ：");
        m = input.nextDouble();
        System.out.print("请输入英语成绩 ：");
        e = input.nextDouble();
        System.out.println("总分为："+(c+m+e));
        System.out.println("平均分为："+(c+m+e)/3);
    }
}
