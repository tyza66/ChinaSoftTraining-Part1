package com.mypack.tset;


import com.mypack.entity.Person;
import com.mypack.entity.sub.Student;
import com.mypack.entity.sub.Teacher;
import com.mypack.service.PeopleManagement;
import com.mypack.ui.ConsoleUI;

public class Test2 {
    public static void main(String[] args) {
        Student student1 = new Student(666, "xiaoming", 666, 5);
        Teacher teacher1 = new Teacher(888, "xiaoliang", 23333, "good");
        Student student2 = new Student(222, "xiaomi", 666, 5);
        PeopleManagement peopleManagement = new PeopleManagement();
        peopleManagement.addOne(student1);
        peopleManagement.addOne(teacher1);
        peopleManagement.addOne(student2);
        peopleManagement.queryAll();
        System.out.println();
        peopleManagement.queryOne(666);
        peopleManagement.queryAll();
        System.out.println();
        peopleManagement.deleteOne(222);
        peopleManagement.queryAll();
        System.out.println();
        peopleManagement.update(666,"giao");
        peopleManagement.queryAll();
        System.out.println();
        ConsoleUI consoleUI = new ConsoleUI();
        consoleUI.showUI();
    }
}
