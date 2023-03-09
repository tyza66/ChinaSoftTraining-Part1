package com.mypack2.test;

import com.mypack2.entity.Person;
import com.mypack2.entity.sub.Student;
import com.mypack2.entity.sub.Teacher;
import com.mypack2.service.PeopleManagement;
import com.mypack2.ui.ConsoleUI;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student(666, "xiaoming", 666, 5);
        Teacher teacher1 = new Teacher(888, "xiaoliang", 23333, "good");
        Student student2 = new Student(222, "xiaomi", 666, 5);
        PeopleManagement peopleManagement = new PeopleManagement();
        peopleManagement.addOne(student1);
        peopleManagement.addOne(teacher1);
        peopleManagement.addOne(student2);
        for (Person i : peopleManagement.queryAll()) {
            System.out.print(i.getName() + "  ");
        }
        System.out.println();
        System.out.println(((Student) peopleManagement.queryOne(666)).getSid());
        for (Person i : peopleManagement.queryAll()) {
            System.out.print(i.getName() + "  ");
        }
        System.out.println();
        peopleManagement.deleteOne(222);
        for (Person i : peopleManagement.queryAll()) {
            System.out.print(i.getName() + "  ");
        }
        System.out.println();
        peopleManagement.update(666,"giao");
        for (Person i : peopleManagement.queryAll()) {
            System.out.print(i.getName() + "  ");
        }
        System.out.println();
        ConsoleUI consoleUI = new ConsoleUI();
        consoleUI.showUI();
    }
}
