package com.sdm.service;

import com.sdm.dao.DeptDao;
import com.sdm.dao.impl.DeptDaoImpl;
import com.sdm.pojo.Dept;
import org.junit.Test;

import java.util.List;

/**
 * Author: tyza66
 * Date: 2023/04/18 14:03
 * Github: https://github.com/tyza66
 **/
public class DeptService {
    DeptDao dd = new DeptDaoImpl();

    @Test
    public void showAll() {
        List<Dept> depts = dd.queryAll();
        for (Dept dept : depts) {
            System.out.println(dept);
        }
    }

    public int addDept(Dept dept) {
        int i = dd.addDept(dept);
        return i;
    }

    public int update(Dept dept) {
        int i = dd.updateDept(dept);
        return i;
    }

    public int delete(int id) {
        int i = dd.deleteDept(id);
        return i;
    }
}
