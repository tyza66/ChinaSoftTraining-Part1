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