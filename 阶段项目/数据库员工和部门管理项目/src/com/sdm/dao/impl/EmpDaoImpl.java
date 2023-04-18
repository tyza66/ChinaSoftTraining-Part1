package com.sdm.dao.impl;

import com.sdm.dao.EmpDao;
import com.sdm.pojo.Dept;
import com.sdm.pojo.Emp;
import com.sdm.util.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: tyza66
 * Date: 2023/04/18 10:55
 * Github: https://github.com/tyza66
 */
public class EmpDaoImpl implements EmpDao {

    @Override
    public List<Emp> queryAll() {
        Connection conn = DBUtil.getConnection();
        String sql = "select * from emp";
        try {
            assert conn != null;
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Emp> emps = new ArrayList<Emp>();
            while (rs.next()) {
                Emp emp = new Emp();
                emp.setEmpNo(rs.getInt("empno"));
                emp.seteName(rs.getString("ename"));
                emp.setJob(rs.getString("JOB"));
                emp.setMGR(rs.getInt("MGR"));
                emp.setHireDate(rs.getDate("HIREDATE"));
                emp.setSal(rs.getInt("SAL"));
                emp.setComm(rs.getInt("COMM"));
                emp.setDeptno(rs.getInt("DEPTNO"));
                emps.add(emp);
            }
            DBUtil.close(rs,ps,conn);
            return emps;
        } catch (SQLException throwables) {
            System.out.println("数据库错误(" + throwables.getMessage() + ")");
        }
        return null;
    }

    @Override
    public Emp queryById(int id) {
        Connection conn = DBUtil.getConnection();
        String sql = "select * from emp where empno = ?";
        try {
            assert conn != null;
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Emp emp = new Emp();
                emp.setEmpNo(rs.getInt("empno"));
                emp.seteName(rs.getString("ename"));
                emp.setJob(rs.getString("JOB"));
                emp.setMGR(rs.getInt("MGR"));
                emp.setHireDate(rs.getDate("HIREDATE"));
                emp.setSal(rs.getInt("SAL"));
                emp.setComm(rs.getInt("COMM"));
                emp.setDeptno(rs.getInt("DEPTNO"));
                DBUtil.close(rs,ps,conn);
                return emp;
            }
        } catch (SQLException throwables) {
            System.out.println("数据库错误(" + throwables.getMessage() + ")");
        }
        return null;
    }

    @Override
    public int add(Emp emp) {
        Connection conn = DBUtil.getConnection();
        String sql = "insert into emp values(?,?,?,?,?,?,?,?)";
        try {
            assert conn != null;
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, emp.getEmpNo());
            ps.setString(2, emp.geteName());
            ps.setString(3, emp.getJob());
            ps.setInt(4, emp.getMGR());
            ps.setDate(5, emp.getHireDate());
            ps.setInt(6, emp.getSal());
            ps.setInt(7, emp.getComm());
            ps.setInt(8, emp.getDeptno());
            DBUtil.close(ps,conn);
            return ps.executeUpdate();
        } catch (SQLException throwables) {
            System.out.println("数据库错误(" + throwables.getMessage() + ")");
        }
        return 0;
    }

    @Override
    public int update(Emp emp) {
        Connection conn = DBUtil.getConnection();
        String sql = "update emp set ename =?, JOB =?, MGR =?, HIREDATE =?, SAL =?, COMM =?, DEPTNO =? where empno =?";
        try {
            assert conn != null;
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, emp.geteName());
            ps.setString(2, emp.getJob());
            ps.setInt(3, emp.getMGR());
            ps.setDate(4, emp.getHireDate());
            ps.setInt(5, emp.getSal());
            ps.setInt(6, emp.getComm());
            ps.setInt(7, emp.getDeptno());
            ps.setInt(8, emp.getEmpNo());
            DBUtil.close(ps,conn);
            return ps.executeUpdate();
        } catch (SQLException throwables) {
            System.out.println("数据库错误(" + throwables.getMessage() + ")");
        }
        return 0;
    }

    @Override
    public int delete(int id) {
        Connection conn = DBUtil.getConnection();
        String sql = "delete from emp where empno =?";
        try {
            assert conn != null;
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            DBUtil.close(ps,conn);
            return ps.executeUpdate();
        } catch (SQLException throwables) {
            System.out.println("数据库错误(" + throwables.getMessage() + ")");
        }
        return 0;
    }

    @Override
    public List<Emp> queryByNameIn(String name) {
        Connection conn = DBUtil.getConnection();
        String sql = "select * from emp where eNAME like ?";
        try {
            assert conn != null;
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + name + "%");
            ResultSet rs = ps.executeQuery();
            List<Emp> emps = new ArrayList<Emp>();
            while (rs.next()) {
                Emp emp = new Emp();
                emp.setEmpNo(rs.getInt("empno"));
                emp.seteName(rs.getString("ename"));
                emp.setJob(rs.getString("JOB"));
                emp.setMGR(rs.getInt("MGR"));
                emp.setHireDate(rs.getDate("HIREDATE"));
                emp.setSal(rs.getInt("SAL"));
                emp.setComm(rs.getInt("COMM"));
                emp.setDeptno(rs.getInt("DEPTNO"));
                emps.add(emp);
            }
            DBUtil.close(rs,ps,conn);
            return emps;
        } catch (SQLException throwables) {
            System.out.println("数据库错误(" + throwables.getMessage() + ")");
        }
        return null;
    }

    @Override
    public List<Emp> queryBySalary(int salary1, int salary2) {
        Connection conn = DBUtil.getConnection();
        String sql = "select * from emp WHERE SAL >= ? AND SAL <= ?";
        try {
            assert conn != null;
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, salary1);
            ps.setInt(2, salary2);
            ResultSet rs = ps.executeQuery();
            List<Emp> emps = new ArrayList<Emp>();
            while (rs.next()) {
                Emp emp = new Emp();
                emp.setEmpNo(rs.getInt("empno"));
                emp.seteName(rs.getString("ename"));
                emp.setJob(rs.getString("JOB"));
                emp.setMGR(rs.getInt("MGR"));
                emp.setHireDate(rs.getDate("HIREDATE"));
                emp.setSal(rs.getInt("SAL"));
                emp.setComm(rs.getInt("COMM"));
                emp.setDeptno(rs.getInt("DEPTNO"));
                emps.add(emp);
            }
            DBUtil.close(rs,ps,conn);
            return emps;
        } catch (SQLException throwables) {
            System.out.println("数据库错误(" + throwables.getMessage() + ")");
        }
        return null;
    }

    @Override
    public List<Emp> queryByHiredate(String hiredate1, String hiredate2) {
        Connection conn = DBUtil.getConnection();
        String sql = "select * from emp WHERE HIREDATE >= ? AND HIREDATE <= ?";
        try {
            assert conn != null;
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(hiredate1));
            ps.setDate(2, Date.valueOf(hiredate2));
            ResultSet rs = ps.executeQuery();
            List<Emp> emps = new ArrayList<Emp>();
            while (rs.next()) {
                Emp emp = new Emp();
                emp.setEmpNo(rs.getInt("empno"));
                emp.seteName(rs.getString("ename"));
                emp.setJob(rs.getString("JOB"));
                emp.setMGR(rs.getInt("MGR"));
                emp.setHireDate(rs.getDate("HIREDATE"));
                emp.setSal(rs.getInt("SAL"));
                emp.setComm(rs.getInt("COMM"));
                emp.setDeptno(rs.getInt("DEPTNO"));
                emps.add(emp);
            }
            DBUtil.close(rs,ps,conn);
            return emps;
        } catch (SQLException throwables) {
            System.out.println("数据库错误(" + throwables.getMessage() + ")");
        }
        return null;
    }

    @Override
    public List<Emp> queryTop(int num) {
        Connection conn = DBUtil.getConnection();
        String sql = "select * from emp where rownum <= ?";
        try {
            assert conn != null;
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, num);
            ResultSet rs = ps.executeQuery();
            List<Emp> emps = new ArrayList<Emp>();
            while (rs.next()) {
                Emp emp = new Emp();
                emp.setEmpNo(rs.getInt("empno"));
                emp.seteName(rs.getString("ename"));
                emp.setJob(rs.getString("JOB"));
                emp.setMGR(rs.getInt("MGR"));
                emp.setHireDate(rs.getDate("HIREDATE"));
                emp.setSal(rs.getInt("SAL"));
                emp.setComm(rs.getInt("COMM"));
                emp.setDeptno(rs.getInt("DEPTNO"));
                emps.add(emp);
            }
            DBUtil.close(rs,ps,conn);
            return emps;
        } catch (SQLException throwables) {
            System.out.println("数据库错误(" + throwables.getMessage() + ")");
        }
        return null;
    }

    @Override
    public List<Emp> queryBigAvgSalary() {
        Connection conn = DBUtil.getConnection();
        String sql = "select * from emp WHERE sal > (select avg(sal) from emp)";
        try {
            assert conn != null;
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Emp> emps = new ArrayList<Emp>();
            while (rs.next()) {
                Emp emp = new Emp();
                emp.setEmpNo(rs.getInt("empno"));
                emp.seteName(rs.getString("ename"));
                emp.setJob(rs.getString("JOB"));
                emp.setMGR(rs.getInt("MGR"));
                emp.setHireDate(rs.getDate("HIREDATE"));
                emp.setSal(rs.getInt("SAL"));
                emp.setComm(rs.getInt("COMM"));
                emp.setDeptno(rs.getInt("DEPTNO"));
                emps.add(emp);
            }
            DBUtil.close(rs,ps,conn);
            return emps;
        } catch (SQLException throwables) {
            System.out.println("数据库错误(" + throwables.getMessage() + ")");
        }
        return null;
    }

    @Override
    public void queryDetail(int id) {
        Connection conn = DBUtil.getConnection();
        String sql = "select * from emp e,dept d where e.deptno = d.deptno and e.empno = ?";
        try {
            assert conn != null;
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            List<Emp> emps = new ArrayList<Emp>();
            while (rs.next()) {
                Emp emp = new Emp();
                emp.setEmpNo(rs.getInt("empno"));
                emp.seteName(rs.getString("ename"));
                emp.setJob(rs.getString("JOB"));
                emp.setMGR(rs.getInt("MGR"));
                emp.setHireDate(rs.getDate("HIREDATE"));
                emp.setSal(rs.getInt("SAL"));
                emp.setComm(rs.getInt("COMM"));
                emp.setDeptno(rs.getInt("DEPTNO"));
                emps.add(emp);
                System.out.println(emp);
                Dept dept = new Dept();
                dept.setDeptNo(rs.getInt("DEPTNO"));
                dept.setdName(rs.getString("DNAME"));
                dept.setLoc(rs.getString("LOC"));
                System.out.println(dept);
            }
            DBUtil.close(rs,ps,conn);
        } catch (SQLException throwables) {
            System.out.println("数据库错误(" + throwables.getMessage() + ")");
        }
    }

    @Override
    public List<Emp> queryDetailByDep(int depId) {
        Connection conn = DBUtil.getConnection();
        String sql = "select * from emp WHERE deptno= ?";
        try {
            assert conn != null;
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, depId);
            ResultSet rs = ps.executeQuery();
            List<Emp> emps = new ArrayList<Emp>();
            while (rs.next()) {
                Emp emp = new Emp();
                emp.setEmpNo(rs.getInt("empno"));
                emp.seteName(rs.getString("ename"));
                emp.setJob(rs.getString("JOB"));
                emp.setMGR(rs.getInt("MGR"));
                emp.setHireDate(rs.getDate("HIREDATE"));
                emp.setSal(rs.getInt("SAL"));
                emp.setComm(rs.getInt("COMM"));
                emp.setDeptno(rs.getInt("DEPTNO"));
                emps.add(emp);
            }
            DBUtil.close(rs,ps,conn);
            return emps;
        } catch (SQLException throwables) {
            System.out.println("数据库错误(" + throwables.getMessage() + ")");
        }
        return null;
    }

    @Override
    public int queryCount() {
        int n = 0;
        Connection conn = DBUtil.getConnection();
        String sql = "select count(*) from emp";
        try {
            assert conn != null;
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                n = rs.getInt(1);
            }
            DBUtil.close(rs,ps,conn);
            return n;
        } catch (SQLException throwables) {
            System.out.println("数据库错误(" + throwables.getMessage() + ")");
        }
        return 0;
    }
}
