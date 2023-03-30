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
    ArrayList<Employee> employees = new ArrayList<>();

    //初始化
    public DeveloperManagement() {
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
