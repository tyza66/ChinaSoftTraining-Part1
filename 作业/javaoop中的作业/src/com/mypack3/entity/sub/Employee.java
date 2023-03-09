package com.mypack3.entity.sub;

import com.mypack3.entity.Worker;

public class Employee extends Worker {
    int annualBonus;

    public Employee(int id, String name, int age, char sex, double height, int salary, int annualBonus) {
        super(id, name, age, sex, height, salary);
        this.annualBonus = annualBonus;
    }

    @Override
    public void eat() {
        System.out.println("普通员工吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("普通员工睡觉");
    }

    public int getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(int annualBonus) {
        this.annualBonus = annualBonus;
    }

    public String toString() {
        return "员工" + super.getName() + "的月薪是" + super.getSalary() + ",年薪是" + (super.getSalary()) * 12 + ",总收入是" + (super.getSalary() * 12 + getAnnualBonus()) + ".";
    }
}
