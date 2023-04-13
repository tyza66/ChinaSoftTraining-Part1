--1、列出至少有一个雇员的所有部门

select distinct deptno,dname from dept where deptno in (select distinct deptno from emp);

select d.deptno,d.dname from dept d inner join  emp e on d.deptno=e.deptno group by d.deptno,d.dname having count(*)>=1

　
　　--2、列出薪金比"SMITH"多的所有雇员
select ename,sal from emp where sal>(select sal from emp where ename='SMITH')

　　--3、列出所有雇员的姓名及其直接上级的姓名
select e.ename,e.mgr,m.ename from emp e,emp m where e.mgr=m.empno(+)
　　

　　--4、列出入职日期早于其直接上级的所有雇员
select e.ename from emp e where e.hiredate <(select m.hiredate from emp m where m.empno=e.mgr)
　

　　--5、列出部门名称和这些部门的雇员,同时列出那些没有雇员的部门
select d.dname,e.ename from dept d left join emp e on e.deptno=d.deptno 

　　--6、列出所有“CLERK”（办事员）的姓名及其部门名称
select e.ename,d.dname from emp e left join dept d on d.deptno=e.deptno where e.job='CLERK'
　
　　--7、列出各种工作类别的最低薪金，显示最低薪金大于1500的记录

select job,min(sal) from emp group by job having min(sal)>1500

　　--8、列出从事“SALES”（销售）工作的雇员的姓名，假定不知道销售部的部门编号

　select ename from emp where deptno =(select deptno from dept where dname='SALES')
　　--9、列出薪金高于公司平均水平的所有雇员

select ename from emp where sal>(select avg(sal) from emp)

		--10、列出与“SCOTT”从事相同工作的所有雇员
select ename from emp where job=(select job from emp where ename='SCOTT')
　　

　　--11、列出某些雇员的姓名和薪金，条件是他们的薪金等于部门30中任何一个雇员的薪金
elect ename,sal from emp where sal =(select sal from emp where deptno=30)
　　

　　--12、列出某些雇员的姓名和薪金，条件是他们的薪金高于部门30中所有雇员的薪金

　　s

　　--13、列出每个部门的信息以及该部门中雇员的数量
select d.deptno,d.dname,count(e.ename) from dept d left join emp e on d.deptno=e.deptno group by d.deptno,d.dname
　

　　--14、列出所有雇员的雇员名称、部门名称和薪金

　select e.ename,d.dname,e.sal from emp e left join dept d on e.deptno=d.deptno

　　--15、列出从事同一种工作但属于不同部门的雇员的不同组合

　　select a.ename,b.ename,a.job,b.job,a.deptno,b.deptno from emp a,emp b where a.job=b.job and a.deptno<>b.deptno

　　--16、列出分配有雇员数量的所有部门的详细信息，即使是分配有0个雇员

　select d.deptno,d.dname,d.loc ,count(empno)from  dept d ,emp e where d.deptno=e.deptno(+) group by d.deptno,d.dname,d.loc

　　--17、列出各种类别工作的最低工资

select min(sal) from emp GROUP BY job

　　--18、列出各个部门的MANAGER（经理）的最低薪金
select deptno, min(sal) from emp where job='MANAGER' group by deptno

　　--19、列出按年薪排序的所有雇员的年薪
select (sal+nvl(comm,0))*12 as avn from emp order by avn
　　
　　--20、列出薪金水平处于第四位的雇员

select empno,ename,sal from emp where  sal >= (select losal from salgrade where grade=4) and sal <= (select hisal from salgrade where grade=4)
