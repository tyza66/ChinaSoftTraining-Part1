package com.team.view.managements;

import com.team.domain.pojo.employee.Employee;
import com.team.domain.pojo.employee.Programmer;
import com.team.service.common.Loading;
import com.team.service.common.Step;
import com.team.service.managements.DeveloperManagement;
import com.team.service.managements.DevelopmentTeamSchedulingManagement;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Author:tyza66
 * CreateTime: 2023-03-29 18:44
 * Github: https://github.com/tyza66
 */
public class DevelopmentTeamSchedulingManagementMenu {
    DeveloperManagement dm = new DeveloperManagement();
    DevelopmentTeamSchedulingManagement dtsm = new DevelopmentTeamSchedulingManagement();

    public void show() {
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

    public void showTeams() {
        System.out.println("团队编号\t成员们：");
        for (Map.Entry<String, ArrayList<Programmer>> one : dtsm.getAll()) {
            System.out.print(one.getKey() + "\t");
            for (Programmer p : one.getValue()) {
                String[] w = p.getClass().toString().split("[.]");
                System.out.print(p.getName() + "(" + w[w.length - 1] + ") ");
            }
        }
        System.out.println();

    }

    public void newTeam() {
        Scanner input = new Scanner(System.in);
        System.out.println("现在系统中的成员列表：");
        System.out.println("Id\t姓名\t年龄\t\t薪资\t设备\t奖金\t股票");
        Employee[] all = dm.queryAll();
        for (Employee one : all) {
            System.out.println(one);
        }
        try {
            System.out.print("输入你想创建的团队成员数量（最大为5）：");
            int num = Integer.parseInt(input.next());
            System.out.print("输入你想添加进团队的新成员们d的id（每个使用回车提交）：");
            Employee[] employees = new Employee[num];
            int id = -1;
            for (int i = 0; i < num; i++) {
                id = Integer.parseInt(input.next());
                employees[i] = dm.queryOne(id);
                if (employees[i] == null) {
                    throw new Exception();
                }
            }
            dtsm.newTeam(employees);
            System.out.println("创建新团队成功！所有团队信息如下：");
            System.out.println("团队编号\t成员们：");
            for (Map.Entry<String, ArrayList<Programmer>> one : dtsm.getAll()) {
                System.out.print(one.getKey() + "\t");
                for (Programmer p : one.getValue()) {
                    String[] w = p.getClass().toString().split("[.]");
                    System.out.print(p.getName() + "(" + w[w.length - 1] + ") ");
                }
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("您输入的信息有误，创建失败！(" + e + ")");
        }
    }
}
