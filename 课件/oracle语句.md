## day01:

### 1.txt

```
C:\Users\xikuang>sqlplus scott/tiger@192.168.10.106:1521/orcl

SQL*Plus: Release 11.2.0.1.0 Production on 星期日 3月 12 21:14:30 2023

Copyright (c) 1982, 2010, Oracle.  All rights reserved.


连接到:
Oracle Database 10g Enterprise Edition Release 10.2.0.1.0 - Production
With the Partitioning, OLAP and Data Mining options
SQL>
```



```
C:\Users\xikuang>sqlplus scott/tiger

SQL*Plus: Release 11.2.0.1.0 Production on 星期日 3月 12 21:15:23 2023

Copyright (c) 1982, 2010, Oracle.  All rights reserved.


连接到:
Oracle Database 11g Enterprise Edition Release 11.2.0.1.0 - 64bit Production
With the Partitioning, OLAP, Data Mining and Real Application Testing options
SQL>

```



```
SQL> select ename,sal,hiredate from emp;

ENAME             SAL HIREDATE                                                  
---------- ---------- --------------                                            
SMITH             800 17-12月-80                                                
ALLEN            1600 20-2月 -81                                                
WARD             1250 22-2月 -81                                                
JONES            2975 02-4月 -81                                                
MARTIN           1250 28-9月 -81                                                
BLAKE            2850 01-5月 -81                                                
CLARK            2450 09-6月 -81                                                
SCOTT            3000 19-4月 -87                                                
KING             5000 17-11月-81                                                
TURNER           1500 08-9月 -81                                                
ADAMS            1100 23-5月 -87                                                

ENAME             SAL HIREDATE                                                  
---------- ---------- --------------                                            
JAMES             950 03-12月-81                                                
FORD             3000 03-12月-81                                                
MILLER           1300 23-1月 -82                                                

已选择14行。

SQL> select ename,sal,hiredate from emp where ename='SMITH';

ENAME             SAL HIREDATE                                                  
---------- ---------- --------------                                            
SMITH             800 17-12月-80                                                





```

### 2.txt



```
SQL> select * from emp;

     EMPNO ENAME      JOB              MGR HIREDATE              SAL       COMM 
---------- ---------- --------- ---------- -------------- ---------- ---------- 
    DEPTNO                                                                      
----------                                                                      
      7369 SMITH      CLERK           7902 17-12月-80            800            
        20                                                                      
                                                                                
      7499 ALLEN      SALESMAN        7698 20-2月 -81           1600        300 
        30                                                                      
                                                                                
      7521 WARD       SALESMAN        7698 22-2月 -81           1250        500 
        30                                                                      
                                                                                

     EMPNO ENAME      JOB              MGR HIREDATE              SAL       COMM 
---------- ---------- --------- ---------- -------------- ---------- ---------- 
    DEPTNO                                                                      
----------                                                                      
      7566 JONES      MANAGER         7839 02-4月 -81           2975            
        20                                                                      
                                                                                
      7654 MARTIN     SALESMAN        7698 28-9月 -81           1250       1400 
        30                                                                      
                                                                                
      7698 BLAKE      MANAGER         7839 01-5月 -81           2850            
        30                                                                      
                                                                                

     EMPNO ENAME      JOB              MGR HIREDATE              SAL       COMM 
---------- ---------- --------- ---------- -------------- ---------- ---------- 
    DEPTNO                                                                      
----------                                                                      
      7782 CLARK      MANAGER         7839 09-6月 -81           2450            
        10                                                                      
                                                                                
      7788 SCOTT      ANALYST         7566 19-4月 -87           3000            
        20                                                                      
                                                                                
      7839 KING       PRESIDENT            17-11月-81           5000            
        10                                                                      
                                                                                

     EMPNO ENAME      JOB              MGR HIREDATE              SAL       COMM 
---------- ---------- --------- ---------- -------------- ---------- ---------- 
    DEPTNO                                                                      
----------                                                                      
      7844 TURNER     SALESMAN        7698 08-9月 -81           1500          0 
        30                                                                      
                                                                                
      7876 ADAMS      CLERK           7788 23-5月 -87           1100            
        20                                                                      
                                                                                
      7900 JAMES      CLERK           7698 03-12月-81            950            
        30                                                                      
                                                                                

     EMPNO ENAME      JOB              MGR HIREDATE              SAL       COMM 
---------- ---------- --------- ---------- -------------- ---------- ---------- 
    DEPTNO                                                                      
----------                                                                      
      7902 FORD       ANALYST         7566 03-12月-81           3000            
        20                                                                      
                                                                                
      7934 MILLER     CLERK           7782 23-1月 -82           1300            
        10                                                                      
                                                                                

已选择14行。

SQL> select * from dept;

    DEPTNO DNAME          LOC                                                   
---------- -------------- -------------                                         
        10 ACCOUNTING     NEW YORK                                              
        20 RESEARCH       DALLAS                                                
        30 SALES          CHICAGO                                               
        40 OPERATIONS     BOSTON                                                

SQL> desc dept
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------
 DEPTNO                                    NOT NULL NUMBER(2)
 DNAME                                              VARCHAR2(14)
 LOC                                                VARCHAR2(13)

SQL> select deptno,dname,loc from dept;

    DEPTNO DNAME          LOC                                                   
---------- -------------- -------------                                         
        10 ACCOUNTING     NEW YORK                                              
        20 RESEARCH       DALLAS                                                
        30 SALES          CHICAGO                                               
        40 OPERATIONS     BOSTON                                                

SQL> select ename,sal from emp;

ENAME             SAL                                                           
---------- ----------                                                           
SMITH             800                                                           
ALLEN            1600                                                           
WARD             1250                                                           
JONES            2975                                                           
MARTIN           1250                                                           
BLAKE            2850                                                           
CLARK            2450                                                           
SCOTT            3000                                                           
KING             5000                                                           
TURNER           1500                                                           
ADAMS            1100                                                           

ENAME             SAL                                                           
---------- ----------                                                           
JAMES             950                                                           
FORD             3000                                                           
MILLER           1300                                                           

已选择14行。

SQL> select ename,sal,sal*12 from emp;

ENAME             SAL     SAL*12                                                
---------- ---------- ----------                                                
SMITH             800       9600                                                
ALLEN            1600      19200                                                
WARD             1250      15000                                                
JONES            2975      35700                                                
MARTIN           1250      15000                                                
BLAKE            2850      34200                                                
CLARK            2450      29400                                                
SCOTT            3000      36000                                                
KING             5000      60000                                                
TURNER           1500      18000                                                
ADAMS            1100      13200                                                

ENAME             SAL     SAL*12                                                
---------- ---------- ----------                                                
JAMES             950      11400                                                
FORD             3000      36000                                                
MILLER           1300      15600                                                

已选择14行。

SQL> select ename,sal,sal*12 yearpay from emp;

ENAME             SAL    YEARPAY                                                
---------- ---------- ----------                                                
SMITH             800       9600                                                
ALLEN            1600      19200                                                
WARD             1250      15000                                                
JONES            2975      35700                                                
MARTIN           1250      15000                                                
BLAKE            2850      34200                                                
CLARK            2450      29400                                                
SCOTT            3000      36000                                                
KING             5000      60000                                                
TURNER           1500      18000                                                
ADAMS            1100      13200                                                

ENAME             SAL    YEARPAY                                                
---------- ---------- ----------                                                
JAMES             950      11400                                                
FORD             3000      36000                                                
MILLER           1300      15600                                                

已选择14行。

SQL> select ename,sal,sal*12 as yearpay from emp;

ENAME             SAL    YEARPAY                                                
---------- ---------- ----------                                                
SMITH             800       9600                                                
ALLEN            1600      19200                                                
WARD             1250      15000                                                
JONES            2975      35700                                                
MARTIN           1250      15000                                                
BLAKE            2850      34200                                                
CLARK            2450      29400                                                
SCOTT            3000      36000                                                
KING             5000      60000                                                
TURNER           1500      18000                                                
ADAMS            1100      13200                                                

ENAME             SAL    YEARPAY                                                
---------- ---------- ----------                                                
JAMES             950      11400                                                
FORD             3000      36000                                                
MILLER           1300      15600                                                

已选择14行。

SQL> select ename,sal salary,sal*12 yearpay from emp;

ENAME          SALARY    YEARPAY                                                
---------- ---------- ----------                                                
SMITH             800       9600                                                
ALLEN            1600      19200                                                
WARD             1250      15000                                                
JONES            2975      35700                                                
MARTIN           1250      15000                                                
BLAKE            2850      34200                                                
CLARK            2450      29400                                                
SCOTT            3000      36000                                                
KING             5000      60000                                                
TURNER           1500      18000                                                
ADAMS            1100      13200                                                

ENAME          SALARY    YEARPAY                                                
---------- ---------- ----------                                                
JAMES             950      11400                                                
FORD             3000      36000                                                
MILLER           1300      15600                                                

已选择14行。
sele
```

### 3.txt

```
SQL> select deptno,ename from emp;

    DEPTNO ENAME                                                                
---------- ----------                                                           
        20 SMITH                                                                
        30 ALLEN                                                                
        30 WARD                                                                 
        20 JONES                                                                
        30 MARTIN                                                               
        30 BLAKE                                                                
        10 CLARK                                                                
        20 SCOTT                                                                
        10 KING                                                                 
        30 TURNER                                                               
        20 ADAMS                                                                

    DEPTNO ENAME                                                                
---------- ----------                                                           
        30 JAMES                                                                
        20 FORD                                                                 
        10 MILLER                                                               

已选择14行。

SQL> select deptno from emp;

    DEPTNO                                                                      
----------                                                                      
        20                                                                      
        30                                                                      
        30                                                                      
        20                                                                      
        30                                                                      
        30                                                                      
        10                                                                      
        20                                                                      
        10                                                                      
        30                                                                      
        20                                                                      

    DEPTNO                                                                      
----------                                                                      
        30                                                                      
        20                                                                      
        10                                                                      

已选择14行。

SQL> select distinct deptno from emp;

    DEPTNO                                                                      
----------                                                                      
        30                                                                      
        20                                                                      
        10                                                                      

SQL> select distinct deptno,ENAME from emp;

    DEPTNO ENAME                                                                
---------- ----------                                                           
        20 JONES                                                                
        30 WARD                                                                 
        20 SCOTT                                                                
        10 KING                                                                 
        30 JAMES                                                                
        30 ALLEN                                                                
        30 MARTIN                                                               
        30 BLAKE                                                                
        20 FORD                                                                 
        20 SMITH                                                                
        20 ADAMS                                                                

    DEPTNO ENAME                                                                
---------- ----------                                                           
        10 MILLER                                                               
        10 CLARK                                                                
        30 TURNER                                                               

已选择14行。

SQL> select distinct deptno,ENAME from emp;

    DEPTNO ENAME                                                                
---------- ----------                                                           
        20 JONES                                                                
        30 WARD                                                                 
        20 SCOTT                                                                
        10 KING                                                                 
        30 JAMES                                                                
        30 ALLEN                                                                
        30 MARTIN                                                               
        30 BLAKE                                                                
        20 FORD                                                                 
        20 SMITH                                                                
        20 ADAMS                                                                

    DEPTNO ENAME                                                                
---------- ----------                                                           
        10 MILLER                                                               
        10 CLARK                                                                
        30 TURNER                                                               

已选择14行。

SQL> select unique deptno,ename from emp;

    DEPTNO ENAME                                                                
---------- ----------                                                           
        20 JONES                                                                
        30 WARD                                                                 
        20 SCOTT                                                                
        10 KING                                                                 
        30 JAMES                                                                
        30 ALLEN                                                                
        30 MARTIN                                                               
        30 BLAKE                                                                
        20 FORD                                                                 
        20 SMITH                                                                
        20 ADAMS                                                                

    DEPTNO ENAME                                                                
---------- ----------                                                           
        10 MILLER                                                               
        10 CLARK                                                                
        30 TURNER                                                               

已选择14行。


```

### 4.txt



```
SQL> host cls

SQL> select 3+3;
select 3+3
         *
第 1 行出现错误: 
ORA-00923: 未找到要求的 FROM 关键字 


SQL> select 3+3 from emp;

       3+3                                                                      
----------                                                                      
         6                                                                      
         6                                                                      
         6                                                                      
         6                                                                      
         6                                                                      
         6                                                                      
         6                                                                      
         6                                                                      
         6                                                                      
         6                                                                      
         6                                                                      

       3+3                                                                      
----------                                                                      
         6                                                                      
         6                                                                      
         6                                                                      
         6                                                                      

已选择15行。

SQL> select 3+3 from dept;

       3+3                                                                      
----------                                                                      
         6                                                                      
         6                                                                      
         6                                                                      
         6                                                                      

SQL> select 3+3 from dual;

       3+3                                                                      
----------                                                                      
         6                                                                      

SQL> show user
USER 为 "SCOTT"
SQL> conn sys/orcl as sysdba
已连接。
SQL> select 3+4 from dual;

       3+4                                                                      
----------                                                                      
         7                                                                      

SQL> conn scott/tiger@192.168.10.106/orcl
已连接。
SQL> conn scott/tiger
已连接。
SQL> select 10/3 from dual;

      10/3                                                                      
----------                                                                      
3.33333333                                                                      

SQL> select 10%3 from dual;
select 10%3 from dual
         *
第 1 行出现错误: 
ORA-00911: 无效字符 


SQL> select mod(10,3) from dual;

 MOD(10,3)                                                                      
----------                                                                      
         1                                                                      

SQL> select 2*3+1 from dual;

     2*3+1                                                                      
----------                                                                      
         7                                                                      

SQL> select 2*(3+1) from dual;

   2*(3+1)                                                                      
----------                                                                      
         8                                                                      

SQL> select ename,sal,comm from emp;

ENAME             SAL       COMM                                                
---------- ---------- ----------                                                
SMITH             800                                                           
ALLEN            1600        300                                                
WARD             1250        500                                                
JONES            2975                                                           
MARTIN           1250       1400                                                
BLAKE            2850                                                           
CLARK            2450                                                           
SCOTT            3000                                                           
KING             5000                                                           
TURNER           1500          0                                                
ADAMS            1100                                                           

ENAME             SAL       COMM                                                
---------- ---------- ----------                                                
JAMES             950                                                           
FORD             3000                                                           
MILLER           1300                                                           
SMITH                                                                           

已选择15行。sle


SQL> select ename,sal,comm,comm+100 from emp;

ENAME             SAL       COMM   COMM+100                                     
---------- ---------- ---------- ----------                                     
SMITH             800                                                           
ALLEN            1600        300        400                                     
WARD             1250        500        600                                     
JONES            2975                                                           
MARTIN           1250       1400       1500                                     
BLAKE            2850                                                           
CLARK            2450                                                           
SCOTT            3000                                                           
KING             5000                                                           
TURNER           1500          0        100                                     
ADAMS            1100                                                           

ENAME             SAL       COMM   COMM+100                                     
---------- ---------- ---------- ----------                                     
JAMES             950                                                           
FORD             3000                                                           
MILLER           1300                                                           
SMITH                                                                           

已选择15行。

SQL> select ename,sal,comm from emp where comm!=null;

未选定行

SQL> select ename,sal,comm from emp where comm is not null;

ENAME             SAL       COMM                                                
---------- ---------- ----------                                                
ALLEN            1600        300                                                
WARD             1250        500                                                
MARTIN           1250       1400                                                
TURNER           1500          0                                                

SQL> select ename,sal,comm from emp where comm is  null;

ENAME             SAL       COMM                                                
---------- ---------- ----------                                                
SMITH             800                                                           
JONES            2975                                                           
BLAKE            2850                                                           
CLARK            2450                                                           
SCOTT            3000                                                           
KING             5000                                                           
ADAMS            1100                                                           
JAMES             950                                                           
FORD             3000                                                           
MILLER           1300                                                           
SMITH                                                                           

已选择11行。

SQL> select ename,sal,comm,nvl(comm,0)+100 from emp;

ENAME             SAL       COMM NVL(COMM,0)+100                                
---------- ---------- ---------- ---------------                                
SMITH             800                        100                                
ALLEN            1600        300             400                                
WARD             1250        500             600                                
JONES            2975                        100                                
MARTIN           1250       1400            1500                                
BLAKE            2850                        100                                
CLARK            2450                        100                                
SCOTT            3000                        100                                
KING             5000                        100                                
TURNER           1500          0             100                                
ADAMS            1100                        100                                

ENAME             SAL       COMM NVL(COMM,0)+100                                
---------- ---------- ---------- ---------------                                
JAMES             950                        100                                
FORD             3000                        100                                
MILLER           1300                        100                                
SMITH                                        100                                

已选择15行。


```

### 5.txt



```
SQL> host cls

SQL> select ename,sal from emp;

ENAME             SAL                                                           
---------- ----------                                                           
SMITH             800                                                           
ALLEN            1600                                                           
WARD             1250                                                           
JONES            2975                                                           
MARTIN           1250                                                           
BLAKE            2850                                                           
CLARK            2450                                                           
SCOTT            3000                                                           
KING             5000                                                           
TURNER           1500                                                           
ADAMS            1100                                                           

ENAME             SAL                                                           
---------- ----------                                                           
JAMES             950                                                           
FORD             3000                                                           
MILLER           1300                                                           
SMITH                                                                           

已选择15行。

SQL> select ename||''s salary is '||sal from emp;
ERROR:
ORA-01756: 引号内的字符串没有正确结束 


SQL> select ename||'''s salary is '||sal from emp;

ENAME||'''SSALARYIS'||SAL                                                       
---------------------------------------------------------------                 
SMITH's salary is 800                                                           
ALLEN's salary is 1600                                                          
WARD's salary is 1250                                                           
JONES's salary is 2975                                                          
MARTIN's salary is 1250                                                         
BLAKE's salary is 2850                                                          
CLARK's salary is 2450                                                          
SCOTT's salary is 3000                                                          
KING's salary is 5000                                                           
TURNER's salary is 1500                                                         
ADAMS's salary is 1100                                                          

ENAME||'''SSALARYIS'||SAL                                                       
---------------------------------------------------------------                 
JAMES's salary is 950                                                           
FORD's salary is 3000                                                           
MILLER's salary is 1300                                                         
SMITH's salary is                                                               

已选择15行。

SQL> select ename+sal from emp;
select ename+sal from emp
       *
第 1 行出现错误: 
ORA-01722: 无效数字 


SQL> select concat(concat(ename,'''s salary is '),sal) from emp;

CONCAT(CONCAT(ENAME,'''SSALARYIS'),SAL)                                         
---------------------------------------------------------------                 
SMITH's salary is 800                                                           
ALLEN's salary is 1600                                                          
WARD's salary is 1250                                                           
JONES's salary is 2975                                                          
MARTIN's salary is 1250                                                         
BLAKE's salary is 2850                                                          
CLARK's salary is 2450                                                          
SCOTT's salary is 3000                                                          
KING's salary is 5000                                                           
TURNER's salary is 1500                                                         
ADAMS's salary is 1100                                                          

CONCAT(CONCAT(ENAME,'''SSALARYIS'),SAL)                                         
---------------------------------------------------------------                 
JAMES's salary is 950                                                           
FORD's salary is 3000                                                           
MILLER's salary is 1300                                                         
SMITH's salary is                                                               

已选择15行。

SQL> select deptno,ename from emp where deptno=10;

    DEPTNO ENAME                                                                
---------- ----------                                                           
        10 CLARK                                                                
        10 KING                                                                 
        10 MILLER                                                               

SQL> select deptno,ename from emp where deptno>10;

    DEPTNO ENAME                                                                
---------- ----------                                                           
        20 SMITH                                                                
        30 ALLEN                                                                
        30 WARD                                                                 
        20 JONES                                                                
        30 MARTIN                                                               
        30 BLAKE                                                                
        20 SCOTT                                                                
        30 TURNER                                                               
        20 ADAMS                                                                
        30 JAMES                                                                
        20 FORD                                                                 

    DEPTNO ENAME                                                                
---------- ----------                                                           
        20 SMITH                                                                

已选择12行。

SQL> select deptno,ename from emp where deptno>=10;

    DEPTNO ENAME                                                                
---------- ----------                                                           
        20 SMITH                                                                
        30 ALLEN                                                                
        30 WARD                                                                 
        20 JONES                                                                
        30 MARTIN                                                               
        30 BLAKE                                                                
        10 CLARK                                                                
        20 SCOTT                                                                
        10 KING                                                                 
        30 TURNER                                                               
        20 ADAMS                                                                

    DEPTNO ENAME                                                                
---------- ----------                                                           
        30 JAMES                                                                
        20 FORD                                                                 
        10 MILLER                                                               
        20 SMITH                                                                

已选择15行。

SQL> select deptno,ename from emp where deptno!=10;

    DEPTNO ENAME                                                                
---------- ----------                                                           
        20 SMITH                                                                
        30 ALLEN                                                                
        30 WARD                                                                 
        20 JONES                                                                
        30 MARTIN                                                               
        30 BLAKE                                                                
        20 SCOTT                                                                
        30 TURNER                                                               
        20 ADAMS                                                                
        30 JAMES                                                                
        20 FORD                                                                 

    DEPTNO ENAME                                                                
---------- ----------                                                           
        20 SMITH                                                                

已选择12行。

SQL> select deptno,ename from emp where deptno<>10;

    DEPTNO ENAME                                                                
---------- ----------                                                           
        20 SMITH                                                                
        30 ALLEN                                                                
        30 WARD                                                                 
        20 JONES                                                                
        30 MARTIN                                                               
        30 BLAKE                                                                
        20 SCOTT                                                                
        30 TURNER                                                               
        20 ADAMS                                                                
        30 JAMES                                                                
        20 FORD                                                                 

    DEPTNO ENAME                                                                
---------- ----------                                                           
        20 SMITH                                                                

已选择12行。

SQL> select deptno,ename from emp where deptno^=10;

    DEPTNO ENAME                                                                
---------- ----------                                                           
        20 SMITH                                                                
        30 ALLEN                                                                
        30 WARD                                                                 
        20 JONES                                                                
        30 MARTIN                                                               
        30 BLAKE                                                                
        20 SCOTT                                                                
        30 TURNER                                                               
        20 ADAMS                                                                
        30 JAMES                                                                
        20 FORD                                                                 

    DEPTNO ENAME                                                                
---------- ----------                                                           
        20 SMITH                                                                

已选择12行。

SQL> select ename,sal from emp where sal between 1000 and 3000;

ENAME             SAL                                                           
---------- ----------                                                           
ALLEN            1600                                                           
WARD             1250                                                           
JONES            2975                                                           
MARTIN           1250                                                           
BLAKE            2850                                                           
CLARK            2450                                                           
SCOTT            3000                                                           
TURNER           1500                                                           
ADAMS            1100                                                           
FORD             3000                                                           
MILLER           1300                                                           

已选择11行。

SQL> select ename,sal from emp where sal>=1000 and sal<=3000;

ENAME             SAL                                                           
---------- ----------                                                           
ALLEN            1600                                                           
WARD             1250                                                           
JONES            2975                                                           
MARTIN           1250                                                           
BLAKE            2850                                                           
CLARK            2450                                                           
SCOTT            3000                                                           
TURNER           1500                                                           
ADAMS            1100                                                           
FORD             3000                                                           
MILLER           1300                                                           

已选择11行。

SQL> select ename,sal from emp where sal between 3000 and 1000;

未选定行

SQL> select ename,sal from emp where sal in (1000,2000,3000,4000);

ENAME             SAL                                                           
---------- ----------                                                           
SCOTT            3000                                                           
FORD             3000                                                           

SQL> select ename,sal from emp where sal =1000 or sal=2000 or sal=3000 or sal=4000;

ENAME             SAL                                                           
---------- ----------                                                           
SCOTT            3000                                                           
FORD             3000                                                           

SQL> select ename from emp where ename='A';

未选定行

SQL> select ename from emp where ename like 'A';

未选定行

SQL> select ename from emp where ename like '%A%';

ENAME                                                                           
----------                                                                      
ALLEN                                                                           
WARD                                                                            
MARTIN                                                                          
BLAKE                                                                           
CLARK                                                                           
ADAMS                                                                           
JAMES                                                                           

已选择7行。

SQL> select ename from emp where ename not like '%A%';

ENAME                                                                           
----------                                                                      
SMITH                                                                           
JONES                                                                           
SCOTT                                                                           
KING                                                                            
TURNER                                                                          
FORD                                                                            
MILLER                                                                          
SMITH                                                                           

已选择8行。

SQL> select ename from emp where ename like '_A%';

ENAME                                                                           
----------                                                                      
WARD                                                                            
MARTIN                                                                          
JAMES                                                                           

SQL> SELECT ename from emp where ename like '%_%';

ENAME                                                                           
----------                                                                      
SM_TH                                                                           
ALLEN                                                                           
WARD                                                                            
JONES                                                                           
MARTIN                                                                          
BLAKE                                                                           
CLARK                                                                           
SCOTT                                                                           
KING                                                                            
TURNER                                                                          
ADAMS                                                                           

ENAME                                                                           
----------                                                                      
JAMES                                                                           
FORD                                                                            
MILLER                                                                          
SM_TH                                                                           

已选择15行。

SQL> SELECT ename from emp where ename like '%\_%' escape '\';

ENAME                                                                           
----------                                                                      
SM_TH                                                                           
SM_TH                                                                           

SQL> select ename,sal from emp where sal in(1000,2000,3000);

ENAME             SAL                                                           
---------- ----------                                                           
SCOTT            3000                                                           
FORD             3000                                                           

SQL> select ename,sal from emp where sal in(1000,2000,3000,null);

ENAME             SAL                                                           
---------- ----------                                                           
SCOTT            3000                                                           
FORD             3000                                                           

SQL> select ename,sal from emp where sal not in(1000,2000,3000);

ENAME             SAL                                                           
---------- ----------                                                           
SM_TH             800                                                           
ALLEN            1600                                                           
WARD             1250                                                           
JONES            2975                                                           
MARTIN           1250                                                           
BLAKE            2850                                                           
CLARK            2450                                                           
KING             5000                                                           
TURNER           1500                                                           
ADAMS            1100                                                           
JAMES             950                                                           

ENAME             SAL                                                           
---------- ----------                                                           
MILLER           1300                                                           

已选择12行。

SQL> select ename,sal from emp where sal not in(1000,2000,3000,null);

未选定行

SQL> select deptno,ename,sal from emp where deptno=10 and sal>3000;

    DEPTNO ENAME             SAL                                                
---------- ---------- ----------                                                
        10 KING             5000                                                

SQL> select ename,sal from emp;

ENAME             SAL                                                           
---------- ----------                                                           
SM_TH             800                                                           
ALLEN            1600                                                           
WARD             1250                                                           
JONES            2975                                                           
MARTIN           1250                                                           
BLAKE            2850                                                           
CLARK            2450                                                           
SCOTT            3000                                                           
KING             5000                                                           
TURNER           1500                                                           
ADAMS            1100                                                           

ENAME             SAL                                                           
---------- ----------                                                           
JAMES             950                                                           
FORD             3000                                                           
MILLER           1300                                                           
SM_TH                                                                           

已选择15行。

SQL> select ename,sal from emp order by sal asc;

ENAME             SAL                                                           
---------- ----------                                                           
SM_TH             800                                                           
JAMES             950                                                           
ADAMS            1100                                                           
WARD             1250                                                           
MARTIN           1250                                                           
MILLER           1300                                                           
TURNER           1500                                                           
ALLEN            1600                                                           
CLARK            2450                                                           
BLAKE            2850                                                           
JONES            2975                                                           

ENAME             SAL                                                           
---------- ----------                                                           
FORD             3000                                                           
SCOTT            3000                                                           
KING             5000                                                           
SM_TH                                                                           

已选择15行。

SQL> select ename,sal from emp where sal is not null order by sal asc;

ENAME             SAL                                                           
---------- ----------                                                           
SM_TH             800                                                           
JAMES             950                                                           
ADAMS            1100                                                           
WARD             1250                                                           
MARTIN           1250                                                           
MILLER           1300                                                           
TURNER           1500                                                           
ALLEN            1600                                                           
CLARK            2450                                                           
BLAKE            2850                                                           
JONES            2975                                                           

ENAME             SAL                                                           
---------- ----------                                                           
SCOTT            3000                                                           
FORD             3000                                                           
KING             5000                                                           

已选择14行。

SQL> select ename,sal from emp where sal is not null order by sal desc;

ENAME             SAL                                                           
---------- ----------                                                           
KING             5000                                                           
FORD             3000                                                           
SCOTT            3000                                                           
JONES            2975                                                           
BLAKE            2850                                                           
CLARK            2450                                                           
ALLEN            1600                                                           
TURNER           1500                                                           
MILLER           1300                                                           
WARD             1250                                                           
MARTIN           1250                                                           

ENAME             SAL                                                           
---------- ----------                                                           
ADAMS            1100                                                           
JAMES             950                                                           
SM_TH             800                                                           

已选择14行。

SQL> select ename,sal from emp where sal is not null order by sal desc,ename desc;

ENAME             SAL                                                           
---------- ----------                                                           
KING             5000                                                           
SCOTT            3000                                                           
FORD             3000                                                           
JONES            2975                                                           
BLAKE            2850                                                           
CLARK            2450                                                           
ALLEN            1600                                                           
TURNER           1500                                                           
MILLER           1300                                                           
WARD             1250                                                           
MARTIN           1250                                                           

ENAME             SAL                                                           
---------- ----------                                                           
ADAMS            1100                                                           
JAMES             950                                                           
SM_TH             800                                                           

已选择14行。

SQL> select ename,sal,sal*12 yearpay from emp where yearpay>10000;
select ename,sal,sal*12 yearpay from emp where yearpay>10000
                                               *
第 1 行出现错误: 
ORA-00904: "YEARPAY": 标识符无效 


SQL> select ename,sal,sal*12 yearpay from emp where sal*12>10000;

ENAME             SAL    YEARPAY                                                
---------- ---------- ----------                                                
ALLEN            1600      19200                                                
WARD             1250      15000                                                
JONES            2975      35700                                                
MARTIN           1250      15000                                                
BLAKE            2850      34200                                                
CLARK            2450      29400                                                
SCOTT            3000      36000                                                
KING             5000      60000                                                
TURNER           1500      18000                                                
ADAMS            1100      13200                                                
JAMES             950      11400                                                

ENAME             SAL    YEARPAY                                                
---------- ---------- ----------                                                
FORD             3000      36000                                                
MILLER           1300      15600                                                

已选择13行。

SQL> select ename,sal,sal*12 yearpay from emp order by yearpay desc;

ENAME             SAL    YEARPAY                                                
---------- ---------- ----------                                                
SM_TH                                                                           
KING             5000      60000                                                
FORD             3000      36000                                                
SCOTT            3000      36000                                                
JONES            2975      35700                                                
BLAKE            2850      34200                                                
CLARK            2450      29400                                                
ALLEN            1600      19200                                                
TURNER           1500      18000                                                
MILLER           1300      15600                                                
WARD             1250      15000                                                

ENAME             SAL    YEARPAY                                                
---------- ---------- ----------                                                
MARTIN           1250      15000                                                
ADAMS            1100      13200                                                
JAMES             950      11400                                                
SM_TH             800       9600                                                

已选择15行。



```



## day02



### 1.txt

```
SQL> select mod(10,3) from dual;

 MOD(10,3)                                                                      
----------                                                                      
         1                                                                      

SQL> select mod(10,3),mod(25,4) from dual;

 MOD(10,3)  MOD(25,4)                                                           
---------- ----------                                                           
         1          1                                                           

SQL> select mod(10,3) from dept;

 MOD(10,3)                                                                      
----------                                                                      
         1                                                                      
         1                                                                      
         1                                                                      
         1                                                                      

SQL> select ename from emp;

ENAME                                                                           
----------                                                                      
张三                                                                            
张三                                                                            
张三                                                                            
SM_TH                                                                           
ALLEN                                                                           
WARD                                                                            
JONES                                                                           
MARTIN                                                                          
BLAKE                                                                           
CLARK                                                                           
SCOTT                                                                           

ENAME                                                                           
----------                                                                      
KING                                                                            
TURNER                                                                          
ADAMS                                                                           
JAMES                                                                           
FORD                                                                            
MILLER                                                                          
SM_TH                                                                           

已选择18行。

SQL> select ename,lower(ename) from emp;

ENAME      LOWER(ENAM                                                           
---------- ----------                                                           
张三       张三                                                                 
张三       张三                                                                 
张三       张三                                                                 
SM_TH      sm_th                                                                
ALLEN      allen                                                                
WARD       ward                                                                 
JONES      jones                                                                
MARTIN     martin                                                               
BLAKE      blake                                                                
CLARK      clark                                                                
SCOTT      scott                                                                

ENAME      LOWER(ENAM                                                           
---------- ----------                                                           
KING       king                                                                 
TURNER     turner                                                               
ADAMS      adams                                                                
JAMES      james                                                                
FORD       ford                                                                 
MILLER     miller                                                               
SM_TH      sm_th                                                                

已选择18行。

SQL> select ename,lower(ename) lowername,upper(ename) uppername,initcap(ename) initcapname from emp;

ENAME      LOWERNAME  UPPERNAME  INITCAPNAM                                     
---------- ---------- ---------- ----------                                     
张三       张三       张三       张三                                           
张三       张三       张三       张三                                           
张三       张三       张三       张三                                           
SM_TH      sm_th      SM_TH      Sm_Th                                          
ALLEN      allen      ALLEN      Allen                                          
WARD       ward       WARD       Ward                                           
JONES      jones      JONES      Jones                                          
MARTIN     martin     MARTIN     Martin                                         
BLAKE      blake      BLAKE      Blake                                          
CLARK      clark      CLARK      Clark                                          
SCOTT      scott      SCOTT      Scott                                          

ENAME      LOWERNAME  UPPERNAME  INITCAPNAM                                     
---------- ---------- ---------- ----------                                     
KING       king       KING       King                                           
TURNER     turner     TURNER     Turner                                         
ADAMS      adams      ADAMS      Adams                                          
JAMES      james      JAMES      James                                          
FORD       ford       FORD       Ford                                           
MILLER     miller     MILLER     Miller                                         
SM_TH      sm_th      SM_TH      Sm_Th                                          

已选择18行。


```



### 2.txt



```
SQL> select ename||'的工资加提成是'||sal+comm from emp;
select ename||'的工资加提成是'||sal+comm from emp
                               *
第 1 行出现错误: 
ORA-01722: 无效数字 


SQL> select ename||'的工资加提成是'||(sal+comm) from emp;

ENAME||'的工资加提成是'||(SAL+COMM)                                             
----------------------------------------------------------------                
张三的工资加提成是                                                              
张三的工资加提成是                                                              
张三的工资加提成是                                                              
SM_TH的工资加提成是                                                             
ALLEN的工资加提成是1900                                                         
WARD的工资加提成是1750                                                          
JONES的工资加提成是                                                             
MARTIN的工资加提成是2650                                                        
BLAKE的工资加提成是                                                             
CLARK的工资加提成是                                                             
SCOTT的工资加提成是                                                             

ENAME||'的工资加提成是'||(SAL+COMM)                                             
----------------------------------------------------------------                
KING的工资加提成是                                                              
TURNER的工资加提成是1500                                                        
ADAMS的工资加提成是                                                             
JAMES的工资加提成是                                                             
FORD的工资加提成是                                                              
MILLER的工资加提成是                                                            
SM_TH的工资加提成是                                                             

已选择18行。

SQL> select ename||'的工资加提成是'||(sal+nvl(comm,0)) from emp;

ENAME||'的工资加提成是'||(SAL+NVL(COMM,0))                                      
----------------------------------------------------------------                
张三的工资加提成是                                                              
张三的工资加提成是                                                              
张三的工资加提成是                                                              
SM_TH的工资加提成是800                                                          
ALLEN的工资加提成是1900                                                         
WARD的工资加提成是1750                                                          
JONES的工资加提成是2975                                                         
MARTIN的工资加提成是2650                                                        
BLAKE的工资加提成是2850                                                         
CLARK的工资加提成是2450                                                         
SCOTT的工资加提成是3000                                                         

ENAME||'的工资加提成是'||(SAL+NVL(COMM,0))                                      
----------------------------------------------------------------                
KING的工资加提成是5000                                                          
TURNER的工资加提成是1500                                                        
ADAMS的工资加提成是1100                                                         
JAMES的工资加提成是950                                                          
FORD的工资加提成是3000                                                          
MILLER的工资加提成是1300                                                        
SM_TH的工资加提成是                                                             

已选择18行。

SQL> select concat(ename,concat('的工资加提成是',sal+nvl(comm,0))) from emp;

CONCAT(ENAME,CONCAT('的工资加提成是',SAL+NVL(COMM,0)))                          
----------------------------------------------------------------                
张三的工资加提成是                                                              
张三的工资加提成是                                                              
张三的工资加提成是                                                              
SM_TH的工资加提成是800                                                          
ALLEN的工资加提成是1900                                                         
WARD的工资加提成是1750                                                          
JONES的工资加提成是2975                                                         
MARTIN的工资加提成是2650                                                        
BLAKE的工资加提成是2850                                                         
CLARK的工资加提成是2450                                                         
SCOTT的工资加提成是3000                                                         

CONCAT(ENAME,CONCAT('的工资加提成是',SAL+NVL(COMM,0)))                          
----------------------------------------------------------------                
KING的工资加提成是5000                                                          
TURNER的工资加提成是1500                                                        
ADAMS的工资加提成是1100                                                         
JAMES的工资加提成是950                                                          
FORD的工资加提成是3000                                                          
MILLER的工资加提成是1300                                                        
SM_TH的工资加提成是                                                             

已选择18行。

SQL> select concat(ename,concat('的工资加提成是',sal+nvl(comm,0)) from emp;
select concat(ename,concat('的工资加提成是',sal+nvl(comm,0)) from emp
                                                             *
第 1 行出现错误: 
ORA-00907: 缺失右括号 



SQL> edit
已写入 file afiedt.buf

  1* run
SQL> run
  1* select concat(ename,concat('的工资加提成是',sal+nvl(comm,0))) from emp

CONCAT(ENAME,CONCAT('的工资加提成是',SAL+NVL(COMM,0)))                          
----------------------------------------------------------------                
张三的工资加提成是                                                              
张三的工资加提成是                                                              
张三的工资加提成是                                                              
SM_TH的工资加提成是800                                                          
ALLEN的工资加提成是1900                                                         
WARD的工资加提成是1750                                                          
JONES的工资加提成是2975                                                         
MARTIN的工资加提成是2650                                                        
BLAKE的工资加提成是2850                                                         
CLARK的工资加提成是2450                                                         
SCOTT的工资加提成是3000                                                         

CONCAT(ENAME,CONCAT('的工资加提成是',SAL+NVL(COMM,0)))                          
----------------------------------------------------------------                
KING的工资加提成是5000                                                          
TURNER的工资加提成是1500                                                        
ADAMS的工资加提成是1100                                                         
JAMES的工资加提成是950                                                          
FORD的工资加提成是3000                                                          
MILLER的工资加提成是1300                                                        
SM_TH的工资加提成是                                                             

已选择18行。



SQL> ed
已写入 file afiedt.buf

  1* select concat(ename,concat('的工资加提成是',sal+nvl(comm,0))) from emp  
SQL> r
  1* select concat(ename,concat('的工资加提成是',sal+nvl(comm,0))) from emp  

CONCAT(ENAME,CONCAT('的工资加提成是',SAL+NVL(COMM,0)))                          
----------------------------------------------------------------                
张三的工资加提成是                                                              
张三的工资加提成是                                                              
张三的工资加提成是                                                              
SM_TH的工资加提成是800                                                          
ALLEN的工资加提成是1900                                                         
WARD的工资加提成是1750                                                          
JONES的工资加提成是2975                                                         
MARTIN的工资加提成是2650                                                        
BLAKE的工资加提成是2850                                                         
CLARK的工资加提成是2450                                                         
SCOTT的工资加提成是3000                                                         

CONCAT(ENAME,CONCAT('的工资加提成是',SAL+NVL(COMM,0)))                          
----------------------------------------------------------------                
KING的工资加提成是5000                                                          
TURNER的工资加提成是1500                                                        
ADAMS的工资加提成是1100                                                         
JAMES的工资加提成是950                                                          
FORD的工资加提成是3000                                                          
MILLER的工资加提成是1300                                                        
SM_TH的工资加提成是                                                             

已选择18行。

SQL> select ename from emp;

ENAME                                                                           
----------                                                                      
张三                                                                            
张三                                                                            
张三                                                                            
SM_TH                                                                           
ALLEN                                                                           
WARD                                                                            
JONES                                                                           
MARTIN                                                                          
BLAKE                                                                           
CLARK                                                                           
SCOTT                                                                           

ENAME                                                                           
----------                                                                      
KING                                                                            
TURNER                                                                          
ADAMS                                                                           
JAMES                                                                           
FORD                                                                            
MILLER                                                                          
SM_TH                                                                           

已选择18行。

SQL> select ename,substr(ename,1,2) from emp;

ENAME      SUBS                                                                 
---------- ----                                                                 
张三       张三                                                                 
张三       张三                                                                 
张三       张三                                                                 
SM_TH      SM                                                                   
ALLEN      AL                                                                   
WARD       WA                                                                   
JONES      JO                                                                   
MARTIN     MA                                                                   
BLAKE      BL                                                                   
CLARK      CL                                                                   
SCOTT      SC                                                                   

ENAME      SUBS                                                                 
---------- ----                                                                 
KING       KI                                                                   
TURNER     TU                                                                   
ADAMS      AD                                                                   
JAMES      JA                                                                   
FORD       FO                                                                   
MILLER     MI                                                                   
SM_TH      SM                                                                   

已选择18行。

SQL> select ename,substr(ename,2,4) from emp;

ENAME      SUBSTR(E                                                             
---------- --------                                                             
张三       三                                                                   
张三       三                                                                   
张三       三                                                                   
SM_TH      M_TH                                                                 
ALLEN      LLEN                                                                 
WARD       ARD                                                                  
JONES      ONES                                                                 
MARTIN     ARTI                                                                 
BLAKE      LAKE                                                                 
CLARK      LARK                                                                 
SCOTT      COTT                                                                 

ENAME      SUBSTR(E                                                             
---------- --------                                                             
KING       ING                                                                  
TURNER     URNE                                                                 
ADAMS      DAMS                                                                 
JAMES      AMES                                                                 
FORD       ORD                                                                  
MILLER     ILLE                                                                 
SM_TH      M_TH                                                                 

已选择18行。

SQL> select ename,substr(ename,2,2) from emp;

ENAME      SUBS                                                                 
---------- ----                                                                 
张三       三                                                                   
张三       三                                                                   
张三       三                                                                   
SM_TH      M_                                                                   
ALLEN      LL                                                                   
WARD       AR                                                                   
JONES      ON                                                                   
MARTIN     AR                                                                   
BLAKE      LA                                                                   
CLARK      LA                                                                   
SCOTT      CO                                                                   

ENAME      SUBS                                                                 
---------- ----                                                                 
KING       IN                                                                   
TURNER     UR                                                                   
ADAMS      DA                                                                   
JAMES      AM                                                                   
FORD       OR                                                                   
MILLER     IL                                                                   
SM_TH      M_                                                                   

已选择18行。

SQL> select ename,substr(ename,2) from emp;

ENAME      SUBSTR(ENAME,2)                                                      
---------- ------------------                                                   
张三       三                                                                   
张三       三                                                                   
张三       三                                                                   
SM_TH      M_TH                                                                 
ALLEN      LLEN                                                                 
WARD       ARD                                                                  
JONES      ONES                                                                 
MARTIN     ARTIN                                                                
BLAKE      LAKE                                                                 
CLARK      LARK                                                                 
SCOTT      COTT                                                                 

ENAME      SUBSTR(ENAME,2)                                                      
---------- ------------------                                                   
KING       ING                                                                  
TURNER     URNER                                                                
ADAMS      DAMS                                                                 
JAMES      AMES                                                                 
FORD       ORD                                                                  
MILLER     ILLER                                                                
SM_TH      M_TH                                                                 

已选择18行。

SQL> select ename,length(ename) from emp;

ENAME      LENGTH(ENAME)                                                        
---------- -------------                                                        
张三                   2                                                        
张三                   2                                                        
张三                   2                                                        
SM_TH                  5                                                        
ALLEN                  5                                                        
WARD                   4                                                        
JONES                  5                                                        
MARTIN                 6                                                        
BLAKE                  5                                                        
CLARK                  5                                                        
SCOTT                  5                                                        

ENAME      LENGTH(ENAME)                                                        
---------- -------------                                                        
KING                   4                                                        
TURNER                 6                                                        
ADAMS                  5                                                        
JAMES                  5                                                        
FORD                   4                                                        
MILLER                 6                                                        
SM_TH                  5                                                        

已选择18行。

SQL> select ename,instr(ename,'A') from emp;

ENAME      INSTR(ENAME,'A')                                                     
---------- ----------------                                                     
张三                      0                                                     
张三                      0                                                     
张三                      0                                                     
SM_TH                     0                                                     
ALLEN                     1                                                     
WARD                      2                                                     
JONES                     0                                                     
MARTIN                    2                                                     
BLAKE                     3                                                     
CLARK                     3                                                     
SCOTT                     0                                                     

ENAME      INSTR(ENAME,'A')                                                     
---------- ----------------                                                     
KING                      0                                                     
TURNER                    0                                                     
ADAMS                     1                                                     
JAMES                     2                                                     
FORD                      0                                                     
MILLER                    0                                                     
SM_TH                     0                                                     

已选择18行。

SQL> select ename,instr(ename,'A'),instr(ename,'A',2) from emp;

ENAME      INSTR(ENAME,'A') INSTR(ENAME,'A',2)                                  
---------- ---------------- ------------------                                  
张三                      0                  0                                  
张三                      0                  0                                  
张三                      0                  0                                  
SM_TH                     0                  0                                  
ALLEN                     1                  0                                  
WARD                      2                  2                                  
JONES                     0                  0                                  
MARTIN                    2                  2                                  
BLAKE                     3                  3                                  
CLARK                     3                  3                                  
SCOTT                     0                  0                                  

ENAME      INSTR(ENAME,'A') INSTR(ENAME,'A',2)                                  
---------- ---------------- ------------------                                  
KING                      0                  0                                  
TURNER                    0                  0                                  
ADAMS                     1                  3                                  
JAMES                     2                  2                                  
FORD                      0                  0                                  
MILLER                    0                  0                                  
SM_TH                     0                  0                                  

已选择18行。

SQL> select ename,instr(ename,'A'),instr(ename,'A',2),instr(ename,'张三') from emp;

ENAME      INSTR(ENAME,'A') INSTR(ENAME,'A',2) INSTR(ENAME,'张三')              
---------- ---------------- ------------------ -------------------              
张三                      0                  0                   1              
张三                      0                  0                   1              
张三                      0                  0                   1              
SM_TH                     0                  0                   0              
ALLEN                     1                  0                   0              
WARD                      2                  2                   0              
JONES                     0                  0                   0              
MARTIN                    2                  2                   0              
BLAKE                     3                  3                   0              
CLARK                     3                  3                   0              
SCOTT                     0                  0                   0              

ENAME      INSTR(ENAME,'A') INSTR(ENAME,'A',2) INSTR(ENAME,'张三')              
---------- ---------------- ------------------ -------------------              
KING                      0                  0                   0              
TURNER                    0                  0                   0              
ADAMS                     1                  3                   0              
JAMES                     2                  2                   0              
FORD                      0                  0                   0              
MILLER                    0                  0                   0              
SM_TH                     0                  0                   0              

已选择18行。

SQL> select length(' abc d  ') from emp;

LENGTH('ABCD')                                                                  
--------------                                                                  
             8                                                                  
             8                                                                  
             8                                                                  
             8                                                                  
             8                                                                  
             8                                                                  
             8                                                                  
             8                                                                  
             8                                                                  
             8                                                                  
             8                                                                  

LENGTH('ABCD')                                                                  
--------------                                                                  
             8                                                                  
             8                                                                  
             8                                                                  
             8                                                                  
             8                                                                  
             8                                                                  
             8                                                                  

已选择18行。

SQL> select length(' abc d  ') from dual;

LENGTH('ABCD')                                                                  
--------------                                                                  
             8                                                                  

SQL> select length(trim(' abc d  ')) from dual;

LENGTH(TRIM('ABCD'))                                                            
--------------------                                                            
                   5                                                            

SQL> select length(ltrim(' abc d  ')) from dual;

LENGTH(LTRIM('ABCD'))                                                           
---------------------                                                           
                    7                                                           

SQL> select length(rtrim(' abc d  ')) from dual;

LENGTH(RTRIM('ABCD'))                                                           
---------------------                                                           
                    6                                                           

SQL> select ename,replace(ename,'A','*') from emp;

ENAME      REPLACE(EN                                                           
---------- ----------                                                           
张三       张三                                                                 
张三       张三                                                                 
张三       张三                                                                 
SM_TH      SM_TH                                                                
ALLEN      *LLEN                                                                
WARD       W*RD                                                                 
JONES      JONES                                                                
MARTIN     M*RTIN                                                               
BLAKE      BL*KE                                                                
CLARK      CL*RK                                                                
SCOTT      SCOTT                                                                

ENAME      REPLACE(EN                                                           
---------- ----------                                                           
KING       KING                                                                 
TURNER     TURNER                                                               
ADAMS      *D*MS                                                                
JAMES      J*MES                                                                
FORD       FORD                                                                 
MILLER     MILLER                                                               
SM_TH      SM_TH                                                                

已选择18行。

SQL> select ename,length(ename) ,lpad(ename,10,'0') from emp;

ENAME      LENGTH(ENAME) LPAD(ENAME,10,'0')                                     
---------- ------------- --------------------                                   
张三                   2 000000张三                                             
张三                   2 000000张三                                             
张三                   2 000000张三                                             
SM_TH                  5 00000SM_TH                                             
ALLEN                  5 00000ALLEN                                             
WARD                   4 000000WARD                                             
JONES                  5 00000JONES                                             
MARTIN                 6 0000MARTIN                                             
BLAKE                  5 00000BLAKE                                             
CLARK                  5 00000CLARK                                             
SCOTT                  5 00000SCOTT                                             

ENAME      LENGTH(ENAME) LPAD(ENAME,10,'0')                                     
---------- ------------- --------------------                                   
KING                   4 000000KING                                             
TURNER                 6 0000TURNER                                             
ADAMS                  5 00000ADAMS                                             
JAMES                  5 00000JAMES                                             
FORD                   4 000000FORD                                             
MILLER                 6 0000MILLER                                             
SM_TH                  5 00000SM_TH                                             

已选择18行。

SQL> select ename,length(ename) ,lpad(ename,10,'0'),rpad(ename,10,'X') from emp;

ENAME      LENGTH(ENAME) LPAD(ENAME,10,'0')   RPAD(ENAME,10,'X')                
---------- ------------- -------------------- --------------------              
张三                   2 000000张三           张三XXXXXX                        
张三                   2 000000张三           张三XXXXXX                        
张三                   2 000000张三           张三XXXXXX                        
SM_TH                  5 00000SM_TH           SM_THXXXXX                        
ALLEN                  5 00000ALLEN           ALLENXXXXX                        
WARD                   4 000000WARD           WARDXXXXXX                        
JONES                  5 00000JONES           JONESXXXXX                        
MARTIN                 6 0000MARTIN           MARTINXXXX                        
BLAKE                  5 00000BLAKE           BLAKEXXXXX                        
CLARK                  5 00000CLARK           CLARKXXXXX                        
SCOTT                  5 00000SCOTT           SCOTTXXXXX                        

ENAME      LENGTH(ENAME) LPAD(ENAME,10,'0')   RPAD(ENAME,10,'X')                
---------- ------------- -------------------- --------------------              
KING                   4 000000KING           KINGXXXXXX                        
TURNER                 6 0000TURNER           TURNERXXXX                        
ADAMS                  5 00000ADAMS           ADAMSXXXXX                        
JAMES                  5 00000JAMES           JAMESXXXXX                        
FORD                   4 000000FORD           FORDXXXXXX                        
MILLER                 6 0000MILLER           MILLERXXXX                        
SM_TH                  5 00000SM_TH           SM_THXXXXX                        

已选择18行。


```



### 3.txt



```

SQL> select 1345.3456 from dual;

 1345.3456                                                                      
----------                                                                      
 1345.3456                                                                      

SQL> select 1345.3456,round(1345.3456) from dual;

 1345.3456 ROUND(1345.3456)                                                     
---------- ----------------                                                     
 1345.3456             1345                                                     

SQL> select 1345.3456,round(1345.5456) from dual;

 1345.3456 ROUND(1345.5456)                                                     
---------- ----------------                                                     
 1345.3456             1346                                                     

SQL> select 1345.3456,round(1345.3456,0) from dual;

 1345.3456 ROUND(1345.3456,0)                                                   
---------- ------------------                                                   
 1345.3456               1345                                                   

SQL> select 1345.3456,round(1345.3456,1) from dual;

 1345.3456 ROUND(1345.3456,1)                                                   
---------- ------------------                                                   
 1345.3456             1345.3                                                   

SQL> select 1345.3456,round(1345.3456,2) from dual;

 1345.3456 ROUND(1345.3456,2)                                                   
---------- ------------------                                                   
 1345.3456            1345.35                                                   

SQL> select 1345.3456,round(1345.3456,-1) from dual;

 1345.3456 ROUND(1345.3456,-1)                                                  
---------- -------------------                                                  
 1345.3456                1350                                                  

SQL> select 1345.3456,trunc(1345.3455) from dual;

 1345.3456 TRUNC(1345.3455)                                                     
---------- ----------------                                                     
 1345.3456             1345                                                     

SQL> select 1345.3456,trunc(1345.6455) from dual;

 1345.3456 TRUNC(1345.6455)                                                     
---------- ----------------                                                     
 1345.3456             1345                                                     

SQL> select 1345.3456,trunc(1345.6455,-2) from dual;

 1345.3456 TRUNC(1345.6455,-2)                                                  
---------- -------------------                                                  
 1345.3456                1300                                                  

SQL> select 1345.3456,trunc(1345.6455,-4) from dual;

 1345.3456 TRUNC(1345.6455,-4)                                                  
---------- -------------------                                                  
 1345.3456                   0                                                  

SQL> select 1345.3456,trunc(1345.6455,-5) from dual;

 1345.3456 TRUNC(1345.6455,-5)                                                  
---------- -------------------                                                  
 1345.3456                   0                                                  



```



### 4.txt

```
SQL> select sysdate from dual;

SYSDATE                                                                         
--------------                                                                  
12-8月 -14                                                                      

SQL> select to_char(sysdate,'yyyy-mm-dd hh:mi:ss') from dual;

TO_CHAR(SYSDATE,'YY                                                             
-------------------                                                             
2014-08-12 11:08:11                                                             

SQL> select to_char(sysdate,'yyyy-MM-dd hh:mi:ss') from dual;

TO_CHAR(SYSDATE,'YY                                                             
-------------------                                                             
2014-08-12 11:08:51                                                             

SQL> select to_char(sysdate,'yyyy-MM-dd hh24:mi:ss') from dual;

TO_CHAR(SYSDATE,'YY                                                             
-------------------                                                             
2014-08-12 11:08:58                                                             

SQL> select sysdate() from dual;
select sysdate() from dual
              *
第 1 行出现错误: 
ORA-00923: 未找到要求的 FROM 关键字 


SQL> select sysdate,add_months(sysdate,-3) from dual;

SYSDATE        ADD_MONTHS(SYS                                                   
-------------- --------------                                                   
12-8月 -14     12-5月 -14                                                       

SQL> select ename,hiredate,months_between(sysdate,hiredate) from emp;

ENAME      HIREDATE       MONTHS_BETWEEN(SYSDATE,HIREDATE)                      
---------- -------------- --------------------------------                      
张三                                                                            
张三                                                                            
张三                                                                            
SM_TH      17-12月-80                           403.853835                      
ALLEN      20-2月 -81                           401.757061                      
WARD       22-2月 -81                           401.692545                      
JONES      02-4月 -81                           400.337706                      
MARTIN     28-9月 -81                           394.498996                      
BLAKE      01-5月 -81                           399.369964                      
CLARK      09-6月 -81                             398.1119                      
SCOTT      19-4月 -87                           327.789319                      

ENAME      HIREDATE       MONTHS_BETWEEN(SYSDATE,HIREDATE)                      
---------- -------------- --------------------------------                      
KING       17-11月-81                           392.853835                      
TURNER     08-9月 -81                           395.144158                      
ADAMS      23-5月 -87                           326.660287                      
JAMES      03-12月-81                           392.305448                      
FORD       03-12月-81                           392.305448                      
MILLER     23-1月 -82                           390.660287                      
SM_TH                                                                           

已选择18行。

SQL> select last_day(sysdate) from dual;

LAST_DAY(SYSDA                                                                  
--------------                                                                  
31-8月 -14                                                                      

SQL> select last_day(sysdate) from dual;

LAST_DAY(SYSDA                                                                  
--------------                                                                  
30-6月 -14                                                                      

SQL> select last_day(sysdate) from dual;

LAST_DAY(SYSDA                                                                  
--------------                                                                  
31-8月 -14                                                                      

SQL> select next_day(sysdate,'星期五') from dual;

NEXT_DAY(SYSDA                                                                  
--------------                                                                  
15-8月 -14                                                                      

SQL> select next_day(sysdate,'星期一') from dual;

NEXT_DAY(SYSDA                                                                  
--------------                                                                  
18-8月 -14                                                                      

SQL> select sysdate from dual;

SYSDATE                                                                         
--------------                                                                  
12-8月 -14                                                                      

SQL> select to_char(sysdate,'yyyy-mm-dd hh:mi:ss') from dual;

TO_CHAR(SYSDATE,'YY                                                             
-------------------                                                             
2014-08-12 11:19:30                                                             

SQL> select to_char(round(sysdate,'day'),'yyyy-mm-dd hh:mi:ss') from dual;

TO_CHAR(ROUND(SYSDA                                                             
-------------------                                                             
2014-08-10 12:00:00                                                             

SQL> select to_char(round(sysdate,'month'),'yyyy-mm-dd hh:mi:ss') from dual;

TO_CHAR(ROUND(SYSDA                                                             
-------------------                                                             
2014-08-01 12:00:00                                                             

SQL> select to_char(round(sysdate,'month'),'yyyy-mm-dd') from dual;

TO_CHAR(RO                                                                      
----------                                                                      
2014-08-01                                                                      

SQL> select sysdate,to_char(round(sysdate,'month'),'yyyy-mm-dd') from dual;

SYSDATE        TO_CHAR(RO                                                       
-------------- ----------                                                       
12-8月 -14     2014-08-01                                                       

SQL> select sysdate,to_char(round(sysdate,'month'),'yyyy-mm-dd') from dual;

SYSDATE        TO_CHAR(RO                                                       
-------------- ----------                                                       
15-8月 -14     2014-08-01                                                       

SQL> select sysdate,to_char(round(sysdate,'month'),'yyyy-mm-dd') from dual;

SYSDATE        TO_CHAR(RO                                                       
-------------- ----------                                                       
16-7月 -14     2014-08-01                                                       

SQL> select sysdate,to_char(round(sysdate,'month'),'yyyy-mm-dd') from dual;

SYSDATE        TO_CHAR(RO                                                       
-------------- ----------                                                       
16-8月 -14     2014-09-01                                                       

SQL> select sysdate,to_char(round(sysdate,'year'),'yyyy-mm-dd') from dual;

SYSDATE        TO_CHAR(RO                                                       
-------------- ----------                                                       
12-8月 -14     2015-01-01                                                       


```



### 5.txt



```
SQL> select trunc(sysdate,'year') from dual;

TRUNC(SYSDATE,
--------------
01-1月 -14

SQL> select add_months(trunc(sysdate,'year'),12) from dual;

ADD_MONTHS(TRU
--------------
01-1月 -15

SQL> select add_months(trunc(sysdate,'year'),12)-trunc(sysdate,'year') from dual
;

ADD_MONTHS(TRUNC(SYSDATE,'YEAR'),12)-TRUNC(SYSDATE,'YEAR')
----------------------------------------------------------
                                                       365

SQL> select '2000/10/10'+1 from dual;
select '2000/10/10'+1 from dual
       *
第 1 行出现错误:
ORA-01722: 无效数字


SQL> select to_date('2000/10/10','yyyy/mm/dd')+1 from dual;

TO_DATE('2000/
--------------
11-10月-00

SQL> select to_char(to_date('2000/10/10','yyyy/mm/dd')+1,'yyyy-mm-dd') from dual
;

TO_CHAR(TO
----------
2000-10-11

SQL> select 12345.88 from dual;

  12345.88
----------
  12345.88

SQL> select to_char(12345.88,'999,999.99') from dual;

TO_CHAR(123
-----------
  12,345.88

SQL> select to_char(12345.88,'L999,999.99') from dual;

TO_CHAR(12345.88,'L99
---------------------
          ￥12,345.88

SQL> select to_char(12345.88,'$999,999.99') from dual;

TO_CHAR(1234
------------
  $12,345.88

SQL> select to_char(12345.88,'$999,999.99') from dual;

TO_CHAR(1234
------------
  $12,345.88

SQL> select to_number('￥12,345.88') from dual;
select to_number('￥12,345.88') from dual
                 *
第 1 行出现错误:
ORA-01722: 无效数字


SQL> select to_number('￥12,345.88','999,999.99') from dual;
select to_number('￥12,345.88','999,999.99') from dual
                 *
第 1 行出现错误:
ORA-01722: 无效数字


SQL> select to_number('￥12,345.88','L999,999.99') from dual;

TO_NUMBER('￥12,345.88','L999,999.99')
--------------------------------------
                              12345.88

SQL> select ename,comm,nvl(comm,0) from emp;

ENAME            COMM NVL(COMM,0)
---------- ---------- -----------
张三                            0
张三                            0
张三                            0
SM_TH                           0
ALLEN             300         300
WARD              500         500
JONES                           0
MARTIN           1400        1400
BLAKE                           0
CLARK                           0
SCOTT                           0

ENAME            COMM NVL(COMM,0)
---------- ---------- -----------
KING                            0
TURNER              0           0
ADAMS                           0
JAMES                           0
FORD                            0
MILLER                          0
SM_TH                           0

已选择18行。

SQL> select ename,comm,nvl(comm,0),nvl2(comm,comm,0) from emp;

ENAME            COMM NVL(COMM,0) NVL2(COMM,COMM,0)
---------- ---------- ----------- -----------------
张三                            0                 0
张三                            0                 0
张三                            0                 0
SM_TH                           0                 0
ALLEN             300         300               300
WARD              500         500               500
JONES                           0                 0
MARTIN           1400        1400              1400
BLAKE                           0                 0
CLARK                           0                 0
SCOTT                           0                 0

ENAME            COMM NVL(COMM,0) NVL2(COMM,COMM,0)
---------- ---------- ----------- -----------------
KING                            0                 0
TURNER              0           0                 0
ADAMS                           0                 0
JAMES                           0                 0
FORD                            0                 0
MILLER                          0                 0
SM_TH                           0                 0

已选择18行。

SQL> select nullif(3,4) from dual;

NULLIF(3,4)
-----------
          3

SQL> select nullif(5,4) from dual;

NULLIF(5,4)
-----------
          5

SQL> select nullif(5,5) from dual;

NULLIF(5,5)
-----------


SQL> select nullif('a','b') from dual;

N
-
a

SQL> select nullif('a','a') from dual;

N
-


-- COALESCE是一个函数， (expression_1, expression_2, ...,expression_n)依次参考各参数表达式，遇到非null值即停止并返回该值。如果所有的表达式都是空值，最终将返回一个空值。使用COALESCE在于大部分包含空值的表达式最终将返回空值。

SQL> select coalesce(null,null,0,null,1) from dual;

COALESCE(NULL,NULL,0,NULL,1)
----------------------------
                           0

SQL> select coalesce(null,null,null,null,1) from dual;

COALESCE(NULL,NULL,NULL,NULL,1)
-------------------------------
                              1

SQL> select coalesce(null,null,null,null,null) from dual;

C
-


SQL> select coalesce(null,null,null,null,null,1,2,3,4,4) from dual;

COALESCE(NULL,NULL,NULL,NULL,NULL,1,2,3,4,4)
--------------------------------------------
                                           1

SQL>
```



### 6.txt



```
SQL> select deptno,ename,sal from emp;

    DEPTNO ENAME             SAL                                                
---------- ---------- ----------                                                
           张三                                                                 
           张三                                                                 
        20 张三                                                                 
        20 SM_TH             800                                                
        30 ALLEN            1600                                                
        30 WARD             1250                                                
        20 JONES            2975                                                
        30 MARTIN           1250                                                
        30 BLAKE            2850                                                
        10 CLARK            2450                                                
        20 SCOTT            3000                                                

    DEPTNO ENAME             SAL                                                
---------- ---------- ----------                                                
        10 KING             5000                                                
        30 TURNER           1500                                                
        20 ADAMS            1100                                                
        30 JAMES             950                                                
        20 FORD             3000                                                
        10 MILLER           1300                                                
        20 SM_TH                                                                

已选择18行。

SQL> select deptno,ename,sal from emp order by deptno
  2  ;

    DEPTNO ENAME             SAL                                                
---------- ---------- ----------                                                
        10 MILLER           1300                                                
        10 CLARK            2450                                                
        10 KING             5000                                                
        20 JONES            2975                                                
        20 张三                                                                 
        20 SM_TH                                                                
        20 FORD             3000                                                
        20 SM_TH             800                                                
        20 ADAMS            1100                                                
        20 SCOTT            3000                                                
        30 JAMES             950                                                

    DEPTNO ENAME             SAL                                                
---------- ---------- ----------                                                
        30 TURNER           1500                                                
        30 MARTIN           1250                                                
        30 WARD             1250                                                
        30 ALLEN            1600                                                
        30 BLAKE            2850                                                
           张三                                                                 
           张三                                                                 

已选择18行。

SQL> edit
已写入 file afiedt.buf

  1  select 
  2  	deptno,ename,sal ,decode(deptno,10,
  3  				nvl(sal,0)+100,
  4  				20,nvl(sal,0)+200,
  5  				30,nvl(sal,0)+300,
  6  				sal+1) newsal
  7  from 
  8  	emp 
  9  order by 
 10* 	deptno
SQL> run
  1  select 
  2  	deptno,ename,sal ,decode(deptno,10,
  3  				nvl(sal,0)+100,
  4  				20,nvl(sal,0)+200,
  5  				30,nvl(sal,0)+300,
  6  				sal+1) newsal
  7  from 
  8  	emp 
  9  order by 
 10* 	deptno

    DEPTNO ENAME             SAL     NEWSAL                                     
---------- ---------- ---------- ----------                                     
        10 MILLER           1300       1400                                     
        10 CLARK            2450       2550                                     
        10 KING             5000       5100                                     
        20 JONES            2975       3175                                     
        20 张三                         200                                     
        20 SM_TH                        200                                     
        20 FORD             3000       3200                                     
        20 SM_TH             800       1000                                     
        20 ADAMS            1100       1300                                     
        20 SCOTT            3000       3200                                     
        30 JAMES             950       1250                                     

    DEPTNO ENAME             SAL     NEWSAL                                     
---------- ---------- ---------- ----------                                     
        30 TURNER           1500       1800                                     
        30 MARTIN           1250       1550                                     
        30 WARD             1250       1550                                     
        30 ALLEN            1600       1900                                     
        30 BLAKE            2850       3150                                     
           张三                                                                 
           张三                                                                 

已选择18行。

SQL> ed
已写入 file afiedt.buf

  1  select 
  2  	deptno,ename,sal ,decode(deptno,10,
  3  				nvl(sal,0)+100,
  4  				20,nvl(sal,0)+200,
  5  				30,nvl(sal,0)+300,
  6  				nvl(sal,0)+1) newsal
  7  from 
  8  	emp 
  9  order by 
 10* 	deptno
SQL> /

    DEPTNO ENAME             SAL     NEWSAL                                     
---------- ---------- ---------- ----------                                     
        10 MILLER           1300       1400                                     
        10 CLARK            2450       2550                                     
        10 KING             5000       5100                                     
        20 JONES            2975       3175                                     
        20 张三                         200                                     
        20 SM_TH                        200                                     
        20 FORD             3000       3200                                     
        20 SM_TH             800       1000                                     
        20 ADAMS            1100       1300                                     
        20 SCOTT            3000       3200                                     
        30 JAMES             950       1250                                     

    DEPTNO ENAME             SAL     NEWSAL                                     
---------- ---------- ---------- ----------                                     
        30 TURNER           1500       1800                                     
        30 MARTIN           1250       1550                                     
        30 WARD             1250       1550                                     
        30 ALLEN            1600       1900                                     
        30 BLAKE            2850       3150                                     
           张三                           1                                     
           张三                           1                                     

已选择18行。

SQL> ed
已写入 file afiedt.buf

  1  select 
  2  	deptno,ename,sal ,decode(deptno,10,
  3  				nvl(sal,0)+100,
  4  				20,nvl(sal,0)+200,
  5  				30,nvl(sal,0)+300,
  6  				nvl(sal,0)+1) newsal,
  7  	case
  8  		when deptno=10 then
  9  			nvl(sal,0)+100
 10  		when deptno=20 then
 11  			nvl(sal,0)+200
 12  		when deptno=30 then
 13  			nvl(sal,0)+300
 14  		else
 15  			nvl(sal,0)+1
 16  	end as newsal2
 17  from 
 18  	emp 
 19  order by 
 20* 	deptno
SQL> /

    DEPTNO ENAME             SAL     NEWSAL    NEWSAL2                          
---------- ---------- ---------- ---------- ----------                          
        10 MILLER           1300       1400       1400                          
        10 CLARK            2450       2550       2550                          
        10 KING             5000       5100       5100                          
        20 JONES            2975       3175       3175                          
        20 张三                         200        200                          
        20 SM_TH                        200        200                          
        20 FORD             3000       3200       3200                          
        20 SM_TH             800       1000       1000                          
        20 ADAMS            1100       1300       1300                          
        20 SCOTT            3000       3200       3200                          
        30 JAMES             950       1250       1250                          

    DEPTNO ENAME             SAL     NEWSAL    NEWSAL2                          
---------- ---------- ---------- ---------- ----------                          
        30 TURNER           1500       1800       1800                          
        30 MARTIN           1250       1550       1550                          
        30 WARD             1250       1550       1550                          
        30 ALLEN            1600       1900       1900                          
        30 BLAKE            2850       3150       3150                          
           张三                           1          1                          
           张三                           1          1                          

已选择18行。

SQL> ed
已写入 file afiedt.buf

  1  select 
  2  	deptno,ename,sal ,decode(deptno,10,
  3  				nvl(sal,0)+100,
  4  				20,nvl(sal,0)+200,
  5  				30,nvl(sal,0)+300,
  6  				nvl(sal,0)+1) newsal,
  7  	case
  8  		when deptno=10 then
  9  			nvl(sal,0)+100
 10  		when deptno=20 then
 11  			nvl(sal,0)+200
 12  		when deptno=30 then
 13  			nvl(sal,0)+300
 14  		else
 15  			nvl(sal,0)+1
 16  	end as newsal2
 17  from 
 18  	emp 
 19  order by 
 20* 	deptno
SQL> edit
已写入 file afiedt.buf

  1  select 
  2  	deptno,ename,sal ,decode(deptno,10,
  3  				nvl(sal,0)+100,
  4  				20,nvl(sal,0)+200,
  5  				30,nvl(sal,0)+300,
  6  				nvl(sal,0)+1) newsal,
  7  	case
  8  		when deptno=10 then
  9  			nvl(sal,0)+100
 10  		when deptno=20 then
 11  			nvl(sal,0)+200
 12  		when deptno=30 then
 13  			nvl(sal,0)+300
 14  		else
 15  			nvl(sal,0)+1
 16  	end as newsal2
 17  from 
 18  	emp 
 19  order by 
 20* 	deptno
SQL> spool off

```



7.txt

```
SQL> select
  2     e.ename,d.dname
  3  from
  4     emp e,dept d
  5  where
  6     e.deptno=d.deptno;

ENAME      DNAME
---------- --------------
SMITH      RESEARCH
ALLEN      SALES
WARD       SALES
JONES      RESEARCH
MARTIN     SALES
BLAKE      SALES
CLARK      ACCOUNTING
SCOTT      RESEARCH
KING       ACCOUNTING
TURNER     SALES
ADAMS      RESEARCH

ENAME      DNAME
---------- --------------
JAMES      SALES
FORD       RESEARCH
MILLER     ACCOUNTING

已选择14行。

SQL> ed
已写入 file afiedt.buf

  1  select
  2     e.ename,d.dname
  3  from
  4*    emp e,dept d
SQL> /

ENAME      DNAME
---------- --------------
SMITH      ACCOUNTING
ALLEN      ACCOUNTING
WARD       ACCOUNTING
JONES      ACCOUNTING
MARTIN     ACCOUNTING
BLAKE      ACCOUNTING
CLARK      ACCOUNTING
SCOTT      ACCOUNTING
KING       ACCOUNTING
TURNER     ACCOUNTING
ADAMS      ACCOUNTING

ENAME      DNAME
---------- --------------
JAMES      ACCOUNTING
FORD       ACCOUNTING
MILLER     ACCOUNTING
SMITH      RESEARCH
ALLEN      RESEARCH
WARD       RESEARCH
JONES      RESEARCH
MARTIN     RESEARCH
BLAKE      RESEARCH
CLARK      RESEARCH
SCOTT      RESEARCH

ENAME      DNAME
---------- --------------
KING       RESEARCH
TURNER     RESEARCH
ADAMS      RESEARCH
JAMES      RESEARCH
FORD       RESEARCH
MILLER     RESEARCH
SMITH      SALES
ALLEN      SALES
WARD       SALES
JONES      SALES
MARTIN     SALES

ENAME      DNAME
---------- --------------
BLAKE      SALES
CLARK      SALES
SCOTT      SALES
KING       SALES
TURNER     SALES
ADAMS      SALES
JAMES      SALES
FORD       SALES
MILLER     SALES
SMITH      OPERATIONS
ALLEN      OPERATIONS

ENAME      DNAME
---------- --------------
WARD       OPERATIONS
JONES      OPERATIONS
MARTIN     OPERATIONS
BLAKE      OPERATIONS
CLARK      OPERATIONS
SCOTT      OPERATIONS
KING       OPERATIONS
TURNER     OPERATIONS
ADAMS      OPERATIONS
JAMES      OPERATIONS
FORD       OPERATIONS

ENAME      DNAME
---------- --------------
MILLER     OPERATIONS

已选择56行。

SQL> select * from salgrade;

     GRADE      LOSAL      HISAL
---------- ---------- ----------
         1        700       1200
         2       1201       1400
         3       1401       2000
         4       2001       3000
         5       3001       9999

SQL> desc salgrade
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------

 GRADE                                              NUMBER
 LOSAL                                              NUMBER
 HISAL                                              NUMBER

SQL> select
  2                                             e.ename,e.sal,s.grade
  3                                     from
  4                                             emp e,salgrade s
  5                                     where
  6                                             e.sal between s.losal and s.hisa
l/
  7
SQL> ed
已写入 file afiedt.buf

  1  select
  2                                             e.ename,e.sal,s.grade
  3                                     from
  4                                             emp e,salgrade s
  5                                     where
  6*                                            e.sal between s.losal and s.hisa
l
SQL> /

ENAME             SAL      GRADE
---------- ---------- ----------
SMITH             800          1
JAMES             950          1
ADAMS            1100          1
WARD             1250          2
MARTIN           1250          2
MILLER           1300          2
TURNER           1500          3
ALLEN            1600          3
CLARK            2450          4
BLAKE            2850          4
JONES            2975          4

ENAME             SAL      GRADE
---------- ---------- ----------
SCOTT            3000          4
FORD             3000          4
KING             5000          5

已选择14行。

```



### 8.txt



```
SQL> ed
已写入 file afiedt.buf

  1  select
  2  	e.ename,e.sal,d.dname,d.loc,s.grade
  3  from
  4  	emp e,dept d,salgrade s
  5  where
  6  	e.deptno=d.deptno
  7  	and
  8* 	e.sal between s.losal and s.hisal
SQL> /

ENAME             SAL DNAME          LOC                GRADE                   
---------- ---------- -------------- ------------- ----------                   
SMITH             800 RESEARCH       DALLAS                 1                   
JAMES             950 SALES          CHICAGO                1                   
ADAMS            1100 RESEARCH       DALLAS                 1                   
WARD             1250 SALES          CHICAGO                2                   
MARTIN           1250 SALES          CHICAGO                2                   
MILLER           1300 ACCOUNTING     NEW YORK               2                   
TURNER           1500 SALES          CHICAGO                3                   
ALLEN            1600 SALES          CHICAGO                3                   
CLARK            2450 ACCOUNTING     NEW YORK               4                   
BLAKE            2850 SALES          CHICAGO                4                   
JONES            2975 RESEARCH       DALLAS                 4                   

ENAME             SAL DNAME          LOC                GRADE                   
---------- ---------- -------------- ------------- ----------                   
SCOTT            3000 RESEARCH       DALLAS                 4                   
FORD             3000 RESEARCH       DALLAS                 4                   
KING             5000 ACCOUNTING     NEW YORK               5                   

已选择14行。



```



### 9.txt



```
SQL> desc emp
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------
 EMPNO                                     NOT NULL NUMBER(4)
 ENAME                                              VARCHAR2(10)
 JOB                                                VARCHAR2(9)
 MGR                                                NUMBER(4)
 HIREDATE                                           DATE
 SAL                                                NUMBER(7,2)
 COMM                                               NUMBER(7,2)
 DEPTNO                                             NUMBER(2)

SQL> select empno,ename,mgr from emp;

     EMPNO ENAME             MGR                                                
---------- ---------- ----------                                                
      7369 SMITH            7902                                                
      7499 ALLEN            7698                                                
      7521 WARD             7698                                                
      7566 JONES            7839                                                
      7654 MARTIN           7698                                                
      7698 BLAKE            7839                                                
      7782 CLARK            7839                                                
      7788 SCOTT            7566                                                
      7839 KING                                                                 
      7844 TURNER           7698                                                
      7876 ADAMS            7788                                                

     EMPNO ENAME             MGR                                                
---------- ---------- ----------                                                
      7900 JAMES            7698                                                
      7902 FORD             7566                                                
      7934 MILLER           7782                                                

已选择14行。

SQL> select empno,ename,sal,mgr from emp;

     EMPNO ENAME             SAL        MGR                                     
---------- ---------- ---------- ----------                                     
      7369 SMITH             800       7902                                     
      7499 ALLEN            1600       7698                                     
      7521 WARD             1250       7698                                     
      7566 JONES            2975       7839                                     
      7654 MARTIN           1250       7698                                     
      7698 BLAKE            2850       7839                                     
      7782 CLARK            2450       7839                                     
      7788 SCOTT            3000       7566                                     
      7839 KING             5000                                                
      7844 TURNER           1500       7698                                     
      7876 ADAMS            1100       7788                                     

     EMPNO ENAME             SAL        MGR                                     
---------- ---------- ---------- ----------                                     
      7900 JAMES             950       7698                                     
      7902 FORD             3000       7566                                     
      7934 MILLER           1300       7782                                     

已选择14行。

SQL> ed
已写入 file afiedt.buf

  1  select 
  2  	e1.empno,e1.ename,e1.sal,e1.mgr,e2.ename 
  3  from 
  4  	emp e1,emp e2
  5  where
  6* 	e1.mgr = e2.empno
  7  /

     EMPNO ENAME             SAL        MGR ENAME                               
---------- ---------- ---------- ---------- ----------                          
      7369 SMITH             800       7902 FORD                                
      7499 ALLEN            1600       7698 BLAKE                               
      7521 WARD             1250       7698 BLAKE                               
      7566 JONES            2975       7839 KING                                
      7654 MARTIN           1250       7698 BLAKE                               
      7698 BLAKE            2850       7839 KING                                
      7782 CLARK            2450       7839 KING                                
      7788 SCOTT            3000       7566 JONES                               
      7844 TURNER           1500       7698 BLAKE                               
      7876 ADAMS            1100       7788 SCOTT                               
      7900 JAMES             950       7698 BLAKE                               

     EMPNO ENAME             SAL        MGR ENAME                               
---------- ---------- ---------- ---------- ----------                          
      7902 FORD             3000       7566 JONES                               
      7934 MILLER           1300       7782 CLARK                               

已选择13行。



```



### 10.txt

```
SQL> host cls

SQL> ed
已写入 file afiedt.buf

  1  select
  2  	d.deptno,d.dname,e.ename
  3  from
  4  	dept d,emp e
  5  where
  6* 	d.deptno=e.deptno
SQL> /

    DEPTNO DNAME          ENAME                                                 
---------- -------------- ----------                                            
        20 RESEARCH       SMITH                                                 
        30 SALES          ALLEN                                                 
        30 SALES          WARD                                                  
        20 RESEARCH       JONES                                                 
        30 SALES          MARTIN                                                
        30 SALES          BLAKE                                                 
        10 ACCOUNTING     CLARK                                                 
        20 RESEARCH       SCOTT                                                 
        10 ACCOUNTING     KING                                                  
        30 SALES          TURNER                                                
        20 RESEARCH       ADAMS                                                 

    DEPTNO DNAME          ENAME                                                 
---------- -------------- ----------                                            
        30 SALES          JAMES                                                 
        20 RESEARCH       FORD                                                  
        10 ACCOUNTING     MILLER                                                

已选择14行。

---------------------------------------------------

SQL> 左外连接：where d.deptno=e.deptno,当条件不成立时，等号左边所代表的表的信息任然被显示

SQL>           写法: where d.deptno=e.deptno(+)

SQL> 右外连接：where d.deptno=e.deptno,当条件不成立时，等号右边所代表的表的信息任然被显示

SQL>            写法：where d.deptno(+)=e.deptno

SQL> 全外连接：where d.deptno=e.deptno,当条件不成立时，等号两边所代表的表的信息任然被显示

SQL>            写法：where d.deptno(+)=e.deptno(+)
-----------------------------------------------------

SQL> ed
已写入 file afiedt.buf

  1  select
  2  	d.deptno,d.dname,e.ename
  3  from
  4  	dept d,emp e
  5  where
  6* 	d.deptno=e.deptno(+)
SQL> /

    DEPTNO DNAME          ENAME                                                 
---------- -------------- ----------                                            
        10 ACCOUNTING     CLARK                                                 
        10 ACCOUNTING     KING                                                  
        10 ACCOUNTING     MILLER                                                
        20 RESEARCH       JONES                                                 
        20 RESEARCH       FORD                                                  
        20 RESEARCH       ADAMS                                                 
        20 RESEARCH       SMITH                                                 
        20 RESEARCH       SCOTT                                                 
        30 SALES          WARD                                                  
        30 SALES          TURNER                                                
        30 SALES          ALLEN                                                 

    DEPTNO DNAME          ENAME                                                 
---------- -------------- ----------                                            
        30 SALES          JAMES                                                 
        30 SALES          BLAKE                                                 
        30 SALES          MARTIN                                                
        40 OPERATIONS                                                           

已选择15行。

SQL> ed
已写入 file afiedt.buf

  1  select
  2  	e.ename,d.dname
  3  from
  4  	emp e,dept d
  5  where
  6* 	e.deptno=d.deptno(+)
SQL> /

ENAME      DNAME                                                                
---------- --------------                                                       
aaa                                                                             
SMITH      RESEARCH                                                             
ALLEN      SALES                                                                
WARD       SALES                                                                
JONES      RESEARCH                                                             
MARTIN     SALES                                                                
BLAKE      SALES                                                                
CLARK      ACCOUNTING                                                           
SCOTT      RESEARCH                                                             
KING       ACCOUNTING                                                           
TURNER     SALES                                                                

ENAME      DNAME                                                                
---------- --------------                                                       
ADAMS      RESEARCH                                                             
JAMES      SALES                                                                
FORD       RESEARCH                                                             
MILLER     ACCOUNTING                                                           

已选择15行。

SQL> ed
已写入 file afiedt.buf

  1  select
  2  	e.ename,d.dname
  3  from
  4  	emp e full outer join dept d
  5* on(e.deptno=d.deptno)
SQL> /

ENAME      DNAME                                                                
---------- --------------                                                       
aaa                                                                             
SMITH      RESEARCH                                                             
ALLEN      SALES                                                                
WARD       SALES                                                                
JONES      RESEARCH                                                             
MARTIN     SALES                                                                
BLAKE      SALES                                                                
CLARK      ACCOUNTING                                                           
SCOTT      RESEARCH                                                             
KING       ACCOUNTING                                                           
TURNER     SALES                                                                

ENAME      DNAME                                                                
---------- --------------                                                       
ADAMS      RESEARCH                                                             
JAMES      SALES                                                                
FORD       RESEARCH                                                             
MILLER     ACCOUNTING                                                           
           OPERATIONS                                                           

已选择16行。

SQL> ed
已写入 file afiedt.buf

  1  select
  2  	e.ename,d.dname
  3  from
  4  	emp e full outer join dept d
  5* on(e.deptno=d.deptno)

```



### 11.txt

```
SQL> host cls

SQL> ed
已写入 file afiedt.buf

  1  select
  2  	e.ename,d.dname
  3  from
  4  	emp e inner join dept d
  5* on(e.deptno=d.deptno)
SQL> /

ENAME      DNAME                                                                
---------- --------------                                                       
SMITH      RESEARCH                                                             
ALLEN      SALES                                                                
WARD       SALES                                                                
JONES      RESEARCH                                                             
MARTIN     SALES                                                                
BLAKE      SALES                                                                
CLARK      ACCOUNTING                                                           
SCOTT      RESEARCH                                                             
KING       ACCOUNTING                                                           
TURNER     SALES                                                                
ADAMS      RESEARCH                                                             

ENAME      DNAME                                                                
---------- --------------                                                       
JAMES      SALES                                                                
FORD       RESEARCH                                                             
MILLER     ACCOUNTING                                                           

已选择14行。

SQL> ed
已写入 file afiedt.buf

  1  select
  2  	e.ename,d.dname
  3  from
  4  	emp e inner join dept d
  5  on(e.deptno=d.deptno)
  6  order by
  7* 	d.dname
SQL> /

ENAME      DNAME                                                                
---------- --------------                                                       
CLARK      ACCOUNTING                                                           
KING       ACCOUNTING                                                           
MILLER     ACCOUNTING                                                           
JONES      RESEARCH                                                             
FORD       RESEARCH                                                             
ADAMS      RESEARCH                                                             
SMITH      RESEARCH                                                             
SCOTT      RESEARCH                                                             
WARD       SALES                                                                
TURNER     SALES                                                                
ALLEN      SALES                                                                

ENAME      DNAME                                                                
---------- --------------                                                       
JAMES      SALES                                                                
BLAKE      SALES                                                                
MARTIN     SALES                                                                

已选择14行。

SQL> ed
已写入 file afiedt.buf

  1  select
  2  	e.ename,d.dname
  3  from
  4  	emp e inner join dept d
  5  using deptno
  6  order by
  7* 	d.dname
SQL> /
using deptno
      *
第 5 行出现错误: 
ORA-00906: 缺失左括号 


SQL> ed
已写入 file afiedt.buf

  1  select
  2  	e.ename,d.dname
  3  from
  4  	emp e inner join dept d
  5  using (deptno)
  6  order by
  7* 	d.dname
SQL> /

ENAME      DNAME                                                                
---------- --------------                                                       
CLARK      ACCOUNTING                                                           
KING       ACCOUNTING                                                           
MILLER     ACCOUNTING                                                           
JONES      RESEARCH                                                             
FORD       RESEARCH                                                             
ADAMS      RESEARCH                                                             
SMITH      RESEARCH                                                             
SCOTT      RESEARCH                                                             
WARD       SALES                                                                
TURNER     SALES                                                                
ALLEN      SALES                                                                

ENAME      DNAME                                                                
---------- --------------                                                       
JAMES      SALES                                                                
BLAKE      SALES                                                                
MARTIN     SALES                                                                

已选择14行。

SQL> ed
已写入 file afiedt.buf

  1  select
  2  	e.ename,d.dname
  3  from
  4  	emp e natural join dept d
  5  order by
  6* 	d.dname
SQL> /

ENAME      DNAME                                                                
---------- --------------                                                       
CLARK      ACCOUNTING                                                           
KING       ACCOUNTING                                                           
MILLER     ACCOUNTING                                                           
JONES      RESEARCH                                                             
FORD       RESEARCH                                                             
ADAMS      RESEARCH                                                             
SMITH      RESEARCH                                                             
SCOTT      RESEARCH                                                             
WARD       SALES                                                                
TURNER     SALES                                                                
ALLEN      SALES                                                                

ENAME      DNAME                                                                
---------- --------------                                                       
JAMES      SALES                                                                
BLAKE      SALES                                                                
MARTIN     SALES                                                                

已选择14行。

SQL> ed
已写入 file afiedt.buf

  1  select
  2  	e.ename,d.dname
  3  from
  4  	emp e cross join dept d
  5  order by
  6* 	d.dname
SQL> /

ENAME      DNAME                                                                
---------- --------------                                                       
aaa        ACCOUNTING                                                           
MILLER     ACCOUNTING                                                           
ALLEN      ACCOUNTING                                                           
WARD       ACCOUNTING                                                           
JONES      ACCOUNTING                                                           
MARTIN     ACCOUNTING                                                           
BLAKE      ACCOUNTING                                                           
CLARK      ACCOUNTING                                                           
SCOTT      ACCOUNTING                                                           
KING       ACCOUNTING                                                           
TURNER     ACCOUNTING                                                           

ENAME      DNAME                                                                
---------- --------------                                                       
ADAMS      ACCOUNTING                                                           
JAMES      ACCOUNTING                                                           
FORD       ACCOUNTING                                                           
SMITH      ACCOUNTING                                                           
FORD       OPERATIONS                                                           
MILLER     OPERATIONS                                                           
JAMES      OPERATIONS                                                           
ADAMS      OPERATIONS                                                           
TURNER     OPERATIONS                                                           
KING       OPERATIONS                                                           
SCOTT      OPERATIONS                                                           

ENAME      DNAME                                                                
---------- --------------                                                       
CLARK      OPERATIONS                                                           
BLAKE      OPERATIONS                                                           
MARTIN     OPERATIONS                                                           
JONES      OPERATIONS                                                           
WARD       OPERATIONS                                                           
ALLEN      OPERATIONS                                                           
SMITH      OPERATIONS                                                           
aaa        OPERATIONS                                                           
SMITH      RESEARCH                                                             
aaa        RESEARCH                                                             
WARD       RESEARCH                                                             

ENAME      DNAME                                                                
---------- --------------                                                       
JONES      RESEARCH                                                             
MARTIN     RESEARCH                                                             
BLAKE      RESEARCH                                                             
CLARK      RESEARCH                                                             
SCOTT      RESEARCH                                                             
KING       RESEARCH                                                             
TURNER     RESEARCH                                                             
ADAMS      RESEARCH                                                             
JAMES      RESEARCH                                                             
FORD       RESEARCH                                                             
MILLER     RESEARCH                                                             

ENAME      DNAME                                                                
---------- --------------                                                       
ALLEN      RESEARCH                                                             
MILLER     SALES                                                                
FORD       SALES                                                                
JAMES      SALES                                                                
ADAMS      SALES                                                                
TURNER     SALES                                                                
KING       SALES                                                                
SCOTT      SALES                                                                
CLARK      SALES                                                                
BLAKE      SALES                                                                
MARTIN     SALES                                                                

ENAME      DNAME                                                                
---------- --------------                                                       
JONES      SALES                                                                
WARD       SALES                                                                
ALLEN      SALES                                                                
aaa        SALES                                                                
SMITH      SALES                                                                

已选择60行。

SQL> spool off

```



### 12.txt



```
SQL> select mod(10,3) from dept;

 MOD(10,3)                                                                      
----------                                                                      
         1                                                                      
         1                                                                      
         1                                                                      
         1                                                                      

SQL> select empno from emp;

     EMPNO                                                                      
----------                                                                      
         1                                                                      
      7369                                                                      
      7499                                                                      
      7521                                                                      
      7566                                                                      
      7654                                                                      
      7698                                                                      
      7782                                                                      
      7788                                                                      
      7839                                                                      
      7844                                                                      

     EMPNO                                                                      
----------                                                                      
      7876                                                                      
      7900                                                                      
      7902                                                                      
      7934                                                                      

已选择15行。

SQL> select count(empno) from emp;

COUNT(EMPNO)                                                                    
------------                                                                    
          15                                                                    

SQL> select sum(sal) from emp;

  SUM(SAL)                                                                      
----------                                                                      
     29025                                                                      

SQL> select avg(sal) from emp;

  AVG(SAL)                                                                      
----------                                                                      
2073.21429                                                                      

SQL> select sum(nvl(sal,0))/15 from emp;

SUM(NVL(SAL,0))/15                                                              
------------------                                                              
              1935                                                              

SQL> select ename,sal from emp;

ENAME             SAL                                                           
---------- ----------                                                           
aaa                                                                             
SMITH             800                                                           
ALLEN            1600                                                           
WARD             1250                                                           
JONES            2975                                                           
MARTIN           1250                                                           
BLAKE            2850                                                           
CLARK            2450                                                           
SCOTT            3000                                                           
KING             5000                                                           
TURNER           1500                                                           

ENAME             SAL                                                           
---------- ----------                                                           
ADAMS            1100                                                           
JAMES             950                                                           
FORD             3000                                                           
MILLER           1300                                                           

已选择15行。

SQL> select min(sal) minsal,max(sal) maxsal from emp;

    MINSAL     MAXSAL                                                           
---------- ----------                                                           
       800       5000                                                           

SQL> select count(*) nums,sum(nvl(sal,0)) sumsal,avg(nvl(sal,0)) avgsal,max(sal) maxsal,min(sal) minsal from emp group by deptno;

      NUMS     SUMSAL     AVGSAL     MAXSAL     MINSAL                          
---------- ---------- ---------- ---------- ----------                          
         1          0          0                                                
         6       9400 1566.66667       2850        950                          
         5      10875       2175       3000        800                          
         3       8750 2916.66667       5000       1300                          

SQL> select deptno,count(*) nums,sum(nvl(sal,0)) sumsal,avg(nvl(sal,0)) avgsal,max(sal) maxsal,min(sal) minsal from emp group by deptno;

    DEPTNO       NUMS     SUMSAL     AVGSAL     MAXSAL     MINSAL               
---------- ---------- ---------- ---------- ---------- ----------               
                    1          0          0                                     
        30          6       9400 1566.66667       2850        950               
        20          5      10875       2175       3000        800               
        10          3       8750 2916.66667       5000       1300               

SQL> select deptno,count(*) nums,sum(nvl(sal,0)) sumsal,avg(nvl(sal,0)) avgsal,max(sal) maxsal,min(sal) minsal from emp;
select deptno,count(*) nums,sum(nvl(sal,0)) sumsal,avg(nvl(sal,0)) avgsal,max(sal) maxsal,min(sal) minsal from emp
       *
第 1 行出现错误: 
ORA-00937: 不是单组分组函数 


SQL> select deptno,count(*) nums,sum(nvl(sal,0)) sumsal,avg(nvl(sal,0)) avgsal,max(sal) maxsal,min(sal) minsal from emp group by deptno;

    DEPTNO       NUMS     SUMSAL     AVGSAL     MAXSAL     MINSAL               
---------- ---------- ---------- ---------- ---------- ----------               
                    1          0          0                                     
        30          6       9400 1566.66667       2850        950               
        20          5      10875       2175       3000        800               
        10          3       8750 2916.66667       5000       1300               



```



### 13.txt

## 

```


SQL> ed
已写入 file afiedt.buf

  1  select
  2  	e.deptno,d.dname,count(*),sum(nvl(e.sal,0)) sumsal
  3  from
  4  	emp e,dept d
  5  where
  6  	e.deptno=d.deptno
  7  group by
  8* 	e.deptno,d.dname
SQL> /

    DEPTNO DNAME            COUNT(*)     SUMSAL                                 
---------- -------------- ---------- ----------                                 
        10 ACCOUNTING              3       8750                                 
        20 RESEARCH                5      10875                                 
        30 SALES                   6       9400                                 

SQL> ed
已写入 file afiedt.buf

  1  select
  2  	e.deptno,d.dname,count(*),sum(nvl(e.sal,0)) sumsal
  3  from
  4  	emp e,dept d
  5  where
  6  	e.deptno=d.deptno(+)
  7  group by
  8* 	e.deptno,d.dname
SQL> /

    DEPTNO DNAME            COUNT(*)     SUMSAL                                 
---------- -------------- ---------- ----------                                 
                                   1          0                                 
        10 ACCOUNTING              3       8750                                 
        20 RESEARCH                5      10875                                 
        30 SALES                   6       9400                                 

SQL> ed
已写入 file afiedt.buf

  1  select
  2  	e.deptno,d.dname,count(*),sum(nvl(e.sal,0)) sumsal
  3  from
  4  	emp e,dept d
  5  where
  6  	e.deptno=d.deptno(+)
  7  group by
  8  	e.deptno,d.dname
  9  having
 10* 	sum(nvl(e.sal,0))>10000
SQL> /

    DEPTNO DNAME            COUNT(*)     SUMSAL                                 
---------- -------------- ---------- ----------                                 
        20 RESEARCH                5      10875                                 

SQL> ed
已写入 file afiedt.buf

  1  select
  2  	e.deptno,d.dname,count(*),sum(nvl(e.sal,0)) sumsal
  3  from
  4  	emp e,dept d
  5  where
  6  	e.deptno=d.deptno(+)
  7  having
  8  	sum(nvl(e.sal,0))>10000
  9  group by
 10* 	e.deptno,d.dname
 11  /

    DEPTNO DNAME            COUNT(*)     SUMSAL                                 
---------- -------------- ---------- ----------                                 
        20 RESEARCH                5      10875                                 

SQL> ed
已写入 file afiedt.buf

  1  select
  2  	e.deptno,d.dname,count(*),sum(nvl(e.sal,0)) sumsal
  3  from
  4  	emp e,dept d
  5  where
  6  	e.deptno=d.deptno(+)
  7  group by
  8* 	e.deptno,d.dname
SQL> /

    DEPTNO DNAME            COUNT(*)     SUMSAL                                 
---------- -------------- ---------- ----------                                 
                                   1          0                                 
        10 ACCOUNTING              3       8750                                 
        20 RESEARCH                5      10875                                 
        30 SALES                   6       9400                                 

SQL> ed
已写入 file afiedt.buf

  1  select
  2  	e.deptno,d.dname,count(*),sum(nvl(e.sal,0)) sumsal
  3  from
  4  	emp e,dept d
  5  where
  6  	e.deptno is not null
  7  	and
  8  	e.deptno=d.deptno(+)
  9  group by
 10* 	e.deptno,d.dname
SQL> /

    DEPTNO DNAME            COUNT(*)     SUMSAL                                 
---------- -------------- ---------- ----------                                 
        10 ACCOUNTING              3       8750                                 
        20 RESEARCH                5      10875                                 
        30 SALES                   6       9400                                 

SQL> ed
已写入 file afiedt.buf

  1  select
  2  	e.deptno,d.dname,count(*),sum(nvl(e.sal,0)) sumsal
  3  from
  4  	emp e,dept d
  5  where
  6  	e.deptno=d.deptno(+)
  7  group by
  8  	e.deptno,d.dname
  9  having
 10* 	e.deptno is not null
SQL> /

    DEPTNO DNAME            COUNT(*)     SUMSAL                                 
---------- -------------- ---------- ----------                                 
        10 ACCOUNTING              3       8750                                 
        20 RESEARCH                5      10875                                 
        30 SALES                   6       9400                                 



```



## day03

### 1.txt

```
SQL> select ename,sal from emp where ename='ALLEN';

ENAME             SAL                                                           
---------- ----------                                                           
ALLEN            1600                                                           

SQL> SELECT ename,sal from emp order by sal desc;

ENAME             SAL                                                           
---------- ----------                                                           
aaa                                                                             
KING             5000                                                           
FORD             3000                                                           
SCOTT            3000                                                           
JONES            2975                                                           
BLAKE            2850                                                           
CLARK            2450                                                           
ALLEN            1600                                                           
TURNER           1500                                                           
MILLER           1300                                                           
WARD             1250                                                           

ENAME             SAL                                                           
---------- ----------                                                           
MARTIN           1250                                                           
ADAMS            1100                                                           
JAMES             950                                                           
SMITH             800                                                           

已选择15行。

SQL> select ename,sal from emp where sal>(select sal from emp where ename='ALLEN');

ENAME             SAL                                                           
---------- ----------                                                           
JONES            2975                                                           
BLAKE            2850                                                           
CLARK            2450                                                           
SCOTT            3000                                                           
KING             5000                                                           
FORD             3000                                                           

已选择6行。

SQL> ed
已写入 file afiedt.buf

  1  select 
  2  	ename,sal 
  3  from 
  4  	emp 
  5  where 
  6  	sal>(
  7  		select sal 
  8  		from 
  9  			emp 
 10  		where 
 11  			ename='ALLEN'
 12* 		)
SQL> /

ENAME             SAL                                                           
---------- ----------                                                           
JONES            2975                                                           
BLAKE            2850                                                           
CLARK            2450                                                           
SCOTT            3000                                                           
KING             5000                                                           
FORD             3000                                                           

已选择6行。

SQL> select ename,sal from emp where deptno=10;

ENAME             SAL                                                           
---------- ----------                                                           
CLARK            2450                                                           
KING             5000                                                           
MILLER           1300                                                           

SQL> select * from (select ename,sal from emp where deptno=10);

ENAME             SAL                                                           
---------- ----------                                                           
CLARK            2450                                                           
KING             5000                                                           
MILLER           1300                                                           

SQL> select ename,sal from emp where sal>(select sal from emp where ename='ALLEN');

ENAME             SAL                                                           
---------- ----------                                                           
JONES            2975                                                           
BLAKE            2850                                                           
CLARK            2450                                                           
SCOTT            3000                                                           
KING             5000                                                           
FORD             3000                                                           

已选择6行。

SQL> select ename,sal from emp where sal>(select sal from emp where ename='ALLEN' OR ENAME='SMITH');
select ename,sal from emp where sal>(select sal from emp where ename='ALLEN' OR ENAME='SMITH')
                                     *
第 1 行出现错误: 
ORA-01427: 单行子查询返回多个行 


SQL> select ename,sal from emp where sal>ALL(select sal from emp where ename='ALLEN' OR ENAME='SMITH');

ENAME             SAL                                                           
---------- ----------                                                           
JONES            2975                                                           
BLAKE            2850                                                           
CLARK            2450                                                           
SCOTT            3000                                                           
KING             5000                                                           
FORD             3000                                                           

已选择6行。

SQL> select ename,sal from emp where sal in(select max(sal) from emp group by deptno)
  2  ;

ENAME             SAL                                                           
---------- ----------                                                           
BLAKE            2850                                                           
FORD             3000                                                           
SCOTT            3000                                                           
KING             5000                                                           

SQL> select deptno,ename,sal from emp where sal in(select max(sal) from emp group by deptno)
  2  ;

    DEPTNO ENAME             SAL                                                
---------- ---------- ----------                                                
        30 BLAKE            2850                                                
        20 FORD             3000                                                
        20 SCOTT            3000                                                
        10 KING             5000                                                

SQL> select deptno,ename,sal from emp where sal not in(select max(sal) from emp group by deptno)
  2  ;

未选定行

SQL> select max(sal) from emp group by deptno;

  MAX(SAL)                                                                      
----------                                                                      
                                                                                
      2850                                                                      
      3000                                                                      
      5000                                                                      

SQL> select ename,sal from emp order by sal desc;

ENAME             SAL                                                           
---------- ----------                                                           
aaa                                                                             
KING             5000                                                           
FORD             3000                                                           
SCOTT            3000                                                           
JONES            2975                                                           
BLAKE            2850                                                           
CLARK            2450                                                           
ALLEN            1600                                                           
TURNER           1500                                                           
MILLER           1300                                                           
WARD             1250                                                           

ENAME             SAL                                                           
---------- ----------                                                           
MARTIN           1250                                                           
ADAMS            1100                                                           
JAMES             950                                                           
SMITH             800                                                           

已选择15行。

SQL> select ename,sal from emp where sal is not null order by sal desc;

ENAME             SAL                                                           
---------- ----------                                                           
KING             5000                                                           
FORD             3000                                                           
SCOTT            3000                                                           
JONES            2975                                                           
BLAKE            2850                                                           
CLARK            2450                                                           
ALLEN            1600                                                           
TURNER           1500                                                           
MILLER           1300                                                           
WARD             1250                                                           
MARTIN           1250                                                           

ENAME             SAL                                                           
---------- ----------                                                           
ADAMS            1100                                                           
JAMES             950                                                           
SMITH             800                                                           

已选择14行。

SQL> select rownum,ename from emp;

    ROWNUM ENAME                                                                
---------- ----------                                                           
         1 aaa                                                                  
         2 SMITH                                                                
         3 ALLEN                                                                
         4 WARD                                                                 
         5 JONES                                                                
         6 MARTIN                                                               
         7 BLAKE                                                                
         8 CLARK                                                                
         9 SCOTT                                                                
        10 KING                                                                 
        11 TURNER                                                               

    ROWNUM ENAME                                                                
---------- ----------                                                           
        12 ADAMS                                                                
        13 JAMES                                                                
        14 FORD                                                                 
        15 MILLER                                                               

已选择15行。

SQL> desc emp
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------
 EMPNO                                     NOT NULL NUMBER(4)
 ENAME                                              VARCHAR2(10)
 JOB                                                VARCHAR2(9)
 MGR                                                NUMBER(4)
 HIREDATE                                           DATE
 SAL                                                NUMBER(7,2)
 COMM                                               NUMBER(7,2)
 DEPTNO                                             NUMBER(2)

SQL> select rownum,ename,sal from emp where sal is not null order by sal desc;

    ROWNUM ENAME             SAL                                                
---------- ---------- ----------                                                
         9 KING             5000                                                
        13 FORD             3000                                                
         8 SCOTT            3000                                                
         4 JONES            2975                                                
         6 BLAKE            2850                                                
         7 CLARK            2450                                                
         2 ALLEN            1600                                                
        10 TURNER           1500                                                
        14 MILLER           1300                                                
         3 WARD             1250                                                
         5 MARTIN           1250                                                

    ROWNUM ENAME             SAL                                                
---------- ---------- ----------                                                
        11 ADAMS            1100                                                
        12 JAMES             950                                                
         1 SMITH             800                                                

已选择14行。

SQL> select rownum,a.* from (select ename,sal from emp where sal is not null order by sal desc)a;

    ROWNUM ENAME             SAL                                                
---------- ---------- ----------                                                
         1 KING             5000                                                
         2 FORD             3000                                                
         3 SCOTT            3000                                                
         4 JONES            2975                                                
         5 BLAKE            2850                                                
         6 CLARK            2450                                                
         7 ALLEN            1600                                                
         8 TURNER           1500                                                
         9 MILLER           1300                                                
        10 WARD             1250                                                
        11 MARTIN           1250                                                

    ROWNUM ENAME             SAL                                                
---------- ---------- ----------                                                
        12 ADAMS            1100                                                
        13 JAMES             950                                                
        14 SMITH             800                                                

已选择14行。

SQL> select rownum,a.* from (select ename,sal from emp where sal is not null order by sal desc)a where rownum<=5;

    ROWNUM ENAME             SAL                                                
---------- ---------- ----------                                                
         1 KING             5000                                                
         2 SCOTT            3000                                                
         3 FORD             3000                                                
         4 JONES            2975                                                
         5 BLAKE            2850                                                

SQL> select rownum,a.* from (select ename,sal from emp where sal is not null order by sal desc)a where rownum between 6 and 10;

未选定行

SQL> ed
已写入 file afiedt.buf

  1  select 
  2  	rownum,a.* 
  3  from (
  4  			select 
  5  				ename,sal 
  6  			from 
  7  				emp 
  8  			where 
  9  				sal is not null 
 10  			order by sal desc
 11* 		)a 
SQL> /

    ROWNUM ENAME             SAL                                                
---------- ---------- ----------                                                
         1 KING             5000                                                
         2 FORD             3000                                                
         3 SCOTT            3000                                                
         4 JONES            2975                                                
         5 BLAKE            2850                                                
         6 CLARK            2450                                                
         7 ALLEN            1600                                                
         8 TURNER           1500                                                
         9 MILLER           1300                                                
        10 WARD             1250                                                
        11 MARTIN           1250                                                

    ROWNUM ENAME             SAL                                                
---------- ---------- ----------                                                
        12 ADAMS            1100                                                
        13 JAMES             950                                                
        14 SMITH             800                                                

已选择14行。

SQL> ed
已写入 file afiedt.buf

  1  select
  2  	b.rn,b.ename,b.sal
  3  from
  4  (
  5  select 
  6  	rownum rn,a.* 
  7  from (
  8  			select 
  9  				ename,sal 
 10  			from 
 11  				emp 
 12  			where 
 13  				sal is not null 
 14  			order by sal desc
 15  		)a 
 16  ) b
 17  where
 18* 	b.rn between 6 and 10
SQL> /

        RN ENAME             SAL                                                
---------- ---------- ----------                                                
         6 CLARK            2450                                                
         7 ALLEN            1600                                                
         8 TURNER           1500                                                
         9 MILLER           1300                                                
        10 WARD             1250                                                

SQL> ed
已写入 file afiedt.buf

  1  select
  2  	b.rn,b.ename,b.sal
  3  from
  4  (
  5  select 
  6  	rownum rn,a.* 
  7  from (
  8  			select 
  9  				ename,sal 
 10  			from 
 11  				emp 
 12  			where 
 13  				sal is not null 
 14  			order by sal desc
 15  		)a 
 16  ) b
 17  where
 18* 	b.rn between 6 and 10
SQL> spool off

```



### 2.txt

```
SQL> select
  2  					e.ename,e.sal,e.deptno
  3  				from
  4  					emp e,(select deptno,avg(sal) avgsal from emp group by deptno) e2
  5  				where
  6  					e.deptno=e2.deptno
  7  					and
  8  					e.sal>e2.avgsal;

ENAME             SAL     DEPTNO                                                
---------- ---------- ----------                                                
ALLEN            1600         30                                                
JONES            2975         20                                                
BLAKE            2850         30                                                
SCOTT            3000         20                                                
KING             5000         10                                                
FORD             3000         20                                                

已选择6行。

SQL> select
  2  					e.ename,e.sal,e.deptno
  3  				from
  4  					emp e
  5  				where
  6  					e.sal>(
  7  						select avg(sal) avgsal
  8  						from
  9  							emp e2
 10  						where
 11  							e2.deptno=e.deptno
 12  					);

ENAME             SAL     DEPTNO                                                
---------- ---------- ----------                                                
ALLEN            1600         30                                                
JONES            2975         20                                                
BLAKE            2850         30                                                
SCOTT            3000         20                                                
KING             5000         10                                                
FORD             3000         20                                                

已选择6行。



```

### 3.txt

```
SQL> select e.ename,e.sal,e.deptno
  2  				from
  3  					emp e
  4  				where
  5  					exists(
  6  						select avg(e2.sal) avgsal
  7  						from
  8  							emp e2
  9  						where
 10  							e.deptno=e2.deptno
 11  						having
 12  							e.sal>avg(e2.sal)
 13  					);

ENAME             SAL     DEPTNO                                                
---------- ---------- ----------                                                
ALLEN            1600         30                                                
JONES            2975         20                                                
BLAKE            2850         30                                                
SCOTT            3000         20                                                
KING             5000         10                                                
FORD             3000         20                                                

已选择6行。

SQL> select e.ename,e.sal,e.deptno
  2  				from
  3  					emp e
  4  				where
  5  					exists(
  6  						select
  7  							1
  8  						from
  9  							emp e2
 10  						where
 11  							e.deptno=e2.deptno
 12  						having
 13  							e.sal>avg(e2.sal)
 14  					);

ENAME             SAL     DEPTNO                                                
---------- ---------- ----------                                                
ALLEN            1600         30                                                
JONES            2975         20                                                
BLAKE            2850         30                                                
SCOTT            3000         20                                                
KING             5000         10                                                
FORD             3000         20                                                

已选择6行。



```

### 4.txt



```
SQL> desc dept
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------
 DEPTNO                                    NOT NULL NUMBER(2)
 DNAME                                              VARCHAR2(14)
 LOC                                                VARCHAR2(13)

SQL> insert into dept values(1,'研发部','nj');

已创建 1 行。

SQL> select * from dept;

    DEPTNO DNAME          LOC                                                   
---------- -------------- -------------                                         
         1 研发部         nj                                                    
        10 ACCOUNTING     NEW YORK                                              
        20 RESEARCH       DALLAS                                                
        30 SALES          CHICAGO                                               
        40 OPERATIONS     BOSTON                                                

SQL> insert into dept values(2,'研发2部',null);

已创建 1 行。

SQL> select * from dept;

    DEPTNO DNAME          LOC                                                   
---------- -------------- -------------                                         
         1 研发部         nj                                                    
         2 研发2部                                                              
        10 ACCOUNTING     NEW YORK                                              
        20 RESEARCH       DALLAS                                                
        30 SALES          CHICAGO                                               
        40 OPERATIONS     BOSTON                                                

已选择6行。

SQL> insert into dept(deptno,dname) values(3,'研发3部');

已创建 1 行。

SQL> select * from dept;

    DEPTNO DNAME          LOC                                                   
---------- -------------- -------------                                         
         1 研发部         nj                                                    
         2 研发2部                                                              
         3 研发3部                                                              
        10 ACCOUNTING     NEW YORK                                              
        20 RESEARCH       DALLAS                                                
        30 SALES          CHICAGO                                               
        40 OPERATIONS     BOSTON                                                

已选择7行。

SQL> insert into dept values(1,'研发n部',null);
insert into dept values(1,'研发n部',null)
*
第 1 行出现错误: 
ORA-00001: 违反唯一约束条件 (SCOTT.PK_DEPT) 


SQL> desc dept
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------
 DEPTNO                                    NOT NULL NUMBER(2)
 DNAME                                              VARCHAR2(14)
 LOC                                                VARCHAR2(13)

SQL> insert into dept values(10000,'研发n部',null);
insert into dept values(10000,'研发n部',null)
                        *
第 1 行出现错误: 
ORA-01438: 值大于为此列指定的允许精度 


SQL> insert into dept values('a','研发n部',null);
insert into dept values('a','研发n部',null)
                        *
第 1 行出现错误: 
ORA-01722: 无效数字 

```

### 5.txt



```
SQL> desc dept
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------
 DEPTNO                                    NOT NULL NUMBER(2)
 DNAME                                              VARCHAR2(14)
 LOC                                                VARCHAR2(13)

SQL> desc emp
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------
 EMPNO                                     NOT NULL NUMBER(4)
 ENAME                                              VARCHAR2(10)
 JOB                                                VARCHAR2(9)
 MGR                                                NUMBER(4)
 HIREDATE                                           DATE
 SAL                                                NUMBER(7,2)
 COMM                                               NUMBER(7,2)
 DEPTNO                                             NUMBER(2)

SQL> insert into emp(empno,ename,sal,hiredate) values(100,'bbb',50000,sysdate);

已创建 1 行。

SQL> select empno,ename,sal,to_char(hiredate,'yyyy-mm-dd') from emp;

     EMPNO ENAME             SAL TO_CHAR(HI                                     
---------- ---------- ---------- ----------                                     
         1 aaa                                                                  
       100 bbb             50000 2014-08-13                                     
      7369 SMITH             800 1980-12-17                                     
      7499 ALLEN            1600 1981-02-20                                     
      7521 WARD             1250 1981-02-22                                     
      7566 JONES            2975 1981-04-02                                     
      7654 MARTIN           1250 1981-09-28                                     
      7698 BLAKE            2850 1981-05-01                                     
      7782 CLARK            2450 1981-06-09                                     
      7788 SCOTT            3000 1987-07-13                                     
      7839 KING             5000 1981-11-17                                     

     EMPNO ENAME             SAL TO_CHAR(HI                                     
---------- ---------- ---------- ----------                                     
      7844 TURNER           1500 1981-09-08                                     
      7876 ADAMS            1100 1987-07-13                                     
      7900 JAMES             950 1981-12-03                                     
      7902 FORD             3000 1981-12-03                                     
      7934 MILLER           1300 1982-01-23                                     

已选择16行。

SQL> insert into emp(empno,hiredate,ename,sal) values(101,to_date('2014-8-13','yyyy-mm-dd'),'ccc',5000);

已创建 1 行。

SQL> select empno,ename,sal,to_char(hiredate,'yyyy-mm-dd') from emp;

     EMPNO ENAME             SAL TO_CHAR(HI                                     
---------- ---------- ---------- ----------                                     
         1 aaa                                                                  
       100 bbb             50000 2014-08-13                                     
       101 ccc              5000 2014-08-13                                     
      7369 SMITH             800 1980-12-17                                     
      7499 ALLEN            1600 1981-02-20                                     
      7521 WARD             1250 1981-02-22                                     
      7566 JONES            2975 1981-04-02                                     
      7654 MARTIN           1250 1981-09-28                                     
      7698 BLAKE            2850 1981-05-01                                     
      7782 CLARK            2450 1981-06-09                                     
      7788 SCOTT            3000 1987-07-13                                     

     EMPNO ENAME             SAL TO_CHAR(HI                                     
---------- ---------- ---------- ----------                                     
      7839 KING             5000 1981-11-17                                     
      7844 TURNER           1500 1981-09-08                                     
      7876 ADAMS            1100 1987-07-13                                     
      7900 JAMES             950 1981-12-03                                     
      7902 FORD             3000 1981-12-03                                     
      7934 MILLER           1300 1982-01-23                                     

已选择17行。

SQL> update emp set sal=1800 where ename='SMITH';

已更新 1 行。

SQL> select ename,sal from emp;

ENAME             SAL                                                           
---------- ----------                                                           
aaa                                                                             
bbb             50000                                                           
ccc              5000                                                           
SMITH            1800                                                           
ALLEN            1600                                                           
WARD             1250                                                           
JONES            2975                                                           
MARTIN           1250                                                           
BLAKE            2850                                                           
CLARK            2450                                                           
SCOTT            3000                                                           

ENAME             SAL                                                           
---------- ----------                                                           
KING             5000                                                           
TURNER           1500                                                           
ADAMS            1100                                                           
JAMES             950                                                           
FORD             3000                                                           
MILLER           1300                                                           

已选择17行。

SQL> update emp set ename='斯密斯',sal=800 where ename='SMITH';

已更新 1 行。

SQL> select ename,sal from emp;

ENAME             SAL                                                           
---------- ----------                                                           
aaa                                                                             
bbb             50000                                                           
ccc              5000                                                           
斯密斯            800                                                           
ALLEN            1600                                                           
WARD             1250                                                           
JONES            2975                                                           
MARTIN           1250                                                           
BLAKE            2850                                                           
CLARK            2450                                                           
SCOTT            3000                                                           

ENAME             SAL                                                           
---------- ----------                                                           
KING             5000                                                           
TURNER           1500                                                           
ADAMS            1100                                                           
JAMES             950                                                           
FORD             3000                                                           
MILLER           1300                                                           

已选择17行。

SQL> rollback;

回退已完成。

SQL> select empno,ename from emp;

     EMPNO ENAME                                                                
---------- ----------                                                           
         1 aaa                                                                  
      7369 SMITH                                                                
      7499 ALLEN                                                                
      7521 WARD                                                                 
      7566 JONES                                                                
      7654 MARTIN                                                               
      7698 BLAKE                                                                
      7782 CLARK                                                                
      7788 SCOTT                                                                
      7839 KING                                                                 
      7844 TURNER                                                               

     EMPNO ENAME                                                                
---------- ----------                                                           
      7876 ADAMS                                                                
      7900 JAMES                                                                
      7902 FORD                                                                 
      7934 MILLER                                                               

已选择15行。

SQL> select empno,ename,sal,hiredate from emp;

     EMPNO ENAME             SAL HIREDATE                                       
---------- ---------- ---------- --------------                                 
         1 aaa                                                                  
      7369 SMITH             800 17-12月-80                                     
      7499 ALLEN            1600 20-2月 -81                                     
      7521 WARD             1250 22-2月 -81                                     
      7566 JONES            2975 02-4月 -81                                     
      7654 MARTIN           1250 28-9月 -81                                     
      7698 BLAKE            2850 01-5月 -81                                     
      7782 CLARK            2450 09-6月 -81                                     
      7788 SCOTT            3000 13-7月 -87                                     
      7839 KING             5000 17-11月-81                                     
      7844 TURNER           1500 08-9月 -81                                     

     EMPNO ENAME             SAL HIREDATE                                       
---------- ---------- ---------- --------------                                 
      7876 ADAMS            1100 13-7月 -87                                     
      7900 JAMES             950 03-12月-81                                     
      7902 FORD             3000 03-12月-81                                     
      7934 MILLER           1300 23-1月 -82                                     

已选择15行。

SQL> delete emp;

已删除15行。

SQL> select empno,ename,sal,hiredate from emp;

未选定行

SQL> rollback;

回退已完成。

SQL> select empno,ename,sal,hiredate from emp;

     EMPNO ENAME             SAL HIREDATE                                       
---------- ---------- ---------- --------------                                 
         1 aaa                                                                  
      7369 SMITH             800 17-12月-80                                     
      7499 ALLEN            1600 20-2月 -81                                     
      7521 WARD             1250 22-2月 -81                                     
      7566 JONES            2975 02-4月 -81                                     
      7654 MARTIN           1250 28-9月 -81                                     
      7698 BLAKE            2850 01-5月 -81                                     
      7782 CLARK            2450 09-6月 -81                                     
      7788 SCOTT            3000 13-7月 -87                                     
      7839 KING             5000 17-11月-81                                     
      7844 TURNER           1500 08-9月 -81                                     

     EMPNO ENAME             SAL HIREDATE                                       
---------- ---------- ---------- --------------                                 
      7876 ADAMS            1100 13-7月 -87                                     
      7900 JAMES             950 03-12月-81                                     
      7902 FORD             3000 03-12月-81                                     
      7934 MILLER           1300 23-1月 -82                                     

已选择15行。

SQL> delete from dept where deptno=10;
delete from dept where deptno=10
*
第 1 行出现错误: 
ORA-02292: 违反完整约束条件 (SCOTT.FK_DEPTNO) - 已找到子记录 


SQL> select empno,ename from emp;

     EMPNO ENAME                                                                
---------- ----------                                                           
         1 aaa                                                                  
      7369 SMITH                                                                
      7499 ALLEN                                                                
      7521 WARD                                                                 
      7566 JONES                                                                
      7654 MARTIN                                                               
      7698 BLAKE                                                                
      7782 CLARK                                                                
      7788 SCOTT                                                                
      7839 KING                                                                 
      7844 TURNER                                                               

     EMPNO ENAME                                                                
---------- ----------                                                           
      7876 ADAMS                                                                
      7900 JAMES                                                                
      7902 FORD                                                                 
      7934 MILLER                                                               

已选择15行。




SQL> ed
已写入 file afiedt.buf

  1  merge into emp e using emp2 e2
  2  on(e.empno=e2.empno)
  3  when matched then
  4  	update set e.ename=e2.ename
  5  when not matched then
  6* 	insert into(e.empno,e.ename) values(e2.empno,e2.ename);
SQL> /
	insert into(e.empno,e.ename) values(e2.empno,e2.ename);
	       *
第 6 行出现错误: 
ORA-00926: 缺失 VALUES 关键字 


SQL> ed
已写入 file afiedt.buf

  1  merge into emp e using emp2 e2
  2  on(e.empno=e2.empno)
  3  when matched then
  4  	update set e.ename=e2.ename
  5  when not matched then
  6* 	insert (e.empno,e.ename) values(e2.empno,e2.ename);
SQL> /
	insert (e.empno,e.ename) values(e2.empno,e2.ename);
	                                                  *
第 6 行出现错误: 
ORA-00911: 无效字符 


SQL> ed
已写入 file afiedt.buf

  1  merge into emp e using emp2 e2
  2  on(e.empno=e2.empno)
  3  when matched then
  4  	update set e.ename=e2.ename
  5  when not matched then
  6* 	insert (e.empno,e.ename) values(e2.empno,e2.ename)
SQL> /

3 行已合并。

SQL> select empno,ename from emp;

     EMPNO ENAME                                                                
---------- ----------                                                           
         1 哈哈                                                                 
         2 呵呵                                                                 
         3 啊啊                                                                 
      7369 SMITH                                                                
      7499 ALLEN                                                                
      7521 WARD                                                                 
      7566 JONES                                                                
      7654 MARTIN                                                               
      7698 BLAKE                                                                
      7782 CLARK                                                                
      7788 SCOTT                                                                

     EMPNO ENAME                                                                
---------- ----------                                                           
      7839 KING                                                                 
      7844 TURNER                                                               
      7876 ADAMS                                                                
      7900 JAMES                                                                
      7902 FORD                                                                 
      7934 MILLER                                                               

已选择17行。



```



### 6.txt

```
SQL> update emp set sal=sal-100 where ename='SMITH';

已更新 1 行。

SQL> SELECT ename,sal from emp where ename='SMITH';

ENAME             SAL
---------- ----------
SMITH             700

SQL> UPDATE emp set sal=sal+100 where ename='ALLEN';

已更新 1 行。

SQL> SELECT ename,sal from emp where ename='ALLEN';

ENAME             SAL
---------- ----------
ALLEN            1700

SQL> COMMit;

提交完成。

SQL> delete from emp where ename='SMITH' OR ENAME='ALLEN';

已删除2行。

SQL> SELECT empno,ename from emp where ename in('SMITH','ALLEN');

未选定行

SQL> rollback;

回退已完成。

SQL> SELECT empno,ename from emp where ename in('SMITH','ALLEN');

     EMPNO ENAME
---------- ----------
      7369 SMITH
      7499 ALLEN

SQL> update emp set sal=3000 where ename='SMITH';

已更新 1 行。

SQL> SELECT empno,ename from emp where ename in('SMITH','ALLEN');

     EMPNO ENAME
---------- ----------
      7369 SMITH
      7499 ALLEN

SQL> SELECT Ename,sal from emp;

ENAME             SAL
---------- ----------
哈哈
呵呵
啊啊
SMITH            3000
ALLEN            1700
WARD             1250
JONES            2975
MARTIN           1250
BLAKE            2850
CLARK            2450
SCOTT            3000

ENAME             SAL
---------- ----------
KING             5000
TURNER           1500
ADAMS            1100
JAMES             950
FORD             3000
MILLER           1300

已选择17行。

SQL> ROLLBACK;

回退已完成。

SQL> INSERT INTO dept(deptno,dname) values(1,'yfbm');

已创建 1 行。

SQL> select * from dept;

    DEPTNO DNAME          LOC
---------- -------------- -------------
         1 yfbm
        10 ACCOUNTING     NEW YORK
        20 RESEARCH       DALLAS
        30 SALES          CHICAGO
        40 OPERATIONS     BOSTON

SQL> quit
从 Oracle Database 10g Enterprise Edition Release 10.2.0.1.0 - Production
With the Partitioning, OLAP and Data Mining options 断开

C:\Documents and Settings\Administrator>sqlplus scott/tiger

SQL*Plus: Release 10.2.0.1.0 - Production on 星期三 8月 13 14:05:40 2014

Copyright (c) 1982, 2005, Oracle.  All rights reserved.


连接到:
Oracle Database 10g Enterprise Edition Release 10.2.0.1.0 - Production
With the Partitioning, OLAP and Data Mining options

SQL> insert into dept(deptno,dname) values(2,'xxx');

已创建 1 行。

SQL> select * from dept;

    DEPTNO DNAME          LOC
---------- -------------- -------------
         1 yfbm
         2 xxx
        10 ACCOUNTING     NEW YORK
        20 RESEARCH       DALLAS
        30 SALES          CHICAGO
        40 OPERATIONS     BOSTON

已选择6行。

SQL> create table tt(id number);

表已创建。

SQL> select * from dept;

    DEPTNO DNAME          LOC
---------- -------------- -------------
         1 yfbm
         2 xxx
        10 ACCOUNTING     NEW YORK
        20 RESEARCH       DALLAS
        30 SALES          CHICAGO
        40 OPERATIONS     BOSTON

已选择6行。

SQL> rollback;

回退已完成。

SQL> select * from dept;

    DEPTNO DNAME          LOC
---------- -------------- -------------
         1 yfbm
         2 xxx
        10 ACCOUNTING     NEW YORK
        20 RESEARCH       DALLAS
        30 SALES          CHICAGO
        40 OPERATIONS     BOSTON

已选择6行。

SQL>
```



## day04：

### 1.txt

```
SQL> create table student(no number,name varchar2(20));

表已创建。


```



### 2.txt

```
SQL> select * from tab;

TNAME                          TABTYPE  CLUSTERID                               
------------------------------ ------- ----------                               
DEPT                           TABLE                                            
EMP                            TABLE                                            
BONUS                          TABLE                                            
SALGRADE                       TABLE                                            
EMP2                           TABLE                                            
STUDENT                        TABLE                                            
EMP3                           TABLE                                            
TT                             TABLE                                            
STUDENT1                       TABLE                                            
ANIMAL                         TABLE                                            

已选择10行。

SQL> drop table student;

表已删除。

SQL> select * from tab;

TNAME                          TABTYPE  CLUSTERID                               
------------------------------ ------- ----------                               
DEPT                           TABLE                                            
EMP                            TABLE                                            
BONUS                          TABLE                                            
SALGRADE                       TABLE                                            
EMP2                           TABLE                                            
EMP3                           TABLE                                            
TT                             TABLE                                            
STUDENT1                       TABLE                                            
ANIMAL                         TABLE                                            
BIN$f0aC1ewdSia60Imj+ce4Hg==$0 TABLE                                            

已选择10行。

SQL> purge recyclebin;

回收站已清空。

SQL> select * from tab;

TNAME                          TABTYPE  CLUSTERID                               
------------------------------ ------- ----------                               
DEPT                           TABLE                                            
EMP                            TABLE                                            
BONUS                          TABLE                                            
SALGRADE                       TABLE                                            
EMP2                           TABLE                                            
EMP3                           TABLE                                            
TT                             TABLE                                            
STUDENT1                       TABLE                                            
ANIMAL                         TABLE                                            

已选择9行。

SQL> drop table animal purge;

表已删除。

SQL> select * from tab;

TNAME                          TABTYPE  CLUSTERID                               
------------------------------ ------- ----------                               
DEPT                           TABLE                                            
EMP                            TABLE                                            
BONUS                          TABLE                                            
SALGRADE                       TABLE                                            
EMP2                           TABLE                                            
EMP3                           TABLE                                            
TT                             TABLE                                            
STUDENT1                       TABLE                                            

已选择8行。

SQL> drop table student1 purge;

表已删除。

-- drop table tt purge 永久删除表和数据
-- drop table tt将表和数据放入回收站

SQL> drop table tt purge;

表已删除。

SQL> select * from tab;

TNAME                          TABTYPE  CLUSTERID                               
------------------------------ ------- ----------                               
DEPT                           TABLE                                            
EMP                            TABLE                                            
BONUS                          TABLE                                            
SALGRADE                       TABLE                                            
EMP2                           TABLE                                            
EMP3                           TABLE                                            

已选择6行。

SQL> drop table emp2 purge;

表已删除。

SQL> drop table emp3 purge;

表已删除。


SQL> select * from tab;

TNAME                          TABTYPE  CLUSTERID                               
------------------------------ ------- ----------                               
DEPT                           TABLE                                            
EMP                            TABLE                                            
BONUS                          TABLE                                            
SALGRADE                       TABLE                                            

SQL> create table student(no number,
  2  name char(10),
  3  addr varchar(10),
  4  birthday date);

表已创建。

SQL> desc student
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------
 NO                                                 NUMBER
 NAME                                               CHAR(10)
 ADDR                                               VARCHAR2(10)
 BIRTHDAY                                           DATE

SQL> insert into student values(1,'aaa','nanjing',to_date('1990-10-10','yyyy-mm-dd'));

已创建 1 行。

SQL> commit;

提交完成。

SQL> select * from student;

        NO NAME       ADDR       BIRTHDAY                                       
---------- ---------- ---------- --------------                                 
         1 aaa        nanjing    10-10月-90                                     

SQL> select name,length(name),addr,length(addr) from student;

NAME       LENGTH(NAME) ADDR       LENGTH(ADDR)                                 
---------- ------------ ---------- ------------                                 
aaa                  10 nanjing               7                                 

SQL> select '|'||name||'|' from student;

'|'||NAME||'                                                                    
------------                                                                    
|aaa       |                                                                    

SQL> select * from student where name='aaa';

        NO NAME       ADDR       BIRTHDAY                                       
---------- ---------- ---------- --------------                                 
         1 aaa        nanjing    10-10月-90                                     

SQL> desc student
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------
 NO                                                 NUMBER
 NAME                                               CHAR(10)
 ADDR                                               VARCHAR2(10)
 BIRTHDAY                                           DATE

SQL> select * from student;

        NO NAME       ADDR       BIRTHDAY                                       
---------- ---------- ---------- --------------                                 
         1 aaa        nanjing    10-10月-90                                     

SQL> select * from student where name='aaa       ';

        NO NAME       ADDR       BIRTHDAY                                       
---------- ---------- ---------- --------------                                 
         1 aaa        nanjing    10-10月-90                                     

SQL> select * from student where name='aa';

未选定行

SQL> select * from student where name='aaa';

        NO NAME       ADDR       BIRTHDAY                                       
---------- ---------- ---------- --------------                                 
         1 aaa        nanjing    10-10月-90                                     

SQL> select * from student where name='aaa ';

        NO NAME       ADDR       BIRTHDAY                                       
---------- ---------- ---------- --------------                                 
         1 aaa        nanjing    10-10月-90                                     

SQL> select * from student where name='aaa  ';

        NO NAME       ADDR       BIRTHDAY                                       
---------- ---------- ---------- --------------                                 
         1 aaa        nanjing    10-10月-90                                     

SQL> select * from student where name='aaa               ';

        NO NAME       ADDR       BIRTHDAY                                       
---------- ---------- ---------- --------------                                 
         1 aaa        nanjing    10-10月-90                                     

SQL> select * from student where name='aaa               ';

        NO NAME       ADDR       BIRTHDAY                                       
---------- ---------- ---------- --------------                                 
         1 aaa        nanjing    10-10月-90                                     

SQL> select * from student where name
  2  
SQL> 
SQL> desc student
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------
 NO                                                 NUMBER
 NAME                                               CHAR(10)
 ADDR                                               VARCHAR2(10)
 BIRTHDAY                                           DATE

SQL> alter table student add(sex char(1));

表已更改。

SQL> desc student
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------
 NO                                                 NUMBER
 NAME                                               CHAR(10)
 ADDR                                               VARCHAR2(10)
 BIRTHDAY                                           DATE
 SEX                                                CHAR(1)

SQL> select * from student;

        NO NAME       ADDR       BIRTHDAY       S                               
---------- ---------- ---------- -------------- -                               
         1 aaa        nanjing    10-10月-90                                     

SQL> update student set sex='0';

已更新 1 行。

SQL> commit;

提交完成。

SQL> select * from student;

        NO NAME       ADDR       BIRTHDAY       S                               
---------- ---------- ---------- -------------- -                               
         1 aaa        nanjing    10-10月-90     0                               

SQL> alter table student add(hk varchar2(20),postcode number(6));

表已更改。

SQL> desc student
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------
 NO                                                 NUMBER
 NAME                                               CHAR(10)
 ADDR                                               VARCHAR2(10)
 BIRTHDAY                                           DATE
 SEX                                                CHAR(1)
 HK                                                 VARCHAR2(20)
 POSTCODE                                           NUMBER(6)

SQL> select * from student;

        NO NAME       ADDR       BIRTHDAY       S HK                            
---------- ---------- ---------- -------------- - --------------------          
  POSTCODE                                                                      
----------                                                                      
         1 aaa        nanjing    10-10月-90     0                               
                                                                                
                                                                                
-- drop 删除字段
SQL> alter table student drop(hk);

表已更改。

SQL> desc student
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------
 NO                                                 NUMBER
 NAME                                               CHAR(10)
 ADDR                                               VARCHAR2(10)
 BIRTHDAY                                           DATE
 SEX                                                CHAR(1)
 POSTCODE                                           NUMBER(6)

SQL> select * from student;

        NO NAME       ADDR       BIRTHDAY       S   POSTCODE                    
---------- ---------- ---------- -------------- - ----------                    
         1 aaa        nanjing    10-10月-90     0                               

SQL> update student set postcode='210000';

已更新 1 行。

SQL> commit;

提交完成。

SQL> select * from student;

        NO NAME       ADDR       BIRTHDAY       S   POSTCODE                    
---------- ---------- ---------- -------------- - ----------                    
         1 aaa        nanjing    10-10月-90     0     210000                    

SQL> alter table student drop column postcode;

表已更改。

SQL> select * from student;

        NO NAME       ADDR       BIRTHDAY       S                               
---------- ---------- ---------- -------------- -                               
         1 aaa        nanjing    10-10月-90     0                               

SQL> desc student
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------
 NO                                                 NUMBER
 NAME                                               CHAR(10)
 ADDR                                               VARCHAR2(10)
 BIRTHDAY                                           DATE
 SEX                                                CHAR(1)

-- 修改字段
SQL> alter table student modify(sex char(2));

表已更改。

SQL> desc student
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------
 NO                                                 NUMBER
 NAME                                               CHAR(10)
 ADDR                                               VARCHAR2(10)
 BIRTHDAY                                           DATE
 SEX                                                CHAR(2)

SQL> select * from student;

        NO NAME       ADDR       BIRTHDAY       SE                              
---------- ---------- ---------- -------------- --                              
         1 aaa        nanjing    10-10月-90     0                               

SQL> update student set sex='女';

已更新 1 行。

SQL> commit;

提交完成。

SQL> select * from student;

        NO NAME       ADDR       BIRTHDAY       SE                              
---------- ---------- ---------- -------------- --                              
         1 aaa        nanjing    10-10月-90     女                              

SQL> desc student;
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------
 NO                                                 NUMBER
 NAME                                               CHAR(10)
 ADDR                                               VARCHAR2(10)
 BIRTHDAY                                           DATE
 SEX                                                CHAR(2)

SQL> alter table student modify(sex char(1));
alter table student modify(sex char(1))
                           *
第 1 行出现错误: 
ORA-01441: 无法减小列长度, 因为一些值过大 


SQL> desc student
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------
 NO                                                 NUMBER
 NAME                                               CHAR(10)
 ADDR                                               VARCHAR2(10)
 BIRTHDAY                                           DATE
 SEX                                                CHAR(2)

SQL> select * from student;

        NO NAME       ADDR       BIRTHDAY       SE                              
---------- ---------- ---------- -------------- --                              
         1 aaa        nanjing    10-10月-90     女                              

SQL> alter table student modify(sex number);
alter table student modify(sex number)
                           *
第 1 行出现错误: 
ORA-01439: 要更改数据类型, 则要修改的列必须为空 


SQL> update student set sex=null;

已更新 1 行。

SQL> commit;

提交完成。

SQL> alter table student modify(sex number);

表已更改。

SQL> desc student
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------
 NO                                                 NUMBER
 NAME                                               CHAR(10)
 ADDR                                               VARCHAR2(10)
 BIRTHDAY                                           DATE
 SEX                                                NUMBER

SQL> alter table student rename column sex to gender;

表已更改。

SQL> desc student
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------
 NO                                                 NUMBER
 NAME                                               CHAR(10)
 ADDR                                               VARCHAR2(10)
 BIRTHDAY                                           DATE
 GENDER                                             NUMBER

SQL> select * from student;

        NO NAME       ADDR       BIRTHDAY           GENDER                      
---------- ---------- ---------- -------------- ----------                      
         1 aaa        nanjing    10-10月-90                                     


```



### 3.txt

```
SQL> select * from student;

        NO NAME       ADDR       BIRTHDAY           GENDER                      
---------- ---------- ---------- -------------- ----------                      
         1 aaa        nanjing    10-10月-90                                     

SQL> commit;

提交完成。

SQL> delete from student;

已删除 1 行。

SQL> select * from student;

未选定行

SQL> rollback;

回退已完成。

SQL> truncate table student;

表被截断。

SQL> select * from student;

未选定行

SQL> rollback;

回退已完成。

SQL> select * from student;

未选定行

SQL> desc student;
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------
 NO                                                 NUMBER
 NAME                                               CHAR(10)
 ADDR                                               VARCHAR2(10)
 BIRTHDAY                                           DATE
 GENDER                                             NUMBER

SQL> rename student to students;

表已重命名。

SQL> show user
USER 为 "SCOTT"
SQL> select * from tab;

TNAME                          TABTYPE  CLUSTERID                               
------------------------------ ------- ----------                               
DEPT                           TABLE                                            
EMP                            TABLE                                            
BONUS                          TABLE                                            
SALGRADE                       TABLE                                            
STUDENTS                       TABLE                                            

SQL> conn sys/orcl as sysdba
已连接。
SQL> create table scott.teacher(id number);

表已创建。

SQL> show user
USER 为 "SYS"
SQL> conn scott/tiger
已连接。
SQL> select * from tab;

TNAME                          TABTYPE  CLUSTERID                               
------------------------------ ------- ----------                               
DEPT                           TABLE                                            
EMP                            TABLE                                            
BONUS                          TABLE                                            
SALGRADE                       TABLE                                            
TEACHER                        TABLE                                            
STUDENTS                       TABLE                                            

已选择6行。

SQL> desc teacher
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------
 ID                                                 NUMBER




SQL> conn / as sysdba
已连接。



SQL> conn scott/tiger
已连接。
SQL> select * from tab;

TNAME                          TABTYPE  CLUSTERID                               
------------------------------ ------- ----------                               
DEPT                           TABLE                                            
EMP                            TABLE                                            
BONUS                          TABLE                                            
SALGRADE                       TABLE                                            
TEACHER                        TABLE                                            
TEACHER2                       TABLE                                            
STUDENTS                       TABLE                                            

已选择7行。




SQL> desc students;
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------
 NO                                                 NUMBER
 NAME                                               CHAR(10)
 ADDR                                               VARCHAR2(10)
 BIRTHDAY                                           DATE
 GENDER                                             NUMBER

SQL> alter table students add(sname varchar2(10) default 'nnu');

表已更改。

SQL> select * from students;

未选定行

SQL> insert into students(no,name,addr,birthday,gender) values(1,'aaa','nj',sysdate,'0');

已创建 1 行。

SQL> select * from students;

        NO NAME       ADDR       BIRTHDAY           GENDER SNAME                
---------- ---------- ---------- -------------- ---------- ----------           
         1 aaa        nj         14-8月 -14              0 nnu                  

SQL> insert into students(no,name,addr,birthday,gender,sname) values(1,'aaa','nj',sysdate,'0','nju');

已创建 1 行。

SQL> select * from students;

        NO NAME       ADDR       BIRTHDAY           GENDER SNAME                
---------- ---------- ---------- -------------- ---------- ----------           
         1 aaa        nj         14-8月 -14              0 nnu                  
         1 aaa        nj         14-8月 -14              0 nju                  

SQL> select * from tab;

TNAME                          TABTYPE  CLUSTERID                               
------------------------------ ------- ----------                               
DEPT                           TABLE                                            
EMP                            TABLE                                            
BONUS                          TABLE                                            
SALGRADE                       TABLE                                            
TEACHER                        TABLE                                            
TEACHER2                       TABLE                                            
STUDENTS                       TABLE                                            
TEACHER3                       TABLE                                            

已选择8行。

SQL> create table emp2 as select * from emp;

表已创建。

SQL> select * from tab;

TNAME                          TABTYPE  CLUSTERID                               
------------------------------ ------- ----------                               
DEPT                           TABLE                                            
EMP                            TABLE                                            
BONUS                          TABLE                                            
SALGRADE                       TABLE                                            
TEACHER                        TABLE                                            
TEACHER2                       TABLE                                            
STUDENTS                       TABLE                                            
TEACHER3                       TABLE                                            
EMP2                           TABLE                                            

已选择9行。

SQL> desc emp2
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------
 EMPNO                                              NUMBER(4)
 ENAME                                              VARCHAR2(10)
 JOB                                                VARCHAR2(9)
 MGR                                                NUMBER(4)
 HIREDATE                                           DATE
 SAL                                                NUMBER(7,2)
 COMM                                               NUMBER(7,2)
 DEPTNO                                             NUMBER(2)

SQL> desc emp
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------
 EMPNO                                     NOT NULL NUMBER(4)
 ENAME                                              VARCHAR2(10)
 JOB                                                VARCHAR2(9)
 MGR                                                NUMBER(4)
 HIREDATE                                           DATE
 SAL                                                NUMBER(7,2)
 COMM                                               NUMBER(7,2)
 DEPTNO                                             NUMBER(2)

SQL> select empno,ename,sal from emp;

     EMPNO ENAME             SAL                                                
---------- ---------- ----------                                                
         1 哈哈                                                                 
         2 呵呵                                                                 
         3 啊啊                                                                 
      7369 SMITH             700                                                
      7499 ALLEN            2850                                                
      7521 WARD             1250                                                
      7566 JONES            2975                                                
      7654 MARTIN           1250                                                
      7698 BLAKE            2850                                                
      7782 CLARK            2450                                                
      7788 SCOTT            3000                                                

     EMPNO ENAME             SAL                                                
---------- ---------- ----------                                                
      7839 KING             5000                                                
      7844 TURNER           1500                                                
      7876 ADAMS            1100                                                
      7900 JAMES             950                                                
      7902 FORD             3000                                                
      7934 MILLER           1300                                                

已选择17行。

SQL> select empno,ename,sal from emp2;

     EMPNO ENAME             SAL                                                
---------- ---------- ----------                                                
         1 哈哈                                                                 
         2 呵呵                                                                 
         3 啊啊                                                                 
      7369 SMITH             700                                                
      7499 ALLEN            2850                                                
      7521 WARD             1250                                                
      7566 JONES            2975                                                
      7654 MARTIN           1250                                                
      7698 BLAKE            2850                                                
      7782 CLARK            2450                                                
      7788 SCOTT            3000                                                

     EMPNO ENAME             SAL                                                
---------- ---------- ----------                                                
      7839 KING             5000                                                
      7844 TURNER           1500                                                
      7876 ADAMS            1100                                                
      7900 JAMES             950                                                
      7902 FORD             3000                                                
      7934 MILLER           1300                                                

已选择17行。

SQL> create table emp3 as select * from emp where 1=2;

表已创建。

SQL> desc emp3
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------
 EMPNO                                              NUMBER(4)
 ENAME                                              VARCHAR2(10)
 JOB                                                VARCHAR2(9)
 MGR                                                NUMBER(4)
 HIREDATE                                           DATE
 SAL                                                NUMBER(7,2)
 COMM                                               NUMBER(7,2)
 DEPTNO                                             NUMBER(2)

SQL> select * from emp3;

未选定行

SQL> select empno,ename,sal from emp;

     EMPNO ENAME             SAL                                                
---------- ---------- ----------                                                
         1 哈哈                                                                 
         2 呵呵                                                                 
         3 啊啊                                                                 
      7369 SMITH             700                                                
      7499 ALLEN            2850                                                
      7521 WARD             1250                                                
      7566 JONES            2975                                                
      7654 MARTIN           1250                                                
      7698 BLAKE            2850                                                
      7782 CLARK            2450                                                
      7788 SCOTT            3000                                                

     EMPNO ENAME             SAL                                                
---------- ---------- ----------                                                
      7839 KING             5000                                                
      7844 TURNER           1500                                                
      7876 ADAMS            1100                                                
      7900 JAMES             950                                                
      7902 FORD             3000                                                
      7934 MILLER           1300                                                

已选择17行。

SQL> select empno,ename,sal from emp2;

     EMPNO ENAME             SAL                                                
---------- ---------- ----------                                                
         1 哈哈                                                                 
         2 呵呵                                                                 
         3 啊啊                                                                 
      7369 SMITH             700                                                
      7499 ALLEN            2850                                                
      7521 WARD             1250                                                
      7566 JONES            2975                                                
      7654 MARTIN           1250                                                
      7698 BLAKE            2850                                                
      7782 CLARK            2450                                                
      7788 SCOTT            3000                                                

     EMPNO ENAME             SAL                                                
---------- ---------- ----------                                                
      7839 KING             5000                                                
      7844 TURNER           1500                                                
      7876 ADAMS            1100                                                
      7900 JAMES             950                                                
      7902 FORD             3000                                                
      7934 MILLER           1300                                                

已选择17行。




SQL> alter table emp2 set  unused(sal);

表已更改。

SQL> select empno,ename,sal from emp2;
select empno,ename,sal from emp2
                   *
第 1 行出现错误: 
ORA-00904: "SAL": 标识符无效 


SQL> desc emp2
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------
 EMPNO                                              NUMBER(4)
 ENAME                                              VARCHAR2(10)
 JOB                                                VARCHAR2(9)
 MGR                                                NUMBER(4)
 HIREDATE                                           DATE
 COMM                                               NUMBER(7,2)
 DEPTNO                                             NUMBER(2)

SQL> alter table emp2 drop unused columns;

表已更改。



```



### 4.txt

```
SQL> create table student(
  2  									no number primary key
  3  								);

表已创建。

SQL> select * from tab;

TNAME                          TABTYPE  CLUSTERID                               
------------------------------ ------- ----------                               
DEPT                           TABLE                                            
EMP                            TABLE                                            
BONUS                          TABLE                                            
SALGRADE                       TABLE                                            
TEACHER                        TABLE                                            
TEACHER2                       TABLE                                            
STUDENTS                       TABLE                                            
TEACHER3                       TABLE                                            
EMP2                           TABLE                                            
EMP3                           TABLE                                            
STUDENT                        TABLE                                            

已选择11行。

SQL> desc user_constraints;
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------
 OWNER                                     NOT NULL VARCHAR2(30)
 CONSTRAINT_NAME                           NOT NULL VARCHAR2(30)
 CONSTRAINT_TYPE                                    VARCHAR2(1)
 TABLE_NAME                                NOT NULL VARCHAR2(30)
 SEARCH_CONDITION                                   LONG
 R_OWNER                                            VARCHAR2(30)
 R_CONSTRAINT_NAME                                  VARCHAR2(30)
 DELETE_RULE                                        VARCHAR2(9)
 STATUS                                             VARCHAR2(8)
 DEFERRABLE                                         VARCHAR2(14)
 DEFERRED                                           VARCHAR2(9)
 VALIDATED                                          VARCHAR2(13)
 GENERATED                                          VARCHAR2(14)
 BAD                                                VARCHAR2(3)
 RELY                                               VARCHAR2(4)
 LAST_CHANGE                                        DATE
 INDEX_OWNER                                        VARCHAR2(30)
 INDEX_NAME                                         VARCHAR2(30)
 INVALID                                            VARCHAR2(7)
 VIEW_RELATED                                       VARCHAR2(14)

SQL> select constraint_name,constraint_type,table_name from user_constraints;

CONSTRAINT_NAME                C TABLE_NAME                                     
------------------------------ - ------------------------------                 
FK_DEPTNO                      R EMP                                            
PK_DEPT                        P DEPT                                           
PK_EMP                         P EMP                                            
SYS_C005554                    P STUDENT                                        

SQL> drop table student cascade constraints;

表已删除。



SQL> create table student(
  2  									no number constraint pk_student primary key
  3  								);

表已创建。

SQL> select constraint_name,table_name from user_constraints;

CONSTRAINT_NAME                TABLE_NAME                                       
------------------------------ ------------------------------                   
FK_DEPTNO                      EMP                                              
PK_DEPT                        DEPT                                             
PK_EMP                         EMP                                              
BIN$KLdiHVOeS56aMchSINlJbg==$0 BIN$7w0avcgdQ8C+9X0Nhhdh0A==$0                   
PK_STUDENT                     STUDENT                                          

SQL> insert into student values(1);

已创建 1 行。

SQL> insert into student values(1);
insert into student values(1)
*
第 1 行出现错误: 
ORA-00001: 违反唯一约束条件 (SCOTT.PK_STUDENT) 


SQL> insert into student values(null);
insert into student values(null)
                           *
第 1 行出现错误: 
ORA-01400: 无法将 NULL 插入 ("SCOTT"."STUDENT"."NO") 


SQL> drop table student cascade constraints;

表已删除。

SQL> 								create table student(
  2  									no number constraint pk_student primary key ,
  3  									name varchar2(10),
  4  									phone varchar2(11) constraint uk_phone unique
  5  								);

表已创建。

SQL> insert into student(no,name,phone) values(2,'aaa','133');

已创建 1 行。

SQL> insert into student(no,name,phone) values(3,'bbb','133');
insert into student(no,name,phone) values(3,'bbb','133')
*
第 1 行出现错误: 
ORA-00001: 违反唯一约束条件 (SCOTT.UK_PHONE) 


SQL> insert into student(no,name,phone) values(3,'bbb',null);

已创建 1 行。

SQL> insert into student(no,name,phone) values(4,'ccc',null);

已创建 1 行。

SQL> select * from student;

        NO NAME       PHONE                                                     
---------- ---------- -----------                                               
         2 aaa        133                                                       
         3 bbb                                                                  
         4 ccc                                                                  

SQL> drop table student cascade constraints;

表已删除。

SQL> 								create table student(
  2  									no number constraint pk_student primary key ,
  3  									name varchar2(10) constraint nk_name not null,
  4  									phone varchar2(11) constraint uk_phone unique
  5  								);

表已创建。

SQL> insert into student(no,name) values(1,'aaa');

已创建 1 行。

SQL> insert into student(no,name) values(2,null);
insert into student(no,name) values(2,null)
                                      *
第 1 行出现错误: 
ORA-01400: 无法将 NULL 插入 ("SCOTT"."STUDENT"."NAME") 


SQL> drop table student cascade constraints;

表已删除。

SQL> 								create table student(
  2  									no number constraint pk_student primary key ,
  3  									name varchar2(10) constraint nk_name not null,
  4  									phone varchar2(11) constraint uk_phone unique,
  5  									sex char(1) constraint ck_sex check(sex in ('0','1'))
  6  								);

表已创建。

SQL> insert into student(no,name,sex) values(1,'aaa',null);//可以
  2  								insert into student(no,name,sex) values(2,'bbb','1');//可以
  3  
SQL> insert into student(no,name,sex) values(1,'aaa',null);

已创建 1 行。

SQL> insert into student(no,name,sex) values(2,'bbb','1');

已创建 1 行。

SQL> select * from student;

        NO NAME       PHONE       S                                             
---------- ---------- ----------- -                                             
         1 aaa                                                                  
         2 bbb                    1                                             

SQL> insert into student(no,name,sex) values(3,'ccc','2');
insert into student(no,name,sex) values(3,'ccc','2')
*
第 1 行出现错误: 
ORA-02290: 违反检查约束条件 (SCOTT.CK_SEX) 




```



### 5.txt

```
SQL> drop table student cascade constraints;

表已删除。

SQL> 								create table student(
  2  									no number constraint pk_student primary key ,
  3  									name varchar2(10) constraint nk_name not null,
  4  									phone varchar2(11) constraint uk_phone unique,
  5  									sex char(1) constraint ck_sex check(sex in ('0','1')),
  6  									cno number
  7  								);

表已创建。

SQL> desc student
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------
 NO                                        NOT NULL NUMBER
 NAME                                      NOT NULL VARCHAR2(10)
 PHONE                                              VARCHAR2(11)
 SEX                                                CHAR(1)
 CNO                                                NUMBER

SQL> create table team(
  2  									no number constraint pk_team primary key,
  3  									name varchar2(20)
  4  								);

表已创建。

SQL> 								insert into student(no,name,cno) values(1,'aaa',1);

已创建 1 行。



SQL> select * from team;

未选定行

SQL> select * from student;

        NO NAME       PHONE       S        CNO                                  
---------- ---------- ----------- - ----------                                  
         1 aaa                               1                                  

SQL> update student set cno=null;

已更新 1 行。

SQL> alter table student add constraint fk_student_team foreign key(cno)
  2  									references team(no);

表已更改。

SQL> select * from team;

未选定行

SQL> select * from student;

        NO NAME       PHONE       S        CNO                                  
---------- ---------- ----------- - ----------                                  
         1 aaa                                                                  

SQL> insert into team values(1,'team1');

已创建 1 行。

SQL> insert into team values(2,'team2');

已创建 1 行。

SQL> commit;

提交完成。

SQL> select * from team;

        NO NAME                                                                 
---------- --------------------                                                 
         1 team1                                                                
         2 team2                                                                

SQL> select * from student;

        NO NAME       PHONE       S        CNO                                  
---------- ---------- ----------- - ----------                                  
         1 aaa                                                                  

SQL> update student set cno=3;
update student set cno=3
*
第 1 行出现错误: 
ORA-02291: 违反完整约束条件 (SCOTT.FK_STUDENT_TEAM) - 未找到父项关键字 


SQL> update student set cno=null;

已更新 1 行。

SQL> update student set cno=1;

已更新 1 行。

SQL> commit;

提交完成。

SQL> select * from team;

        NO NAME                                                                 
---------- --------------------                                                 
         1 team1                                                                
         2 team2                                                                

SQL> select * from student;

        NO NAME       PHONE       S        CNO                                  
---------- ---------- ----------- - ----------                                  
         1 aaa                               1                                  

SQL> delete from team where no=1;
delete from team where no=1
*
第 1 行出现错误: 
ORA-02292: 违反完整约束条件 (SCOTT.FK_STUDENT_TEAM) - 已找到子记录 


SQL> spool off

```



### 建表语句：

```
--1.建表之前应该先删除表格.删除表格的时候，先删子表，后删主表
--2.建表的时候，要考虑主外键顺序

--删除表格
drop table student cascade constraints purge;
drop table team cascade constraints purge;


--建立表格
--constraint nk_tname not null(tname) not null不能这样定义
create table team(
	tno number constraint pk_team primary key,
	tname varchar2(20) constraint nk_tname not null
);

create table student(
	no number,
	name varchar2(10) constraint nk_name not null,
	sex char(1),
	phone varchar(11),
	tno number,
	constraint pk_student primary key(no),
	constraint ck_sex check(sex in('0','1')),
	constraint uk_phone unique(phone),
	constraint fk_student_team foreign key(tno) references team(tno)
);


--外键设置的时候，顺便设置级联删除
alter table student drop constraint fk_student_team;
alter table student add constraint fk_student_team foreign key(tno) references team(tno) on delete cascade;

alter table student drop constraint fk_student_team;
alter table student add constraint fk_student_team foreign key(tno) references team(tno) on delete set null ;

```



### 初始化数据脚本：

```
--插入数据，注意，先插入主表，后插入子表

--班级表
insert into team(tno,tname) values(1,'班级1');
insert into team(tno,tname) values(2,'班级2');
insert into team(tno,tname) values(3,'班级3');


--学生表
insert into student(no,name,sex,phone,tno) values(1,'aaa','0','133',1);
insert into student(no,name,sex,phone,tno) values(2,'bbb','1','134',1);

insert into student(no,name,sex,phone,tno) values(3,'ccc','0','135',2);
insert into student(no,name,sex,phone,tno) values(4,'ddd','1','136',2);

commit;

```



### 14题sql查询练习：

```
1.求工资高于公司平均工资的员工。
分析
sal,>,avg(),ename,empno,emp表
where sal>
子查询，嵌套子查询

select empno,ename
from
	emp
where
	sal>(select avg(sal) from emp)

2.求工资最高的员工姓名和工资（用组函数）。
select ename,sal
max
group by
having

select
	ename,sal
from
	emp
where
	sal =(select max(sal) from emp)




3.求工资最高的员工姓名和工资（不允许用组函数）。
select ename,sal 
from
	emp
where
	sal =(
select sal from (select sal from emp where sal is not null order by sal desc) where rownum=1
)

select ename,sal
from
	emp
where
	sal>=all(
		select sal from emp where sal is not null
	)


4.求工资高于所在部门平均工资的员工。
select 
	deptno,empno,ename,sal
from emp e
where
	sal>(
		select avg(sal)
		from
			emp e2
		where
			e.deptno=e2.deptno
	)
order by
	deptno



5.求平均工资最高的部门名称。
avg,max,dname(dept表）,sal(emp表）


select e.deptno,d.dname,avg(e.sal) avgsal
from
	emp e,dept d
where
	e.deptno=d.deptno
group by
	e.deptno,d.dname
having
	avg(sal)=(
			select 
				max(b.avgsal)
			from
			(select deptno,avg(sal) avgsal
			from
				emp e
			group by
				e.deptno
			) b
	)




6.列出各部门工资最高的员工信息（含部门编号、部门名称、员工姓名、员工工资，并按部门编号排序）。
deptno(emp,dept),dname(dept),ename(emp),sal(emp),连表查询，order by deptno

select
	e.deptno,d.dname,e.ename,e.sal
from
	emp e,dept d
where
	e.deptno=d.deptno
	and
	e.sal=(
		select max(sal) from emp e2
		where
			e.deptno=e2.deptno
	)
order by
	e.deptno



7.列出各部门平均工资及对应的工资等级。
group by deptno
avg(sal)
grade(salgrade表）

select
	a.*,s.grade
from
	(select deptno,avg(sal) avgsal
	from
		emp
	group by
		deptno
	) a,salgrade s
where
	a.avgsal between s.losal(+) and s.hisal(+)

8.列出各部门工资平均等级。

select
	a.deptno,d.dname,avg(a.grade) avggrade
from
	(
	select
		e.deptno,e.ename,e.sal,s.grade	
	from
		emp e,salgrade s
	where
		e.sal between s.losal and s.hisal
	) a,dept d
where
	a.deptno=d.deptno
group by
	a.deptno,d.dname


10.列出经理员工（拥有下级员工的员工）。
select
	e.deptno,e.empno,e.ename,e.sal
from
	emp e
where
	e.empno in(select mgr from emp)





11.求经理员工中平均工资最低的部门名称。
"经理表“
select
	a.deptno,d.dname,avg(a.sal) avgsal
from
	(	
		select
			e.deptno,e.empno,e.ename,e.sal
		from
			emp e
		where
			e.empno in(select mgr from emp)
	)a,dept d
where
	a.deptno=d.deptno
group by
	a.deptno,d.dname
having
	avg(a.sal)=(	
		select min(b.avgsal)
		from
			(
				select
					a.deptno,avg(a.sal) avgsal
				from
					(	
						select
							e.deptno,e.empno,e.ename,e.sal
						from
							emp e
						where
							e.empno in(select mgr from emp)
					)a
				group by
					a.deptno			
			)b
	)
------------------------------------------------------使用with子句
with basesql as(
select
	a.deptno,avg(a.sal) avgsal
from
	(	
		select
			e.deptno,e.empno,e.ename,e.sal
		from
			emp e
		where
			e.empno in(select mgr from emp)
	)a
group by
	a.deptno	
)
select 
	b1.deptno,d.dname,b1.avgsal
from
	basesql b1,dept d
where
	b1.avgsal=(	
		select min(b2.avgsal)
		from basesql b2
	)
	and
	b1.deptno=d.deptno

12.求平均工资的级别最低的部门名称。
求平均工资按部门分组
再求平均工资级别
再求最低的
with basesql as (
select
	a.*,s.grade
from
	(
	select
		e.deptno,avg(e.sal) avgsal
	from
		emp e
	group by
		e.deptno
	) a,salgrade s
where
	a.avgsal between s.losal and s.hisal
)
select
	b.deptno,d.dname,b.avgsal,b.grade
from
	basesql b,dept d
where
	b.grade = (select min(grade) from basesql)
	and
	b.deptno = d.deptno
13.求比普通员工最高工资高的经理员工姓名。
"经理员工表"
select
	e.deptno,e.empno,e.ename,e.sal
from
	emp e
where
	e.empno in(select mgr from emp)

"普通员工表"
select
	e.deptno,e.empno,e.ename,e.sal
from
	emp e
where
	e.empno not in(select mgr from emp where mgr is not null)


求普通员工最高工资是多少
select 
	max(sal)
from
	(
		select
			e.deptno,e.empno,e.ename,e.sal
		from
			emp e
		where
			e.empno not in(select mgr from emp where mgr is not null)	
	)

查询经理员工信息
select
	e.deptno,e.empno,e.ename,e.sal
from
	emp e
where
	e.empno in(select mgr from emp)
	and
	e.sal>(
		select 
			max(sal)
		from
			(
				select
					e.deptno,e.empno,e.ename,e.sal
				from
					emp e
				where
					e.empno not in(select mgr from emp where mgr is not null)	
			)
	)


14求工资最高的前5名员工姓名。
select
	b.*
from
	(
	select
		rownum rn,a.*
	from
		(select e.empno,e.ename,e.sal from emp e where e.sal is not null order by sal desc) a
	) b
where
	b.rn between 6 and 10
15.
求工资最高的前6-10名员工姓名。
```





## day05:



### 1.txt

```


SQL> conn scott/tiger
已连接。
SQL> show user
USER 为 "SCOTT"
SQL> create view view_emp10 as select deptno,ename,sal from emp where deptno=10;

视图已创建。

SQL> select * from tab;

TNAME                          TABTYPE  CLUSTERID                               
------------------------------ ------- ----------                               
DEPT                           TABLE                                            
EMP                            TABLE                                            
BONUS                          TABLE                                            
SALGRADE                       TABLE                                            
TEACHER                        TABLE                                            
TEACHER2                       TABLE                                            
STUDENTS                       TABLE                                            
TEACHER3                       TABLE                                            
EMP2                           TABLE                                            
EMP3                           TABLE                                            
STUDENT                        TABLE                                            

TNAME                          TABTYPE  CLUSTERID                               
------------------------------ ------- ----------                               
TEAM                           TABLE                                            
T_LESSON                       TABLE                                            
T_STU_PROFILE                  TABLE                                            
T_SCORE                        TABLE                                            
VIEW_EMP10                     VIEW                                             

已选择16行。

SQL> desc user_views;
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------
 VIEW_NAME                                 NOT NULL VARCHAR2(30)
 TEXT_LENGTH                                        NUMBER
 TEXT                                               LONG
 TYPE_TEXT_LENGTH                                   NUMBER
 TYPE_TEXT                                          VARCHAR2(4000)
 OID_TEXT_LENGTH                                    NUMBER
 OID_TEXT                                           VARCHAR2(4000)
 VIEW_TYPE_OWNER                                    VARCHAR2(30)
 VIEW_TYPE                                          VARCHAR2(30)
 SUPERVIEW_NAME                                     VARCHAR2(30)

SQL> select view_name from user_views;

VIEW_NAME                                                                       
------------------------------                                                  
VIEW_EMP10                                                                      

SQL> desc user_tables;
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------
 TABLE_NAME                                NOT NULL VARCHAR2(30)
 TABLESPACE_NAME                                    VARCHAR2(30)
 CLUSTER_NAME                                       VARCHAR2(30)
 IOT_NAME                                           VARCHAR2(30)
 STATUS                                             VARCHAR2(8)
 PCT_FREE                                           NUMBER
 PCT_USED                                           NUMBER
 INI_TRANS                                          NUMBER
 MAX_TRANS                                          NUMBER
 INITIAL_EXTENT                                     NUMBER
 NEXT_EXTENT                                        NUMBER
 MIN_EXTENTS                                        NUMBER
 MAX_EXTENTS                                        NUMBER
 PCT_INCREASE                                       NUMBER
 FREELISTS                                          NUMBER
 FREELIST_GROUPS                                    NUMBER
 LOGGING                                            VARCHAR2(3)
 BACKED_UP                                          VARCHAR2(1)
 NUM_ROWS                                           NUMBER
 BLOCKS                                             NUMBER
 EMPTY_BLOCKS                                       NUMBER
 AVG_SPACE                                          NUMBER
 CHAIN_CNT                                          NUMBER
 AVG_ROW_LEN                                        NUMBER
 AVG_SPACE_FREELIST_BLOCKS                          NUMBER
 NUM_FREELIST_BLOCKS                                NUMBER
 DEGREE                                             VARCHAR2(10)
 INSTANCES                                          VARCHAR2(10)
 CACHE                                              VARCHAR2(5)
 TABLE_LOCK                                         VARCHAR2(8)
 SAMPLE_SIZE                                        NUMBER
 LAST_ANALYZED                                      DATE
 PARTITIONED                                        VARCHAR2(3)
 IOT_TYPE                                           VARCHAR2(12)
 TEMPORARY                                          VARCHAR2(1)
 SECONDARY                                          VARCHAR2(1)
 NESTED                                             VARCHAR2(3)
 BUFFER_POOL                                        VARCHAR2(7)
 ROW_MOVEMENT                                       VARCHAR2(8)
 GLOBAL_STATS                                       VARCHAR2(3)
 USER_STATS                                         VARCHAR2(3)
 DURATION                                           VARCHAR2(15)
 SKIP_CORRUPT                                       VARCHAR2(8)
 MONITORING                                         VARCHAR2(3)
 CLUSTER_OWNER                                      VARCHAR2(30)
 DEPENDENCIES                                       VARCHAR2(8)
 COMPRESSION                                        VARCHAR2(8)
 DROPPED                                            VARCHAR2(3)

SQL> select table_name from user_tables;

TABLE_NAME                                                                      
------------------------------                                                  
DEPT                                                                            
EMP                                                                             
BONUS                                                                           
SALGRADE                                                                        
TEACHER                                                                         
TEACHER2                                                                        
TEACHER3                                                                        
EMP2                                                                            
EMP3                                                                            
STUDENT                                                                         
TEAM                                                                            

TABLE_NAME                                                                      
------------------------------                                                  
T_LESSON                                                                        
T_STU_PROFILE                                                                   
T_SCORE                                                                         
STUDENTS                                                                        

已选择15行。

SQL> select * from tab;

TNAME                          TABTYPE  CLUSTERID                               
------------------------------ ------- ----------                               
DEPT                           TABLE                                            
EMP                            TABLE                                            
BONUS                          TABLE                                            
SALGRADE                       TABLE                                            
TEACHER                        TABLE                                            
TEACHER2                       TABLE                                            
STUDENTS                       TABLE                                            
TEACHER3                       TABLE                                            
EMP2                           TABLE                                            
EMP3                           TABLE                                            
STUDENT                        TABLE                                            

TNAME                          TABTYPE  CLUSTERID                               
------------------------------ ------- ----------                               
TEAM                           TABLE                                            
T_LESSON                       TABLE                                            
T_STU_PROFILE                  TABLE                                            
T_SCORE                        TABLE                                            
VIEW_EMP10                     VIEW                                             

已选择16行。

SQL> desc view_emp10
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------
 DEPTNO                                             NUMBER(2)
 ENAME                                              VARCHAR2(10)
 SAL                                                NUMBER(7,2)

SQL> select * from view_emp10;

    DEPTNO ENAME             SAL                                                
---------- ---------- ----------                                                
        10 CLARK            2450                                                
        10 KING             5000                                                
        10 MILLER           1300                                                



```



### 2.txt



```
SQL> create view view_emp10 as select deptno,ename,sal,hiredate from emp where deptno=10;
create view view_emp10 as select deptno,ename,sal,hiredate from emp where deptno=10
            *
第 1 行出现错误: 
ORA-00955: 名称已由现有对象使用 


SQL> create or replace view view_emp10 as select deptno,ename,sal,hiredate from emp where deptno=10;

视图已创建。

SQL> desc view_emp10
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------
 DEPTNO                                             NUMBER(2)
 ENAME                                              VARCHAR2(10)
 SAL                                                NUMBER(7,2)
 HIREDATE                                           DATE

SQL> create or replace view view_emp10 as select deptno,ename,sal from emp where deptno=10;

视图已创建。

SQL> create or replace view view_emp10 as select deptno,ename,sal,sal*12 from emp where deptno=10;
create or replace view view_emp10 as select deptno,ename,sal,sal*12 from emp where deptno=10
                                                                *
第 1 行出现错误: 
ORA-00998: 必须使用列别名命名此表达式 


SQL> create or replace view view_emp10 as select deptno,ename,sal,sal*12 yearpay from emp where deptno=10;

视图已创建。

SQL> desc view_emp10
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------
 DEPTNO                                             NUMBER(2)
 ENAME                                              VARCHAR2(10)
 SAL                                                NUMBER(7,2)
 YEARPAY                                            NUMBER

SQL> select * from tab;

TNAME                          TABTYPE  CLUSTERID                               
------------------------------ ------- ----------                               
DEPT                           TABLE                                            
EMP                            TABLE                                            
BONUS                          TABLE                                            
SALGRADE                       TABLE                                            
TEACHER                        TABLE                                            
TEACHER2                       TABLE                                            
STUDENTS                       TABLE                                            
TEACHER3                       TABLE                                            
EMP2                           TABLE                                            
EMP3                           TABLE                                            
STUDENT                        TABLE                                            

TNAME                          TABTYPE  CLUSTERID                               
------------------------------ ------- ----------                               
TEAM                           TABLE                                            
T_LESSON                       TABLE                                            
T_STU_PROFILE                  TABLE                                            
T_SCORE                        TABLE                                            
VIEW_EMP10                     VIEW                                             

已选择16行。

SQL> desc view_emp10
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------
 DEPTNO                                             NUMBER(2)
 ENAME                                              VARCHAR2(10)
 SAL                                                NUMBER(7,2)
 YEARPAY                                            NUMBER

SQL> select * from view_emp10
  2  ;

    DEPTNO ENAME             SAL    YEARPAY                                     
---------- ---------- ---------- ----------                                     
        10 CLARK            2450      29400                                     
        10 KING             5000      60000                                     
        10 MILLER           1300      15600                                     

SQL> update view_emp10 set yearpay=30000 where ename='CLARK';
update view_emp10 set yearpay=30000 where ename='CLARK'
                      *
第 1 行出现错误: 
ORA-01733: 此处不允许虚拟列 


SQL> update view_emp10 set sal=3000 where ename='CLARK';

已更新 1 行。

SQL> create or replace view view_emp10 as select e.deptno,d.dname,e.ename,e.sal from emp e ,dept d where e.deptno=d.deptno and e.deptno=10;

视图已创建。

SQL> desc view_emp10;
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------
 DEPTNO                                             NUMBER(2)
 DNAME                                              VARCHAR2(14)
 ENAME                                              VARCHAR2(10)
 SAL                                                NUMBER(7,2)

SQL> select * from view_emp10;

    DEPTNO DNAME          ENAME             SAL                                 
---------- -------------- ---------- ----------                                 
        10 ACCOUNTING     CLARK            3000                                 
        10 ACCOUNTING     KING             5000                                 
        10 ACCOUNTING     MILLER           1300                                 

SQL> update view_emp10 set dname='ACCOUNTING2' where ename='CLARK';
update view_emp10 set dname='ACCOUNTING2' where ename='CLARK'
                      *
第 1 行出现错误: 
ORA-01779: 无法修改与非键值保存表对应的列 


SQL> SPOOL OFF

```



### 3.txt

```
SQL> create sequence myseq;

序列已创建。

SQL> desc user_sequences;
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------
 SEQUENCE_NAME                             NOT NULL VARCHAR2(30)
 MIN_VALUE                                          NUMBER
 MAX_VALUE                                          NUMBER
 INCREMENT_BY                              NOT NULL NUMBER
 CYCLE_FLAG                                         VARCHAR2(1)
 ORDER_FLAG                                         VARCHAR2(1)
 CACHE_SIZE                                NOT NULL NUMBER
 LAST_NUMBER                               NOT NULL NUMBER

SQL> select sequence_name,min_value,max_value,increment_by from user_sequences;

SEQUENCE_NAME                   MIN_VALUE  MAX_VALUE INCREMENT_BY               
------------------------------ ---------- ---------- ------------               
MYSEQ                                   1 1.0000E+27            1               

SQL> select myseq.nextval from dual;

   NEXTVAL                                                                      
----------                                                                      
         1                                                                      

SQL> select myseq.nextval from dual;

   NEXTVAL                                                                      
----------                                                                      
         2                                                                      

SQL> select myseq.nextval from dual;

   NEXTVAL                                                                      
----------                                                                      
         3                                                                      

SQL> select myseq.currval from dual;

   CURRVAL                                                                      
----------                                                                      
         3                                                                      

SQL> select myseq.currval from dual;

   CURRVAL                                                                      
----------                                                                      
         3                                                                      

SQL> select myseq.nextval from dual;

   NEXTVAL                                                                      
----------                                                                      
         5                                                                      

SQL> select myseq.nextval from dual;

   NEXTVAL                                                                      
----------                                                                      
        10                                                                      

SQL> select myseq.nextval from dual;

   NEXTVAL                                                                      
----------                                                                      
        11                                                                      

SQL> select myseq.nextval from dual;

   NEXTVAL                                                                      
----------                                                                      
        12                                                                      

```



### 4.txt

```
SQL> create sequence myseq2 start with 100 increment by -1;
create sequence myseq2 start with 100 increment by -1
*
第 1 行出现错误:
ORA-04008: START WITH 不能大于 MAXVALUE


SQL> create sequence myseq2 start with 100 increment by -1 maxvalue 100;

序列已创建。

SQL> select myseq2.nextval from dual;

   NEXTVAL
----------
       100

SQL> select myseq2.nextval from dual;

   NEXTVAL
----------
        99

SQL> select myseq2.nextval from dual;

   NEXTVAL
----------
        98

SQL> select myseq2.nextval from dual;

   NEXTVAL
----------
        97

SQL> select myseq2.nextval from dual;

   NEXTVAL
----------
        96

SQL> create sequence myseq3 start with 1 increment by 2 maxvalue 6;

序列已创建。

SQL> select myseq3.nextval from dual;

   NEXTVAL
----------
         1

SQL> select myseq3.nextval from dual;

   NEXTVAL
----------
         3

SQL> select myseq3.nextval from dual;

   NEXTVAL
----------
         5



SQL> create sequence myseq4 start with 1 increment by 2 maxvalue 6 cache 2 cycle
;

序列已创建。

SQL> select myseq4.nextval from dual;

   NEXTVAL
----------
         1

SQL> select myseq4.nextval from dual;

   NEXTVAL
----------
         3

SQL> select myseq4.nextval from dual;

   NEXTVAL
----------
         5

SQL> select myseq4.nextval from dual;

   NEXTVAL
----------
         1

SQL> desc emp
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------

 EMPNO                                     NOT NULL NUMBER(4)
 ENAME                                              VARCHAR2(10)
 JOB                                                VARCHAR2(9)
 MGR                                                NUMBER(4)
 HIREDATE                                           DATE
 SAL                                                NUMBER(7,2)
 COMM                                               NUMBER(7,2)
 DEPTNO                                             NUMBER(2)

SQL> create sequence seq_emp;

序列已创建。




SQL> insert into emp(empno,ename) values(seq_emp.nextval,'aaa');
insert into emp(empno,ename) values(seq_emp.nextval,'aaa')
*
第 1 行出现错误:
ORA-00001: 违反唯一约束条件 (SCOTT.PK_EMP)


SQL> select empno,ename from emp;

     EMPNO ENAME
---------- ----------
         1 哈哈
         2 呵呵
         3 啊啊
      7369 SMITH
      7499 ALLEN
      7521 WARD
      7566 JONES
      7654 MARTIN
      7698 BLAKE
      7782 CLARK
      7788 SCOTT

     EMPNO ENAME
---------- ----------
      7839 KING
      7844 TURNER
      7876 ADAMS
      7900 JAMES
      7902 FORD
      7934 MILLER

已选择17行。

SQL> insert into emp(empno,ename) values(seq_emp.nextval,'aaa');

已创建 1 行。

SQL> insert into emp(empno,ename) values(seq_emp.nextval,'aaa');

已创建 1 行。

SQL> insert into emp(empno,ename) values(seq_emp.nextval,'aaa');

已创建 1 行。

SQL> select empno,ename from emp;

     EMPNO ENAME
---------- ----------
         1 哈哈
         4 aaa
         5 aaa
         6 aaa
         2 呵呵
         3 啊啊
      7369 SMITH
      7499 ALLEN
      7521 WARD
      7566 JONES
      7654 MARTIN

     EMPNO ENAME
---------- ----------
      7698 BLAKE
      7782 CLARK
      7788 SCOTT
      7839 KING
      7844 TURNER
      7876 ADAMS
      7900 JAMES
      7902 FORD
      7934 MILLER

已选择20行。

SQL>
```



### 5.txt



```
SQL> desc user_indexes;
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------
 INDEX_NAME                                NOT NULL VARCHAR2(30)
 INDEX_TYPE                                         VARCHAR2(27)
 TABLE_OWNER                               NOT NULL VARCHAR2(30)
 TABLE_NAME                                NOT NULL VARCHAR2(30)
 TABLE_TYPE                                         VARCHAR2(11)
 UNIQUENESS                                         VARCHAR2(9)
 COMPRESSION                                        VARCHAR2(8)
 PREFIX_LENGTH                                      NUMBER
 TABLESPACE_NAME                                    VARCHAR2(30)
 INI_TRANS                                          NUMBER
 MAX_TRANS                                          NUMBER
 INITIAL_EXTENT                                     NUMBER
 NEXT_EXTENT                                        NUMBER
 MIN_EXTENTS                                        NUMBER
 MAX_EXTENTS                                        NUMBER
 PCT_INCREASE                                       NUMBER
 PCT_THRESHOLD                                      NUMBER
 INCLUDE_COLUMN                                     NUMBER
 FREELISTS                                          NUMBER
 FREELIST_GROUPS                                    NUMBER
 PCT_FREE                                           NUMBER
 LOGGING                                            VARCHAR2(3)
 BLEVEL                                             NUMBER
 LEAF_BLOCKS                                        NUMBER
 DISTINCT_KEYS                                      NUMBER
 AVG_LEAF_BLOCKS_PER_KEY                            NUMBER
 AVG_DATA_BLOCKS_PER_KEY                            NUMBER
 CLUSTERING_FACTOR                                  NUMBER
 STATUS                                             VARCHAR2(8)
 NUM_ROWS                                           NUMBER
 SAMPLE_SIZE                                        NUMBER
 LAST_ANALYZED                                      DATE
 DEGREE                                             VARCHAR2(40)
 INSTANCES                                          VARCHAR2(40)
 PARTITIONED                                        VARCHAR2(3)
 TEMPORARY                                          VARCHAR2(1)
 GENERATED                                          VARCHAR2(1)
 SECONDARY                                          VARCHAR2(1)
 BUFFER_POOL                                        VARCHAR2(7)
 USER_STATS                                         VARCHAR2(3)
 DURATION                                           VARCHAR2(15)
 PCT_DIRECT_ACCESS                                  NUMBER
 ITYP_OWNER                                         VARCHAR2(30)
 ITYP_NAME                                          VARCHAR2(30)
 PARAMETERS                                         VARCHAR2(1000)
 GLOBAL_STATS                                       VARCHAR2(3)
 DOMIDX_STATUS                                      VARCHAR2(12)
 DOMIDX_OPSTATUS                                    VARCHAR2(6)
 FUNCIDX_STATUS                                     VARCHAR2(8)
 JOIN_INDEX                                         VARCHAR2(3)
 IOT_REDUNDANT_PKEY_ELIM                            VARCHAR2(3)
 DROPPED                                            VARCHAR2(3)

SQL> select index_name,table_name from user_indexes;

INDEX_NAME                     TABLE_NAME                                       
------------------------------ ------------------------------                   
PK_EMP                         EMP                                              
PK_DEPT                        DEPT                                             

SQL> desc user_ind_columns;
 名称                                      是否为空? 类型
 ----------------------------------------- -------- ----------------------------
 INDEX_NAME                                         VARCHAR2(30)
 TABLE_NAME                                         VARCHAR2(30)
 COLUMN_NAME                                        VARCHAR2(4000)
 COLUMN_POSITION                                    NUMBER
 COLUMN_LENGTH                                      NUMBER
 CHAR_LENGTH                                        NUMBER
 DESCEND                                            VARCHAR2(4)

SQL> select index_name,table_name,column_name from user_ind_columns;

INDEX_NAME                     TABLE_NAME                                       
------------------------------ ------------------------------                   
COLUMN_NAME                                                                     
--------------------------------------------------------------------------------
PK_DEPT                        DEPT                                             
DEPTNO                                                                          
                                                                                
PK_EMP                         EMP                                              
EMPNO                                                                           
                                                                                

SQL> select empno,ename from emp where empno=7788;

     EMPNO ENAME                                                                
---------- ----------                                                           
      7788 SCOTT                                                                

SQL> select empno,ename from emp where ename='SMITH';

     EMPNO ENAME                                                                
---------- ----------                                                           
      7369 SMITH                                                                

SQL> create index idx_ename on emp(ename);
create index idx_ename on emp(ename)
                          *
第 1 行出现错误: 
ORA-00054: 资源正忙, 但指定以 NOWAIT 方式获取资源  


SQL> create index idx_ename on emp(ename);

索引已创建。

SQL> select empno,ename from emp where ename='SMITH';

     EMPNO ENAME                                                                
---------- ----------                                                           
      7369 SMITH                                                                

SQL> drop index idx_ename;

索引已删除。


```



### 6.txt

```
SQL> create synonym e for emp;
create synonym e for emp
*
第 1 行出现错误: 
ORA-01031: 权限不足 


SQL> conn test/test@teacher
已连接。
SQL> grant create synonym to scott;

授权成功。

SQL> conn scott/tiger@teacher
已连接。
SQL> create synonym e for emp;

同义词已创建。

SQL> select empno,ename from emp;

     EMPNO ENAME                                                                
---------- ----------                                                           
         1 哈哈                                                                 
         4 aaa                                                                  
         5 aaa                                                                  
         6 aaa                                                                  
         2 呵呵                                                                 
         3 啊啊                                                                 
      7369 SMITH                                                                
      7499 ALLEN                                                                
      7521 WARD                                                                 
      7566 JONES                                                                
      7654 MARTIN                                                               

     EMPNO ENAME                                                                
---------- ----------                                                           
      7698 BLAKE                                                                
      7782 CLARK                                                                
      7788 SCOTT                                                                
      7839 KING                                                                 
      7844 TURNER                                                               
      7876 ADAMS                                                                
      7900 JAMES                                                                
      7902 FORD                                                                 
      7934 MILLER                                                               

已选择20行。

SQL> select empno,ename from e;

     EMPNO ENAME                                                                
---------- ----------                                                           
         1 哈哈                                                                 
         4 aaa                                                                  
         5 aaa                                                                  
         6 aaa                                                                  
         2 呵呵                                                                 
         3 啊啊                                                                 
      7369 SMITH                                                                
      7499 ALLEN                                                                
      7521 WARD                                                                 
      7566 JONES                                                                
      7654 MARTIN                                                               

     EMPNO ENAME                                                                
---------- ----------                                                           
      7698 BLAKE                                                                
      7782 CLARK                                                                
      7788 SCOTT                                                                
      7839 KING                                                                 
      7844 TURNER                                                               
      7876 ADAMS                                                                
      7900 JAMES                                                                
      7902 FORD                                                                 
      7934 MILLER                                                               

已选择20行。

SQL> select empno,ename from e;

     EMPNO ENAME                                                                
---------- ----------                                                           
         1 哈哈                                                                 
         4 aaa                                                                  
         5 aaa                                                                  
         6 aaa                                                                  
         2 呵呵                                                                 
         3 啊啊                                                                 
      7369 SMITH                                                                
      7499 ALLEN                                                                
      7521 WARD                                                                 
      7566 JONES                                                                
      7654 MARTIN                                                               

     EMPNO ENAME                                                                
---------- ----------                                                           
      7698 BLAKE                                                                
      7782 CLARK                                                                
      7788 SCOTT                                                                
      7839 KING                                                                 
      7844 TURNER                                                               
      7876 ADAMS                                                                
      7900 JAMES                                                                
      7902 FORD                                                                 
      7934 MILLER                                                               

已选择20行。

SQL> select * from tab;

TNAME                          TABTYPE  CLUSTERID                               
------------------------------ ------- ----------                               
DEPT                           TABLE                                            
EMP                            TABLE                                            
BONUS                          TABLE                                            
SALGRADE                       TABLE                                            
VIEW_EMP10                     VIEW                                             
VIEW_EMO10                     VIEW                                             
VIEW_EMP100                    VIEW                                             
VIEW_EMP11                     VIEW                                             
E                              SYNONYM                                          
EMPVU10                        VIEW                                             

已选择10行。


```



### 7.txt

作业：

test_data.sql



第二次4题查询练习.sql



```
--第一题
select 
      tsp.stu_name,tsp.class_id,tson.lesson_name
from
  (
  select
    tsp.stu_id,tsn.lesson_id
  from
    t_lesson tsn,t_stu_profile tsp
  ) a,t_stu_profile tsp,t_lesson tson
where
  not exists(
      select 1
      from
       t_score ts
      where
       a.stu_id=ts.stu_id and a.lesson_id =ts.lesson_id
   )       
  and
  a.stu_id = tsp.stu_id
  and
  a.lesson_id = tson.lesson_id
order by
      stu_name     
      

--第二题
with basesql as (select 
  b.*,rownum rn
from
(
select
   a.*
from
  t_score a
order by 
      lesson_id,score desc
) b
)
,basesql2 as(
select 
  b1.lesson_id,min(b1.rn) rn2
from
       basesql b1
group by
      b1.lesson_id
),basesql3 as (
select
      b1.*,b1.rn-b2.rn2+1 as rn2
from
      basesql b1,basesql2 b2
where
      b1.lesson_id = b2.lesson_id
order by 
      b1.lesson_id,score desc
)
select 
       b3.lesson_id,tson.lesson_name,
       max(decode(b3.rn2,1,(
                         select
                          tff.stu_name
                         from
                          t_stu_profile tff,t_score tss,t_lesson tsonn
                         where
                          tff.stu_id = tss.stu_id
                          and
                          tss.lesson_id = tsonn.lesson_id
                          and
                          tsonn.lesson_id = b3.lesson_id
                          and
                          tss.score = b3.score
              
       )||'_'||score)) 第一名,
       max(decode(b3.rn2,2,score)) 第二名,
       max(decode(b3.rn2,3,score)) 第三名       
from 
      basesql3  b3,t_lesson tson
where
      b3.lesson_id = tson.lesson_id
group by
      b3.lesson_id,tson.lesson_name


--第三题
select
  aa.stu_id,tss.stu_name,count(score) sc
from
  (
  select
    a.*,nvl(ts.score,0) score
  from
    (
    select
      tsf.stu_id,tson.lesson_id
    from
      t_stu_profile tsf,t_lesson tson
    )a,t_score ts
  where
    a.stu_id = ts.stu_id(+)
    and
    a.lesson_id = ts.lesson_id(+)
  ) aa,t_stu_profile tss
where
  score<60
  and
  aa.stu_id = tss.stu_id
group by
      aa.stu_id,tss.stu_name
having
      count(score)>1


--第四题

with basesql as (
select
  aa.stu_id,avg(score) avgscore
from
  (
  select
    a.*,nvl(ts.score,0) score
  from
    (
    select
      tsf.stu_id,tson.lesson_id
    from
      t_stu_profile tsf,t_lesson tson
    )a,t_score ts
  where
    a.stu_id = ts.stu_id(+)
    and
    a.lesson_id = ts.lesson_id(+)
   ) aa
group by 
      aa.stu_id
)
select 
*
from
(
select 
      *
from
      basesql b
where
      b.avgscore=(
                select 
                     max(avgscore) maxavgscore
                from
                      basesql b)
) cc,(
select 
      *
from
      basesql b
where
      b.avgscore=(
                select 
                     min(avgscore) maxavgscore
                from
                      basesql b)
)dd
 
```



7.txt

jdbc



TestConnection.java



```
package com.mypack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class TestConnection {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		//连接的一些先决条件
		String username = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@202.119.105.2:1521:orcl";
		String driverClassName = "oracle.jdbc.OracleDriver";
		//注册数据库驱动
		Class.forName(driverClassName);
		
		//获取连接对象（Connection)
		Connection conn = DriverManager.getConnection(url,username,password);
		System.out.println("conn="+conn);		
		
		//通过连接对象再次取得语句对象（Statement)
		Statement stmt = conn.createStatement();
		//通过语句对象发送sql语句让数据库执行
		//执行之后，数据库把结果返回给java，使用结果集对象接受（ResultSet)
		String sql = "select empno,ename from emp";
		ResultSet rs = stmt.executeQuery(sql);
		
		//不一定每一次都有结果集，因为只有DQL语句有结果集。如果有结果就处理它
//		while(true){
//			boolean n = rs.next();//光标一开始在结果集第一行之前，next方法调用之后，会检查有没有下一行，同时有下一行的话，光标定位到下一行。
//			if(n){
//				int empno = rs.getInt(1);//取得时第一列内容（empno）
//				String ename = rs.getString("ename");//同时也可以这样rs.getString(2)
//				System.out.println(empno+" "+ename);
//			}
//			else{
//				break;
//			}
//		}			
		while(rs.next()){
			int empno = rs.getInt(1);//取得时第一列内容（empno）
			String ename = rs.getString("ename");//同时也可以这样rs.getString(2)
			System.out.println(empno+" "+ename);	
		}
		
		//关闭以上使用的资源例如：ResultSet,Statement,Connection
		//最近使用先关
		rs.close();
		stmt.close();
		conn.close();
		
	}

}

```



## day06 JDBC:



```
package com.mypack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		testConnection();		
	}
	
	public static void testConnection(){
		String username = "scott";
		String password = "tiger";
		String driverClassName = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:orcl";
		String sql = "select empno,ename,to_char(hiredate,'yyyy-mm-dd') from emp";
		Connection conn =null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driverClassName);
			conn = DriverManager.getConnection(url,username,password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				String empno = rs.getString(1);
				String ename = rs.getString("ename");
				String hiredate = rs.getString(3);
				System.out.println(empno+" "+ename+" "+hiredate);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(rs!=null){
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(stmt!=null){
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}

```





```
package com.mypack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDMLAndDDL {

	public static void main(String[] args) {
//		testDDL();
		testDQL();
	}
	public static void testDDL(){
		String driverClassName = "oracle.jdbc.OracleDriver";
		String username = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@202.119.105.2:1521:orcl";
		String sql = "create table emp2(empno number)";
		
		Connection conn = null;
		Statement  stmt = null;		
		try {
			Class.forName(driverClassName);
			conn = DriverManager.getConnection(url,username,password);
			stmt = conn.createStatement();
//			int updateRow = stmt.executeUpdate(sql);
//			System.out.println("插入 "+updateRow+"行记录");
			
			
//			int row = stmt.executeUpdate(sql);
//			System.out.println(row);
			
			boolean rst = stmt.execute(sql);
			System.out.println(rst);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(stmt!=null){
					stmt.close();
				}
				if(conn!=null){
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
	
	//演示boolean execute(String sql)方法执行DQL
	public static void testDQL(){
		String driverClassName = "oracle.jdbc.OracleDriver";
		String username = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@202.119.105.2:1521:orcl";
		String sql = "select ename from emp";
		
		Connection conn = null;
		Statement  stmt = null;		
		ResultSet rs = null;
		try {
			Class.forName(driverClassName);
			conn = DriverManager.getConnection(url,username,password);
			stmt = conn.createStatement();
			
			
			boolean rst = stmt.execute(sql);
			if(rst){
				//说明sql是DQL
				//如何取得结果集
				rs = stmt.getResultSet();
				while(rs.next()){
					System.out.println(rs.getString(1));
				}
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(rs!=null){
					rs.close();
				}
				if(stmt!=null){
					stmt.close();
				}
				if(conn!=null){
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
	
	public static void testDML(){
		String driverClassName = "oracle.jdbc.OracleDriver";
		String username = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@202.119.105.2:1521:orcl";
		String sql = "insert into emp(empno,ename) values(1000,'中文')";
		String sql2 = "update emp set sal=1000 where empno=1000";
		String sql3 = "delete from emp where sal<1000";
		Connection conn = null;
		Statement  stmt = null;		
		try {
			Class.forName(driverClassName);
			conn = DriverManager.getConnection(url,username,password);
			stmt = conn.createStatement();
			int updateRow = stmt.executeUpdate(sql);
			System.out.println("插入 "+updateRow+"行记录");
			
			updateRow = stmt.executeUpdate(sql2);
			System.out.println("更新 "+updateRow+"行记录");
			
			updateRow = stmt.executeUpdate(sql3);
			System.out.println("删除 "+updateRow+" 行记录");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(stmt!=null){
					stmt.close();
				}
				if(conn!=null){
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
	}
	

}

```





```
package com.mypack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestTCL {

	public static void main(String[] args) {
		updateMoney("ALLEN","中文",500);

	}
	/**
	 * 
	 * @param name1 转账人员
	 * @param name2	接收人员
	 * @param money 金额
	 */
	public static void updateMoney(String name1,String name2,double money){
		String driverClassName = "oracle.jdbc.OracleDriver";
		String username = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@202.119.105.2:1521:orcl";
		String sql = "update emp set sal=sal-"+money+" where ename='"+name1+"'";
		String sql2 = "update emp set sal=sal+"+money+" where ename='"+name2+"'";
		
		System.out.println(sql);
		System.out.println(sql2);
		
		Connection conn = null;
		Statement  stmt = null;		
		try {
			Class.forName(driverClassName);
			conn = DriverManager.getConnection(url,username,password);
			//开启手动提交事务
			conn.setAutoCommit(false);//boolean conn.getAutoCommit()
			
			
			stmt = conn.createStatement();
			
			stmt.executeUpdate(sql);
			stmt.executeUpdate(sql2);
			
			//执行一组DML语句之后（如果执行到commit说明之前的sql执行过程中没有报异常）
			conn.commit();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {			
			e.printStackTrace();
			if(conn!=null){
				try {
					conn.rollback();//回滚事务
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}finally{
			try {
				if(stmt!=null){
					stmt.close();
				}
				if(conn!=null){
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}

}

```



