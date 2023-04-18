package com.sdm.dao;

import com.sdm.pojo.Dept;

import java.util.List;

public interface DeptDao {
    public int addDept(Dept dept);
    public int deleteDept(int id);
    public int updateDept(Dept dept);
    public List<Dept> queryAll();
}
