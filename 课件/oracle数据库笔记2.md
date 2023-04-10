





学习方面：
	1.作业按时完成（检查学习情况）
	2.课间练习时间比原先多。（充分利用）
	3.回去多练习（讲解4个小时，1小时）。写到吐






​				

2.数据库



存储数据的地方？

变量 

数组

集合框架 List Set Map  运行在内存里面的，不能持久化保存



File+IO流  数据通过IO流可以写在文件里面



	为什么要学数据库？
		Student stu = new Student(???);
		writeToFile(stu);
	
		stu = new Student(???);
		writeToFile(stu);
	
		.....


		//查询某个学生，姓名中张



		此时如果有数据库的存在，执行以上功能（保存若干学生，之后再查询姓张的同学）

		关系型数据库  数据库里面的数据以表，字段的形式来存在
		一张表就相当于一个数据集合
		一行数据就相当于一个对象
		一个字段就相当于对象的一个属性
		
		dbms  database managesystem  数据库管理系统
		
		sql语句： 结构化查询语句 ，类似于自然语言
	
		insert into 学生表 values(???);
		......
	
		select ??? from 学生表 where 姓名 like '%张%';



		1.操作方便
		2.操作方式统一（电影，学生例子）
		3.效率要比自己写代码要高（数据库具体实现代码c编写的）


	市面上常见的数据库有哪些？
		oracle（甲骨文）
			靠数据库发家，数据库技术。java也属于oracle公司
		sqlserver(微软）
			sqlserver作为java编程人员使用不是太多，大项目中几乎不会用。
		db2（IBM）
			好，有点冷门
		mysql（瑞典一个公司，被sun收购，之后sun又被oracle收购）



	铁道部门：
		sqlserver，oracle
	
	政府部门，教育部门：
		sqlserver
	
	电力：
		db2，oracle
	
	电信：
		oracle，sybase（sqlserver）
		
	中小型企业： mysql



	学习难度？
		1.、具备初中英语知识
		2.select
		  from
		  where
		  group by
		  order by
		  having
		  insert
		  delete
		  update
		  drop
		  alter
		  create
		  .....
		  50个
		 3.5类SQL语句，先接触的DQL这一类是5类中最复杂的（绕人）
		 
		 DQL： Data Query Language  :数据查询语句，主要是查询，sql语句里面80%都是查询
			第二天第三天会接触到
		4.java访问数据库  jdbc
			5-6个类（接口）
			平均每个类3-4个方法


	安装和卸载
		。。。8i
		oracle 9i
		oracle 10g2
		oracle 11g
		oracle 12c
			i:internet网络
			g：grid网格技术
			c：cloud云技术
	
		卸载：10g，
			*.反安装程序直接卸载
			--------------------------------------
			*.进注册表卸载（9i的时候，必须这样）
				注册表
				|
				|
				HKEY_LOCAL_MACHINE
					|
					|
					|SOFTWARE
						|
					|	|ORACLE目录删除
					|
					|SYSTEM
						|
						|currentcontrolset
							|
							|
							services
								|
								|
								|
								5个oracle的服务
			*.把安装在磁盘上的oracle目录删除，有可能删不掉，因为其中有文件被os占用
			重启系统，再过去删除
	
			*.再把c:\program files\oracle目录给删除
	
		安装：
			注意点：
				计算机名称不要有中文
				安装路径中不要有中文，空格之类
					program files这个文件夹不要使用
				最好提供一个网线。（后续此oracle可以通过网络访问）
	
		oracle安装完毕后：
			其实它还有一个web应用程序随着oracle的安装，也安装完毕了。
			我们可以通过网页来访问oracle数据库。
	
			浏览器------》web应用----》oracle数据库
	
			我们可以不这样用。
	
			sqlplus---------->oracle数据库
				tcp/ip


			sqlplus.exe是oracle一个客户端软件，随着oracle的安装一起安装的。

			oracle数据库有3类账户：
			scott:  密码tiger
			system: 普通管理员
			sys: 系统管理员，权限最高  使用的时候后面必须加 as sysdbs
	
			sqlplus 用户名/账号@主机地址[ :端口号]/数据库名字
			sqlplus 用户名/密码    登录本机oracle数据库
	
	        例如：
	
	        sqlplus mytest/123456@localhost/mytestdb    
	
	        sqlplus mytest/123456@192.168.0.106:1521/mytestdb
	
			Microsoft Windows XP [版本 5.1.2600]
			(C) 版权所有 1985-2001 Microsoft Corp.
	
			C:\Documents and Settings\Administrator>sqlplus
	
			SQL*Plus: Release 10.2.0.1.0 - Production on 星期一 8月 11 11:15:22 2014
	
			Copyright (c) 1982, 2005, Oracle.  All rights reserved.
	
			请输入用户名:  sys
			输入口令:
	
			连接到:
			Oracle Database 10g Enterprise Edition Release 10.2.0.1.0 - Production
			With the Partitioning, OLAP and Data Mining options
	
			SQL>
			只要看到sql提示符说明已经登入到数据库了。


			**使用scott账户登入数据库，刚安装oracle之后，scottr账号是锁定状态的，需要解锁

			C:\Documents and Settings\Administrator>sqlplus scott/tiger

			SQL*Plus: Release 10.2.0.1.0 - Production on 星期一 8月 11 11:17:54 2014

			Copyright (c) 1982, 2005, Oracle.  All rights reserved.

			ERROR:
			ORA-28000: the account is locked


			**使用sys账号为scott解锁
				1.登入sys
				2.发送解锁命令
					alter user scott account unlock;
	
				3.重新使用scott账号登入（connect scott/tiger)
				Oracle Database 10g Enterprise Edition Release 10.2.0.1.0 - Production
				With the Partitioning, OLAP and Data Mining options
	
				SQL> alter user scott account unlock;
	
				用户已更改。
	
				SQL> connect scott/tiger
				ERROR:
				ORA-28001: the password has expired


				更改 scott 的口令
				新口令:
				重新键入新口令:
				口令已更改
				已连接。
				SQL> show user
				USER 为 "SCOTT"
				SQL>
	
	登入，退出
			C:\Documents and Settings\Administrator>sqlplus scott/tiger@teacher
	
			SQL*Plus: Release 10.2.0.1.0 - Production on 星期一 8月 11 11:27:37 2014
	
			Copyright (c) 1982, 2005, Oracle.  All rights reserved.


			连接到:
			Oracle Database 10g Enterprise Edition Release 10.2.0.1.0 - Production
			With the Partitioning, OLAP and Data Mining options
	
			SQL> select * from tab;
	
			TNAME                          TABTYPE  CLUSTERID
			------------------------------ ------- ----------
			DEPT                           TABLE
			EMP                            TABLE
			BONUS                          TABLE
			SALGRADE                       TABLE
	
			SQL> select * from dept;
	
			    DEPTNO DNAME          LOC
			---------- -------------- -------------
				10 ACCOUNTING     NEW YORK
				20 RESEARCH       DALLAS
				30 SALES          CHICAGO
				40 OPERATIONS     BOSTON
	
			SQL> show user
			USER 为 "SCOTT"
			SQL> quit
			从 Oracle Database 10g Enterprise Edition Release 10.2.0.1.0 - Production
			With the Partitioning, OLAP and Data Mining options 断开
	
			C:\Documents and Settings\Administrator>


	什么是sql语句？
		SQL:Structured Query Language(结构化查询语言）
			类似自然语言英语，用来操作数据库的，向数据库发送命令，数据库根据命令执行相关操作。


	sql语句分类（5类）
		DQL（Data Query Language）数据查询语言：数据的查询
				select
				from
				where
				....
		DML(Data Manipulation Language)数据操纵语言。数据的增删改操作
				insert
				delete
				update
				......
		TCL（Transaction Control Language)事务控制语言。搭配DML使用的
				commit
				rollback
				.....


		DDL(Data Define Language)数据定义语言。
				create
				alter
				.....
	
		DCL（Data Control Language)数据控制语言.用户的授权以及撤销
				grant
				revoke



	sql语句与sqlplus命令的区别

		sqlplus常用命令：

			show user(简写,sho user)
			从当前用户切换到另一个用户connect otheruser/password (conn )
			describe 查看表结构：(desc)


			sqlplus命令有个特征：
				1.可以简写
				2.可以不加分号


		sql命令：
			sqlplus接收之后，把他们传入数据库
			sql命令----》sqlplus软件------>数据库


数据类型：

 number： 数值类型

 char ： 字符类型: 有固定长度

varchar ： 可变长度的字符串

varchar2： 可变长度的字符串

date： 日期时间类型



​	基本的操作
​		先理解scott用户下4张表
​		dept（部门表）：
​		 DEPTNO		部门编号                                NOT NULL NUMBER(2)
​		 DNAME           部门名称                                   VARCHAR2(14)
​		 LOC             部门地址                                   VARCHAR2(13)


		emp（员工表）：
		EMPNO		员工编号                                     NOT NULL NUMBER(4)
		ENAME           姓名                                   VARCHAR2(10)
		JOB             岗位                                   VARCHAR2(9)
		MGR             经理编号                                   NUMBER(4)
		HIREDATE        入职日期                                   DATE
		SAL              月薪                                  NUMBER(7,2)
		COMM             提成                                  NUMBER(7,2)
		DEPTNO           部门编号                                  NUMBER(2)
	
		salgrade（工资级别表）:
		
		GRADE                级别                              NUMBER
		LOSAL                最低工资                              NUMBER
		HISAL                最高工资                              NUMBER


		查看用户下有哪些表？
			select * from tab; 查询该用户地下所有的表名


		查看某张表的表结构（列的定义信息，列的名称，列的数据类型等等）
			desc(ribe) 表名(;)
		
		在sql提示符下（登入了sqlplus），清除屏幕内容
			host cls
	
		select语句基本功能：
			1.选择列
			2.选择行
			3.连接查询


		select语句语法：
			select  *|distinct column|expression [alias]
			from	表名
			
		可以给字段，表名起别名， 空格 别名  或者  as 别名
	
		sql语句特征
			1。语句不区分大小写
			2.关键字不能换行或拆开或者简写
			3.如果语句复杂，可以换行缩进，增加可读性。
			4.信息内容是区分大小写


		算数表达式在查询语句中的使用：
			+,-,*,/,取余  取余不能使用%，必须使用mod()函数
	
			dual表的使用。
				维护语法完整性
				避免多个结果的出现
	
		查询中的空值（null）
			null值不是空字符，或者0，表示暂不适用，暂未分配
	
			null与任何数数学运算值都是null
			另外where条件中过滤null，必须使用is null或者is not null，不能写==null或者！=null
			null在运算过程中，可能会涉及到一个函数叫做nvl
			nvl(comm,0)  如果当第一个参数值为null时，自动选择参数2，如果不为空，还是参数1
	
		连字运算符号（||)	
			有点类似java中的字符串+操作
	
			还有一个函数也能完成拼接任务:concat()


		约束和排序数据：
			where子句来约束数据行
				比较条件：
					>,>=,<,<=,!=(<>,^=),=
					between...and：  在。。区间
					in(集合）
						not in后续的集合中不能有null值，否则查不出结果！！
					like 
						特殊字符：
							%:0-多个任意字符
							_：一个任意字符
						escape转义
							例如：
								select ename from emp where ename like '%\_%' escape '\';
					is null
	
				逻辑条件：
					and
					or
						类似java中 (&&,||)
					not
	
			order by子句来排序数据







		----------------------------------------------------------
			通过界面可以开关数据库
				控制面板--->管理工具---->服务---》5个oracle后台服务
				最后2个重要，其他都不重要


​			


			通过cmd窗口：
				实例开启与关闭：
					net start oracleservice实例名称
					net stop oracleserivce实例名称
	
				监听的开启与关闭
				lsnrctl.exe (listener control)  
					启动监听：lsnrctl start
					关闭监听：lsnrctl stop
	
			到目前为止查询（DQL）语句：
				select
				from	必须
				-----------------
				where	可选
				order by
				
				列别名只能在order by中使用，where中不能使用
				select ename,sal,sal*12 yearpay from emp order by yearpay




		oracle中内置函数
			单行函数与多行函数
	
			单行函数5类
				字符
					lower,upper,initcap,substr,instr,length,replace,trim,lpad,rpad
				数字
					round四舍五入,trunc截取,mod取余
				日期
					sysdate获取当前系统日期，sysdate不需要圆括号
					add_months加月到一个日期上
					months_between两个日期间隔的月
					next_day
					last_day 
					round:日是按16为入的开始，月7为入的开始
					trunc
					*日期加减一个数是另一个日期
					*两个日期相减操作，是间隔的天数
	
					日期：
					年月日时分秒
	
				转换
					to_char数字或者日期转换成字符（串）
					to_date字符转换成日期
					------------------------------
					to_number字符转换成数字
				通用
					nvl： 两个参数
						nvl(comm,0) 当薪资为null,返回0；不为null，返回其本身
					nvl2： 3个参数
						nvl2(comm,comm,0) 当薪资不为null时，返回第2个参数，否则，返回第3个参数
						
					nullif： 2个参数
						当2个参数不相等时，返回第一个参数；否则，返回空
					coalesce：任意多个参数
					- COALESCE是一个函数， (expression_1, expression_2, ...,expression_n)依次参考各参					数表达式，遇到非null值即停止并返回该值。如果所有的表达式都是空值，最终将返回一个空						值。使用COALESCE在于大部分包含空值的表达式最终将返回空值。		


				带分支判断的函数：
					decode
				    case表达式
	
						select 
							deptno,ename,sal ,decode(deptno,10,
										nvl(sal,0)+100,
										20,nvl(sal,0)+200,
										30,nvl(sal,0)+300,
										nvl(sal,0)+1) newsal,
							case
								when deptno=10 then
									nvl(sal,0)+100
								when deptno=20 then
									nvl(sal,0)+200
								when deptno=30 then
									nvl(sal,0)+300
								else
									nvl(sal,0)+1
							end as newsal2
						from 
							emp 
						order by 
							deptno


		连表查询(从多张表中获取数据)
			连表查询语法：
				以oracle语法为主，标准语法为辅


				查询员工姓名（emp表），以及它对应的部门名称（dept表）。
				SQL> select
				  2     e.ename,d.dname
				  3  from
				  4     emp e,dept d
				  5  where
				  6     e.deptno=d.deptno;
				连表查询时，注意表别名的使用，能提高查询效率。
			
			连接类型：
				等值连接：连接条件中使用等号运算符号
	
				非等值连接：连接条件是没有使用等号运算符
					例如：查询员工姓名，工资(emp)，以及工资对应的工资等级（salgrade)
					select
						e.ename,e.sal,s.grade
					from
						emp e,salgrade s
					where
						e.sal between s.losal and s.hisal


					之前的要求基础上，同时查出员工对应的部门名称，以及地址（dept）

				自连接：可以把一张表格想象成2张不同的表，从而进行连表查询。
					例如：取得员工编号(empno)，姓名(ename)，工资(sal)，
						以及它经理员工编号（mgr），经理员工姓名(ename)
				外连接:
					再满足连接条件的基础上，不满足连接条件的行（因为没有记录与之匹配）也会取出来。
	
				标准语法：
					外连接
					left [outer] join
					right [outer] join
					full [outer] join
	
					内连接：
						[inner] join


					关键字以及子句：
						on() :类似where书写连接条件
						using:
						cross join
						natural join:比较2长表中名称相同的列，自然作为条件连接起来


				外连接练习：
				例如：取得员工编号(empno)，姓名(ename)，工资(sal)，
						以及它经理员工编号（mgr），经理员工姓名(ename)
						里面king没有经理与之对应，因为king就是顶层boss。


​			
​		多行函数以及分组语句
​			多行函数（分组函数，聚合函数）：
​				avg
​				count
​				sum
​				max
​				min
​				。。。。


			分组语句
				group by
				having


			多行函数再select子句中出现的时候，要知道分组语句也会尾随而来
				例如：
				
					1.select count(*),sum(sal) from emp;
	
					以上例子中分组语句没有（显式）出现。实际上把emp所有记录当做一组看待。


					2.select 
						deptno,count(*),sum(sal) 
					from 
						emp
					group by
						deptno
					以上例子很好说明那句话
	
					同时要注意的问题：
						select子句中出现了多行行数，那么select子句中的自然列（没有组函数调用的）
						那么必须再group by子句中也出现，否则分组语句报错
					SQL> select
					  2          deptno,count(*),sum(sal)
					  3    from
					  4       emp;
						deptno,count(*),sum(sal)
						*
					第 2 行出现错误:
					ORA-00937: 不是单组分组函数


​			
​			
​	

			一条完整sql查询语句：
				select
				from
				--------------------
				where
				group by
				having
				order by


				having是对分组之后的行进行过滤。
				where是对数据进行过滤也是行过滤，只是在分组之前就过滤完毕了。
	
				如果能再where中过滤的，那么绝对不要拿到having中过滤




			子查询
				分类：
					嵌套子查询
						内部查询可以单独作为一条完整的查询语句
	
					关联子查询（相关子查询）
						内部查询不能独立作为一条查询语句来执行
				子查询再比较时候：
					单行运算符号
						>,>=,<,<=,!=,=
					多行运算符号
						in ,any,all
	
							all		any
					大于		大于最大	大于最小
	
					小于		小于最小	小于最大


				TOP-n分析，其实就是from子句中加上子查询
					rownum伪列（每个表都有这么一列）


				查询员工姓名，工资，部门编号，要求员工的工资高于本部门的平均工资。
				//使用嵌套子查询
				select 
					e.ename,e.sal,e.deptno 
				from 
					emp e,(select deptno,avg(sal) avgsal from emp group by deptno) e2
				where
					e.deptno=e2.deptno
					and
					e.sal>e2.avgsal



				//使用相关子查询：
				select
					e.ename,e.sal,e.deptno
				from 
					emp e
				where
					e.sal>(
						select avg(sal) avgsal
						from
							emp e2
						where
							e2.deptno=e.deptno
					)


				//子查询中关键字:exists(存在的意思）
				select e.ename,e.sal,e.deptno
				from
					emp e
				where
					exists(
						select 
							1 
						from
							emp e2
						where
							e.deptno=e2.deptno
						having
							e.sal>avg(e2.sal)
					)


			表中数据增删改（DML）
				insert
				update
				delete
				----------
				merge：合并表，使用B表合并表A，有则更新，无则添加
	
				搭配TCL
					commit
					rollback



				insert语法：
					insert into 表名[(列名称...)] values(列的值...);


					添加数据的时候会出现的问题：
						1.违反约束
							约束就再增删改操作过程中涉及的数据的一种检查方式
	
							SQL> insert into dept values(1,'研发n部',null);
							insert into dept values(1,'研发n部',null)
							*
							第 1 行出现错误:
							ORA-00001: 违反唯一约束条件 (SCOTT.PK_DEPT)
	
						2.数据长度违反表格定义的类型或者长度
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
				update语法：
					update 表名 set 列=列值[,列2=列值...] [where子句];
	
					update emp set sal=1800 where ename='SMITH';
	
					修改smith的工资等于2000，姓名等于斯密斯，雇佣日期是昨天
						update emp set sal=2000,ename='斯密斯',hiredate=to_date('2014-8-12','yyyy-mm-dd') where ename='SMITH';
	
					更新过程中注意点：
						1.约束
	
						2.最新的数据类型是否符合列中定义要求
						 或者数据长度超过列中定义的长度
	
				delete语法：
					delete [from] 表名称 [where条件];
				
					delete emp;
	
					删除过程中注意点：
						1.约束



				merge语法：
​					

					试验：
						1新建emp2表
						SQL> create table emp2(empno number,ename varchar2(10));
	
						表已创建。
	
						SQL> insert into emp2 values(1,'哈哈');
	
						已创建 1 行。
	
						SQL> insert into emp2 values(2,'呵呵');
	
						已创建 1 行。
	
						SQL> insert into emp2 values(3,'啊啊');
	
						已创建 1 行。
	
						SQL> commit;
	
						2.执行merge命令，把emp2合并到emp中
						 merge into emp e using emp2 e2
						 on(e.empno=e2.empno)
						 when matched then
						    update set e.ename=e2.ename
						 when not matched then
						    insert (e.empno,e.ename) values(e2.empno,e2.ename)


	------------------------------------------------
		昨天内容：
			子查询
			数据增删改（DML，TCL）需要记忆，灵活性没有DQL高



		管理表(DDL)
			操作：
				新建表格	create table  表格名称(列 数据类型[,列2 数据类型]);
				修改表结构
						alter table 表格名称	add	新添列
										注意点：
											新添的列名不能与原先存在的列同名
									drop	删除列
										注意点：
											表中至少要有一个列
									modify：修改列数据类型
										同类型长度调整
											注意点：改大可以改小要看表中实际数据最大长度而定
										不同类型调整
											注意点：
												列中有数据是不能跨类型修改的
									rename column xx to yy修改列的名称
									
									系统比较忙的时候，并且数据多情况下，删除列效率不好，
									可以使用先标记（set unused),后系统不忙的时候再(drop unused columns)
									set unused
									drop unused columns
	
				删除表格：drop table 表格名称 [purge] [cascade constraints]
				截断表格：truncate table 表格名称


				复制表：
					1.复制表的同时把数据也复制过来
						create table emp2 as select * from emp;
					2.只复制表结构
						create table emp2 as select * from emp where 1=2;
	
				对象重命名：rename 对象名称 to 新名称;


				命名规则：t_,X_
					例如：用户表 t_user
	
				schema(方案）：等同于用户名称
					解释：某个用户下所有对象的集合称为方案
			
				建表时候，涉及到列的数据类型：
					常用的数据类型有3类：
						数字（number)整数浮点数都能表示
						日期（date）
						字符(char,varchar,varchar2)
							char定长的字符
								无论数据占用多少长度，定义的长度必定会使用掉
								例如： ....
									name char(10)
									....
	
								insert into xxx(name) values('abc'); 'abc          ';实际使用10个长度
	
							varchar不定长的字符
								数据实际使用多少长度，最终就使用多少长度
								例如：
									....
									name varchar(10)
									....
								insert into xxx(name) values('abc'); 'abc' 实际使用3个长度
	
							oracle中药用varchar的话直接转成varchar2
					不常用的：
						clob（character large object）
						blob（binary large object）
						10g ：4g
	
					练习：
						1.定义student表格，至少4列，最好把常用的3个数据类型都用上。
						2.最好能进一步验证varchar,char之间的区别

​					

			约束：

				作用：
					DML操作的时候，对数据的一个限制（安全检查）
	
				分类(5类）：
					主键（符合约束，包含唯一以及非空）
					唯一（修饰的列的值必须是唯一的）
					非空（修饰的列必须要有值，不能有null值）
					检查（修饰的列必须符合检查的条件，条件是程序员安排的）
					外键（存在2张表之间）
						级联删除（on delete cascade)
						级联置空 (on delete set null )
				操作：
					添加约束
						时机：
							1建表的时候，顺便建立约束
								drop table student cascade constraints;
								create table student(
									no number constraint pk_student primary key ,
									name varchar2(10) constraint nk_name not null,
									phone varchar2(11) constraint uk_phone unique,
									sex char(1) constraint ck_sex check(sex in ('0','1')),
									cno number
								);
								//演示主键约束
								insert into student(no) values(1);
								insert into student(no) values(null);
								//越是唯一约束
								insert into student(no,name,phone) values(2,'aaa','133');
								insert into student(no,name,phone) values(3,'bbb','133');
								//演示非空约束
								insert into student(no,name) values(1,'aaa');
								insert into student(no,name) values(2,null);
								//演示检查约束
								insert into student(no,name,sex) values(1,'aaa',null);//可以
								insert into student(no,name,sex) values(2,'bbb','1');//可以
								insert into student(no,name,sex) values(3,'ccc','2');//不可以
								//演示外键约束
								insert into student(no,name,cno) values(1,'aaa',1);
	
							2.建表之后，再建约束
								create table team(
									no number constraint pk_team primary key,
									name varchar2(20)
								);
								alter table student add constraint fk_student_team foreign key(cno)
									references team(no);
						如何查看约束的名称：
							数据字典：user_constraints
					禁用约束
						alter table 表格名称 disable constraint 约束名称
					启用约束
						alter table 表格名称 enable constraint 约束名称
					删除约束
						alter table 表格名称 drop constraint 约束名称;

------------------------------------------------------------------------------
			其他数据库对象(DDL)
				视图（view）
					作用：使复杂查询简单化（简单在很长的查询语句，可以永久保存在数据库中，随时可以使用）
						限制数据的访问（相同的数据，通过不同的视图看到的信息不一样）
	
					视图的DML操作：
						简单视图是可以DML操作的
						而复杂视图是不可以进行DML操作的。建议不要对视图进行DML操作
	
						简单视图：1没有连表查询 2没有组函数（分组语句）
						复杂视图：1.有连表查询 2.有组函数调用


					视图特点：
						1.视图没有数据，查询视图的时候，那些数据是来源于视图底层的基表
						2.视图不能加快查询速度（客户---访问--》视图--》再访问底层的sql语句）
						3.永久存储在数据库中（即使数据库重启，视图的定义还在）
					语法：
						新建：
						create [or replace] view 视图名称 as 子查询;
	
						删除：
						drop view 视图名称
	
						查看视图的数据字典：
							user_views
	
						！！没有修改视图的语法。
	
				序列（sequence）
					作用：产生一个唯一的数。（通常用序列来自动填充表的主键列）
	
					语法：
						新建
						create sequence 序列名称 [start with 数字] [increment by 数字];
	
						修改序列：
						alter sequence .....
	
						删除序列
						drop sequence 序列名称;
						
						使用序列：
							序列中的伪列：currval，nextval
							例如：
								select 序列名称.nextval from dual;取得序列生成下一个数
								select 序列名称.currval from dual;取得序列生成当前的数
						数据字典：
							user_sequences
				索引（index）
					作用：加快查询速度。（索引与表中数据的关系就好比，书籍目录与书籍内容关系）


					特征：
						占用存储空间


					建立索引的原则：
						什么时候改建？
							*一个或多个列经常同时在一个WHERE子句中或一个连接条件中被使用
							*表很大，并且经常的查询期望取回少于百分之2 到4 的行多不


						什么时候不该建立？
							与该建立索引相反
					建立索引：
						1.隐式建立
							数据库默认行为，只要表中列上施加了unique约束，数据库自动为这列加上唯一索引
						2.显式建立
							程序员通过语句建立
	
					语法：
						新建
						create index 索引名称 on 表格(表格中的列)
						删除
						drop index 索引名称
					索引的使用：
						我们只管建立索引，而索引的使用以及调整是数据库来操作的。


				同义词（synonym）
					作用：为数据库中对象重新建立一个别名（是数据库对象）
	
					语法：
						建立
						create synonym 同义词名称 for 某个数据库对象;
	
						删除
						drop synonym 同义词名称;

​					


			控制用户访问（DCL）
				创建用户
					CREATE user 用户名 identified by 密码
	
				授权
					grant 权限[,权限n] to 用户[,用户2][,角色];
	
				角色
					什么是角色？
						一组权限的集合称为角色。主要是便于管理权限
					新建
						create role 角色名称;
					授权
						grant 权限[或者角色] to 角色名称;
					删除
						drop role 角色名称







		1.查询语句遗留
			集合查询
				4种类型：
					全联合（union all）	不排序	重复数据不过滤
					-------------------------------
					联合（union）		排序	过滤重复数据
					相交（intersect)	排序	
					相减（minus)		排序
	
				集合查询语句特征：
					1.其实就是多个独立的查询语句拼接一起，查出一个结果
					2.2个独立的查询列的个数要一致。同时对应位置上的数据类型也要一致


				例子：
					union all：
						select deptno,ename,sal from emp where deptno=10 
						union all 
						select deptno,ename,sal from emp where deptno=30;


					不使用标准语法，使用集合查询加上oracle的左外、右外连接查询出全外连接的结果


			分级查询
				语法：
					start with
					 connect by [prior]
					伪列：level层级意思


				例子：
					查出从king开始所有员工的关系(自上向下）
					SQL> select lpad(ename,length(ename)+(level-1)*2,'-') ename,level from emp start
						with ename='KING'  connect by prior empno=mgr;


					自下向上
					select lpad(ename,length(ename)+(level-1)*2,'-') ename,level from emp start
				            with ename='ADAMS'  connect by  PRIOR MGR=EMPNO ;
	
			后续一些关注点
				高级函数
					排名
						以前接触的伪列 rownum
						还有一个高级函数
						row_number()
	
						rank()
						dense_rank()


					---排名 rank,dense_rank
					select rank() over(order by sal desc) rk  ,
					       dense_rank() over(order by sal desc) rk2,
					ename,sal from emp where sal is not null;


					--排名
					select deptno,ename,sal,rank() over(partition by deptno order by sal desc) rk1 from emp 
					where sal is not null
					order by deptno
					;
	
				高级查询
					增强型的group by


		2.java访问数据库
			程序中发送sql语句（字符串）通过网络到数据库，然后数据库执行完毕（结果）
			再把结果回传到java程序中。


			访问oracle数据库为例：
				java中构造一个数据库类
	
				MyOracleAccess obj = new MyOracleAccess(serverIp,serverPort,username,password);
				String sql = "select ename from emp";
				MyOracleQueryResult rst = obj.executeSql(sql);
				//后续就是处理结果集
				//.....
	
				如果切换到另一个数据库
				肯定要再次学习类似MyOracleAccess这么一个类以及它的方法
	
				如果频繁的切换数据库也就意味着不停的要学习！！！



			JDBC(Java Database Connectivity)
				一套API（一些类与接口以及异常）
						
						程序员
						|
				-------------------------------|
				|			       |
				|		API	       |	
				|			       |	
				|------------------------------
						|
				-------------------------------|
				|			       |
				|SPI（service provider Interface） |	
				|			       |	
				|------------------------------

-------------------------------|			-------------------------------|							|			       |							|		API	       |								|			       |							|-----------------------------|			       |			
|		oracle	       |			|		mysql		|
|			       |			|				|
|------------------------------				|------------------------------
​		
			jdbc中最大的特色接口的数量多于类，编程的时候，面向接口编程。
			最终的好处：
				以一套固定的编程模型可以访问任意数据库。





			API中类与接口有哪些常用的：
				1他们所处的包叫做：java.sql.*,javax.sql.*
	
				2.目前常用的再java.sql.*
					类：
						DriverManager
						SQLException
					接口：
						Connection
						Statement
							|
							|PreparedStatement
							|CallableStatement
						ResultSet(、ResultSetMetaData）



​							

			一个完整的jdbc访问数据库：
				1.注册驱动
		修路		2.获取连接（Connection）
		买车		3.获得语句（Statement）
		拖货		4.执行sql
		卸货		5.返回结果（3种）：DQL（ResultSet),DML(int),SQLException
				6.如果结果是ResultSet，那么还存在解析它
		。。。		7.关闭资源（最近使用先关）


​			
​			*DML以及DDL操作
​				Statement接口中方法：
​					ResultSet executeQuery(String)	主要是针对DQL
​					boolean execute(String sql)一般而言就是留给DDL,DCL
​					int executeUpdate(String sql) 主要是针对DML，当然DDL也是可以的
​			
				！！！通常jdbc很少会大量的执行DDL。公司代码中甚至不会通过jdbc执行DDL。

			*DML操作过程中事务的处理：

				TCL语句，再jdbc中时以方法的形式存在的！！！

				*jdbc默认是自动提交事务（executeXXX方法执行完毕后，自动提交）
				*手动提交：
					步骤：
						1.获取Connection对象之后，显示把自动提交事务改成手动提交
							Connection.setAutoCommit(boolean autoCommit)
	
						2.try块中执行sql完毕后，手动提交（Connection.commit())
						如果try中抛出异常，那么在catch块中（Connection.rollback())


			*Statement子接口PreparedStatement介绍：
				*相比Statement而言，优势地方					
					1.防止sql注入
						例子：登录的例子
	
						PreparedStatement使用注意点：
							1.sql语句中有可能有问号
								String sql = "update emp set sal=? where empno=?";
								PreparedStatement pstmt = conn.prepareStatement(sql);
							2.调用执行方法之前一定要对问号用具体的值替换
								pstmt.setDouble(1,3000.0);
								pstmt.setInt(2,7788);
							3.执行代码
								pstmt.executeUpdate();


					2.效率（减少数据库中执行计划的产生）
						String sql = "insert into emp(empno,ename) values(1,'aa')";
						String sql2 = "insert into emp(empno,ename) values(2,'bb')";
						String sql3 = "insert into emp(empno,ename) values(3,'cc')";
	
						//......
	
						stmt.executeUpdate(sql);
						stmt.executeUpdate(sql2);
						stmt.executeUpdate(sql3);
	
						//.......
	
						stmt.executeUpdate(sql);当这句送入数据库之后
							数据库做以下事情：
								1.检查语法
								2.生成此语句的执行计划
								3.执行此sql语句
								4。返回结果给客户
						----------------------------------------------------
						//......
						pstmt  =conn.prepareStatement("insert into emp(empno,ename) values(?,?)";
	
						pstmt.setInt(1,1);
						pstmt.setString(2,"aa");
						pstmt.executeUpdate();
						
						pstmt.setInt(1,2);
						pstmt.setString(2,"bb");
						pstmt.executeUpdate();
						
						pstmt.setInt(1,3);
						pstmt.setString(2,"cc");
						pstmt.executeUpdate();
	
						//.......
	
						pstmt.setInt(1,1);
						pstmt.setString(2,"aa");
						pstmt.executeUpdate();当这句送入数据库之后
							数据库做以下事情：
								1.检查语法
								2.生成此语句的执行计划
										2.2保存此执行计划
								3.执行此sql语句
								4。返回结果给客户
						
						pstmt.setInt(1,2);
						pstmt.setString(2,"bb");
						pstmt.executeUpdate();执行这句的时候：
							数据库做以下事情：
								1.检查语法
								2.查看有没有与本次执行相关的执行计划
									2。1有直接用。无就新生成
								3.执行
								4.返回结果



			*Statement子接口CallableStatement介绍：
				*作用：主要是调用数据库中的存储过程。
	
				演示：
					1.再oracle数据库中编写一个过程和一个函数
					2.通过CallableStatement去调用之前建立的那个过程以及函数
	
				*存储过程的简单介绍：
					优势：执行效率
					不足：学习成本增加，另大型公司会用，小公司很少会用











			*数据库访问的封装：
				1.封装的理由
					jdbc访问数据库代码有个特征：
						1.初始化一些对象
						2.真正的操作（发送sql有可能每一次发送的sql不一样）
						3.清理第一步构造的对象
				2.如何封装
					自己写一个
					第三方



			*后续的任务
				配置数据库连接池（数据源）。通常在web项目中都是通过配置连接池的方式。
				来访问数据库。





			Connection中方法：
				Statement createStatement();
				void setAutoCommit(boolean autoCommit);
				boolean getAutoCommit();
				void commit();
				void rollback();
				void close();
	
			Statement中方法：
				boolean execute(String sql);
				ResultSet stmt.getResultSet();


				ResultSet executeQuery(String sql);
				int executeUpdate(String sql);
				void close();
				void addBatch(String sql)
				int[] executeBatch()
	
			PreparedStatement中方法：
				void setXXX(int index,XXX value) ;XXX就是一些常见的java数据类型尤其与数据库中的类型对应起来
								例如：java		数据库
									String		varchar，varchar2，char
									int		number
									double		number
									java.sql.Date		Date
									java.util.Date
				Result executeQuery()
				int executeUpdate()
				void addBatch()
				int[] executeBatch()


			CallableStatement中方法：
				String sql = "{call proc_raisesal(?,?)}";
				
				.....
				void setXXX(int colIndex,XXX value);
				void registerOutParameter(int colIndex,Types 数据库类型常量)
				XXX getXXX(int colIndex)
