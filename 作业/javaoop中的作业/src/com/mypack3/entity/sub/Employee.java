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
}
