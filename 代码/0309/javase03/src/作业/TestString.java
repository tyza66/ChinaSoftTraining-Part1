package 作业;

import java.util.Scanner;

public class TestString {
    public static void main(String[] args) {

        /*
        基本数据类型： byte short int long float double char boolean
        引用数据类型： String 数组 类  接口

        基本数据类型比较使用==比较
        引用数据类型比较使用.equals比较
         */

        int n1=20,n2=20;
        System.out.println(n1==n2);


        String s1="abc";
        String s2=new String("abc");
        System.out.println(s1==s2);//false
        //对于引用数据类型来说，==比较的是是否是同一个对象，是否是同一个内存地址
        //比较值的话。使用.equals()方法来比较
        System.out.println(s1.equals(s2));//true

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str=sc.next();
        if(str.equals("aaa")){
            System.out.println("您输入的值是aaa");
        }else{
            System.out.println("您输入的是其他值");
        }
    }
}
