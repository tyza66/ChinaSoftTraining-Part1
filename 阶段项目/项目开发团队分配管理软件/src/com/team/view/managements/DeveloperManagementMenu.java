package com.team.view.managements;

import com.team.domain.pojo.employee.Employee;
import com.team.service.common.Loading;
import com.team.service.common.Step;
import com.team.service.managements.DeveloperManagement;

import java.util.Scanner;

/**
 * Author:tyza66
 * CreateTime: 2023-03-29 18:43
 * Github: https://github.com/tyza66
 */
//开发人员管理
public class DeveloperManagementMenu {
    DeveloperManagement dm = new DeveloperManagement();

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
            System.out.println("====开发人员管理菜单====");
            System.out.println("1.添加人员");
            System.out.println("2.查阅人员");
            System.out.println("0.返回上级菜单");
            System.out.print("输入指令：");
            String code = input.next();
            switch (code) {
                case "1":
                    addOne();
                    break;
                case "2":
                    showAll();
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

    public void addOne() {
        Scanner input = new Scanner(System.in);
        String id, name, age, salary, bouns, stock;
        System.out.println("你要添加的开发人员类型是：");
        System.out.println("1.程序员");
        System.out.println("2.设计师");
        System.out.println("3.架构师");
        System.out.print("输入指令：");
        String code = input.next();
        if (code.equals("1")) {
            try {
                System.out.print("请输入id：");
                id = input.next();
                System.out.print("请输入name：");
                name = input.next();
                System.out.print("请输入age：");
                age = input.next();
                System.out.print("请输入salary：");
                salary = input.next();
                dm.add(Integer.parseInt(id), name, Integer.parseInt(age), Double.parseDouble(salary), null);
                System.out.println("添加成功！");
            } catch (Exception e) {
                System.out.println("您输入的信息有误，添加失败！");
            }
        } else if (code.equals("2")) {
            try {
                System.out.print("请输入id：");
                id = input.next();
                System.out.print("请输入name：");
                name = input.next();
                System.out.print("请输入age：");
                age = input.next();
                System.out.print("请输入salary：");
                salary = input.next();
                System.out.print("请输入bonus：");
                bouns = input.next();
                dm.add(Integer.parseInt(id), name, Integer.parseInt(age), Double.parseDouble(salary), null, Double.parseDouble(bouns));
                System.out.println("添加成功！");
            } catch (Exception e) {
                System.out.println("您输入的信息有误，添加失败！");
            }
        } else if (code.equals("3")) {
            try {
                System.out.print("请输入id：");
                id = input.next();
                System.out.print("请输入name：");
                name = input.next();
                System.out.print("请输入age：");
                age = input.next();
                System.out.print("请输入salary：");
                salary = input.next();
                System.out.print("请输入bonus：");
                bouns = input.next();
                System.out.print("请输入stock：");
                stock = input.next();
                dm.add(Integer.parseInt(id), name, Integer.parseInt(age), Double.parseDouble(salary), null, Double.parseDouble(bouns), Integer.parseInt(stock));
                System.out.println("添加成功！现在所有的成员信息有：");
                System.out.println("Id\t姓名\t年龄\t\t薪资\t设备\t奖金\t股票");
                Employee[] all = dm.queryAll();
                for(Employee one:all){
                    System.out.println(one);
                }
            } catch (Exception e) {
                System.out.println("您输入的信息有误，添加失败！");
            }
        } else {
            System.out.println("您输入的信息有误！");
        }
    }

    public void showAll() {
        Scanner input = new Scanner(System.in);
        System.out.println("Id\t姓名\t年龄\t\t薪资\t设备\t奖金\t股票");
        Employee[] all = dm.queryAll();
        for(Employee one:all){
            System.out.println(one);
        }
        System.out.print("输入您要操作的人员id进行操作：");
        String control = input.next();
        System.out.println("1.修改");
        System.out.println("2.删除");
        System.out.print("输入指令：");
        String now = input.next();
        if(now.equals("1")){
            System.out.println("1.修改年龄");
            System.out.println("2.修改薪资");
            System.out.println("3.修改设备");
            System.out.print("输入指令：");
            String code = input.next();
            switch (code){
                case "1":
                    System.out.print("输入要修改为的年龄：");
                    String newAge = input.next();
                    try{
                        boolean b = dm.updateAge(Integer.parseInt(control), Integer.parseInt(newAge));
                        if(b){
                            System.out.println("修改年龄成功！");
                        }else {
                            System.out.println("您输入的信息有误，修改年龄失败！");
                        }
                    }catch (Exception e){
                        System.out.println("您输入的信息有误，修改年龄失败！");
                    }
                    break;
                case "2":
                    System.out.print("输入要修改为的薪资：");
                    String newSalary = input.next();
                    try{
                        boolean b = dm.updateSalary(Integer.parseInt(control), Integer.parseInt(newSalary));
                        if(b){
                            System.out.println("修改薪资成功！");
                        }else {
                            System.out.println("您输入的信息有误，修改薪资失败！");
                        }
                    }catch (Exception e){
                        System.out.println("您输入的信息有误，修改薪资失败！");
                    }
                    break;
                case "3":
                    System.out.println("选择你要赋予的设备类型");
                    System.out.println("1.PC");
                    System.out.println("2.笔记本电脑");
                    System.out.println("3.打印机");
                    System.out.print("输入指令：");
                    String type = input.next();
                    try {
                        switch (type) {
                            case "1":
                                System.out.print("输入要赋予的PC型号：");
                                String model = input.next();
                                System.out.print("输入要赋予的显示器：");
                                String display = input.next();
                                if(dm.eq1(Integer.parseInt(control),model,display)){
                                    System.out.println("修改设备成功！");
                                }else{
                                    System.out.println("您输入的信息有误，修改设备失败！");
                                }
                                break;
                            case "2":
                                System.out.print("输入要赋予的笔记本电脑型号：");
                                String model1 = input.next();
                                System.out.print("输入要赋予的笔记本电脑价格：");
                                String price = input.next();
                                if(dm.eq2(Integer.parseInt(control),model1,Double.parseDouble(price))){
                                    System.out.println("修改设备成功！");
                                }else{
                                    System.out.println("您输入的信息有误，修改设备失败！");
                                }
                                break;
                            case "3":
                                System.out.print("输入要赋予的打印机型号：");
                                String model2 = input.next();
                                System.out.print("输入要赋予的打印机类型：");
                                String mode = input.next();
                                if(dm.eq3(Integer.parseInt(control),model2,mode)){
                                    System.out.println("修改设备成功！");
                                }else{
                                    System.out.println("您输入的信息有误，修改设备失败！");
                                }
                                break;
                            default:
                                System.out.println("您输入的信息有误！");
                                break;
                        }
                    }catch(Exception e){
                        System.out.println("您输入的信息有误，修改设备失败！");
                    }
                    break;
                default:
                    System.out.println("您输入的信息有误！");
                    break;
            }

        }else if(now.equals("2")){
            System.out.print("您确定要删除此员工吗?(y/n):");
            String y = input.next();
            if(y.equalsIgnoreCase("y")){
                try{
                    boolean end = dm.deleteOne(Integer.parseInt(control));
                    if (end==false){
                        System.out.println("您输入的信息有误，或者这个人已在某个团队中，删除失败！");
                    }else {
                        System.out.println("删除成功！现在所有的成员信息有：");
                        System.out.println("Id\t姓名\t年龄\t\t薪资\t设备\t奖金\t股票");
                        all = dm.queryAll();
                        for(Employee one:all){
                            System.out.println(one);
                        }
                    }
                }catch(Exception e){
                    System.out.println("您输入的信息有误，删除失败！");
                }
            }
        }else{
            System.out.println("您输入的信息有误！");
        }
    }
}
