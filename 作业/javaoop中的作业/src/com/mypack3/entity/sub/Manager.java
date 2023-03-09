package com.mypack3.entity.sub;

import com.mypack3.entity.Worker;

public class Manager extends Worker {
    int salary;

    @Override
    public void eat() {
        System.out.println("经理吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("经理睡觉");
    }
}
