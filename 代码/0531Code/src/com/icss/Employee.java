package com.icss;

/**
 * 声明Employee类，属性：name(姓名），salary（薪水），对属性进行封装，生成get,set方法（
 */
public class Employee {
//    private 封装   当前类中访问   default  本包   protected 本包或者跨包有继承关系   public
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee() {
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
