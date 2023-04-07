package com.team.view;

import com.team.service.LoginService;

import java.util.Scanner;

public class LoginView {
    private Scanner sc = new Scanner(System.in);
    private LoginService loginService = new LoginService();

    //软件初始界面
    public void initMenu() {
        boolean flag = true;
        int i = 0;
        while (flag) {
            System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
            System.out.println("\t欢迎来到项目开发团队分配管理软件");
            System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
            if (i == 0) {
                System.out.println("\uD83D\uDC15\n\uD83D\uDC15");
                System.out.println("\uD83D\uDC15-----<请先注册或登录>-----\uD83D\uDC15");
                TSUtility.readReturn();
            }
            System.out.print("1.登录\t2.注册\t3.退出软件\n请选择：");
            char c = TSUtility.readInitMenuSelection();
            switch (c) {
                case '1':
                    loginMenu();
                    flag = false;
                    break;
                case '2':
                    registerMenu();
                    break;
                case '3':
                    System.out.print("确认是否退出(Y/N)：");
                    char rcs = TSUtility.readConfirmSelection();
                    if (rcs == 'Y') {
                        System.exit(0);
                    }
            }
            i++;
        }
    }

    //登录界面(仅供本类initMenu()方法调用)
    private void loginMenu() {
        for (int i = 0; i < 5; i++) {
            System.out.println("====================");
            System.out.println("==\t  登录界面\t  ==");
            System.out.println("====================");
            System.out.println("请输入用户名：");
            String userName = sc.nextLine();
            System.out.println("请输入密码：");
            String password = sc.nextLine();
            if (loginService.login(userName, password)) {
                try {
                    TSUtility.loadSpecialEffects();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("登录成功！欢迎您：" + userName);
                break;
            } else {
                //如果错误则重新输入，限制次数只有5次，超过次数则程序停止，重新启动
                System.out.println("登录失败！用户名或密码错误！");
                if (i == 4) {
                    System.out.println("登录次数还剩0次，软件已停止运行，请重新启动！");
                    System.exit(0);
                }
                System.out.println("登录次数还剩" + (4 - i) + "次，请重新输入！");
            }
        }
    }

    //注册界面(仅供本类initMenu()方法调用)
    private void registerMenu() {
        System.out.println("====================");
        System.out.println("==\t  注册界面\t  ==");
        System.out.println("====================");
        System.out.println("请输入你要注册的用户名：");
        String userName = sc.nextLine();
        System.out.println("请输入你要注册的密码：");
        String password = sc.nextLine();
        loginService.register(userName, password);
        System.out.println("注册成功！请登录！");
    }

    //用户信息修改界面
    public void modifyMenu() {
        while (true) {
            System.out.println("====================");
            System.out.println("==\t  修改界面\t  ==");
            System.out.println("====================");
            System.out.println("请输入你需要修改的类型：");
            System.out.println("1(修改用户名)");
            System.out.println("2(修改密码)");
            System.out.println("3(修改用户名和密码)");
            System.out.println("4(不修改，退出)");
            char s = TSUtility.readMenuSelection();
            if (s == '1' || s == '3') {
                System.out.println("请输入新的用户名：");
                if (loginService.modifyUserName(sc.nextLine())) {
                    System.out.println("修改成功！");
                } else {
                    System.out.println("修改失败！");
                }
            }
            if (s == '2' || s == '3') {
                System.out.println("请输入新的密码：");
                if (loginService.modifyPassword(sc.nextLine())) {
                    System.out.println("修改成功！");
                } else {
                    System.out.println("修改失败！");
                }
            }
            if (s == '4') {
                System.out.println("退出中");
                try {
                    TSUtility.loadSpecialEffects();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }
}
