--1、列出至少有一个雇员的所有部门
select * from dept d where (select count(*) from emp e where e.deptno=d.deptno group by deptno)>=1;
--2、列出薪金比"SMITH"多的所有雇员
select * from emp where sal>(select sal from emp where ename='SMITH');
--3、列出所有雇员的姓名及其直接上级的姓名
select e1.ename 员工姓名,e2.ename 上级姓名 from emp e1,emp e2 where e1.MGr = e2.EMPNO;
--4、列出入职日期早于其直接上级的所有雇员
select e1.ename from emp e1,emp e2 where e1.MGr = e2.EMPNO and e1.hiredate<e2.hiredate;
--5、列出部门名称和这些部门的雇员,同时列出那些没有雇员的部门
select d.dname,e.* from emp e,dept d where e.deptno(+) = d.deptno;
--6、列出所有“CLERK”（办事员）的姓名及其部门名称
select e.ename,d.dname from emp e,dept d where e.DEPTNO = d.deptno and e.job = 'CLERK';
--7、列出各种工作类别的最低薪金，显示最低薪金大于1500的记录
select job,min(sal) from emp group by job having min(sal)>1500;
--8、列出从事“SALES”（销售）工作的雇员的姓名，假定不知道销售部的部门编号
select ename from emp where job='SALESMAN';
--9、列出薪金高于公司平均水平的所有雇员
select * from emp WHERE sal>(select avg(sal) from emp);
--10、列出与“SCOTT”从事相同工作的所有雇员
select * from emp where job = (select job from emp where ename='SCOTT');
--11、列出某些雇员的姓名和薪金，条件是他们的薪金等于部门30中任何一个雇员的薪金
select ename,sal from emp where sal in (select sal from emp where deptno=30);
--12、列出某些雇员的姓名和薪金，条件是他们的薪金高于部门30中所有雇员的薪金
select ename,sal from emp where sal > all(select sal from emp where deptno=30);
--13、列出每个部门的信息以及该部门中雇员的数量
select d.*,(select count(*) from emp e where e.deptno = d.deptno) 人数 from dept d;
--14、列出所有雇员的雇员名称、部门名称和薪金
select e.ename,d.dname,e.sal from emp e,dept d where e.deptno = d.deptno;
--15、列出从事同一种工作但属于不同部门的雇员的不同组合
select * from emp order by job;
--16、列出分配有雇员数量的所有部门的详细信息，即使是分配有0个雇员
select d.*,(select count(*) from emp e where e.deptno = d.deptno) 人数 from dept d;
--17、列出各种类别工作的最低工资
select job,min(sal) 最低工资 from emp group by job;
--18、列出各个部门的MANAGER（经理）的最低薪金
select (select e2.ename from emp e2 where e2.EMPNO= e.mgr),min(sal) from emp e group by mgr;
--19、列出按年薪排序的所有雇员的年薪
select * from emp order by (sal*12+nvl(comm,0));
--20、列出薪金水平处于第四位的雇员
select * from (select rownum rn,e.* from emp e order by e.sal) where rn=4;


