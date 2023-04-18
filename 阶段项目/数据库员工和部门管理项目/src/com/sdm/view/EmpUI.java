package com.sdm.view;

import com.sdm.pojo.Emp;
import com.sdm.service.EmpService;

import java.sql.Date;
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
                case 3://员工的添加操作 97 66 44 55 2001-08-24 22 66 20
                    System.out.println("输入你要添加员工的empNo,eName,job,MGR,hireDate,sal,comm,deptno并用空格隔开：");
                    try {
                        Emp e = new Emp(input.nextInt(), input.next(), input.next(), input.nextInt(), Date.valueOf(input.next()), input.nextInt(), input.nextInt(), input.nextInt());
                        int add = es.add(e);
                        if (add >= 1) {
                            System.out.println("添加成功!");
                        } else {
                            System.out.println("添加失败");
                        }
                    } catch (Exception e) {
                        System.out.println("你输入的信息有误!");
                    }
                    break;
                case 4://员工的修改操作 97 96 44 55 2001-08-24 22 66 20
                    System.out.println("输入你要修改员工的empNo,eName,job,MGR,hireDate,sal,comm,deptno并用空格隔开：");
                    try {
                        Emp e = new Emp(input.nextInt(), input.next(), input.next(), input.nextInt(), Date.valueOf(input.next()), input.nextInt(), input.nextInt(), input.nextInt());
                        int add = es.update(e);
                        if (add >= 1) {
                            System.out.println("修改成功!");
                        } else {
                            System.out.println("修改失败");
                        }
                    } catch (Exception e) {
                        System.out.println("你输入的信息有误!");
                    }
                    break;
                case 5://员工的删除操作
                    System.out.print("输入你要删除的员工id:");
                    int id1 = input.nextInt();
                    int delete = es.delete(id1);
                    if (delete >= 1) {
                        System.out.println("删除成功!");
                    } else {
                        System.out.println("删除失败");
                    }
                    break;
                case 6://查询出姓名里面包含“xxx”的员工信息
                    System.out.print("输入要查询的关键词:");
                    String next = input.next();
                    es.showByNameIn(next);
                    break;
                case 7://查询出员工薪资再指定区间值的员工信息，区间 值从键盘动态获取 100 10000
                    System.out.println("输入薪资范围的最小值和最大值并且用空格隔开:");
                    try {
                        es.showSalaryInCase(input.nextInt(), input.nextInt());
                    }catch (Exception e) {
                        System.out.println("你输入的信息有误!");
                    }
                    break;
                case 8://查询出员工雇佣日期再指定区间的员工信息 1900-01-01 2001-12-12
                    System.out.println("输入入职日期范围的最小值和最大值并且用空格隔开（yyyy-mm-dd）:");
                    try {
                        es.showHireInCase(input.next(), input.next());
                    }catch (Exception e) {
                        System.out.println("你输入的信息有误!");
                    }
                    break;
                case 9://查询出头n条员工信息，n从键盘动态获取
                    System.out.print("输入查询信息的条数:");
                    int n = input.nextInt();
                    es.showTop(n);
                    break;
                case 10://查询出员工工资大于平均薪资的员工信息
                    es.showSalBiggerAvg();
                    break;
                case 11://查询出某个员工的详细信息，包括部门信息
                    System.out.print("输入查询员工的id:");
                    int id2 = input.nextInt();
                    es.showDetail(id2);
                    break;
                case 12://查询出部门编号等于指定部门的员工的详细信息
                    System.out.print("输入查询部门的id:");
                    int id3 = input.nextInt();
                    es.showMember(id3);
                    break;
                case 13://查询出员工的总记录数
                    es.showNum();
                    break;
                default:
                    System.out.println("您输入的指令有误，请重新输入!");
                    break;
            }
            System.out.println("----------");
        }
    }
}
