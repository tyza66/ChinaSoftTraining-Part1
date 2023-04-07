package com.team.service;

import com.team.domain.*;

import java.util.ArrayList;

public class NameListService {
    private ArrayList<Employee> employees = new ArrayList<>();

    //代码块，初始化员工数据
    {
        employees.add(new Employee(1, "马云  \t", 22, 3000));
        employees.add(new Architect(2, "马化腾  \t", 32, 18000, new NoteBook("联想T4", 6000),
                60000, 5000));
        employees.add(new Programmer(3, "李彦宏  \t", 23, 7000, new PC("戴尔", "NEC 17寸")));
        employees.add(new Programmer(4, "刘强东  \t", 24, 7300, new PC("戴尔", "三星 17寸")));
        employees.add(new Designer(5, "雷军  \t", 50, 10000, new Print("激光", "佳能2900"),
                5000));
        employees.add(new Programmer(6, "任志强  \t", 30, 16800, new PC("华硕", "三星 17寸")));
        employees.add(new Designer(7, "柳传志  \t", 45, 35500, new PC("华硕", "三星 17寸"),
                8000));
        employees.add(new Architect(8, "杨元庆  \t", 35, 6500, new Print("针式", "爱普生20k"),
                15500, 1200));
        employees.add(new Designer(9, "史玉柱  \t", 27, 7800, new NoteBook("惠普m6", 5800),
                1500));
        employees.add(new Programmer(10, "丁磊  \t", 26, 6600, new PC("戴尔", "NEC17寸")));
        employees.add(new Programmer(11, "张朝阳  \t", 35, 7100, new PC("华硕", "三星 17寸")));
        employees.add(new Designer(12, "杨致远  \t", 38, 9600, new NoteBook("惠普m6", 5800),
                3000));
    }

    //查看指定id的员工；
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public Employee getEmployees(int id) throws TeamException {
        for (Employee employee : employees) {//增强for循环
            if (employee.getId() == id) {
                return employee;
            }
        }
        throw new TeamException("找不到该员工，请确认id是否输入正确！");

    }

    //添加员工,根据职业添加
    public void addEmployee(char c, String name, int age, double salary, Equipment
            equipment, double bonus, int stock) {
        switch (c) {
            case '1':
                employees.add(new Employee(employees.size() + 1, name, age, salary));
                break;
            case '2':
                employees.add(new Programmer(employees.size() + 1, name, age, salary, equipment));
                break;
            case '3':
                employees.add(new Designer(employees.size() + 1, name, age, salary, equipment, bonus));
                break;
            case '4':
                employees.add(new Architect(employees.size() + 1, name, age, salary, equipment, bonus, stock));
                break;
        }

    }

    //修改员工
    public void modifyEmployee(Employee employee, String name, int age, double salary) {
        employee.setName(name);
        employee.setAge(age);
        employee.setSalary(salary);
    }

    //实现员工的删除（注意员工id需要动态显示，也就是删除后，员工id需要更新）
    public boolean deleteEmployee(int id) {
        //如果没有该员工则输出异常信息
        try {
            employees.remove(getEmployees(id));
        } catch (TeamException e) {
            System.out.println(e.getMessage());

            return false;
        }
        for (int i = 0; i < employees.size(); i++) {
            employees.get(i).setId(i + 1);
        }
        return true;
    }
}
