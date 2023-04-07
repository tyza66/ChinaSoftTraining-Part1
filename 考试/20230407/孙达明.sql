--1、选择部门30中的雇员
select * from emp WHERE DEPTNO = 30;　
--2、列出所有办事员的姓名、编号和部门
select e.ename,e.DEPTNO,d.dname from emp e join DEPT d on e.DEPTNO=d.DEPTNO;　
--3、找出佣金高于薪金的雇员
select * FROM emp where comm>sal;
--4、找出佣金高于薪金60%的雇员
select * FROM emp where comm>(sal*0.6);
--5、找出部门10中所有经理和部门20中的所有办事员的详细资料
select * from emp where (DEPTNO=10 and job='MANAGER') or (DEPTNO=20 and job='CLERK');
--6、找出部门10中所有经理、部门20中所有办事员，既不是经理又不是办事员但其薪金>=2000的所有雇员的详细资料
SELECT * from EMP where (job='MANAGER' AND DEPTNO=20) OR (DEPTNO=20 and job='CLERK') OR (job NOT IN('CLERK','MANAGER') AND SAL>=2000);
--7、找出收取佣金的雇员的不同工作
SELECT DISTINCT JOB FROM EMP WHERE COMM IS NULL;
--8、找出不收取佣金或收取的佣金低于100的雇员
SELECT * FROM EMP WHERE (COMM IS NULL) OR (COMM<=100);
--9、找出各月最后一天受雇的所有雇员
SELECT * FROM EMP WHERE HIREDATE = LAST_DAY(HIREDATE);
--10、找出早于25年之前受雇的雇员
SELECT * FROM EMP WHERE MONTHS_BETWEEN(SYSDATE,HIREDATE)>300;
--11、显示只有首字母大写的所有雇员的姓名
SELECT DISTINCT ename FROM emp WHERE ename=INITCAP(ename);
--12、显示正好为6个字符的雇员姓名
SELECT DISTINCT ename FROM emp WHERE LENGTH(ename)=6;
--13、显示不带有'R'的雇员姓名
SELECT DISTINCT ename FROM emp WHERE ENAME not like '%R%';
--14、显示所有雇员的姓名的前三个字符
SELECT DISTINCT SUBSTR(ENAME, 0, 3) FROM emp;
--15、显示所有雇员的姓名，用a替换所有'A'
SELECT DISTINCT REPLACE(ename, a,A) FROM emp;
--16、显示所有雇员的姓名以及满10年服务年限的日期
SELECT DISTINCT ENAME,add_months(hiredate,12*10) 满十年日期 FROM emp;
--17、显示雇员的详细资料，按姓名排序
SELECT * FROM EMP ORDER BY ENAME;
--18、显示雇员姓名，根据其服务年限，将最老的雇员排在最前面
SELECT * FROM EMP ORDER BY HIREDATE;
--19、显示所有雇员的姓名、工作和薪金，按工作的降序顺序排序，而工作相同时按薪金升序
SELECT ename,JOB,SAL FROM EMP ORDER BY job DESC,HIREDATE;
--20、显示所有雇员的姓名和加入公司的年份和月份，按雇员受雇日所在月排序，将最早年份的项目排在最前面
SELECT ename,to_char(hiredate,'yyyy-mm') AS 年月,hiredate FROM emp ORDER BY to_char(hiredate,'mm');
--21、显示在一个月为30天的情况下所有雇员的日薪金
select ename,round(SAL/30) 日薪金 from emp;
--22、找出在（任何年份的）2月受聘的所有雇员
SELECT * FROM emp where TO_CHAR(HIREDATE,'mm')='02';
--23、对于每个雇员，显示其加入公司的天数
SELECT ENAME,ROUND(SYSDATE-HIREDATE) FROM emp;
--24、显示姓名字段的任何位置，包含 "A" 的所有雇员的姓名
SELECT DISTINCT ename FROM emp WHERE ENAME like '%A%';
--25、以年、月和日显示所有雇员的服务年限
SELECT ename,hiredate,trunc(MONTHS_BETWEEN(SYSDATE,hiredate) /12)year,trunc(MOD(MONTHS_BETWEEN(SYSDATE,hiredate),12))months,trunc(SYSDATE - ADD_MONTHS(hiredate,months_between(sysdate,hiredate))) day FROM emp ;

　