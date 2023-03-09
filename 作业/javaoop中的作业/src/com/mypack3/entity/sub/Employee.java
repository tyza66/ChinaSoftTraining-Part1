package com.mypack3.entity.sub;

import com.mypack3.entity.Worker;

public class Employee extends Worker {
    int salary;
    int annualBonus;

    @Override
    public void eat() {
        System.out.println("普通员工吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("普通员工睡觉");
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(int annualBonus) {
        this.annualBonus = annualBonus;
    }

    public String toString() {
        return "员工" + super.getName() + "的月薪是" + super.getSalary() + ",年薪是" + super.getSalary() * 12 + ",总收入是" + super.getSalary() * 1 + getAnnualBonus() + ".";
    }
}
