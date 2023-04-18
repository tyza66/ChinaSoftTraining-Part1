package com.sdm.service;

import com.sdm.dao.EmpDao;
import com.sdm.dao.impl.EmpDaoImpl;
import com.sdm.pojo.Emp;
import org.junit.Test;

import java.util.List;

/**
 * Author: tyza66
 * Date: 2023/04/18 12:34
 * Github: https://github.com/tyza66
 */
public class EmpService {
    EmpDao ed = new EmpDaoImpl();
    @Test
    public void showAll(){
        List<Emp> emps = ed.queryAll();
        for(Emp e : emps){
            System.out.println(e);
        }
    }

    public void showOne(int id){
        Emp emp = ed.queryById(id);
        System.out.println(emp);
    }

    public int add(Emp emp){
        int add = ed.add(emp);
        return add;
    }
}
