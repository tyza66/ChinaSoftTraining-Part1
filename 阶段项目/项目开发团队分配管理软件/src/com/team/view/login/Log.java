package com.team.view.login;

import com.team.service.common.Loading;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Log {
    public void show(){
        Scanner input  = new Scanner(System.in);
        //加载
        try {
            Loading.loadSpecialEffects();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //显示界面
        System.out.println("*****用户登录*****");
        System.out.println("1.登录");
        System.out.println("2.注册");
        System.out.println("0.退出");
        System.out.print("输入指令：");
        String code = input.next();
    }
}
