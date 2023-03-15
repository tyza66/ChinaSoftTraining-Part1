package com.mypack3.ui;

import com.mypack3.entity.Worker;
import com.mypack3.entity.sub.Employee;
import com.mypack3.entity.sub.Manager;
import com.mypack3.service.WorkerManagementImpl;
import com.mypack3.service.impl.WorkerManagementIF;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UI {
    WorkerManagementIF wm = new WorkerManagementImpl();

    public void init(WorkerManagementIF wm) {
        this.wm = wm;
    }

    public void showUI() {
        boolean run = true;
        while (run) {
            System.out.println("----超级高级工作人员管理系统----");
            System.out.println("(1)添加经理");
            System.out.println("(2)添加普通员工");
            System.out.println("(3)查询一个人");
            System.out.println("(4)查询所有人");
            System.out.println("(5)修改某人的工资");
            System.out.println("(6)删除一个人");
            System.out.println("(0)退出这个系统");
            System.out.println("----输入序号调用对应功能----");
            Scanner input = new Scanner(System.in);
            int type = input.nextInt();
            switch (type) {
                case 0:
                    run = false;
                    break;
                case 1:
                    System.out.print("请输入构建经理的八个属性：");
                    int id = input.nextInt();
                    String name = input.next();
                    int age = input.nextInt();
                    char sex = input.next().charAt(0);
                    double height = input.nextInt();
                    int salary = input.nextInt();
                    int annualBonus = input.nextInt();
                    int year_endDividend = input.nextInt();
                    Manager m = new Manager(id, name, age, sex, height, salary, annualBonus, year_endDividend);
                    wm.addWorker(m);
                    break;
                case 2:
                    System.out.print("请输入构建普通员工的七个属性：");
                    int id1 = input.nextInt();
                    String name1 = input.next();
                    int age1 = input.nextInt();
                    char sex1 = input.next().charAt(0);
                    double height1 = input.nextInt();
                    int salary1 = input.nextInt();
                    int annualBonus1 = input.nextInt();
                    Employee e = new Employee(id1, name1, age1, sex1, height1, salary1, annualBonus1);
                    wm.addWorker(e);
                    break;
                case 3:
                    System.out.print("输入要查询的人的id：");
                    int searchId = input.nextInt();
                    wm.queryOne(searchId).show();
                    break;
                case 4:
                    for (Worker i : wm.queryAllWorkers()) {
                        i.show();
                    }
                    break;
                case 5:
                    System.out.print("请输入要修改的人的id还有要修改成的工资（只有增加有效）：");
                    int updateId = input.nextInt();
                    int updateSalary = input.nextInt();
                    wm.updateSalary(updateId, updateSalary);
                    break;
                case 6:
                    System.out.print("输入你要删除的人的id：");
                    int deleteId = input.nextInt();
                    wm.removeWorker(deleteId);
                    break;
                default:
                    System.out.println("你输入的东西是非法的，我不懂，但是大为震惊");
            }
            System.out.println("====================");
        }
    }
}
