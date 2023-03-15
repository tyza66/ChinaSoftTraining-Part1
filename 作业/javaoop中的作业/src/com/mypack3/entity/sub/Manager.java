package com.mypack3.entity.sub;

import com.mypack3.entity.Worker;

public class Manager extends Worker {
    int annualBonus;
    int year_endDividend;

    public Manager(int id, String name, int age, char sex, double height, int salary, int annualBonus, int year_endDividend) {
        super(id, name, age, sex, height, salary);
        this.annualBonus = annualBonus;
        this.year_endDividend = year_endDividend;
    }

    @Override
    public void eat() {
        System.out.println("经理吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("经理睡觉");
    }

    @Override
    public void show() {
        System.out.println(this.toString());
    }

    public int getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(int annualBonus) {
        this.annualBonus = annualBonus;
    }

    public int getYear_endDividend() {
        return year_endDividend;
    }

    public void setYear_endDividend(int year_endDividend) {
        this.year_endDividend = year_endDividend;
    }

    public String toString() {
        return "经理" + super.getName() + "的月薪是" + super.getSalary() + ",年薪是" + (super.getSalary() * 12) + ",总收入是" + (super.getSalary() * 12 + getAnnualBonus() + getYear_endDividend()) + ".";
    }
}
