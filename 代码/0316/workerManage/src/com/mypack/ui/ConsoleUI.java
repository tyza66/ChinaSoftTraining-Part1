package com.mypack.ui;

import com.mypack.entity.sub.Employee;
import com.mypack.entity.sub.Manager;
import com.mypack.service.WorkerManagementIF;
import com.mypack.service.impl.WorkerManagementImpl;

import java.util.Scanner;

public class ConsoleUI {

    Scanner sc=new Scanner(System.in);
    WorkerManagementIF wm=new WorkerManagementImpl();

    public void startApp(){
        while(true){
            System.out.println("---------------------");
            System.out.println("\t工人管理系统");
            System.out.println("---------------------");
            System.out.println("1.\t添加工人");
            System.out.println("2.\t查询所有");
            System.out.println("3.\t查询单个");
            System.out.println("4.\t调整薪资");
            System.out.println("5.\t删除工人");
            System.out.println("0.\t退出系统");
            System.out.println("----------------------");
            System.out.println("请选择操作：");
            int num=sc.nextInt();

            if(num==0){
                System.out.println("推出系统了。。。。");
                break;
            }

            switch (num){
                case 1: showAdd();break;
                case 2: showQueryAll();break;
                case 3: showQueryOne();break;
                case 4: showUpdateSalary(); break;
                case 5: showDelete();break;
                default:
                    System.out.println("您输入不合法，请重新输入。。。");
            }


        }
    }

    private void showDelete() {
        System.out.println("请输入您要删除的人员的编号：");
        int id=sc.nextInt();
        wm.deleteWorkerById(id);
    }

    private void showUpdateSalary() {
        System.out.println("请输入您要更新的人员的编号：");
        int id=sc.nextInt();
        System.out.println("请输入您要调整的薪资幅度：");
        double increment=sc.nextDouble();
        wm.updateSalary(id,increment);
    }

    private void showQueryOne() {
        System.out.println("请输入您要查询的人员的编号：");
        int id=sc.nextInt();
        wm.queryOneWorker(id);
    }

    private void showQueryAll() {

        System.out.println("欢迎进入查询所有的界面");
        wm.queryAllWorker();
    }

    private void showAdd() {

        System.out.println("请选择1. 添加普通工人 2. 添加经理：");
        int num=sc.nextInt();
        if(num==1){
            System.out.println("请输入您要添加的普通工人的编号：");
            int id=sc.nextInt();
            System.out.println("请输入您要添加的普通工人的姓名：");
            String name=sc.next();
            System.out.println("请输入您要添加的普通工人的岗位名称：");
            String jobname=sc.next();
            System.out.println("请输入您要添加的普通工人的月薪：");
            double salary=sc.nextDouble();
            System.out.println("请输入您要添加的普通工人的年终奖：");
            double yearPay=sc.nextDouble();

            Employee e=new Employee(id,name,jobname,salary,yearPay);

            wm.addWorker(e);


        }else if(num==2){
            System.out.println("请输入您要添加的经理的编号：");
            int id=sc.nextInt();
            System.out.println("请输入您要添加的经理的姓名：");
            String name=sc.next();
            System.out.println("请输入您要添加的经理的岗位名称：");
            String jobname=sc.next();
            System.out.println("请输入您要添加的经理的月薪：");
            double salary=sc.nextDouble();
            System.out.println("请输入您要添加的经理的年终奖：");
            double yearPay=sc.nextDouble();
            System.out.println("请输入您要添加的经理的分红：");
            double fenhong=sc.nextDouble();

            Manager m=new Manager(id,name,jobname,salary,fenhong,yearPay);
            wm.addWorker(m);

        }else{
            System.out.println("您输入不合法，请重新输入");
        }
    }
}


