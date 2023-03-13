package com.mypack.entity.sub2;

import com.mypack.entity.Person;

public class Teacher extends Person {

    private int teaNO;
    private String subject;

    public Teacher() {
    }

    public Teacher(int id, String name, int age, String address, int teaNO, String subject) {
        super(id, name, age, address);
        this.teaNO = teaNO;
        this.subject = subject;
    }

    public int getTeaNO() {
        return teaNO;
    }

    public void setTeaNO(int teaNO) {
        this.teaNO = teaNO;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void showTea(){
        System.out.println("编号："+super.getId()+"姓名："+super.getName()+" 年龄："+super.getAge()+" 住址："+super.getAddress()+" 工号："+teaNO+" 授课科目："+subject);
    }
}
