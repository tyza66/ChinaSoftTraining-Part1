package com.team.view.managements;

import com.team.service.common.Loading;
import com.team.service.common.Step;
import com.team.service.managements.DevelopmentTeamSchedulingManagement;

import java.util.Scanner;

/**
 * Author:tyza66
 * CreateTime: 2023-03-29 18:44
 * Github: https://github.com/tyza66
 */
public class DevelopmentTeamSchedulingManagementMenu {
    DevelopmentTeamSchedulingManagement dtsm = new DevelopmentTeamSchedulingManagement();
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
            System.out.println("====开发团队调度管理菜单====");
            System.out.println("1.查看团队列表");
            System.out.println("2.新建团队");
            System.out.println("0.返回上级菜单");
            System.out.print("输入指令：");
            String code = input.next();
            switch (code) {
                case "1":
                    showTeams();
                    break;
                case "2":
                    newTeam();
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
    public void showTeams(){

    }

    public void newTeam(){

    }
}
