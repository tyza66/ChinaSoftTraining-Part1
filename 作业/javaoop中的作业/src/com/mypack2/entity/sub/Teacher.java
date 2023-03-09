package com.mypack2.entity.sub;

import com.mypack2.entity.Person;

public class Teacher extends Person {
    int money;
    String statu;

    public Teacher(int id, String name, int money, String statu) {
        super(id, name);
        this.money = money;
        this.statu = statu;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getStatu() {
        return statu;
    }

    public void setStatu(String statu) {
        this.statu = statu;
    }

    @Override
    public String getName() {
        return super.name;
    }
}
