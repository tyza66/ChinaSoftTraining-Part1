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

    public int update(Emp emp){
        int update = ed.update(emp);
        return update;
    }

    public int delete(int id){
        int delete = ed.delete(id);
        return delete;
    }

    public void showByNameIn(String key){
        List<Emp> emps = ed.queryByNameIn(key);
        for(Emp e : emps){
            System.out.println(e);
        }
    }

    public void showSalaryInCase(int s1,int s2){
        List<Emp> emps = ed.queryBySalary(s1,s2);
        for(Emp e : emps){
            System.out.println(e);
        }
    }

    public void showHireInCase(String h1,String h2){
        List<Emp> emps = ed.queryByHiredate(h1,h2);
        for(Emp e : emps){
            System.out.println(e);
        }
    }

    public void showTop(int n){
        List<Emp> emps = ed.queryTop(n);
        for(Emp e : emps){
            System.out.println(e);
        }
    }

    public void showSalBiggerAvg(){
        List<Emp> emps = ed.queryBigAvgSalary();
        for(Emp e : emps){
            System.out.println(e);
        }
    }

    public void showDetail(int id){
        ed.queryDetail(id);
    }

    public void showMember(int id){
        List<Emp> emps = ed.queryDetailByDep(id);
        for(Emp e : emps){
            System.out.println(e);
        }
    }

    public void showNum(){
        System.out.println(ed.queryCount());
    }
}
