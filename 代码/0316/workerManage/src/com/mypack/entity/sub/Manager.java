package com.mypack.entity.sub;

import com.mypack.entity.Worker;

public class Manager extends Worker {

    private double fenhong;
    private double yearPay;

    public Manager() {
    }

    public Manager(int id, String name, String jobname, double salary, double fenhong, double yearPay) {
        super(id, name, jobname, salary);
        this.fenhong = fenhong;
        this.yearPay = yearPay;
    }

    public double getFenhong() {
        return fenhong;
    }

    public void setFenhong(double fenhong) {
        this.fenhong = fenhong;
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
                +"年薪："+super.getSalary()*12+"总收入："+(super.getSalary()*12+yearPay+fenhong));
    }
}
