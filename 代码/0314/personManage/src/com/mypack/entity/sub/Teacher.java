package com.mypack.entity.sub;

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
    public void shoeTea(){
        System.out.println("编号"+super.getId()+" 姓名："+super.getName()+" 年龄："+super.getAge()+" 地址："+super.getAddress()+"工号："+teaNO+"科目："+subject);
    }

}
