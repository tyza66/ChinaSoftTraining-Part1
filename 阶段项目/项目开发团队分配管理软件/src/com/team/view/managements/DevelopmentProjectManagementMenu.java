package com.team.view.managements;

import com.team.domain.pojo.Project;
import com.team.service.common.Loading;
import com.team.service.common.Step;
import com.team.service.managements.DevelopmentProjectManagement;

import java.util.Scanner;

/**
 * Author:tyza66
 * CreateTime: 2023-03-29 18:44
 * Github: https://github.com/tyza66
 */
public class DevelopmentProjectManagementMenu {
    DevelopmentProjectManagement dpm = new DevelopmentProjectManagement();

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
        Scanner input = new Scanner(System.in);
        System.out.println("当前所有项目：");
        Project[] allProject = dpm.getAllProject();
        for (Project p:allProject){
            System.out.println(p);
        }
        try{
            System.out.print("请输入要操作的项目id：");
            String control = input.next();
            System.out.println("要进行的操作：");
            System.out.println("1.修改项目名称");
            System.out.println("2.修改项目描述");
            System.out.println("3.更换开发团队");
            System.out.println("4.更改项目状态");
            System.out.println("5.删除项目");
            String code = input.next();
            switch(code){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                default:
                    System.out.println("您输入的信息有误，操作失败！ ");
                    break;
            }
        }catch (Exception e){
            System.out.println("您输入的信息有误，操作失败！ ");
        }
    }
    public void newProject(){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入新项目名称：");
        String name = input.next();
        System.out.print("请输入新项目介绍：");
        String in = input.next();
        dpm.newProject(name,in);
        System.out.println("新建项目成功！（当前为随机开发团队）");
    }
}
