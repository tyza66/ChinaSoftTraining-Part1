package com.mypack.ui;

import com.mypack.entity.sub.Student;
import com.mypack.entity.sub.Teacher;
import com.mypack.service.ArrayPeopleManagement;
import com.mypack.service.ListPeopleManagement;
import com.mypack.service.PeopleManagementIF;

import java.util.Scanner;

public class ConsoleUI {
    PeopleManagementIF pm=new ListPeopleManagement();

    Scanner sc=new Scanner(System.in);


    public void startApp(){

        while(true) {
            System.out.println("-------------------------");
            System.out.println("\t人员管理系统");
            System.out.println("--------------------------");
            System.out.println("1.\t添加人员");
            System.out.println("2.\t查询所有");
            System.out.println("3.\t修改人员");
            System.out.println("4.\t删除人员");
            System.out.println("5.\t查询单个");
            System.out.println("0.\t退出系统");
            System.out.println("--------------------------");
            System.out.println("请选择操作：");

            int num = sc.nextInt();
            if(num==0){
                System.out.println("退出系统了。。。");
                break;
            }
            switch (num){
                case 1: showAdd();break;
                case 2: showQueryAll();break;
                case 3: showUpdate(); break;
                case 4: showDelete();break;
                case 5: showQueryOne();break;
                default:
                    System.out.println("输入不合法");break;
            }
        }
    }

    private void showQueryOne() {

        System.out.println("欢迎进入查询单个模块... 请输入您要查询的人员编号：");
        int id = sc.nextInt();
        pm.queryPersonById(id);

    }

    private void showDelete() {
        System.out.println("欢迎进入删除人员信息模块。。。请输入您要删除的人员编号：");
        int id = sc.nextInt();
        pm.deleteOne(id);
    }

    private void showUpdate() {
        System.out.println("欢迎进入更新人员信息模块。。");
        System.out.println("请输入要更新人员的编号信息：");
        int id=sc.nextInt();
        System.out.println("请输入更新之后的人员姓名：");
        String newName=sc.next();
        pm.updatePersonById(id,newName);
    }

    private void showQueryAll() {
        System.out.println("欢迎进入查询所有人员信息模块");
        pm.queryAllPerson();
    }

    private void showAdd() {

        System.out.println("欢迎进入添加学生模块，请选择：1. 添加老师 2. 添加学生");

        int num=sc.nextInt();
        if(num==1){
            System.out.println("请输入老师的编号：");
            int id= sc.nextInt();
            System.out.println("请输入老师的姓名：");
            String name=sc.next();
            System.out.println("请输入老师的年龄：");
            int age=sc.nextInt();
            System.out.println("请输入老师的地址：");
            String address=sc.next();
            System.out.println("请输入老师的工号：");
            int teaNO=sc.nextInt();
            System.out.println("请输入老师的科目：");
            String subject=sc.next();

            //直接通过有参的构造方法初始化对象
            Teacher t=new Teacher(id,name,age,address,teaNO,subject);
            //调用添加的逻辑
            pm.addPerson(t);


        }else if(num==2){
            System.out.println("请输入学生的编号：");
            int id= sc.nextInt();
            System.out.println("请输入学生的姓名：");
            String name=sc.next();
            System.out.println("请输入学生的年龄：");
            int age=sc.nextInt();
            System.out.println("请输入学生的地址：");
            String address=sc.next();
            System.out.println("请输入学生的学号：");
            int stuNO=sc.nextInt();
            System.out.println("请输入学生的班级名称：");
            String className=sc.next();

            //直接通过有参的构造方法初始化对象
            Student s=new Student(id,name,age,address,stuNO,className);
            //调用添加的逻辑
            pm.addPerson(s);

        }else{
            System.out.println("您的输入不合法");
        }

    }
}
