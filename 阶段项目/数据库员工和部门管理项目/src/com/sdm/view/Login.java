package com.sdm.view;

import com.sdm.pojo.User;
import com.sdm.service.UserService;

import java.util.Scanner;

/**
 * Author: tyza66
 * Date: 2023/04/18 10:12
 * Github: https://github.com/tyza66
 */
public class Login {
    //数据库中有一个默认账号 账号和密码都是admin
    private UserService us = new UserService();
    public static String user = "";

    public void show() {
        boolean run = true;
        int failTimes = 0;
        Scanner input = new Scanner(System.in);
        while (run) {
            if (user.equals("")) {
                System.out.print("是否需要注册新账号(y/n):");
                String choice = input.next();
                if (choice.equalsIgnoreCase("Y")) {
                    System.out.print("请输入注册的账号：");
                    String userName = input.next();
                    System.out.print("请输入你的密码：");
                    String passWord = input.next();
                    us.addUser(new User(userName, passWord));
                    System.out.println("注册成功！");
                }
                System.out.println("---员工部门管理系统登录---");
                System.out.print("请输入你的账号：");
                String userName = input.next();
                System.out.print("请输入你的密码：");
                String passWord = input.next();
                if (us.checkUser(userName, passWord)) {
                    failTimes = 0;
                    user = userName;
                    menu();
                } else {
                    System.out.println("密码错误请重新登录!");
                    failTimes++;
                    if (failTimes == 3) {
                        System.out.println("3次密码错误，将自动退出系统!");
                        failTimes = 0;
                        run = false;
                    }
                }
            } else {
                menu();
            }
            System.out.println("----------");
        }
    }

    public void menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("登录成功");
        System.out.println("---员工部门管理系统---");
        System.out.println("1.修改当前系统用户密码(" + user + ")");
        System.out.println("2.员工信息管理模块");
        System.out.println("3.部门信息管理模块");
        System.out.println("0.返回登录");
        System.out.println("-1.退出系统");
        System.out.print("输入指令序号：");
        int ch = input.nextInt();
        switch (ch) {
            case 0:
                user = "";
                break;
            case 1:
                System.out.print("请输入新密码:");
                String passWord = input.next();
                us.changePassword(user, passWord);
                System.out.println("修改成功,请重新登录!");
                user = "";
                break;
            case 2:
                new EmpUI().show();
                break;
            case 3:
                new DeptUI().show();
                break;
            case -1:
                System.exit(0);
                break;
            default:
                System.out.println("您输入的指令有误，请重新输入!");
                break;
        }
    }
}
