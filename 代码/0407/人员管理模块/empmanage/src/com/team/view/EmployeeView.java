package com.team.view;

import com.team.pojo.*;
import com.team.service.EmployeeService;

import java.util.Scanner;

public class EmployeeView {

    private EmployeeService employeeService=new EmployeeService();
    private Scanner sc=new Scanner(System.in);

    public  void empInitView(){
        while(true){
            System.out.println("🔣         ~开发人员管理主菜单~         🔣");
            System.out.println("🐕1.     <开发人员的查看>           *");
            System.out.println("🐖2.     <开发人员的添加>           *");
            System.out.println("🐱3.     <开发人员的修改>           *");
            System.out.println("🐂4.     <开发人员的删除>           *");
            System.out.println("🐇5.     <退出当前菜单>             *");
            System.out.print("⬇请选择：");
            int num=sc.nextInt();
            if(num==5){
                System.out.println("您推出系统了");
                break;
            }
            switch (num){
                case 1: showEmpQuery(); break;
                case 2: showEmpAdd(); break;
                case 3: showEmpUpdate();break;
                case 4: showEmpDelete();break;

            }
        }
    }

    private void showEmpDelete() {
        System.out.println("请输入您要删除的员工编号：");
        int id=sc.nextInt();
        employeeService.deleteEmployeeById(id);
    }

    private void showEmpUpdate() {
        System.out.println("请输入您要更新的员工id");
        int id=sc.nextInt();
        System.out.println("请输入您要更新的员工姓名：");
        String name=sc.next();
        System.out.println("请输入您要更新的员共年龄：");
        int age=sc.nextInt();
        System.out.println("请输入您要更新的员工薪资：");
        double salary=sc.nextDouble();
        Employee employee=new Employee(id,name,age,salary);
        employeeService.updateEmployee(employee);

    }

    private void showEmpAdd() {

        System.out.println("欢迎进入添加人员界面：");
        System.out.println("1(无职位)\n2(程序员)\n3(设计师)\n4(架构师)");
        System.out.print("请选择需要添加的雇员的职位：");
        int num=sc.nextInt();
        if(num==1){
            System.out.println("请输入您要添加的员工id");
            int id=sc.nextInt();
            System.out.println("请输入您要添加的员工姓名：");
            String name=sc.next();
            System.out.println("请输入您要添加的员共年龄：");
            int age=sc.nextInt();
            System.out.println("请输入您要添加的员工薪资：");
            double salary=sc.nextDouble();

            Employee emp=new Employee(id,name,age,salary);
            employeeService.addEmployee(emp);

        }else if(num==2){

            System.out.println("请输入您要添加的员工id");
            int id=sc.nextInt();
            System.out.println("请输入您要添加的员工姓名：");
            String name=sc.next();
            System.out.println("请输入您要添加的员共年龄：");
            int age=sc.nextInt();
            System.out.println("请输入您要添加的员工薪资：");
            double salary=sc.nextDouble();
            System.out.println("请输入您要添加程序员的成员编号：");
            int memeberId=sc.nextInt();
            PC pc=new PC("戴尔", "NEC 17寸");
            Programmer programmer=new Programmer(id,name,age,salary,memeberId,pc);

            employeeService.addEmployee(programmer);



        }else if(num==3){

            System.out.println("请输入您要添加的员工id");
            int id=sc.nextInt();
            System.out.println("请输入您要添加的员工姓名：");
            String name=sc.next();
            System.out.println("请输入您要添加的员共年龄：");
            int age=sc.nextInt();
            System.out.println("请输入您要添加的员工薪资：");
            double salary=sc.nextDouble();
            System.out.println("请输入您要添加设计师的成员编号：");
            int memeberId=sc.nextInt();
            PC pc=new PC("华硕", "三星 17寸");
            System.out.println("请输入您要添加的设计师的奖金：");
            double bonus=sc.nextDouble();
            Designer designer=new Designer(id,name,age,salary,memeberId,pc,bonus);
            employeeService.addEmployee(designer);

        }else if(num==4){


            System.out.println("请输入您要添加的员工id");
            int id=sc.nextInt();
            System.out.println("请输入您要添加的员工姓名：");
            String name=sc.next();
            System.out.println("请输入您要添加的员共年龄：");
            int age=sc.nextInt();
            System.out.println("请输入您要添加的员工薪资：");
            double salary=sc.nextDouble();
            System.out.println("请输入您要添加架构师的成员编号：");
            int memeberId=sc.nextInt();
            Printer printer = new Printer("针式", "爱普生20k");

            System.out.println("请输入您要添加的架构师的奖金：");
            double bonus=sc.nextDouble();
            System.out.println("请输入您要添加架构师的股票：");
            int stock=sc.nextInt();
            Architect architect=new Architect(id,name,age,salary,memeberId,printer,bonus,stock);
            employeeService.addEmployee(architect);
        }

    }



    private void showEmpQuery() {
        System.out.println("欢迎来到查看所有员工的界面");
        employeeService.queryAllEmployee();
    }


}
