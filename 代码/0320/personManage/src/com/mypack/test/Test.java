package com.mypack.test;

import com.mypack.entity.Person;
import com.mypack.service.ArrayPeopleManagement;


public class Test {

    public static void main(String[] args) {

        ArrayPeopleManagement pm=new ArrayPeopleManagement();

        //添加
    /*    Person p1=new Person(1,"张三1",23,"北京1");
        Person p2=new Person(2,"张三2",23,"北京2");
        Person p3=new Person(3,"张三3",23,"北京3");
        Person p4=new Person(4,"张三4",23,"北京4");
        Person p5=new Person(5,"张三5",23,"北京5");

        pm.addPerson(p1);
        pm.addPerson(p2);
        pm.addPerson(p3);
        pm.addPerson(p4);
        pm.addPerson(p5);*/

        //查询所有
        pm.queryAllPerson();

        //查询单个
        System.out.println("--------------");
        pm.queryPersonById(3);

        System.out.println("-------------------");

        //修改
        pm.updatePersonById(1,"李四");
        //查询所有
        pm.queryAllPerson();

        //删除
        System.out.println("--------------------");
        pm.deleteOne(4);
        //查询所有
        pm.queryAllPerson();



    }
}
