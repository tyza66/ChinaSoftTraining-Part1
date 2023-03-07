import java.util.Scanner;

public class Test9 {

    public static void main(String[] args) {

        //从键盘动态获取数据
        System.out.println("请输入一个int类型的值：");
        Scanner sc=new Scanner(System.in);//构建一个扫描器，用于扫描用来动态输入的而数据
        int num=sc.nextInt();// 将用户输入的数据用变量num来接受
        System.out.println("num: "+num);

        System.out.println("请输入一个小数类型的数据：");
        double d = sc.nextDouble();//alt+回车 自动生成返回值
        System.out.println("接受到的小数是："+d);

        System.out.println("请输入一个String类型的数据：");
        String str = sc.next();
        System.out.println("接受到的字符串是："+str);


    }
}
