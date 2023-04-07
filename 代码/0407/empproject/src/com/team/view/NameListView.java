package com.team.view;

import com.team.domain.*;
import com.team.service.NameListService;
import com.team.service.TeamException;

import java.awt.geom.Arc2D;
import java.util.ArrayList;
import java.util.Scanner;

public class NameListView {
    private Scanner sc = new Scanner(System.in);
    static NameListService listSvc = new NameListService();

    //开发人员管理主菜单
    public void DeveloperManageMainMenu() {
        getAllEmployeesView();
        while (true) {
            System.out.println("🔣         ~开发人员管理主菜单~         🔣");
            System.out.println("🐕1.     <开发人员的查看>           *");
            System.out.println("🐖2.     <开发人员的添加>           *");
            System.out.println("🐱3.     <开发人员的修改>           *");
            System.out.println("🐂4.     <开发人员的删除>           *");
            System.out.println("🐇5.     <退出当前菜单>             *");
            System.out.print("⬇请选择：");
            char c = TSUtility.readMenuSelectionPro();
            switch (c) {
                case '1':
                    try {
                        TSUtility.loadSpecialEffects();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    getAllEmployeesView();
                    break;
                case '2':
                    addEmployeeView();
                    TSUtility.readReturn();
                    break;
                case '3':
                    modifyEmployeeView();
                    break;
                case '4':
                    deleteEmployeeView();
                    break;
                case '5':
                    System.out.print("确认是否退出(Y/N)：");
                    char rcs = TSUtility.readConfirmSelection();
                    if (rcs == 'Y') {
                        return;
                    }
            }
        }
    }

    //开发人员的查看视图(供本类DeveloperManageMainMenu()方法以及TeamView类addTeamView()调用)
    void getAllEmployeesView() {
        ArrayList<Employee> allEmployees = listSvc.getEmployees();
        System.out.println("ID\t姓名\t\t年龄\t\t工资\t\t职位\t\t\t状态\t\t奖金\t\t股票\t\t领用设备");
        for (Employee emp : allEmployees) {
            if (emp instanceof Architect) {
                Architect a = (Architect) emp;
                System.out.println(a + "\t\t    架构师\t\t\t" + a.isStatus() + "\t\t" + a.getBonus() + "\t\t" + a.getStock() + "\t\t"
                        + a.getEquipment().getDescription());
            } else if (emp instanceof Designer) {
                Designer d = (Designer) emp;
                System.out.println(d + "\t\t    设计师\t\t\t" + d.isStatus() + "\t\t\t\t\t" + d.getBonus() + "\t\t"
                        + d.getEquipment().getDescription());
            } else if (emp instanceof Programmer) {
                Programmer p = (Programmer) emp;
                System.out.println(p + "\t\t    程序员\t\t\t" + p.isStatus() + "\t\t\t\t\t\t\t\t" + p.getEquipment().getDescription());
            } else {
                System.out.println(emp);
            }
        }
    }

    //开发人员的添加交互视图(仅供本类DeveloperManageMainMenu()方法调用)
    private void addEmployeeView() {
        System.out.println("1(无职位)\n2(程序员)\n3(设计师)\n4(架构师)");
        System.out.print("请选择需要添加的雇员的职位：");
        char s = TSUtility.readMenuSelection();
        //不同职位的设备和设备属性都不一样，所以使用switch语句分别赋值，以便后续提示语使用
        String position = "", device = "", equipAttribute1 = "", equipAttribute2 = "";
        switch (s) {
            case '1':
                position = "无职位";
                break;
            case '2':
                position = "程序员";
                device = "台式电脑";
                equipAttribute1 = "型号";
                equipAttribute2 = "显示器名称";
                break;
            case '3':
                position = "设计师";
                device = "笔记本电脑";
                equipAttribute1 = "型号";
                equipAttribute2 = "价格";
                break;
            case '4':
                position = "架构师";
                device = "打印机";
                equipAttribute1 = "名称";
                equipAttribute2 = "类型";
                break;
        }
        System.out.println("‘当前雇员职位分配为：" + position + "’");
        System.out.println("请输入当前雇员的姓名：");
        String name = sc.next();
        System.out.println("请输入当前雇员的年龄：");
        int age = TSUtility.readInt();
        System.out.println("请输入当前雇员的工资：");
        double salary = TSUtility.readDouble();
        //不同职位的设备、奖金、股票都不一样，所以需要条件判断语句输出不同的提示语
        Equipment equipment = null;
        if (s != '1') {
            System.out.println("请为当前" + position + "配一台好的" + device);
            System.out.println("请输入需要配置的" + device + "的" + equipAttribute1 + "：");
            equipAttribute1 = sc.next();
            System.out.println("请输入需要配置的" + device + "的" + equipAttribute2 + "：");
            //进行判断，不同职位添加不同设备
            if (s == '2') {
                sc.nextLine();
                equipAttribute2 = sc.nextLine();
                equipment = new PC(equipAttribute1, equipAttribute2);
            } else if (s == '3') {
                double price = TSUtility.readDouble();
                equipment = new NoteBook(equipAttribute1, price);
            } else {
                sc.nextLine();
                equipAttribute2 = sc.nextLine();
                equipment = new Print(equipAttribute1, equipAttribute2);
            }
            System.out.println("设备添加成功！");
        }
        double bonus = 0;
        if (s == '3' || s == '4') {
            System.out.println("请输入当前" + position + "的奖金：");
            bonus = TSUtility.readDouble();
        }
        int stock = 0;
        if (s == '4') {
            System.out.println("请输入当前" + position + "的股票：");
            stock = TSUtility.readStock();
        }
        listSvc.addEmployee(s, name, age, salary, equipment, bonus, stock);
        System.out.println("人员添加成功！");
    }

    //开发人员的修改交互视图(仅供本类DeveloperManageMainMenu()方法调用)
    private void modifyEmployeeView() {
        System.out.print("请输入需要修改的员工id：");
        int id = TSUtility.readInt();
        Employee employee;
        //如果没有该员工要输出异常信息
        try {
            employee = listSvc.getEmployees(id);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
            System.out.println("修改失败！");
            return;
        }
        System.out.print("姓名(" + employee.getName() + ")：");
        String name = TSUtility.readString(4, employee.getName());
        System.out.print("年龄(" + employee.getAge() + ")：");
        String age = TSUtility.readString(2, String.valueOf(employee.getAge()));
        System.out.print("工资(" + employee.getSalary() + ")：");
        String salary = TSUtility.readString(6, String.valueOf(employee.getSalary()));
        listSvc.modifyEmployee(employee, name, Integer.parseInt(age), Double.parseDouble(salary));
        System.out.println("修改成功！");
    }

    //开发人员的删除交互视图(仅供本类DeveloperManageMainMenu()方法调用)
    private void deleteEmployeeView() {
        System.out.print("请输入需要删除的员工id：");
        int id = TSUtility.readInt();
        if (listSvc.deleteEmployee(id)) {
            System.out.println("删除成功！");
        } else {
            System.out.println("删除失败！");
        }
    }
}
