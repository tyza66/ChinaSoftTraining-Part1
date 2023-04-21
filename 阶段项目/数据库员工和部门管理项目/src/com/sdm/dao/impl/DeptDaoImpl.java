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
        PreparedStatement ps = null;
        String sql = "insert into dept values(?,?,?)";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, dept.getDeptNo());
            ps.setString(2, dept.getdName());
            ps.setString(3, dept.getLoc());
            int i = ps.executeUpdate();
            return i;
        } catch (Exception e) {
            System.out.println("数据库错误(" + e.getMessage() + ")");
        } finally {
            if (ps != null) {
                DBUtil.close(ps, conn);
            }
        }
        return 0;
    }

    @Override
    public int deleteDept(int id) {
        Connection conn = DBUtil.getConnection();
        PreparedStatement ps = null;
        String sql = "delete from dept where DEPTNO =?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            int i = ps.executeUpdate();
            return i;
        } catch (Exception e) {
            System.out.println("数据库错误(" + e.getMessage() + ")");
        } finally {
            if (ps != null) {
                DBUtil.close(ps, conn);
            }
        }
        return 0;
    }

    @Override
    public int updateDept(Dept dept) {
        Connection conn = DBUtil.getConnection();
        PreparedStatement ps = null;
        String sql = "update dept set DNAME =?,LOC =? where DEPTNO =?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, dept.getdName());
            ps.setString(2, dept.getLoc());
            ps.setInt(3, dept.getDeptNo());
            int i = ps.executeUpdate();
            DBUtil.close(ps, conn);
            return i;
        } catch (Exception e) {
            System.out.println("数据库错误(" + e.getMessage() + ")");
        } finally {
            if (ps != null) {
                DBUtil.close(ps, conn);
            }
        }
        return 0;
    }

    @Override
    public List<Dept> queryAll() {
        Connection conn = DBUtil.getConnection();
        PreparedStatement ps = null;
        String sql = "select * from dept";
        List<Dept> depts = new ArrayList<Dept>();
        try {
            ps = conn.prepareStatement(sql);
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
        } finally {
            if (ps != null) {
                DBUtil.close(ps, conn);
            }
        }
        return null;
    }
}
