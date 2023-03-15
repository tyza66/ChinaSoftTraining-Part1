package com.mypack.test;

import com.mypack.entity.sub.Student;
import com.mypack.entity.sub.Teacher;
import com.mypack.service.PeopleManagement;

public class Test2 {

    public static void main(String[] args) {

        Student s1=new Student(1,"张三",23,"北京",1001,"1班");
        Student s2=new Student(2,"李四",24,"上海",1002,"1班");
        Student s3=new Student(3,"万物",25,"深圳",1003,"1班");
        Student s4=new Student(4,"赵六",26,"广州",1004,"1班");
        Teacher t1=new Teacher(5,"孙膑",33,"石家庄",20001,"语文");
        Teacher t2=new Teacher(6,"曹超",33,"郑州",20002,"语文");
        Teacher t3=new Teacher(7,"诸葛亮",33,"沈阳",20003,"语文");
        Teacher t4=new Teacher(8,"赵云",33,"大连",20004,"语文");

        PeopleManagement pm=new PeopleManagement();
        pm.addPerson(s1);
        pm.addPerson(s2);
        pm.addPerson(s3);
        pm.addPerson(s4);
        pm.addPerson(t1);
        pm.addPerson(t2);
        pm.addPerson(t3);
        pm.addPerson(t4);
        pm.queryAllPerson();



    }
}
