package com.team.pojo;

public class Designer extends  Programmer{

    private double bonus;

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, int memberId, Equipment equipment, double bonus) {
        super(id, name, age, salary, memberId, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Designer{" +
                "bonus=" + bonus +
                '}';
    }
}
