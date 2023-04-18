package com.sdm.view;

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

    public void show() {
        boolean run = true;
        int failTimes = 0;
        Scanner input = new Scanner(System.in);
        while (run) {
            System.out.println("---员工部门管理系统登录---");
            System.out.print("请输入你的账号：");
            String userName = input.next();
            System.out.print("请输入你的密码：");
            String passWord = input.next();
            if (us.checkUser(userName, passWord)) {
                failTimes = 0;
                System.out.println("登录成功");
            } else {
                System.out.println("密码错误请重新登录");
                failTimes++;
                if (failTimes == 3) {
                    System.out.println("3次密码错误，将自动退出系统");
                    failTimes = 0;
                    run = false;
                }
            }
        }
    }
}
