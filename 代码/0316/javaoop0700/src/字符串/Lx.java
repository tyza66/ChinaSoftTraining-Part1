package 字符串;

public class Lx {

    public static void main(String[] args) {
       // ex1();
        ex2();

    }

    /*1.给定一个字符串String str="hgrh'[iyhwghl;hp'ghibjg";

    要求：经过运算，把里面的字符反转输出



2.编写一个程序,利用数组求出”HELLO”,”JAVA”，”PROGRAM”三个字符串的平均长度

    String[] arr={”HELLO”,”JAVA”,”PROGRAM”}*/

    public static void ex1(){
        String str="hgrh'[iyhwghl;hp'ghibjg";
        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            System.out.print(ch+"");
        }
    }

    public static void ex2(){
        String[] arr={"HELLO","JAVA","PROGRAM"};
        int totallen=0;
        for(String str:arr){
            totallen+=str.length();//求总长度
        }
        System.out.println("平均长度是："+totallen/arr.length);
    }

}
