package com.team.pojo;

public class Programmer extends Employee{

    private int memberId;//成员编号
    private Equipment equipment;//使用设备

    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary, int memberId, Equipment equipment) {
        super(id, name, age, salary);
        this.memberId = memberId;
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "memberId=" + memberId +
                ", equipment=" + equipment +
                '}';
    }
}
