package com.mypack.entity.sub;

import com.mypack.entity.Worker;

public class Employee extends Worker{
    private double yearPay;// 年终奖

    public Employee() {
    }



    public Employee(int id, String name, String jobname, double salary, double yearPay) {
        super(id, name, jobname, salary);
        this.yearPay = yearPay;
    }

    public double getYearPay() {
        return yearPay;
    }

    public void setYearPay(double yearPay) {
        this.yearPay = yearPay;
    }
    @Override
    public void show() {
        System.out.println("普通员工编号："+super.getId()+"姓名："+super.getName()+"岗位名称："+super.getJobname()+"月薪"+super.getSalary()+"年终奖："+yearPay
        +"年薪："+super.getSalary()*12+"总收入："+(super.getSalary()*12+yearPay));
    }
}
