package com.team.view.menu;

import com.team.service.common.Loading;

import java.util.Scanner;

/**
 * Author:tyza66
 * CreateTime: 2023-03-29 18:37
 * Github: https://github.com/tyza66
 */
public class ManagementMenu {
    public void show(){
        Scanner input = new Scanner(System.in);
        //加载
        try {
            Loading.loadSpecialEffects();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //显示选择界面
        boolean run = true;
        while(run){
            System.out.println("======项目开发团队分配管理系统======");
            System.out.println("1.开发人员管理");
            System.out.println("2.开发团队调度管理");
            System.out.println("3.开发项目管理");
            System.out.println("0.返回登录界面");
        }
    }
}
