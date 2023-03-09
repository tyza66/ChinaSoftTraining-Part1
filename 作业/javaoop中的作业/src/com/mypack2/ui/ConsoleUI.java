package com.mypack2.ui;

import com.mypack2.entity.Person;
import com.mypack2.service.PeopleManagement;

import java.util.Scanner;

public class ConsoleUI {
    PeopleManagement peopleManagement = new PeopleManagement();

    public void showUI() {
        boolean run = true;
        Scanner input = new Scanner(System.in);
        int now = 0;
        while (run) {
            System.out.println("********超级人员管理系统********");
            System.out.println("*(1)保存新人员信息");
            System.out.println("*(2)查询员信息");
            System.out.println("*(3)查询所有人");
            System.out.println("*(4)删除某人信息");
            System.out.println("*(5)修改某人员信息");
            System.out.println("*(0)退出系统");
            System.out.println("********输入对应序号选择********");
            now = input.nextInt();
            switch (now) {
                case 1:
                    System.out.println("请输入需要用到的参数们：");
                    break;
                case 2:
                    System.out.println("请输入需想要查找人的id：");
                    break;
                case 3:
                    for (Person i : peopleManagement.queryAll()) {
                        System.out.print(i.getName() + "  ");
                    }
                    break;
                case 4:
                    System.out.println("请输入需要用到的参数们：");
                    break;
                case 5:
                    break;
                default:
                    run = false;
            }
        }
    }
}
