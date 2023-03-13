package com.mypack.test;

import com.mypack.entity.Person;
import com.mypack.entity.sub.Student;
import com.mypack.entity.sub2.Teacher;

public class Test {

    public static void main(String[] args) {
        Person p=new Person(1001,"张三",23,"北京");
        System.out.println(p);

        Teacher t=new Teacher();
        t.setId(1002);
        t.setName("孔子");
        t.setAge(66);
        t.setAddress("山东");
        t.setTeaNO(10010);
        t.setSubject("语文");

        t.work();
        t.sleep();
        t.showTea();

        Student s=new Student(1003,"孟子",33,"德州",10086,"3年2班");
        s.work();
        s.sleep();
        s.showStu();
    }
}
