package com.team.view.login;

import com.team.service.common.Loading;
import com.team.service.common.Step;
import com.team.service.log.UserManagement;
import com.team.view.menu.ManagementMenu;

import java.util.Scanner;

/**
 * Author:tyza66
 * CreateTime: 2023-03-29 18:28
 * Github: https://github.com/tyza66
 */
public class Log {
    UserManagement um = new UserManagement();
    ManagementMenu mm = new ManagementMenu();

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
            System.out.println("*****用户登录*****");
            System.out.println("1.登录");
            System.out.println("2.注册");
            System.out.println("0.退出");
            System.out.print("输入指令：");
            String code = input.next();
            switch (code) {
                case "1":
                    logIn();
                    break;
                case "2":
                    signOn();
                    break;
                case "0":
                    run = false;
                    break;
                default:
                    System.out.println("您输入的内容不合法，请重新输入!");
                    break;
            }
            Step.longNext();
        }
    }

    //登录
    public void logIn() {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入账号：");
        String id = input.next();
        System.out.print("请输入密码：");
        String pwd = input.next();
        if (um.check(id,pwd)){
            System.out.print("是否需要修改个人信息(y/n):");
            String y = input.next();
            if(y.equalsIgnoreCase("Y")){
                System.out.print("请输入新的密码:");
                String newPwd = input.next();
                um.changePassWord(id,newPwd);
                System.out.println("修改密码成功，请重新登录!");
            }else{
                System.out.println("登录成功！");
                mm.show();
            }
        }else{
            System.out.println("您输入的账号或密码有误，登录失败！");
        }
    }

    //注册
    public void signOn() {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入要注册的账号：");
        String id = input.next();
        System.out.print("请输入您的密码：");
        String pwd = input.next();
        um.add(id,pwd);
        System.out.println("注册成功！");
    }
}
