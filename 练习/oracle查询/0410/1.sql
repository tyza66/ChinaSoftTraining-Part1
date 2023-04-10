select NULLIF(1,2) from dual;
select COALESCE(NULL, null, null, 2) FROM dual;
SELECT DEPTNO,ENAME,SAL,DECODE(DEPTNO, 10,nvl(sal,0)+100,20,nvl(sal,0)+200,30,nvl(sal,0)+300,nvl(sal,0)+1) newsal from emp ORDER BY SAL;
SELECT DEPTNO,ENAME,SAL,DECODE(DEPTNO, 10,nvl(sal,0)+100,20,nvl(sal,0)+200,30,nvl(sal,0)+300,nvl(sal,0)+1) as newsal1,case when depton=10 then nvl(sal,0)+100 when deptno=20 then nvl(sal,0)+200 when deptno=30 then nvl(sal,0)+300 else nvl(sal,0)+1 end as newsal2 from emp ORDER BY SAL;