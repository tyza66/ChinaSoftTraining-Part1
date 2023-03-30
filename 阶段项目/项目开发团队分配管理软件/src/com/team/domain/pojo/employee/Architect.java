package com.team.domain.pojo.employee;

import com.team.domain.interfaces.Equipment;

/**
 * Author:tyza66
 * CreateTime: 2023-03-29 19:02
 * Github: https://github.com/tyza66
 */
public class Architect extends Designer {
    private int stock;//公司奖励的股票；

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return super.getId() + "\t" + super.getName() + "\t" + super.getAge() + "\t\t" + super.getSalary() + "\t" + super.getEquipment() + "\t" + super.getBonus() + "\t" + stock;
    }
}

