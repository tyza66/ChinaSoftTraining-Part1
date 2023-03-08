package com.mypack.entity.sub2;

import com.mypack.entity.Person;

public class Teacher extends Person {
    int gongId;
    int money;

    public Teacher(String name, int age, int weight, char sex, int gongId, int money) {
        super(name, age, weight, sex);
        this.gongId = gongId;
        this.money = money;
    }

    public int getGongId() {
        return gongId;
    }

    public void setGongId(int gongId) {
        this.gongId = gongId;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName(){
        return super.getName();
    }
    @Override
    public void sleep() {
        System.out.print(super.getName());
        super.sleep();
    }
}
