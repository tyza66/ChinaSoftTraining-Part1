package com.team.service.managements;

import com.team.domain.interfaces.Equipment;
import com.team.domain.pojo.employee.Architect;
import com.team.domain.pojo.employee.Designer;
import com.team.domain.pojo.employee.Employee;
import com.team.domain.pojo.employee.Programmer;
import com.team.domain.pojo.equipment.NoteBook;
import com.team.domain.pojo.equipment.PC;
import com.team.domain.pojo.equipment.Printer;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Author:tyza66
 * CreateTime: 2023-03-29 18:43
 * Github: https://github.com/tyza66
 */
//开发人员管理
public class DeveloperManagement {
    static ArrayList<Employee> employees = new ArrayList<>();

    //初始化
    public DeveloperManagement() {
        employees.add(new Employee(1, "马云  \t", 22, 3000));
        employees.add(new Architect(2, "马化腾  \t", 32, 18000, new NoteBook("联想T4", 6000),
                60000, 5000));
        employees.add(new Programmer(3, "李彦宏  \t", 23, 7000, new PC("戴尔", "NEC 17寸")));
        employees.add(new Programmer(4, "刘强东  \t", 24, 7300, new PC("戴尔", "三星 17寸")));
        employees.add(new Designer(5, "雷军  \t", 50, 10000, new Printer("激光", "佳能2900"),
                5000));
        employees.add(new Programmer(6, "任志强  \t", 30, 16800, new PC("华硕", "三星 17寸")));
        employees.add(new Designer(7, "柳传志  \t", 45, 35500, new PC("华硕", "三星 17寸"),
                8000));
        employees.add(new Architect(8, "杨元庆  \t", 35, 6500, new Printer("针式", "爱普生20k"),
                15500, 1200));
        employees.add(new Designer(9, "史玉柱  \t", 27, 7800, new NoteBook("惠普m6", 5800),
                1500));
        employees.add(new Programmer(10, "丁磊  \t", 26, 6600, new PC("戴尔", "NEC17寸")));
        employees.add(new Programmer(11, "张朝阳  \t", 35, 7100, new PC("华硕", "三星 17寸")));
        employees.add(new Designer(12, "杨致远  \t", 38, 9600, new NoteBook("惠普m6", 5800),
                3000));
        employees.add(new Programmer(96, "孙达明", 99, 999999999, new PC("lenovo", "y7000p")));
    }

    //添加设计师
    public void add(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        employees.add(new Designer(id, name, age, salary, equipment, bonus));
    }

    //添加程序员
    public void add(int id, String name, int age, double salary, Equipment equipment) {
        employees.add(new Programmer(id, name, age, salary, equipment));
    }

    //添加架构师
    public void add(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        employees.add(new Architect(id, name, age, salary, equipment, bonus, stock));
    }

    public Employee[] queryAll() {
        return employees.toArray(new Employee[0]);
    }

    public boolean deleteOne(int id) {
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee one = iterator.next();
            if (one.getId() == id) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    //修改年龄
    public boolean updateAge(int id, int newAge) {
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee one = iterator.next();
            if (one.getId() == id) {
                one.setAge(newAge);
                return true;
            }
        }
        return false;
    }

    //修改薪资
    public boolean updateSalary(int id, double newSalary) {
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee one = iterator.next();
            if (one.getId() == id) {
                one.setSalary(newSalary);
                return true;
            }
        }
        return false;
    }

    //修改设备为PC
    public boolean eq1(int id, String model, String display) {
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee one = iterator.next();
            if (one.getId() == id) {
                one.setEquipment(new PC(model, display));
                return true;
            }
        }
        return false;
    }

    //修改设备为笔记本电脑
    public boolean eq2(int id, String model, double price) {
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee one = iterator.next();
            if (one.getId() == id) {
                one.setEquipment(new NoteBook(model, price));
                return true;
            }
        }
        return false;
    }

    //修改设备为打印机
    public boolean eq3(int id, String name, String type) {
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee one = iterator.next();
            if (one.getId() == id) {
                one.setEquipment(new Printer(name, type));
                return true;
            }
        }
        return false;
    }
}
