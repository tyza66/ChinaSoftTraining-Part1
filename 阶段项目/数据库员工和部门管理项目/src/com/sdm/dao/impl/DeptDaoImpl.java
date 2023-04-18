package com.sdm.dao.impl;

import com.sdm.dao.DeptDao;
import com.sdm.pojo.Dept;
import com.sdm.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: tyza66
 * Date: 2023/04/18 13:49
 * Github: https://github.com/tyza66
 **/
public class DeptDaoImpl implements DeptDao {

    @Override
    public int addDept(Dept dept) {
        Connection conn = DBUtil.getConnection();
        String sql = "insert into emp values(?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, dept.getDeptNo());
            ps.setString(2, dept.getdName());
            ps.setString(3, dept.getLoc());
            int i = ps.executeUpdate();
            DBUtil.close(ps, conn);
            return i;
        } catch (Exception e) {
            System.out.println("数据库错误(" + e.getMessage() + ")");
        }
        return 0;
    }

    @Override
    public int deleteDept(int id) {
        Connection conn = DBUtil.getConnection();
        String sql = "delete from emp where DEPTNO =?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            int i = ps.executeUpdate();
            DBUtil.close(ps, conn);
            return i;
        } catch (Exception e) {
            System.out.println("数据库错误(" + e.getMessage() + ")");
        }
        return 0;
    }

    @Override
    public int updateDept(Dept dept) {
        Connection conn = DBUtil.getConnection();
        String sql = "update emp set DNAME =?,LOC =? where DEPTNO =?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, dept.getdName());
            ps.setString(2, dept.getLoc());
            ps.setInt(3, dept.getDeptNo());
            int i = ps.executeUpdate();
            DBUtil.close(ps, conn);
            return i;
        } catch (Exception e) {
            System.out.println("数据库错误(" + e.getMessage() + ")");
        }
        return 0;
    }

    @Override
    public List<Dept> queryAll() {
        Connection conn = DBUtil.getConnection();
        String sql = "select * from emp";
        List<Dept> depts = new ArrayList<Dept>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Dept dept = new Dept();
                dept.setDeptNo(rs.getInt("DEPTNO"));
                dept.setdName(rs.getString("DNAME"));
                dept.setLoc(rs.getString("LOC"));
                depts.add(dept);
            }
            DBUtil.close(rs, ps, conn);
            return depts;
        } catch (Exception e) {
            System.out.println("数据库错误(" + e.getMessage() + ")");
        }
        return null;
    }
}
