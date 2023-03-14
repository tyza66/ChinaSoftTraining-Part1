package com.mypack.entity.sub;

import com.mypack.entity.Person;

public class Student extends Person {

    private int stuNO;
    private String className;

    public Student() {
    }

    public Student(int id, String name, int age, String address, int stuNO, String className) {
        super(id, name, age, address);
        this.stuNO = stuNO;
        this.className = className;
    }

    public int getStuNO() {
        return stuNO;
    }

    public void setStuNO(int stuNO) {
        this.stuNO = stuNO;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    public void showStu(){
        System.out.println("编号"+super.getId()+" 姓名："+super.getName()+" 年龄："+super.getAge()+" 地址："+super.getAddress()+"学号："+stuNO+"班级名称："+className);
    }
}
