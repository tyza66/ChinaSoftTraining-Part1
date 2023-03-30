package com.team.domain.pojo.employee;

import com.team.domain.interfaces.Equipment;

/**
 * Author:tyza66
 * CreateTime: 2023-03-29 19:02
 * Github: https://github.com/tyza66
 */
public class Designer extends Programmer {
    private double bonus;//奖金

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return super.getId() + "\t" + super.getName() + "\t" + super.getAge() + "\t\t" + super.getSalary() + "\t" + (super.getEquipment()==null?"\t":super.getEquipment())  + "\t" + bonus;
    }
}
