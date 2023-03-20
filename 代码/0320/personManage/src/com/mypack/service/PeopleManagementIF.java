package com.mypack.service;

import com.mypack.entity.Person;

public interface PeopleManagementIF {
    //方法
    //添加方法
    public void addPerson(Person p);

    //查询所有
    public void  queryAllPerson();

    //查询单个
    public void queryPersonById(int id);

    //修改单个
    public  void updatePersonById(int id, String newname);

    //删除的逻辑
    public void deleteOne(int id);
}
