import java.util.Scanner;

public class 判断是否是成年人 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "";
        int age = 0;
        System.out.print("请输入姓名：");
        name = input.next();
        System.out.print("请输入年龄：");
        age = input.nextInt();
        System.out.println("=================");
        System.out.print(name+"今年"+age+"岁，");
        if (age>=18){
            System.out.println("是成年人");
        }else{
            System.out.println("是未成年人");
        }
    }
}
