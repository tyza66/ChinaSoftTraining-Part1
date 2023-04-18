package com.sdm.view;

import com.sdm.pojo.Dept;
import com.sdm.service.DeptService;

import java.util.Scanner;

/**
 * Author: tyza66
 * Date: 2023/04/18 12:19
 * Github: https://github.com/tyza66
 */
public class DeptUI {
    DeptService ds = new DeptService();

    public void show() {
        boolean run = true;
        Scanner input = new Scanner(System.in);
        while (run) {
            System.out.println("---部门管理系统---");
            System.out.println("1.增加部门");
            System.out.println("2.删除部门");
            System.out.println("3.修改部门信息");
            System.out.println("4.查询所有部门");
            System.out.println("0.返回上级");
            System.out.print("输入指令序号: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("请输入你要添加的部门depno,dname,loc并用空格隔开:");
                    try {
                        int i = ds.addDept(new Dept(input.nextInt(), input.next(), input.next()));
                        if(i>=1){
                            System.out.println("添加成功!");
                        }else {
                            System.out.println("添加失败!");
                        }
                    } catch (Exception e) {
                        System.out.println("你输入的信息有误!");
                    }
                    break;
                case 2:
                    System.out.print("请输入你要删除的部门id:");
                    int id = input.nextInt();
                    int delete = ds.delete(id);
                    if(delete>=1){
                        System.out.println("删除成功!");
                    }else {
                        System.out.println("删除失败!");
                    }
                    break;
                case 3:
                    System.out.println("请输入你要修改的部门depno,dname,loc并用空格隔开:");
                    try {
                        int update = ds.update(new Dept(input.nextInt(), input.next(), input.next()));
                        if(update>=1){
                            System.out.println("修改成功!");
                        }else {
                            System.out.println("修改失败!");
                        }
                    } catch (Exception e) {
                        System.out.println("你输入的信息有误!");
                    }
                    break;
                case 4:
                    ds.showAll();
                    break;
                case 0:
                    run = false;
                    break;
                default:
                    System.out.println("您输入的指令有误，请重新输入!");
                    break;
            }
            System.out.println("----------");
        }
    }
}
