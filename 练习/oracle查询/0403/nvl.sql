select empno,ename,nvl(comm,0)+100 from emp;
select empno||'giao'||ename from emp;