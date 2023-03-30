package com.team.domain.pojo.employee;

import com.team.domain.interfaces.Equipment;

/**
 * Author:tyza66
 * CreateTime: 2023-03-29 18:28
 * Github: https://github.com/tyza66
 */
public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;
    Equipment equipment;

    public Employee() {
    }

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + "\t" + name + "\t" + age + "\t\t" + salary;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }
}

