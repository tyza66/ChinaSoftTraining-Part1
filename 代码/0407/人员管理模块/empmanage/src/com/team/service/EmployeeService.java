package com.team.service;

import com.team.pojo.*;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    private List<Employee> employees=new ArrayList<>();
    {
        employees.add(new Employee(1, "马云  \t", 22,3000));
        employees.add(new Architect(2, "马化腾  \t", 32, 18000,1, new NoteBook("联想T4", 6000), 60000, 5000));
        employees.add(new Programmer(3, "李彦宏  \t", 23, 7000, 2,new PC("戴尔", "NEC 17寸")));
        employees.add(new Programmer(4, "刘强东  \t", 24, 7300, 3,new PC("戴尔", "三星 17寸")));
        employees.add(new Designer(5, "雷军  \t", 50, 10000, 4,new Printer("激光", "佳能2900"),
                5000));
        employees.add(new Programmer(6, "任志强  \t", 30, 16800,5, new PC("华硕", "三星 17寸")));
        employees.add(new Designer(7, "柳传志  \t", 45, 35500, 6,new PC("华硕", "三星 17寸"),
                8000));
        employees.add(new Architect(8, "杨元庆  \t", 35, 6500, 7,new Printer("针式", "爱普生20k"),
                15500, 1200));
        employees.add(new Designer(9, "史玉柱  \t", 27, 7800, 8,new NoteBook("惠普m6", 5800),
                1500));
        employees.add(new Programmer(10, "丁磊  \t", 26, 6600, 9,new PC("戴尔", "NEC17寸")));
        employees.add(new Programmer(11, "张朝阳  \t", 35, 7100,10, new PC("华硕", "三星 17寸")));
        employees.add(new Designer(12, "杨致远  \t", 38, 9600, 11,new NoteBook("惠普m6", 5800),
                3000)); }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void queryAllEmployee(){
        for(int i=0;i<employees.size();i++){
            Employee employee = employees.get(i);
            System.out.println(employee);
        }
    }

    public Employee queryEmployeeById(int id){
        for(int i=0;i<employees.size();i++){
            Employee employee = employees.get(i);
            if(employee.getId()==id){
                return employee;
            }
        }
        return  null;
    }

    public void deleteEmployeeById(int id){
        for(int i=0;i<employees.size();i++){
            Employee employee = employees.get(i);
            if(employee.getId()==id){
               employees.remove(employee);
            }
        }
    }

    public void updateEmployee(Employee emp){
        for(int i=0;i<employees.size();i++){
            Employee employee = employees.get(i);
            if(employee.getId()==emp.getId()){
                employee.setAge(emp.getAge());
                employee.setName(emp.getName());
                employee.setSalary(emp.getSalary());
            }
        }
    }
}
