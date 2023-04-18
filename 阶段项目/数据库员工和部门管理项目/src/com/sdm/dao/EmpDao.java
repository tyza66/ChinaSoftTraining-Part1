package com.sdm.dao;

import com.sdm.pojo.Emp;

import java.util.List;

public interface EmpDao {
    //    a.员工的查询所有
    public List<Emp> queryAll();

    //    b.员工的查询单个
    public Emp queryById(int id);

    //    c.员工的添加操作
    public int add(Emp emp);

    //    d.员工的修改操作
    public int update(Emp emp);

    //    e.员工的删除操作
    public int delete(int id);

    //    f.查询出姓名里面包含“xxx”的员工信息
    public List<Emp> queryByNameIn(String name);

    //    g.查询出员工薪资再指定区间值的员工信息，区间 值从键盘动态获取
    public List<Emp> queryBySalary(int salary1,int salary2);

    //    h.查询出员工雇佣日期再指定区间的员工信息
    public List<Emp> queryByHiredate(String hiredate1,String hiredate2);

    //    i.查询出头n条员工信息，n从键盘动态获取
    public List<Emp> queryTop(int num);

    //    j.查询出员工工资大于平均薪资的员工信息
    public List<Emp> queryAvgSalary();

    //    k.查询出某个员工的详细信息，包括部门信息
    public void queryDetail(int id);

    //    l.查询出部门编号等于指定部门的员工的详细信息
    public List<Emp> queryDetailByDep(int depId);

    //    m.查询出员工的总记录数
    public int queryCount();
}
