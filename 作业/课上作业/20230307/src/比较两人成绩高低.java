import java.util.Scanner;

public class 比较两人成绩高低 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int zs=0,ls=0;
        System.out.print("请输入张三的java成绩：");
        zs = input.nextInt();
        System.out.print("请输入李四的java成绩：");
        ls = input.nextInt();
        if(zs>ls){
            System.out.print("张三的成绩比李四高"+(zs-ls)+"分");
        }else{
            System.out.print("李四的成绩比张三高"+(ls-zs)+"分");
        }
    }
}
