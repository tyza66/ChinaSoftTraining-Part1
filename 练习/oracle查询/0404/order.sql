select ename,sal,sal*12 yearpay from emp where yearpay>10000;
--where里面不能用替代的
select ename,sal,sal*12 yearpay from emp where sal*12>10000;
select ename,sal,sal*12 yearpay from emp order by yearpay asc;
select ename,sal,sal*12 yearpay from emp order by yearpay desc;
--排序里面可以别名也可以用计算后的
select ename,lower(ename) lowername,upper(ename) uppername,initcap(ename) initcapname from emp;
select ename,substr(ename,2,2) from emp;
select ename,substr(ename,2) from emp;
SQL> select ename,instr(ename,'A') from emp;
select ename,instr(ename,'A'), instr(ename,'A',2) from emp;
