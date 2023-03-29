package com.team.domain.pojo.employee;

import com.team.domain.interfaces.Equipment;

/**
 * Author:tyza66
 * CreateTime: 2023-03-29 19:02
 * Github: https://github.com/tyza66
 */
public class Programmer extends Employee {
    private int memberId;
    private boolean status=true;//人员的状态初始化为true，添加到团队之后为false；
    private Equipment equipment;//成员设备

    public Programmer(){}

    public Programmer(int id, String name, int age, double salary,  Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
    public boolean isStatus(){return status;}

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }
}

