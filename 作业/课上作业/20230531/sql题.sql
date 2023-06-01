-- （1）查询ename是Steven的雇员ID，部门名称，所在城市，所属国家。（3分）
select EMPNO 雇员ID,(select DNAME from dept where DEPTNO=e.DEPTNO) 部门名,(SELECT city from "location" WHERE country_id = e.EMPNO) 所在城市,(select country_name from "countries" where region_id = e.DEPTNO) 所属国家 from EMP e where ename = 'Steven'

-- （2）列出某些雇员的姓名和薪资，条件是他们的薪资高于部门编号为50的所有雇员的薪资
select ename 姓名,SAL 薪资 from emp where sal>all(select sal from emp where EMPNO=50) 

-- （3）查询每个部门工资最高且最高工资要大于10000的员工部门ID，姓名和薪水，并按部门ID降序排列
select DEPTNO 部门ID,ENAME 姓名,SAL 薪资 from emp e where sal=(select max(sal) from EMP where deptno = e.deptno GROUP BY DEPTNO) ORDER BY DEPTno desc





create table student(
	id number(6) primary key,
	name VARCHAR2(10),
	age number(3) check(age>1 and age<200),
	tel VARCHAR2(20),
	birth date,
	sex VARCHAR2(10) CHECK(SEX='男' or sex='女')
)
②、修改上述表，将Name列的数据类型改成长度为30的字符串类型（3分）
alert table student modify(name varchar(30))

③、检索电话是135和136开头的男生姓名（3分）
select s.name,s.sex from student s where s.sex = '男' and (s.tel like '135%' or s.tel like '136%')

④、追加一名学生信息，要求生日为2010-01-01,其他数据自拟（3分）
INSERT into student VALUES(1,'小明',18,'132',to_date('2010-01-01','yyyy-mm-dd'),'男')

