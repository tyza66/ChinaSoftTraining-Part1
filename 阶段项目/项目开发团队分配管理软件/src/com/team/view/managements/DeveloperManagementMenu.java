package com.team.view.managements;

import com.team.service.common.Loading;
import com.team.service.managements.DeveloperManagement;

import java.util.Scanner;

/**
 * Author:tyza66
 * CreateTime: 2023-03-29 18:43
 * Github: https://github.com/tyza66
 */
//开发人员管理
public class DeveloperManagementMenu {
    DeveloperManagement dm = new DeveloperManagement();

    public void show() {
        Scanner input = new Scanner(System.in);
        //加载
        try {
            Loading.loadSpecialEffects();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //显示界面
        boolean run = true;
        while (run) {
            System.out.println("====开发人员管理菜单====");
            System.out.println("1.添加人员");
            System.out.println("2.查阅人员");
            System.out.println("0.返回上级菜单");
            System.out.print("输入指令：");
            String code = input.next();
            switch(code){
                case "1":
                    addOne();
                    break;
                case "2":
                    showAll();
                    break;
                case "0":
                    run = false;
                    break;
                default:
                    break;
            }
        }

    }
    public void addOne(){
        Scanner input = new Scanner(System.in);
        String id,name,age,salary,bouns,stock;
        System.out.println("你要添加的开发人员类型是：");
        System.out.println("1.程序员");
        System.out.println("2.设计师");
        System.out.println("3.架构师");
        String code = input.next();
        if(code.equals("1")){
            System.out.print("请输入id：");
            id = input.next();
            System.out.print("请输入name：");
            name = input.next();
            System.out.print("请输入age：");
            age = input.next();
            System.out.print("请输入salary：");
            salary = input.next();
        }else if(code.equals("2")){
            System.out.print("请输入id：");
            System.out.print("请输入name：");
            System.out.print("请输入age：");
            System.out.print("请输入salary：");
            System.out.print("请输入bonus：");
        }else if(code.equals("3")){
            System.out.print("请输入id：");
            System.out.print("请输入name：");
            System.out.print("请输入age：");
            System.out.print("请输入salary：");
            System.out.print("请输入bonus：");
            System.out.print("请输入stock：");
        }else {
            System.out.println("您输入的信息有误！");
        }
    }
    public void showAll(){

    }
}
