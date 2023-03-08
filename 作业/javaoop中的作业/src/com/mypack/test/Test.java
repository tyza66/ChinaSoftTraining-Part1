package com.mypack.test;

import com.mypack.entity.sub.Student;
import com.mypack.entity.sub2.Teacher;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("xiaoming",10,100,'男',999,666);
        Teacher teacher = new Teacher("xiaoliang",11,100,'男',999,666);
        student.sleep();
        teacher.sleep();
        student.eat();
        student.eat();
        System.out.println(student.getAge());
    }
}
