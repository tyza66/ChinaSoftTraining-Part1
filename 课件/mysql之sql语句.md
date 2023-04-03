mysql之sql语句：



eg01:

```
-- 查看所有的数据库 show
show databases;
-- 创建新的数据库 create
create database mydata;
-- 删除数据库 drop
drop database mydata;

-- 选用数据库 use 数据库名
use test;
-- 查看数据库中的所有的表名
show tables;

-- 创建表 create TABLE
create table mytab(id int,name varchar(10));

create table mytab2(id int,name varchar(20));

-- 查看表结构 desc 
desc mytab;
desc mytab2;

-- 删除表 DROP
drop table mytab;
drop table if exists mytab;

-- 创建一张表 student
create table student(
id int PRIMARY key,
name varchar(10),
sex varchar(2),
age int

);

-- 创建一张表 成绩表
create table score(
	sid int,
	sname varchar(5),
	primary key(sid)
);

-- --------------------------------

-- 创建一张表
use test;

create table student2(
	id int,
  name varchar(10),
	sex varchar(2),
	age int,
	sid int
)

-- 查看所有的表
show tables;

-- 查看表结构
desc student2;

-- 修改性别类型
alter table student2 modify sex char(2) not null;

desc student2;

-- 修改表名
ALTER table student2 rename stu;

show tables;

desc stu;

-- 修改数据类型
alter table stu modify sex varchar(2) not null;

desc stu;

--  修改字段名
alter table stu change age sage double;

desc stu;

-- 添加字段
alter table stu add age int;

desc stu;

-- 向表中的第一位置添加字段
alter table stu add a int first;

desc stu;

-- 向表中已存在的字段后加入新字段
alter table stu add address varchar(20) after sage;

desc stu;

-- 删除字段
alter table stu drop sage;

desc stu; 

-- 修改现有字段的位置
alter table stu modify age int after sex;

desc stu;

-- 删除表
drop table stu;


	
```

eg02：

```
--整型
create table tmp1(
	x tinyint,
	x1 tinyint unsigned,
	y smallint,
	z mediumint,
	m int,
	n bigint
);
-- TINYINT	1 字节	(-128，127)
-- SMALLINT	2 字节	(-32 768，32 767)
-- MEDIUMINT	3 字节	(-8 388 608，8 388 607)
-- INT或INTEGER	4 字节	(-2 147 483 648，2 147 483 647)

-- 浮点型
create table tmp2(
	x FLOAT(5,1),
  y DOUBLE(5,1),
  z DECIMAL(5,1)
);

-- 日期时间

--  year格式 YYYY范围 1901-2155
create table tmp3(
	y year
);

insert into tmp3 values (97);
insert into tmp3 values (02);

-- time HH:MM:SS  '-838:59:59'/'838:59:59'
create table tmp4(
	t time
);

insert into tmp4 values ("10:06:04");
insert into tmp4 values ("3 02");
insert into tmp4 values ("2 10:10");
insert into tmp4 values ("235959");
insert into tmp4 values (CURRENT_TIME);
insert into tmp4 values (now());

-- date YYYY-MM-DD  1000-01-01/9999-12-31
create table tmp5(
	d date
);
insert into tmp5 values ('2022-04-27');
insert into tmp5 values ('20220326');
insert into tmp5 values ('220427');
insert into tmp5 values ('22-04-28');
insert into tmp5 values (CURRENT_DATE());
insert into tmp5 values (now());

-- datetime YYYY-MM-DD  HH:mm:ss  1000-01-01 00:00:00/9999-12-31 23:59:59

create table tmp6(
	d datetime
);

insert into tmp6 values('2022-04-05 11:20:12');
insert into tmp6 values(now());
insert into tmp6 values('20220405112212');

-- TIMESTAMP 注意时间戳的格式
create table tmp7(
	d TIMESTAMP
);
insert into tmp7 values ('22@05@03 03@13@33');

-- 字符串类型
-- char 固定长度  varchar 可变长度的字符串

create table tmp8(
	ch char(40),
 vch   varchar(40)
);

insert into tmp8 values('ab  ','ab  ');
select * from tmp8;
select ch,vch from tmp8;
select CONCAT(ch,vch) from tmp8;

--  ENUM 和set
create table tmp9(
	enm enum('first','second','third'),
	s set('a','b','c','d')
);
insert into tmp9(enm) values ('first');
insert into tmp9(enm) values (null);
insert into tmp9(enm) values ('abc');
insert into tmp9(s) values ('a');
-- insert into tmp9(enm) values ('a,b');-- 数据无法插入

-- 运算符 数学运算 + - * / %
create table tmp10(
	num int
);

insert into tmp10 values (64);

select num from tmp10;
select num ,num+10,num-10,num+5-3 from tmp10;
select 10+50;
select num,num*2,num/2,num%3 from tmp10;

-- 如果除数为0，返回null值
select num,num/0,num%0 from tmp10;


---------------------------------------------------
-- 比较运算 true为1 FALSE为0  null值和null值比较返回的是null值
-- 会自动将字符串2转换成数字2
select 1=0,2=2,'2'=2,'b'='b',(1+3)=(2+1),null=null,1=null;
-- 安全等于符号<=> 
-- <=>为NULL安全的等值比较运算符（NULL-safe equal），该操作符作用类似“=”。区别为当符号两边出现NULL值时，=操作符会返回NULL，而<=>会返回1（两边操作数都为NULL时）或者0（一边操作数为NULL） 
select 1<=>0,2<=>2,'2'<=>2,null<=>null,1<=>null;

-- 不等于<> != 大于等于 大于 小于等于 小于  null值和null值比较返回的是null值
select 'good'<>'god',1!=2,null<>null ,null!=null,1<>null;
select 'good'<='god',1<=2,4<=4,5.5<=5,(1+3)<=(1+2),null<=null;

-- 等式两边只要有一边为null，则结果为null

-- 等式两边只要有一边为null，则结果为null
-- 判断是否为null,判断是否为非null
select null is null,10 is null,10 is not null,isnull(10),isnull(null);

-- least 返回最小值 ，但是如果有null值，则返回null值
select least(20,12),least(20.5,3.0,89.5),least('a','b','c'),least(10,null);

-- greatest 返回最大值，但是如果有null值，则返回null值
select greatest(30,26),greatest(20.2,3.5,89.6),greatest('a','b','c'),greatest(10,null);

-- between and 在什么区间 前毕后毕区间 前后都包含在内
select 4 BETWEEN 4 and 6,6 between 4 and 6, 7 BETWEEN 4 and 6;

-- in  / not IN
-- 当null在in的左或者右，组中是否有null值，返回值都为null
-- 当左右两侧都没有null值，存在返回1，不存在返回0
select 'abc' in (1,2,3,'abc'),4 in (1,2,3,'abc');
select null in (1,2,3,'abc'),null in (1,2,3,'abc',null);
-- 当左侧不为null，右侧组中有null值，左侧存在，返回1；不存在返回null值
select 2 in (1,2,3,'abc',null),4 in (1,2,3,'abc',null);

-- not IN
select 'abc' not in (1,2,3,'abc'),4 not in (1,2,3,'abc');

select null not  in (1,2,3,'abc'),null not in (1,2,3,'abc',null);

select 2 not in (1,2,3,'abc',null),4 not in (1,2,3,'abc',null);

-- like 模糊查询    匹配符号 _匹配任意一个字符   %匹配任意多个字符
select 'stud' like 'stud','student' like 's%','stu' like 's_','student' like '%t';

-- REGEXP 正则表达式
select 'ssky' REGEXP '^s', 'ssky' REGEXP 'y$';


-- mysql中的函数
-- 数学函数
select abs(2),abs(-3.3),abs(-33);
select pi();
-- 求平方根
select sqrt(9),sqrt(40),sqrt(-49);
-- 取余
select mod(31,8),mod(234,10),mod(45.5,6);
-- 向上取整
select ceil(-3.35),CEILING(3.35),CEILING(3.95);
-- 向下取整
select floor(-3.35),FLOOR(3.35);
-- rand()  0<=val<=1
select rand(),rand(),rand();

select rand(1),rand(1),rand(11),rand(11);
-- sign() 判断正负
select sign(-5),sign(0),sign(100);
-- 求2的3次方
select pow(2,3);

```



eg03:

```
-- 字符串函数 char_length  LENGTH
select char_length("abc"),length("abc");
-- char_length函数可以计算unicode字符，包括中文等字符集的长度，而length函数用来计算普通字符的长度
select char_length("报错解决"),length("报错解决");

-- concat() 拼接字符串 
-- 拼接的时候只要有一个函数为null,则结果为null
select concat('mysql','5.5');
select concat('mysql',null,'5.5');
-- concat_ws() 函数 第一个参数是拼接符
-- 如果连接符为null,则返回null值
select concat_ws('-','2015','02','23');
select concat_ws('-','2015',null,'02','23');
select concat_ws(null,'2015','02','23');

-- lower lcase 转换成小写
select lower('ABC'),lcase('Abcd');
-- upper  ucase 转换成大写
select upper('abc'),ucase('Abcd');

-- LEFT 从左边开始截取5个字符
select left('football',5);

-- right 从右边开始截取4个字符
select right('football',4);
-- lpad 左补全字符
select lpad('9',3,'0'),lpad('009',4,'1');
-- rpad  右补全
select rpad('9',3,'0');
-- trim 去除空格  只能去除头部和尾部空格，中间空格不能去掉
select trim('  abd f ');
-- 还能去除指定的字符，只能去除头尾指定的字符
select trim( 'xy' from 'xy123456xy'),trim( 'xy' from 'xy123456xyx');

-- repeat  重复n次
select repeat('xyz',3);

-- insert 插入
select insert('football',1,3,'x');

-- replace  替换
select replace('abcdef','a','$');
-----------------------------------------------------------------------
-- elt 第一个参数就是要返回的元素位置
select elt(3,'a','b','c','d');

-- field:MySQL中的该函数用于返回指定值在给定值列表中的索引位置。例如，如果给定列表为(“3”，“1”，“2”)，
-- 并且值为要搜索其索引位置的“1”，则此函数将返回2作为索引位置
select field('hi','hey','hi','bar');
select field('ha','hey','hi','bar');

-- FIND_IN_SET
select find_in_set('hi','hey,hi,bar');
-- 0 没有找到，返回值是0
select find_in_set('ha','hey,hi,bar');
-- 如果值为null,则返回null值
select find_in_set(null,'hey,hi,bar');

-- 日期函数
-- 获取系统当前日期
select curdate(),current_date();

-- 获取系统当前的日期时间
select CURRENT_TIMESTAMP(),LOCALTIME(),now(),SYSDATE();
-- 获取long类型格式的时间
select UNIX_TIMESTAMP();
-- 获取系统当前的日期和时间
select utc_date(),utc_time();
-- month()   monthname()
select month('2022-02-12'),monthname('2022-02-12');

-- dayname()
select dayname('2022-05-06');
-- dayofweek()  一周的第几天 周日是第一天
select dayofweek(now());

-- 从周一开始的 周一是0 
select weekday(now());
-- 一年中的第几周
select week(now()),weekofyear(now());

-- 一年中的第几天，一个月中的第几天
select dayofyear(now()),dayofmonth(now());

-- 获取当前的分钟数，获取当前的秒数
select minute('10:03:06'),second('10:03:06');

-- 日期运算
-- DATE_ADD(,INTERVAL expr unit)
select date_add('2022-05-04 12:23:25',interval 1 second);

-- ADDDATE(date,INTERVAL expr unit) 增加指定的时间
select adddate(now(),interval 31 day);
-- subdate  减少指定的时间
select subdate(now(),interval 1 month);
-- addtime  添加时间
select addtime('15:08:44','02:00:00');
-- subtime 减少时间
select subtime('15:08:44','02:00:00');


-- 条件判断函数
-- if() 满足条件，返回第一个元素，否则，返回第二个元素
select if(1=2,'a','b');
-- ifnull()IFNULL() 函数用于判断第一个表达式是否为 NULL，如果为 NULL 则返回第二个参数的值，如果不为 NULL 则返回第一个参数的值
select ifnull('a','b');
select null+1,ifnull(null,0)+1;


-- 加密函数
-- password()
select password('123456'),password('12356');
-- MD5()
select md5('123456');
-- encode 加密 decode 解密
select encode('sercet','aaa'),encode('123','aaa');
select decode(encode('qwe','aaa'),'aaa');

```



eg04：

```
select * from emp;
select * from dept;
select * from emp where ename like 'S%' ;

-- and  与
select * from emp where ename like 'S%' and sal>1000;

select * from emp where ename like 'S%' and sal>1000 and deptno=10

-- or  或
select * from emp where ename like 'S%' ;
select * from emp where ename like 'S%' or sal>1000;

-- 优先级的使用 ()

select * from emp where deptno=20 and ename like 'S%' or sal>2000;
select * from emp where deptno=20 and (ename like 'S%' or sal>2000);

-- distinct 去除重复记录
-- 字段不重复
select DISTINCT job from emp;

-- 字段组合不重复
select distinct job,deptno from emp;

-- 行（记录）不重复
select distinct * from emp;

--  order by 排序 升序排序 正排序 默认是升序排序
select * from emp order by sal;
select * from emp order by sal asc;

-- 倒序排序 降序排列
select * from emp order by sal desc;

-- 多个字段排序，以第一个排序字段为主
select * from  emp order by sal asc,empno asc;
select * from emp order by sal desc,empno desc;


-- limit在sql语句的最后
--  limit[位置偏移量,]行数
select * from emp order by empno limit 5;
select * from emp order by empno limit 0,10
select * from emp order by empno limit 10,10

-- 聚合函数
-- count()  统计
select count(*) from emp;
select count(*) from emp where deptno=10;


-- sum() 求和
select sum(sal) from emp;
select sum(sal) from emp where deptno=10;


-- avg() 求平均值
select avg(sal) from emp;
select avg(sal) from  emp where deptno=10;

--  max() 求最大值
select max(sal) from emp;
select max(sal) from emp where deptno=10;

-- min() 求最小值
select min(sal) from emp;
select min(sal) from emp where deptno=10;

-- 分组函数 group by
select deptno from emp group by deptno;
select deptno,ename from emp group by deptno;

-- 按部门分组，查询该部门的最高工资
select deptno,max(sal) from emp group by deptno;

-- 按部门分组，查看各个部门的平均工资
select deptno,avg(sal) from emp group by deptno;

-- 按部门分组，查看各个部门的平均工资，并且平均工资不能小于2000
select deptno,avg(sal) from emp where avg(sal)>2000 group by deptno;-- 错误的
-- GROUP BY不能和where条件搭配使用，必须和having搭配使用
select deptno,avg(sal) from emp group by deptno having avg(sal)>2000;

-- 关键字的使用顺序
select deptno,max(sal) from  emp
where deptno <>10
group by deptno
having max(sal)>2000
order by deptno DESC
limit 1;
```

eg05:


```
-- 连表查询
select * from emp;
select * from dept;
-- 表的别名
select e.empno,e.ename,e.job  from emp e;
select emp.empno,emp.ename,emp.job from emp;
-- 字段别名
select e.empno as '员工编号',e.ename as '员工姓名',e.job as '岗位'  from emp e;

-- 等值条件查询
select e.empno,e.ename,e.job,d.dname from emp e,dept d where e.deptno=d.deptno

select empno ,ename,job,dname from emp e,dept d where e.deptno=d.deptno

select empno ,ename,job,dname from emp e,dept d where e.deptno=d.deptno and e.deptno=10;

select * from loc;

-- 三表等值连接
select * from emp e,dept d,loc l where e.deptno=d.deptno and d.locid=l.locid;

select empno,ename,job,dname,lname from emp e,dept d,loc l where e.deptno=d.deptno and d.locid=l.locid;

-- 和等值连接效果一样（inner join..on  ,inner可以省略）
select empno,ename,job,dname from emp e inner join dept d on (e.deptno=d.deptno);

select empno,ename,job,dname from emp e join dept d on (e.deptno=d.deptno);

select empno,ename,job,dname,lname from emp e join dept b on (e.deptno=b.deptno) join loc c on (b.locid=c.locid);


-- 笛卡尔乘积
select * from emp cross join dept;

-- 外连接
-- 左外连接 left outer join ..on   outer可以省略
-- 显示左边表和右边表相匹配上的记录，以及没有匹配上的左边表的记录
select empno,ename,job,dname from emp e left outer join dept d on (e.deptno=d.deptno);

-- 右外连接 right outer JOIN...ON
-- 显示左边表和右边表相匹配上的记录,以及没有匹配上的右边表的记录
select empno,ename,job,dname from emp e right join dept d on(e.deptno=d.deptno);

-- mysql里面没有全外连接
-- 自连接
select a.empno,a.ename,a.mgr,b.ename from emp a,emp b where a.mgr=b.empno;

select a.empno,a.ename,a.mgr,b.ename from emp a left join emp b on (a.mgr=b.empno);

select a.empno,a.ename,a.mgr,b.ename from emp a right join emp b on (a.mgr=b.empno);



-- 子查询
-- any 满足一条即可
select * from emp where sal >any (select sal from emp);
select * from emp where sal <any (select sal from emp);

-- all 必须同时满足 就是>=最大值
select * from emp where sal >=all (select sal from emp);
-- <=最小值 
select * from emp where sal <=all (select sal from emp);

-- 单行子查询
select * from emp where sal >(select avg(sal) from emp);

-- 多行子查询
select * from emp where sal in (select sal from emp where sal>2000);
select * from emp where deptno in(select deptno from dept where dname in ('ACCOUNTING','SALES'));
-- 跟上句效果等效的
select e.* from emp e,dept d where e.deptno=d.deptno and d.dname in ('ACCOUNTING','SALES')

-- exists / not EXISTS
-- exists() 括号中的子查询如果返回0条记录，则可以将该条件看成1=2
-- 返回的不是0条记录的话，可以看成1=1
-- not exists 和exists是相反的
select * from emp where 1=2;

select * from emp where exists (select ename from emp where ename='TOM') and sal>=3000;
-- 相当于查询所有
select * from emp where not EXISTS (select ename from emp where ename='abc');


```

