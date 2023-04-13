package com.team.view;

import com.team.service.LoginService;

import java.util.Scanner;

public class LoginView {

    private LoginService loginService=new LoginService();

    Scanner sc=new Scanner(System.in);

    public void initMenu(){

        while(true){
            System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
            System.out.println("\t欢迎来到项目开发团队分配管理软件");
            System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
            System.out.println("-----<请先注册或登录>-----");
            System.out.print("1.登录\t2.注册\t3.退出软件\n请选择：");
            int num=sc.nextInt();
            if(num==3){
                System.out.println("您退出了系统");
                break;
            }
            switch (num){
                case 1: showLogin(); break;
                case 2: showRegister();break;
                default:
                    System.out.println("您输入不合法");
            }

        }
    }

    private void showRegister() {
        System.out.println("====================");
        System.out.println("==\t  注册界面\t  ==");
        System.out.println("====================");
        System.out.println("请输入你要注册的用户名：");
        String userName = sc.next();
        System.out.println("请输入你要注册的密码：");
        String password = sc.next();
        loginService.register(userName, password);
        System.out.println("注册成功！请登录！");
    }

    private void showUpdatePass() {
        System.out.println("====================");
        System.out.println("==\t  修改密码界面\t  ==");
        System.out.println("====================");
        System.out.println("请输入你要修改的用户名：");
        String userName = sc.next();
        System.out.println("请输入你要修改的之后密码：");
        String password = sc.next();
        boolean flag = loginService.updatePassword(userName, password);
        if(flag){
            System.out.println("密码修改成功");
        }else{
            System.out.println("密码修改失败");
        }

    }

    private void showLogin() {

        System.out.println("欢迎您来到登录系统");
        for (int i = 0; i < 5; i++) {
            System.out.println("====================");
            System.out.println("==\t  登录界面\t  ==");
            System.out.println("====================");
            System.out.println("请输入用户名：");
            String userName = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();
            if (loginService.login(userName, password)) {
                System.out.println("登录成功，欢迎您"+userName);
                break;

            } else {
                //如果错误则重新输入，限制次数只有5次，超过次数则程序停止，重新启动
                System.out.println("登录失败！用户名或密码错误！");
                if (i == 4) {
                    System.out.println("登录次数还剩0次，软件已停止运行，请重新启动！");
                    break;
                }
                System.out.println("登录次数还剩" + (4 - i) + "次，请重新输入！");
            }
        }

    }
}
