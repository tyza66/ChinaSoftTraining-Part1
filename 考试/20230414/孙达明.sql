聚合函数
1.求scott.emp表中sal+500后的平均值。
select avg(sal+500) from emp;
2.求scott.emp表中不同sal值的平均值。
select (select sum(DISTINCT sal) from emp)/(select count(DISTINCT sal) from emp) from dual;
3.求scott.emp表中sal的最大值和最小值。
select max(sal),min(sal) from emp;
4.求scott.emp表所有员工的人数。
select count(*) from emp;
5.求scott.emp表sal列之和
select sum(sal) from emp;

日期函数

6.求当前系统时间。
select SYSDATE from dual;
7.求当前月份的最后一天。
select LAST_DAY(SYSDATE) from dual;
8.求当前日期与2016年12月20日之间相隔的月数。
select MONTHS_BETWEEN(SYSDATE,TO_DATE('2016-12-20', 'yyyy-mm-dd')) from dual;
9.求下一个星期一的日期。
select NEXT_DAY(SYSdate,'Sunday')+1 from dual;
10.求你现在的年龄。
select TO_NUMBER(to_char(SYSDATE,'yyyy')) - TO_NUMBER(to_char(to_date('2001-08-24','yyyy-mm-dd'),'yyyy')) from dual;
转换函数 

11.将123转换成字符串。
select TO_CHAR(123) from dual;
12.将'123'转换成数值型。
select TO_NUMBER('123') from dual;
13.将当前日期转换成日期型。
select to_date('2023-04-14','yyyy-mm-dd') from dual;
14.将‘970.13’转换成数值型后再加上100。	
select TO_NUMBER('970.13')+100 from dual;
多表连查 	

15.查询scott.emp表各雇员信息与其所在部门信息。
select e.*,d.* from emp e,dept d where d.deptno = e.deptno;
16.查询scott.emp表各雇员名字和所在部门名称。
select e.ename,d.dname from emp e,dept d where d.deptno = e.deptno;
17.查询比SMITH工资高的雇员姓名。
select ename from emp where sal>nvl((select sal from emp where ename= 'SMITH'),0);
18.查询各雇员名字和所在部门名称。
select e.ename,d.dname from emp e,dept d where d.deptno = e.deptno;
嵌套查询（子查询）

19.查询SMITH所在部门的详细信息。
select * from dept where deptno = (select deptno from emp where ename = 'SMITH');
20.查询与SMITH在同一部门的员工信息
select * from emp where deptno = (select deptno from emp where ename = 'SMITH');
21.找出其他部门比10号部门某员工工资高的雇员信息。
select * from emp where sal >any(select sal from emp where deptno =10) and deptno<>10;
22.找出SMITH所在部门的详细信息。
select * from dept where deptno = (select deptno from emp where ename = 'SMITH');
23.查看职务为CLERK或SALESMAN的雇员信息。
select * from emp where job = 'CLER' or job ='SALESMAN';
高级查询	

24.查询所有员工的人数和他们的平均工资
select count(*),avg(sal) from emp;
25.查询部门编号为20的所有员工信息
select * from emp where deptno=20;
26.查询部门编号为20，部门中工资最高的员工信息
select * from emp where deptno = 20 and sal >=all(select sal from emp where deptno=20);
27.查询将金COMM高于工资SAL 20%的员工信息
select * from emp where nvl(comm,0) > sal*0.2;
28.查询所有有奖金的员工信息
select * from emp where comm is not null;
29.查询工龄大于或等于10年的员工信息
select * from emp where MONTHS_BETWEEN(SYSDATE,HIREDATE)>=120;
30.查询员工名正好为8个字母的员工信息
select * from emp where length(ename)=8;
31.查询员工的姓名和工资，并按工资降序排序
select ename,sal from emp order by sal desc;
32.查询所有员工的姓名、部门号、工资，结果先按部门号升序排序，再按工资降序排序
select ename.deptno,sal from emp order by deptno,sal desc;
33.查询各个部门中的员工的人数和平均资
select count(*),avg(sal) from emp group by deptno;
34.统计各个工种的员工的人数和平均工资
select count(*),avg(sal) from emp group by job;