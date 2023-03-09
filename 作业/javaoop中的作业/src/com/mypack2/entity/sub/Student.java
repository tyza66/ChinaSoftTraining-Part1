package com.mypack2.entity.sub;

import com.mypack2.entity.Person;

public class Student extends Person {
    int sid;
    int grade;

    public Student(int id, String name, int sid, int grade) {
        super(id, name);
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
}
