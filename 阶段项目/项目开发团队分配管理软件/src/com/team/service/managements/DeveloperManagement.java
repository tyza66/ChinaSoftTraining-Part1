package com.team.service.managements;

import com.team.domain.interfaces.Equipment;
import com.team.domain.pojo.employee.Architect;
import com.team.domain.pojo.employee.Designer;
import com.team.domain.pojo.employee.Employee;
import com.team.domain.pojo.employee.Programmer;
import com.team.domain.pojo.equipment.PC;

import java.util.ArrayList;

/**
 * Author:tyza66
 * CreateTime: 2023-03-29 18:43
 * Github: https://github.com/tyza66
 */
//开发人员管理
public class DeveloperManagement {
    ArrayList<Employee> employees = new ArrayList<>();

    //初始化
    public DeveloperManagement(){
        employees.add(new Programmer(96,"孙达明",99,999999999,new PC("lenovo","y7000p")));
    }

    //添加设计师
    public void add(int id, String name, int age, double salary, Equipment equipment, double bonus){
        employees.add(new Designer(id,name,age,salary,equipment,bonus));
    }
    //添加程序员
    public void add(int id, String name, int age, double salary,  Equipment equipment){
        employees.add(new Programmer(id,name,age,salary,equipment));
    }
    //添加架构师
    public void add(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock){
        employees.add(new Architect(id,name,age,salary,equipment,bonus,stock));
    }

    public Employee[] queryAll(){
        return employees.toArray(new Employee[0]);
    }
}
