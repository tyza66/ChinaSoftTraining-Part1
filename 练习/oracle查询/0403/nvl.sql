select empno,ename,nvl(comm,0)+100 from emp; 
--如果当第一个参数值为空时自动选择参数2，如果不为空还是参数1
select empno||'giao'||ename from emp;
select * from emp;
SELECT 1+1 from dual;
SELECT DISTINCT * from emp;
SELECT * FROM emp WHERE comm is not null;
SELECT * from emp where DEPTNO^=10;
SELECT * from emp where DEPTNO!=10;
SELECT * from emp where DEPTNO<>10;
SELECT * from emp WHERE ENAME LIKE '%\_%' ESCAPE '\';