–1查询20号部门的所有员工信息
select * from emp where deptno =20;

–2查询所有工种为CLERK的员工的工号、员工名和部门名。
select e.empno,e.ename,d.deptno from emp e,dept d where e.deptno=d.deptno;

–3查询奖金（COMM）高于工资（SAL）的员工信息
select * from emp where nvl(comm,0)>sal;

–4查询奖金高于工资的20%的员工信息
select * from emp where nvl(comm,0) > 0.2 * sa

–5查询10号部门中工种为MANAGER和20号部门中工种为CLERK的员工的信息
select * from emp where (job='MANAGER' and deptno=10) or (job='CLERK' and deptno=20); 

–6查询所有工种不是MANAGER和CLERK，且工资大于或等于2000的员工的详细信息
select * from emp where job not in('MANAGER','CLERK') and sal>=2000;

–7查询有奖金的员工的不同工种
select distinct job from emp where comm is not null;

–8查询所有员工 工资和奖金的和
select ename,sal+nvl(comm,0) from emp;

–9查询没有奖金或奖金低于100的员工信息
select * from emp where comm is null or comm<100;

–10查询各月倒数第2天入职的员工信息
select * from emp where HIREDATE =  LAST_DAY(HIREDATE)-1;
–last_day(date)函数返回指定日期对应月份的最后一天

–11查询员工工龄大于或等于10年的员工信息
select * from emp where MONTHS_BETWEEN(SYSDATE,hiredate)>120;
–MONTHS_BETWEEN函数返回两个日期之间的月份数。
–months_between(date1,date2)函数返回两个日期之间的月份数

–12查询员工信息，要求以首字母大写的方式显示所有员工的姓名
select initcap(ename) from emp;
–initcap()首字母大写函数

–13查询员工名正好为6个字符的员工的信息
select * from emp where LENGTH(ename)=6;

–14查询员工名字中不包含字母“S”员工
select * from emp where ename not like '%S%';

–15查询员工姓名的第2个字母为“M”的员工信息
select * from emp where ename like '_M%';

–"_"(下划线)用于表示一个字符
–"%"(百分号)用于表示0个或多个字符

–16查询所有员工姓名的前3个字符
select substr(ename, 0, 3) from emp;
–substr函数
–格式1： substr(string string, int a, int b); //string 字符串，从a位开始截取，截取长度b
–格式2：substr(string string, int a) ; //string 字符串，截取从第a位开始后面所有字符

–17查询所有员工的姓名，如果包含字母“S”，则用“s”替换
select replace('S','s') from emp;
–UPPER();全部转换为大写
–LOWER();全部转换为小写
–INITCAP();首字母大写
–replace(字符串1，字符串2，字符串3)：将串1中所有的串2，替换成串3

–18查询员工的姓名和入职日期，并按入职日期从先到后进行排列
select ename,hiredate from emp order by hiredate;

–19显示所有的姓名、工种、工资和奖金，按工种降序排列，若工种相同则按工资升序排列
select ename,job,sal,nvl(comm,0) from emp order by job desc,sal;

–20显示所有员工的姓名、入职的年份和月份，若入职日期所在的月份排序，若月份相同则按入职的年份排序
select ename,to_char(hiredate,'yyyy'),to_char(hiredate,'mm') from emp order by to_char(hiredate,'mm'),to_char(hiredate,'yyyy');
–extract()函数，截取年year\月month\日day\时timezon_hour\分minute\秒second
–时间间隔extract(day from （t1-t2）)

–21查询在2月份入职的所有员工信息
select * from emp where to_char(hiredate,'mm')='02';

–22查询所有员工入职以来的工作期限，用“年月**日”的形式表示。（不做）

–23查询至少有一个员工的部门信息
select d.deptno,dname,loc from dept d where EXISTS(select count(*) from emp where d.deptno =emp.DEPTNO);

–24查询工资比SMITH员工工资高的所有员工信息
select * from emp where sal>(select sal from emp where ename = 'SMITH');

–25查询所有员工的姓名及其直接上级的姓名
select ename,(select ename from emp e2 where e1.mgr = e2.empno) from emp e1;

–26查询入职日期早于其直接上级领导的所有员工信息
select * from emp e1,emp e2 where (select hiredate from emp e2 where e1.mgr = e2.empno)<e1.hiredate;

–27查询所有部门及其员工信息，包括那些没有员工的部门
select d.deptno,dname,loc,e.* from emp e,dept d where d.deptno = e.deptno;

–28查询所有工种为CLERK的员工的姓名及其部门名称
select e.ename,d.dname from emp e,dept d where e.job = 'CLERK';

–29查询最低工资大于2500的各种工作
select job from emp GROUP BY job having min(sal)>2500;

–31查询最低工资低于2000的部门及其员工信息
select d.*,e.* from dept d,emp e where d.deptno = e.deptno and d.deptno in (select d.DEPTno from dept d,emp e where d.deptno=e.deptno GROUP BY e.deptno having (min(sal)<2000));
–having函数用在group by子句的后面，对分组结果集进行条件筛选。可以使用别名.

–32查询在SALES部门工作的员工的姓名信息
select * from emp e,dept d where e.deptno= d.deptno and d.dname = 'SALES';

–33查询工资高于公司平均工资的所有员工信息
select ename,sal from emp group by  having sal>avg(sal);

–34查询与SMITH员工从事相同工作的所有员工信息
select * from emp where job = (select job from emp where ename = 'SMITH');

–35列出工资等于30号部门中某个员工工资的所有员工的姓名和工资。
select ename,sal from emp where sal in(SELECT sal from emp where deptno = 30);

–36查询工资高于30号部门中工作的所有员工的工资的员工姓名和工资
select ename,sal from emp,dept where sal>(SELECT max(sal) from emp GROUP BY deptno having deptno=30);

–37查询每个部门中的员工数量、平均工资和平均工作年限
select count(*),avg(sal),avg(TO_NUMBER(to_char(hiredate,'yyyy'))) from emp GROUP BY deptno;

–trunc 函数可用于截取日期时间 例：trunc(sysdate,’yyyy’)

–38查询从事同一种工作但不属于同一部门的员工信息
select e1.* from emp e1,emp e2 where e1.job=e2.job and e1.deptno<>e2.deptno;

–39查询各个部门的详细信息以及部门人数、部门平均工资
select d.*,(select count(*) from emp e1 where e1.deptno = d.deptno),(select avg(e2.sal) from emp e2 where e2.deptno = d.deptno) from dept d;

–40查询各种工作的最低工资
select job,min(sal) from emp group by job;

–41查询各个部门中的不同工种的最高工资
select max(sal) from emp group by deptno,job;

–42查询10号部门员工以及领导的信息
select e1.*,e2.* from emp e1,emp e2 where e1.mgr = e2.empno and e1.deptno = 10;

–43查询各个部门的人数及平均工资
select avg(e2.sal) from emp e2 group by e2.deptno;

–44查询工资为某个部门平均工资的员工信息
select e.* from emp e where sal=(select avg(e2.sal) from emp e2 where e2.deptno = e.deptno group by e2.deptno);

–45查询工资高于本部门平均工资的员工的信息
select e.* from emp e where sal>(select avg(e2.sal) from emp e2 where e2.deptno = e.deptno group by e2.deptno);

–46查询工资高于本部门平均工资的员工的信息及其部门的平均工资
select e.*,(select avg(e2.sal) from emp e2 where e2.deptno = e.deptno group by e2.deptno) from emp e where sal>(select avg(e2.sal) from emp e2 where e2.deptno = e.deptno group by e2.deptno);

–47查询工资高于20号部门某个员工工资的员工的信息
select * from emp where sal>(select min(sal) from emp where deptno = 20 group by deptno);

–48统计各个工种的人数与平均工资
select deptno,count(ename),avg(sal) from emp group by deptno;

–49统计每个部门中各个工种的人数与平均工资
select deptno,job,count(ename),avg(sal) from emp group by deptno,job;

–50查询工资、奖金与10号部门某个员工工资、奖金都相同的员工的信息
select e2.* from emp e1,emp e2 where e1.sal = e2.sal and e1.comm = e2.comm and e2.deptno=10; 

–51查询部门人数大于5的部门的员工的信息
select e.* from emp e where e.deptno in (select d.DEPTno from dept d,emp e where d.deptno=e.deptno GROUP BY e.deptno having (count(*)>5));


–52查询所有员工工资都大于1000的部门的信息
select d.* from dept d where d.deptno in (select d.DEPTno from dept d,emp e where d.deptno=e.deptno GROUP BY e.deptno having (min(sal)>1000));

–53查询所有员工工资都大于1000的部门的信息及其员工信息
select d.*,e.* from dept d,emp e where d.deptno = e.deptno and d.deptno in (select d.DEPTno from dept d,emp e where d.deptno=e.deptno GROUP BY e.deptno having (min(sal)>1000));

–54查询所有员工工资都在900~3000之间的部门的信息
select * from dept where deptno in (select d.DEPTno from dept d,emp e where d.deptno=e.deptno GROUP BY e.deptno having (min(sal)>900 and max(sal)>3000));

–55查询所有工资都在900~3000之间的员工所在部门的员工信息
select * from emp where deptno = (select d.DEPTno from dept d,emp e where d.deptno=e.deptno GROUP BY e.deptno having (min(sal)>900 and max(sal)>3000));