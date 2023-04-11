-- 1.取前几条数据。
select rownum,a.* from emp a where rownum<=5

2.先根据部门编号升序，再根据薪水降序。

select * from emp order by deptno asc,sal desc

3.查询出雇员表(emp)中comm为null的记录。

select * from emp where comm is null

4.查询出雇员表(emp)中员工的姓名,将名字中的'A'换为'1','B'换为'2'。

select replace( replace(ename,'A','1'),'B','2') from emp

5.查询出每个部门的平均薪水，并显示出部门详细信。

select a.dname,a.deptno,a.loc,b.sa from dept a inner join (select avg(sal) sa,deptno from emp group by deptno) b on a.deptno=b.deptno

6.查询出部门人员中薪水大于2000的人在2个以上的部门。

select count(deptno),deptno from emp where sal>2000 group by deptno  having (count(deptno))>=2
7.求出每个部门中薪水最高的员工。

select * from dept a inner join ( select max(sal) sa,deptno from emp group by deptno) b on a.deptno=b.deptno

8.分别统计出各个月份入职(hiredate)的员工有多少人。

select extract(month from hiredate),count(*) from emp group by extract(month from hiredate)

9.查询scott.emp表中所有列。

select * from emp;

10.查询scott.emp表中的ename列。

select ename from emp;

11.查询scott.emp表中ename列，将其列名改为“雇员姓名”。
select ename as "雇员姓名" from emp;

12.查询scott.emp表中sal、comm两项工资的总和。
select sal+nvl(comm,0) from emp;

13.消除emp表中job列的重复值。
select distinct job from emp;

14.查看scott.emp表中在10号部门的所有员工具体情况。

select * from emp where deptno=10

15.查询scott.emp表中工资在1500和3000之间的雇员编号。
select empno from emp where sal between 1500 and 3000

16.查询scott.emp表中在10、20或30号部门工作的雇员编号。
select * from emp where deptno in (10,20,30)

17.查询scott.emp表中名字中含有K字母的雇员姓名。
select * from emp where ename like '%K%'

18.查询comm列为NULL的雇员信息。
select * from emp where comm is null

19.查询10号部门工资在1000元以上的雇员信息。

select * from emp where deptno=10 and sal>1000

20.将emp表按照部门号升序、员工编号降序排列。
select * from emp  order by deptno asc,empno desc

21.统计scott.emp表中各部门的人数。

select count(deptno) from emp group by deptno

22.统计各部门人数，将多于5人的部门编号输出。

select count(deptno) from emp group by deptno having count(deptno)>5

23.将scott.emp表中的内容复制一份到newemp表。
create table newemp as select * from emp

内置函数 

24.查看A的ASCII码。

select ascii('A') from dual;

25.查看ASCII码为65的字符。

select chr(65) from dual;

26.使用LENGTH函数求字符串‘This is Oracle 11g’。
select length('This is Oracle 11g') from dual


27.使用CONCAT函数将EMP表中各元组的ename添加在job之后。

select concat(job,ename) from emp;


28.使用SUBSTRING函数、SUBSTR函数
select substr('qwerty777',2,6) from dual

29.使用MOD函数求8除以3的余数。
select mod(8,3) from dual;

30.使用ROUND函数取整。
select round(23.13,1) from dual;