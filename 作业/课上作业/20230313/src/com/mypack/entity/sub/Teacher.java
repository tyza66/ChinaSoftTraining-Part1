package com.mypack.entity.sub;

import com.mypack.entity.Person;

public class Teacher extends Person {
    int money;
    String statu;

    public Teacher(int id, String name, int money, String statu) {
        super(id, name);
        this.money = money;
        this.statu = statu;
    }
}
