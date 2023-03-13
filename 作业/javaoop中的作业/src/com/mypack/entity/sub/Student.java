package com.mypack.entity.sub;

import com.mypack.entity.Person;

public class Student extends Person {
    private int sid;
    private int grade;

    public Student(String name, int age, int weight, char sex, int sid, int grade) {
        super(name, age, weight, sex);
        this.sid = sid;
        this.grade = grade;
    }

    public int getSid() {
        return sid;
    }

    public int getSid(int i) {
        return i;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return super.getName();
    }

    @Override
    public void sleep() {
        System.out.print(super.getName());
        super.sleep();
    }
}
