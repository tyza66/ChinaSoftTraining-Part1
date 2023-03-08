package com.mypack.entity.sub;

import com.mypack.entity.Person;

public class Student extends Person {
    int sid;
    int grade;

    public Student(String name, int age, int weight, char sex, int sid, int grade) {
        super(name, age, weight, sex);
        this.sid = sid;
        this.grade = grade;
    }

    public int getSid() {
        return sid;
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

    public String getName(){
        return super.getName();
    }

    @Override
    public void sleep() {
        System.out.print(super.getName());
        super.sleep();
    }
}
