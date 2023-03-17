package 作业;

import java.util.Scanner;

public class TestAge {

    public static void main(String[] args) {
        Student s=new Student();
        s.setName("小李");
        System.out.println("请输入该学生的年龄：");
        Scanner sc=new Scanner(System.in);
        int age = sc.nextInt();
        s.setAge(age);

        System.out.println(s);
    }
}
