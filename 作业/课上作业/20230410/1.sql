--1.取前几条数据。
select * from emp where ROWNUM<=2;
--2.先根据部门编号升序，再根据薪水降序。
select * from emp ORDER BY DEPTNO,SAL desc;
--3.查询出雇员表(emp)中comm为null的记录。
select * from emp where comm is null;
--4.查询出雇员表(emp)中员工的姓名,将名字中的'A'换为'1','B'换为'2'。
select REPLACE(REPLACE(ename, 'A', 1), 'B', 2) from emp;
--5.查询出每个部门的平均薪水，并显示出部门详细信。
select e.deptno 部门编号,(select dname from dept d where d.deptno = e.deptno) 部门名称,count(e.deptno) 人数,avg(e.SAL) 平均薪水 from emp e group by deptno;
--6.查询出部门人员中薪水大于2000的人在2个以上的部门。
select d.deptno,d.dname from dept d where (select count(e.deptno) from emp e where e.sal>2000 and e.deptno = d.deptno group by e.deptno)>2;
--7.求出每个部门中薪水最高的员工。
select e1.deptno,e1.ENAME,e1.sal from emp e1 where e1.sal=(select max(SAL) from emp e2 where e2.DEPTNO = e1.DEPTNO);
--8.分别统计出各个月份入职(hiredate)的员工有多少人。
select TO_CHAR(HIREDATE,'mm') 月份,COUNT(*) 人数 from emp group by TO_CHAR(HIREDATE,'mm') ORDER BY TO_CHAR(HIREDATE,'mm');
--9.查询scott.emp表中所有列。
select * from emp;
--10.查询scott.emp表中的ename列。
select ename from emp;
--11.查询scott.emp表中ename列，将其列名改为“雇员姓名”。
select ename 雇员姓名 from emp;
--12.查询scott.emp表中sal、comm两项工资的总和。
select nvl(sal,0)+nvl(comm,0) from emp;
--13.消除emp表中job列的重复值。
select DISTINCT job from emp;
--14.查看scott.emp表中在10号部门的所有员工具体情况。
select * from emp where DEPTNO = 10;
--15.查询scott.emp表中工资在1500和3000之间的雇员编号。
select EMPNO FROM emp where sal BETWEEN 1500 and 3000;
--16.查询scott.emp表中在10、20或30号部门工作的雇员编号。
select deptno,empno from emp where deptno in(10,20,30);
--17.查询scott.emp表中名字中含有K字母的雇员姓名。
SELECT ename from emp where ename like '%K%';
--18.查询comm列为NULL的雇员信息。
SELECT comm from emp where comm is null;
--19.查询10号部门工资在1000元以上的雇员信息。
select * from emp where DEPTNO=0 and sal>1000;
--20.将emp表按照部门号升序、员工编号降序排列。
select * from emp ORDER BY deptno,EMPNO desc;
--21.统计scott.emp表中各部门的人数。
select count(*) from emp group BY DEPTNO;
--22.统计各部门人数，将多于5人的部门编号输出。
select d.deptno from dept d where (select count(*) from emp e where e.deptno=d.deptno )>5;
--23.将scott.emp表中的内容复制一份到newemp表。内置函数 
create table newemp as select * from emp;
--24.查看A的ASCII码。
select ASCII('A') from dual;
--25.查看ASCII码为65的字符。
select CHR(65) from dual;
--26.使用LENGTH函数求字符串‘This is Oracle 11g’。
SELECT length('This is Oracle 11g') from dual;
--27.使用CONCAT函数将EMP表中各元组的ename添加在job之后。
select concat(job,ename) FROM emp;
--28.使用SUBSTRING函数、SUBSTR函数
select SUBSTR(ENAME,1, 2) from emp;
--29.使用MOD函数求8除以3的余数。
select mod(8,3) from dual;
--30.使用ROUND函数取整。
select round(1.2) from dual;
