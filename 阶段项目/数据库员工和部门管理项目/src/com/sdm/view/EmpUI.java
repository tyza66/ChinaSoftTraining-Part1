package com.sdm.view;

import com.sdm.service.EmpService;

import java.util.Scanner;

/**
 * Author: tyza66
 * Date: 2023/04/18 10:55
 * Github: https://github.com/tyza66
 */
public class EmpUI {
    private EmpService es = new EmpService();
    public void show() {
        boolean run = true;
        Scanner input = new Scanner(System.in);
        while (run) {
            System.out.println("---员工部门管理系统---");
            System.out.println("1 .查询所有员工");
            System.out.println("2 .使用id查询某个员工");
            System.out.println("3 .添加员工");
            System.out.println("4 .修改员工");
            System.out.println("5 .删除员工");
            System.out.println("6 .查询出名字中含有关键字的员工信息");
            System.out.println("7 .查询工资在某区间内的员工信息");
            System.out.println("8 .查询入职日期在某时间区间内的员工信息");
            System.out.println("9 .查询前n条员工信息");
            System.out.println("10.查询工资大于平均工资的员工信息");
            System.out.println("11.查询某员工的详细信息（包括部门信息）");
            System.out.println("12.查询部门编号等于某数字的员工信息");
            System.out.println("13.查询出员工的总记录数");
            System.out.println("0 .返回上级菜单");
            System.out.print("输入指令序号: ");
            int choice = input.nextInt();
            switch (choice) {
                case 0:
                    run = false;
                    break;
                case 1://查询所有员工
                    es.showAll();
                    break;
                case 2://员工的查询单个
                    System.out.print("输入你要查询的员工id:");
                    int id = input.nextInt();
                    es.showOne(id);
                    break;
                case 3://员工的添加操作

                    break;
                case 4://员工的修改操作
                    break;
                case 5://员工的删除操作
                    break;
                case 6://查询出姓名里面包含“xxx”的员工信息
                    break;
                case 7://查询出员工薪资再指定区间值的员工信息，区间 值从键盘动态获取
                    break;
                case 8://查询出员工雇佣日期再指定区间的员工信息
                    break;
                case 9://查询出头n条员工信息，n从键盘动态获取
                    break;
                case 10://查询出员工工资大于平均薪资的员工信息
                    break;
                case 11://查询出某个员工的详细信息，包括部门信息
                    break;
                case 12://查询出部门编号等于指定部门的员工的详细信息
                    break;
                case 13://查询出员工的总记录数
                    break;
                default:
                    System.out.println("您输入的指令有误，请重新输入!");
                    break;
            }
            System.out.println("----------");
        }
    }
}
