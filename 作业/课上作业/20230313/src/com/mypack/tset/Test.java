package com.mypack.tset;

import com.mypack.entity.sub.Student;
import com.mypack.entity.sub.Teacher;
import com.mypack.service.PeopleManagement;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student(1, "小明", 2, 3);
        Student s2 = new Student(3, "老王", 2, 3);
        Teacher t1 = new Teacher(2, "小亮", 200, "giao");
        PeopleManagement pm = new PeopleManagement();
        pm.addOne(t1);
        pm.addOne(s1);
        pm.queryOne(2);
        System.out.println("-----------------------");
        pm.queryAll();
        pm.deleteOne(2);
        System.out.println("-----------------------");
        pm.queryAll();
        pm.addOne(s2);
        pm.update(3,"小王");
        System.out.println("-----------------------");
        pm.queryAll();
    }
}
