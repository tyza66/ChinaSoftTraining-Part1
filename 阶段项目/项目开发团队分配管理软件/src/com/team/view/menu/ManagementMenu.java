package com.team.view.menu;

import com.team.service.common.Loading;
import com.team.service.common.Step;
import com.team.view.managements.DeveloperManagement;
import com.team.view.managements.DevelopmentProjectManagement;
import com.team.view.managements.DevelopmentTeamSchedulingManagement;

import java.util.Scanner;

/**
 * Author:tyza66
 * CreateTime: 2023-03-29 18:37
 * Github: https://github.com/tyza66
 */
public class ManagementMenu {
    DeveloperManagement dm = new DeveloperManagement();
    DevelopmentTeamSchedulingManagement dtsm = new DevelopmentTeamSchedulingManagement();
    DevelopmentProjectManagement dpm = new DevelopmentProjectManagement();

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
            System.out.print("输入指令：");
            String code = input.next();
            switch (code){
                case "1":
                    developerManagement();
                    break;
                case "2":
                    developmentTeamSchedulingManagement();
                    break;
                case "3":
                    developmentProjectManagement();
                    break;
                case "0":
                    run = false;
                    break;
                default:
                    System.out.println("您输入的内容不合法，请重新输入");
                    break;
            }
            Step.longNext();
        }
    }
    public void developerManagement(){
        dm.show();
    }
    public void developmentTeamSchedulingManagement(){
        dtsm.show();
    }
    public void developmentProjectManagement(){
        dpm.show();
    }
}
