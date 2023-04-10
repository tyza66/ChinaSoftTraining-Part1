select NULLIF(1,2) from dual;
select COALESCE(NULL, null, null, 2) FROM dual;
SELECT DEPTNO,ENAME,SAL,DECODE(DEPTNO, 10,nvl(sal,0)+100,20,nvl(sal,0)+200,30,nvl(sal,0)+300,nvl(sal,0)+1) newsal from emp ORDER BY SAL;
SELECT DEPTNO,ENAME,SAL,DECODE(DEPTNO, 10,nvl(sal,0)+100,20,nvl(sal,0)+200,30,nvl(sal,0)+300,nvl(sal,0)+1) as newsal1,case when deptno=10 then nvl(sal,0)+100 when deptno=20 then nvl(sal,0)+200 when deptno=30 then nvl(sal,0)+300 else nvl(sal,0)+1 end as newsal2 from emp ORDER BY deptno;
-- 查询员工姓名及其对应的部门编号
select e.ename,d.dname from emp e,dept d where e.DEPTNO = d.DEPTNO;
--查询salgrade表中的内容
select * from salgrade;
--查询emp表的薪资等级在哪个区间里面
select e.ename,e.sal,s.grade from emp e,salgrade s where e.sal between s.LOSAL and HISAL;

select e.ename,e.sal,d.dname,d.loc,s.grade from emp e,salgrade s,dept d where e.deptno=d.deptno and e.sal between s.losal and s.hisal;