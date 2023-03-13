package com.mypack.entity.sub;

import com.mypack.entity.Person;

public class Student extends Person {
    int sid;
    int grade;

    public Student(int id, String name, int sid, int grade) {
        super(id, name);
        this.sid = sid;
        this.grade = grade;
    }
}
