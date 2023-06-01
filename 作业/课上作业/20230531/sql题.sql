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

alert table student modify(name varchar(30))

select s.name,s.sex from student s where s.sex = '男' and (s.tel like '135%' or s.tel like '136%')

