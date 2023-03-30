package com.team.view.managements;

import com.team.service.common.Loading;
import com.team.service.common.Step;

import java.util.Scanner;

/**
 * Author:tyza66
 * CreateTime: 2023-03-29 18:44
 * Github: https://github.com/tyza66
 */
public class DevelopmentProjectManagementMenu {
    public void show(){
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
            System.out.println("====开发项目管理菜单====");
            System.out.println("1.查看项目进度");
            System.out.println("2.新建项目");
            System.out.println("0.返回上级菜单");
            System.out.print("输入指令：");
            String code = input.next();
            switch (code) {
                case "1":
                    showProjects();
                    break;
                case "2":
                    newProject();
                    break;
                case "0":
                    run = false;
                    break;
                default:
                    System.out.println("您输入的指令有误！");
                    break;
            }
            Step.longNext();
        }
    }
    public void showProjects(){
        
    }
    public void newProject(){

    }
}
