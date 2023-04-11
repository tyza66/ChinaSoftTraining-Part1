select deptno,sum(nvl(sal,0)) from emp GROUP BY deptno;

select
	e.deptno,d.dname,count(*),sum(nvl(e.sal,0)) sumsal
from 
	emp e,	dept d
where 
	e.deptno=d.deptno(+)
group by
	e.deptno,d.dname
having
	sum(nvl(e.sal,0))>10000;
	
select ename,sal from emp where ename = 'ALLEN';

SELECT ename,sal from emp order by sal desc;

select ename,sal from emp where sal>(select sal from emp where ename ='ALLEN');

select ename,sal from emp where deptno = 10;

select sal from emp where ename = 'ALLEN' or ename = 'SMITH';

select ename,sal from emp where sal>all(select sal from emp where ename = 'ALLEN' or ename = 'SMITH');
select ename,sal from emp where sal<=all(select sal from emp where ename = 'ALLEN' or ename = 'SMITH');

select ename,sal from emp where sal in (select max(sal) from emp group by deptno);

