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

select max(sal) from emp group by deptno;
select ename,sal from emp order by sal desc;

select ename,sal from emp where sal is not null order by sal desc;

select max(sal) from emp where sal is not null group by deptno;

-- 大于最大的
select ename,sal from emp where sal >= all(select max(sal) from emp where sal is not null group by deptno);
-- 大于任意一个
select ename,sal from emp where sal >= any (select max(sal) from emp where sal is not null group by deptno);
-- 小于最小的
select ename,sal from emp where sal <= all (select max(sal) from emp where sal is not null group by deptno);
-- 小于任意一个 就是小于最大的
select ename ,sal from emp where sal< any (select max(sal) from emp where sal is not null group by deptno);

select rownum,ename,sal from emp;

select rownum,ename,sal from emp where rownum<=5;

select rownum,ename from emp where sal is not null order by desc;

select ename,sal from emp where sal is not null order by sal desc;

select rownum,a.* from (select ename,sal from emp where sal is not null order by sal desc) a;

select rownum,a.* from (select ename,sal from emp where sal is not null order by sal desc) a where rownum<=5;

select ename,sal from emp where sal is not null order by sal desc;

select rownum,a.* from (select ename,sal from emp where sal is not null order by sal desc) a;
-- 三层嵌套sql语句 之后使用内层产生的行标进行截取中间部分的一部分字段
select b.rn,b.ename,b.sal from (select rownum rn,a.* from (select ename,sal from emp where sal is not null order by sal desc) a) b where b.rn between 6 and 10;

select rownum,ename,sal from emp;
select rownum,enum,sal from emp where rownum<=5;
-- rownum不能直接产于比较，所以必须用别的办法
select rownum,enum,sal from emp where rownum between 6 and 10;

select * from (select rownum rn,ename,sal from emp) a;
select * from (select rownum rn,ename,sal from emp) a where rn<5;
select * from (select rownum rn,ename,sal from emp) a where rn between 6 and 10;
select * from (select rownum rn,ename,sal from emp) a where rn between 11 and 15;

--关联子查询
select e.ename,e.sal,e.deptno from emp e,(select deptno,avg(sal) avgsal from emp group by deptno) e2 where e.deptno= e2.deptno and e.sal>avgsal;

select e.ename,e.sal,e.deptno from emp e where e.sal>(select avg(sal) avgsal from emp e2 where e.deptno=e2.deptno);

select * from emp where exists (select ename,sal,deptno from emp e2 where e2.sal>4000);
-- 字句存在 条件就满足
select * from emp where exists (select ename,sal,deptno from emp e2 where e2.sal>6000);

select * from dept;
insert into dept values (1,'研发部','nj');
insert into dept values (2,'研发2部',null);
insert into dept values (3,'研发3部');
-- 已经有了 违反唯一约束条件
insert into dept values (1,'研发n部',null);
-- 超出最大精度
insert into dept values (10000,'研发n部',null);
-- 类型不同
insert into dept values ('a','研发n部',null);

insert into emp(empno,ename,sal,hiredate) values(100,'bbb',100,sysdate);

select empno,ename,sal,to_char(hiredate,'yyyy-mm-dd') from emp;

insert into emp(empno,hiredate) values(96,to_date('2021.08-24','yyyy-mm-dd'));

select * from emp;
update emp set ename='史密斯' ,sal=800 where ename = 'SMITH';
rollback;
create table emp2 as select * from emp;
select * from emp2;
-- 两张表合并
merge into emp e using emp2 e2 on (e.empno = e2.empno) when matched then update set e.ename = e2.ename when not matched then insert(e.empno,e.ename) values (e2.empno,e2.ename);