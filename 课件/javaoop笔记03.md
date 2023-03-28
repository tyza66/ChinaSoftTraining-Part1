javase:  java初级； java  数据类型 变量 分支判断循环  javaoop 异常 File  IO流 多线程

javaee:  java中级：  java面向web的服务器端编程  www.baidu.com  www.taobao.com

​	servlet  jsp  jstl el表达式

高级：  java框架   ： 程序的设计方式  ssm   spring springmvc mybatis  springboot  springcloud



项目： springboot ｓｓｍ　微服务项目



ｈｒ　面试　　　技术面试　　项目经理面试



简历　项目经验





前２个月　：　ｊａｖａｓｅ　　　ｏｒａｃｌｅ数据库　ｊｄｂｃ　　ｈｔｍｌ　ｊｓ　ｃｓｓ　ｈｔｍｌ５　ｃｓｓ３　ａｊａｘ　异步访问后台的技术　ｊｑｕｅｒｙ












学习要求：

	1. 不要迟到。请假

	2. 少看多练

	3. 问题0积累

	4. 上课之前一定要交手机

什么是java：

## java特点


	java是一门编程语言，用来通过代码的形式来解决某种问题


	java 其实是后缀名以.java来结尾的文件

1. 简单性    简单易学，容易上手

2. 健壮性    内部安全，机制健全，不容易出错

3. 安全性   内部规则多，限制多，相对安全
4. 跨平台性  可以在不同的平台上使用 平台指操作系统
5. 面向对象性   java涵盖的范围的比较广，可以将任何事物作为编程对对象，无所不能
6. 分布性   一个程序可以分布在不同的电脑上面运行

   记事本文件后缀名修改为.java


开发工具：


	记事本工具+ dos

	集成开发工具 MyEclipse  idea






java的发展史：


	java之父
	了解




java开发需要一个平台：


	jdk(java delevoplement kit)  java开发工具集


	安装方式和普通软件一样 ，直接next


	注意：  安装路径后不要出现中文字样

	安装后需要配置环境变量：

	安装路径：C:\Program Files\Java\jdk1.8.0_172\bin

	环境变量：

	右键属性---高级---环境变量---系统变量 

	配置两个：

	变量名  JAVA_HOME    变量值：C:\Program Files\Java\jdk1.8.0_172
	变量名： path        变量值： 新建：%JAVA_HOME%\bin
	
	确定 Ok


​	
​	




	如何验证jdk是否安装成功？



	运行----cmd---回车-----javac    

	如果出现：



Microsoft Windows [版本 6.1.7601]
版权所有 (c) 2009 Microsoft Corporation。保留所有权利。

```
C:\Users\xikuang>javac
用法: javac <options> <source files>
其中, 可能的选项包括:
  -g                         生成所有调试信息
  -g:none                    不生成任何调试信息
  -g:{lines,vars,source}     只生成某些调试信息
  -nowarn                    不生成任何警告
  -verbose                   输出有关编译器正在执行的操作的消息
  -deprecation               输出使用已过时的 API 的源位置
  -classpath <路径>            指定查找用户类文件和注释处理程序的位置
  -cp <路径>                   指定查找用户类文件和注释处理程序的位置
  -sourcepath <路径>           指定查找输入源文件的位置
  -bootclasspath <路径>        覆盖引导类文件的位置
  -extdirs <目录>              覆盖所安装扩展的位置
  -endorseddirs <目录>         覆盖签名的标准路径的位置
  -proc:{none,only}          控制是否执行注释处理和/或编译。
  -processor <class1>[,<class2>,<class3>...] 要运行的注释处理程序的名称; 绕过默认的搜索进程
  -processorpath <路径>        指定查找注释处理程序的位置
  -parameters                生成元数据以用于方法参数的反射
  -d <目录>                    指定放置生成的类文件的位置
  -s <目录>                    指定放置生成的源文件的位置
  -h <目录>                    指定放置生成的本机标头文件的位置
  -implicit:{none,class}     指定是否为隐式引用文件生成类文件
  -encoding <编码>             指定源文件使用的字符编码
  -source <发行版>              提供与指定发行版的源兼容性
  -target <发行版>              生成特定 VM 版本的类文件
  -profile <配置文件>            请确保使用的 API 在指定的配置文件中可用
  -version                   版本信息
  -help                      输出标准选项的提要
  -A关键字[=值]                  传递给注释处理程序的选项
  -X                         输出非标准选项的提要
  -J<标记>                     直接将 <标记> 传递给运行时系统
  -Werror                    出现警告时终止编译
  @<文件名>                     从文件读取选项和文件名


C:\Users\xikuang>javac -version
javac 1.8.0_172

```





---------------------------------------


说明安装配置成功



jdk的安装：


	1. 直接安装jdk,不要出现中文字样、


	下载jdk:  http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

	2. 配置环境变量


	计算机---右键---属性----高级-----环境变量----系统变量-----path


	复制java的安装路径直到bin根目录；粘贴搭配path值的最前面，注意后面加上一个英文分号;


	3. 验证 cmd----javac




java特点：


	1. 简单性    简单易学，容易上手

	2. 健壮性    内部安全，机制健全，不容易出错

	3. 安全性   内部规则多，限制多，相对安全
	4. 跨平台性  可以在不同的平台上使用 平台指操作系统
	5. 面向对象性   java涵盖的范围的比较广，可以将任何事物作为编程对对象，无所不能
	6. 分布性   一个程序可以分布在不同的电脑上面运行




	java应用：   企业应用级别开发；Android  也以java为基础  大数据，云计算里面也有java代码

	C;     驱动程序或者底层开发，难学，灵活性太大



	写java文件一般默认把显示文件后缀名给勾选上 控制面板--文件夹选项

	Test.java文件

	编写并运行java 文件：



		public class Test{

			public static void main(String[] args){

				System.out.println("hello world!!!");
			}
		}

注意：

	1.  class后面的单词叫类名；类名必须和文件名保持一致；文件名可以随便写，但是必须符合命名规则

	2.  public static void main(String[] args){}  是main方法，是主方法，固定写法；是程序的入口，必须经过main方法才能访问程序


	3.  System.out.println("hello world!!!");   输出语句；表示把""里面的东西原样输出到控制台上面


	4. System，String 中的S是大写的，区分大小写

	5. 里面的标点符号全部都是英文的，除了""内部的标点符号

	6. 每个单词之间都要有至少一个空格；空格或者换行的个数没影响


	当文件中的代码改动过后，必须重新编译




类名/文件名的命名规则：



	1.  类名由英文字母，数字，中文或者特殊符号$或者_组成

	2. 不能以数字开头

	3. 类名建议首字母大写


​	

-------------------------------------------------------------------------



1.  先切换到要执行的java文件所在的目录



	cd /d  文件所在路径



2.  编译该java文件


	javac   文件名.java
	编译成功之后会生成一个特ｃｌａｓｓ文件
3. 执行该java文件


	java 文件名
```

C:\Users\Administrator>cd /d D:\中软103\代码\0307

D:\中软103\代码\0307>javac Test.java

D:\中软103\代码\0307>java Test
hello world

D:\中软103\代码\0307>
```





常用的快捷键：


	ctrl+s  保存   ctrl+c  复制  ctl+v 粘贴

	ctrl+a  全选   ctrl+z  撤销  ctrl+d 删除


	shift+小写字母=大写字母



	注意：  代码改动过后，记得随手保存


		main方法内部每一行代码结束后面都要有英文分号;  表示该语句结束


	\t  表示制表符 表示绝对空格8个  \n 表示打印空行   都放在""里面


	System.out.println();  表示打印空行





	java文件经过先编译后执行的过程


	编译后会生成一个二进制编码的class文件，他是一个中间文件；

	执行其实是执行的是编译后生成的该class文件





## 变量和数据类型


常量：   固定不变的值  "aaa"   123  100    3.4　　　　　　　

变量：   某个值可以用一个字母形式的变量来表示，变量随着他的值的变化而变化



### 变量的命名规则：


	和类名一样  字母，汉字，数字或者特殊符号$ 或者 _  ，不能以数字开头

	变量名一般首字母小写，驼峰式命名法
	不能是java关键字　　ｉｎｔ　ｂｒｅａｋ　ｂｙｔｅ　ｓｈｏｒｔ



变量定义的时候必须指明他的数据类型


带""的都是String 类型  即字符串类型

String s="aaa";



	注释：


		注释是对程序或者代码的说明，很好的解释了程序，有不影响程序代码的执行


		/**
		*
		*/   文档注释
		
		//   单行注释
	
		/*
		
			多行注释
		*/





### 数据类型：



		基本数据类型：  8种
			数值：数学意义上的数值
				整数：
	
					表示范围不一样
	
					byte(字节型) short（短整型） int（整型） long（长整型）
	            小数：
	
					float (单精度)  double（双精度）
			字符：    
	
				只能表示单个字符或者单个汉字
				char  (字符型)		
	            
	        判断：
	
				boolean(布尔类型)=====只有两个值 true/false
		引用数据类型：
		
			String (字符串类型)  数组 类 接口	



字符串例子：

```
public class Test2 {

    public static void main(String[] args) {
        String s="abcde";//字符串类型 s就是变量 abcde就是变量的值
        System.out.println("s");//s  加""都是字符串，都原样输出
        System.out.println(s);//abcde  输出变量其实就是输出变量的值
        System.out.println(s+"abc");//+ 起拼接的作用 将变量和字符串拼接起来
    }
}

```



----------------------------------------------


	定义变量：


		int i=3; String s="abc";  类型 变量=值；




-----------------------------------------------------------
### 表示范围：

了解：


	类型    	位数 		表示范围


	byte    	8		-2的7次方------2的7次方-1   -128---127

	short      	16		-2的15次方------2的15次方-1

	int 		32		-2的31次方------2的31次方-1

	long    	64		-2的63次方------2的63次方-1


	float		32		-2的31次方------2的31次方-1

	double          64		-2的63次方------2的63次方-1



	byte===> short===>int====>long===>float====>double  表示范围依次增大

```

public class TestType {
    public static void main(String[] args) {

        //演示8种基本数据类型
        //整数 byte short int long
        byte b=127;// -128--127
        short s=12;
        int i=23;
        long l=23434;

        //浮点类型
        float f=3.4f;//定义的时候后面必须加f
        double d=23.34;

        char ch='有';//char类型的字符使用''单引号来表示 表示单个字符或者单个汉字
        boolean bl=false;//只有2个值 true /false

        //String类型 属于引用数据类型
        String str="hello";

        System.out.println(b+" "+s+" "+i+" "+l+" "+f+" "+d+" "+ch+" "+bl+" "+str );

    }
}
```

```
public class Person{

	public static void main(String[] args){


		int id=1001;
		String name="张三";
		int age=23;
		char sex='男';
		double weight=123.5;

		System.out.println("编号： "+id);
		System.out.println("姓名："+name);
		System.out.println("年龄："+age);
		System.out.println("性别："+sex);
		System.out.println("体重："+weight);
		
}
}
```



```
public class BBB{

	public static void main(String[] args){


		//System.out.println("aaa");//打印之后并换行
		System.out.print("aaa");//直接打印并不换行
		System.out.println("123");
}
}
```



```

public class Test2 {
	public static void main(String[] args) {
		//数据定义
		//类型 变量=值；
		int i=3;
		//int i=5;  重复定义 非法的  一个变量只能被定义一次
		i=5;    //重新赋值  合法的  
		System.out.println(i);
		
		//类型 变量；
		int j;
		j=8;
		
		System.out.println(j);//变量没有初始化值不能被输出
		
		//快速注释：  选中内容  ctrl+shift+/
		//快速解注：  选中内容  ctrl+shift+\
		/*int m=12;
		int n;
		int k=18;*/
		
		int m=12,n,k=18;//也可以一次定义
		
		n=13;
		k=81;
		
		System.out.println(m+" "+n+" "+k);
	}

}

```



## 运算符：




	数学运算符：		+ 加	- 减	* 乘	/ 整除	% 取余


	比较运算符：        	>  >=  <  <=  ==    !=



	三目运算符：	

				boolean条件表达式 ? 表达式1 :  表达式2 ;
				如果条件表达式为true时，执行表达式1；否则执行表达式2

​			



	赋值运算符：  =	+=	-= *=  /=  %=





	逻辑运算符：

		&& 与		两边条件必须同时满足  ；两边都为true，结果为true；只要有一边为false，结果为false；如果左边为false，不计算右边
		||或		两边只需满足一边;一边为true,则结果为true；只要有一边为true，结果为true；如果左边为true,不计算右边
		！非		对原值取反 非真即假 非假即真



	单目运算符：

		++	自增	--	自减
		int m=5; int n=m++; int n=++m;	



代码：

```

public class Test3 {

	public static void main(String[] args) {
		//数学运算符：		+ 加	- 减	* 乘	/ 整除	% 取余
		
		int i=10,j=4;
		System.out.println(i+j);//14
		System.out.println(i-j);//6
		System.out.println(i*j);//40
		System.out.println(i/j);//2
		System.out.println(i%j);//2
		
		//比较运算符：        	>  >=  <  <=  ==    !=
		//比较表达式运算结果为一个boolean类型的值  boolean类型条件表达式
		boolean bl1=i>j;//true
		boolean bl2=i<j;//false
		System.out.println(bl1+" "+bl2);
		System.out.println(i>=j);//true
		System.out.println(i==j);//false

	}

}

```



练习：

给定一个int型整数563，要求他经过与10或100之间进行运算，得到一个值365



```

public class Test4 {

	public static void main(String[] args) {
		/*boolean条件表达式 ? 表达式1 :  表达式2 ;
		如果条件表达式为true时，执行表达式1；否则执行表达式2*/
		
		int i=9;
		int j=8;
		int k=i>j?i:j;
		System.out.println(k);
		
		boolean bl=i>j?true:false;
		System.out.println(bl);
		
		String s=i>j? i+"比"+j+"大":i+"比"+j+"小";
		System.out.println(s);

	}

}

```



作业10道题



```
package 运算符;

public class Test2 {

	public static void main(String[] args) {
		// 赋值运算符
		int i=5;
		i+=2;//  等效于  i=i+2
		i-=3;// 4
		i*=3;//12
		i/=5;//2
		i%=2;//0
		System.out.println(i);

	}

}

```

```
package 运算符;

public class Test3 {

	public static void main(String[] args) {
		/*&& 与		两边条件必须同时满足  ；两边都为true，结果为true；只要有一边为false，结果为false；如果左边为false，不计算右边
		||或		两边只需满足一边;一边为true,则结果为true；只要有一边为true，结果为true；如果左边为true,不计算右边
		！非		对原值取反 非真即假 非假即真
		
		*/
		int i=5,j=8;
		boolean bl1=i<j;//true
		boolean bl2=i>=j;//false
		
		System.out.println(bl1&&bl1);//true&&true=true
		System.out.println(bl1&&bl2);//true&&false=false
		System.out.println(bl2&&bl2);//false&&false=false
		
		System.out.println(bl1||bl2);//true||false=true
		System.out.println(bl1||bl1);//true||true=true
		System.out.println(bl2||bl2);//false||false=false
		
		System.out.println(!bl1);//!true=false
		System.out.println(!bl2);//!false=true



	}

}

```



```
package 运算符;

public class Test4 {

	public static void main(String[] args) {
		// 单目运算符 ++ --
		//i++  或者++i 对于i本身来说没影响；都是自增
		//int n=m++;int n=++m
		//对于n来说
		//运算在后，表示先赋值后运算
		//运算在前。表示先运算后赋值
		int i=5;
		//i++;
		++i;
		System.out.println(i);
		
		
		int m=8;
		
		//int n=m++;//m=9  n=8	运算在后，表示先赋值后运算
		int n=++m;//m=9 n=9		运算在前。表示先运算后赋值
		
		System.out.println("m===>"+m+"  n===>"+n);

	}

}

```



### 类型转换：	



	自动类型转换：

			运算或者比较：
			小转大，向上转型
			byte+byte=int short+short=int
			int i=3;  long l=i;
	
			低于int类型之间的转换以int为准，高于int以大类型为准
	强制类型转换：
		大类型转换为小类型  ，向下转型
	
			float f=3.5f; int i=(int)f;



代码：

```
package 运算符;
//数据类型:基本数据类型   和引用数据类型
//基本数据类型:整数 :long  int  short byte  小数 :float double  字符：char    boolean:true  false
//引用数据类型:String 接口   集合  继承 数组
public class Test4 {

	public static void main(String[] args) {
		
		int  a=5;
		double  b=4.5;
		int c=(int) (a+b);
		System.out.println(c);
		

	}

}

```

```

public class Test1 {

	public static void main(String[] args) {
		/*自动类型转换：

		小类型转换为大类型



		byte+byte=int short+short=int

		低于int类型之间的数据进行运算结果以int类型为准；

		高于int类型之间的数据进行运算结果以大类型为准*/
		
		byte b1=12,b2=23;
		int b3=b1+b2;
		
		short s1=12,s2=45;
		int s3=s1+s2;
		
		int i=12;
		long l=23;
		long i2=i+l;


	}

}

```



从键盘动态获取数据：
​	

	import java.util.Scanner;
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	
	String s=sc.next();



​	

## 程序的执行结构：



### 1.   顺序执行结构：


			程序默认从上到下顺序执行

```

public class Test3 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(1);
		System.out.println(1);
		
		System.out.println(1);
		System.out.println(1);
		System.out.println(1);
		System.out.println(1);
		
		System.out.println(1);
		System.out.println(1);
		
		System.out.println(1);

	}

}

```



### 2. 分支选择结构


			if(条件表达式){ 语句块} 		 为true时，才执行语句块

			if(条件表达式){ 语句块1}else{语句块2}  	为true时，才执行语句块1；否则执行语句块2

			if(条件表达式){ 语句块1}else if(条件表达式2){语句块2}...else{语句块n}  	 满足哪个条件表达式，执行哪个语句块；都不满足，执行语句块n




			switch case 结构

		初始值；
			switch(变量){
				case 值1； 语句1；break;
				case 值2； 语句2；break;
				case 值3； 语句3；break;
				case 值4； 语句4；break;
					........
				case 值n； 语句n；break;
				default: 语句
	
			}


			break: 表示跳出switch..case结构，该结构里面未执行的将不再执行

			变量的类型： byte,short,char,int   String只在jdk7.0以上版本支持

代码：

```
package 运算符;
//流程控制语句: 循环语句 选择判断

//判断:
//三种定义格式：if(条件表达式){判断语句}    一种情况的
//         if(){}    else{}      两种情况

	


public class Test5 {
	
	
    public static void main(String[] args) {
        int  i=80;
        if(i<60){
            System.out.println("不及格");
        }
        else if(i>=60&&i<=70){

            System.out.println("及格");
        }
        else  if(i>=70&&i<=90){
            System.out.println("良好");


        }
        else{
            System.out.println("优秀");
        }

    }
}

```



```
package 运算符;
//案例 3、迷你计算器 
//功能描述：使用 switch 语句实现迷你运算器，支持“+”、“-”、“*”、“/”，自己定义两个操作数，显示输出运算结果 
//源代码参考：补充资料\案例 4\迷你计算器 
//选择: switch (fh){
//case '+':
//	
//	break;
//case '-':
//	
//	
//	break
//
//}
public class Test6 {
	public static void main(String[] args) {
	double  a=31.4;
	double  b=32.5;
	char  fh='*';
	switch (fh) {
	case '+':
		System.out.println(a+"+"+b+"="+(a+b));
		break;
	case '-':
		System.out.println(a+"-"+b+"="+(a-b));
		break;
	case '*':
		System.out.println(a+"*"+b+"="+(a*b));
		break;
	case '/':
		System.out.println(a+"/"+b+"="+(a/b));
		break;
	
	}
	}

}

```

```
package 运算符;

import java.util.Scanner;

public class Test9 {
public static void main(String[] args) {
Scanner  s=new Scanner(System.in);
	System.out.println("请输入您要计算的第一个数字：");
	int shu1 = s.nextInt();
	System.out.println("请输入您要计算的第二个数字：");
	int shu2 = s.nextInt();
	System.out.println("请输入您的运算符:");
	String fh = s.next();
	switch (fh) {
	case "+":
		System.out.println(shu1+"+"+shu2+"="+(shu1+shu2));
		break;

	case "-":
		System.out.println(shu1+"-"+shu2+"="+(shu1-shu2));
		break;
	case "*":
		System.out.println(shu1+"*"+shu2+"="+(shu1*shu2));
		break;
	case "/":
		System.out.println(shu1+"/"+shu2+"="+(shu1/shu2));
		break;
	}
}
}

```



```

public class Test2 {

	public static void main(String[] args) {
		String s="星期三";
		switch (s) {
		case "星期一":System.out.println("去上班");	break;
		case "星期二":System.out.println("去开会");	break;
		case "星期三":System.out.println("去出差");	break;
		case "星期四":System.out.println("去打球");	break;
		case "星期五":System.out.println("去购物");	break;
		case "星期六":System.out.println("去睡觉");	break;
		case "星期日":System.out.println("去游泳");	break;
		
		default:System.out.println("没有这一天");
			
		}

	}

}

```

**作业：**

案例 1、买彩票 

功能描述：如果体彩中了 500 万，我买房、买车、资助希望工程、去欧洲旅游；如 果没中，我买下一期体彩，继续烧高香 

源代码参考：补充资料\案例 1\买彩票 

案例 2、压岁钱 

功能描述：春节到了，小明期盼收到压岁钱。他想：如果收到的钱超过 1000 元，那 么捐助失学儿童；收到的钱在 500～1000 之间，那么购买航模；如果收到的钱不足 500 元，那么购买百科全书。 

源代码参考：补充资料\案例 2\压岁钱。 

案例 3、迷你计算器 

功能描述：使用 switch 语句实现迷你运算器，支持“+”、“-”、“*”、“/”，自己定义两个操作数，显示输出运算结果 

源代码参考：补充资料\案例 4\迷你计算器 



### 3. 循环执行结构



for循环：




			for(初始条件;  循环终止条件; 初始值改变部分){
				循环体；
			}



while循环：




			初始条件；
			while(循环终止条件){
				循环体；
				初始值改变部分
	
			}

​		

do..while循环：


​	
​	
​			初始条件；
​			do{
​				循环体；
​				初始值改变部分
​				}while(循环终止条件);

​			

代码：

​	

```

public class Test4 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++){
			//System.out.print(1+" "); 输出10遍1
			System.out.print(i+"  ");//输出1-10
		}
		
		System.out.println();
		
		for(int i=10;i>=1;i--){
			//System.out.print(1+" ");
			System.out.print(i+" ");//输出10-1
		}

	}

}


```

​	\t 表示绝对空格8个  相当于按了一下tab键的效果

```

public class Test5 {

	public static void main(String[] args) {
		System.out.println("abc\t123");
	}

}

```



```

public class TestWhile {

	public static void main(String[] args) {
		/*初始条件；
		while(循环终止条件){
			循环体；


			初始值改变部分

		}*/
		int i=1;
		while(i<=10){
			
			System.out.print(i+" ");
			i++;
		}
		
		System.out.println();
		int j=10;
		while(j>=1){
			System.out.print(j+" ");
			j--;
		}


	}

}

```



```

public class TestDoWhile {

	public static void main(String[] args) {
		/*初始条件；
		do{
			循环体；


			初始值改变部分

			
		}while(循环终止条件);
		
		*
		*
		*for。while 先判断后执行，do..while先执行后判断，即使条件不满足，也会执行1次
		*/
		
		int i=1;
		do{
			System.out.print(i+" ");
			i++;
		}while(i<=10);
		
		System.out.println();
		int j=10;
		do {
			System.out.print(j+" ");
			j--;
		} while (j>0);
		

	}

}

```



```

public class TestForFor {

	public static void main(String[] args) {
		//先执行外循环，再执行内循环；外循环走一次，内循环走一遍
		//外循环的循环次数跟行数保持一致；内循环的循环次数和每一行的元素个数保持一致
		//外循环可以控制行数，内循环控制每行元素个数
		for(int i=1;i<=4;i++){

			for(int j=1;j<=4;j++){
				
				System.out.print("i==>"+i+" j==>"+j+"    ");
				
			}
			System.out.println();
		}

	}

}

```

```

public class 乘法表 {

	public static void main(String[] args) {
		//  \t代表绝对空格8个
		for(int i=1;i<=9;i++){
			
			for(int j=1;j<=i;j++){
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}

	}

}

```



作业：

```
1. 输出1-100

2.输出100-1

3.输出1-100 之间的所有偶数值

4. 输出1-100之间的所有奇数值

5. 输出1-100之间不能被3整除的所有数


6. 求1-100之间所有数的和

7.输出1-100之间不能被3整除的所有数之和


8. 求10的阶乘  1*2*3*4*。。*10


9.打印这2个图形


    *
   **
  ***
 ****
*****

   *
  ***
 *****
*******


```

```
package 练习;

public class Lx6 {

	public static void main(String[] args) {
	/*	  	*
		   **
		  ***
		 ****
		*****
		-----------------------------------------------
		
		行数	空格个数 	*
		1	4		1
		2	3		2
		3	2		3
		4	1		4
		5	0		5
		i	5-行数	行数

		   *
		  ***
		 *****
		*******
		行数 	空格	*
		1	3	1
		2	2	3
		3	1	5
		4	0	7
		i	4-i  i*2-1
		**/
		
		for(int i=1;i<=5;i++){
			//一边打印空格一边打印*
			for(int m=1;m<=5-i;m++){
				System.out.print(" ");
			}
			for(int n=1;n<=i;n++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("----------------------------------");
		for(int i=1; i<=4;i++){
			for(int m=1;m<=4-i;m++){
				System.out.print(" ");
			}
			for(int n=1;n<=i*2-1;n++){
				System.out.print("*");
			}
			System.out.println();
		}


	}

}

```



### 4. 程序的中断执行

break		跳出当前循环  整个循环

continue	跳出本次循环   具体的某次循环



代码：

```

public class break_continue用法 {

	public static void main(String[] args) {
		// break 跳出的当前循环
		//continue 跳出本次循环
		
		for(int i=1;i<=4;i++){
			if(i==2){
				//break;//1   跳出的是当前的for循环，跳出之后后面的不执行
				continue;// 1 3 4  跳出的是i==2的这次循环，i==2这次不执行；后面还将继续执行
			}
			System.out.println(i);
		}
		
		
		System.out.println("----------------------");
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(i==2&&j==3){
					//break;//当前循环值得是外循环的某次循环，该次内循环未执行的不再执行；外循环后面的还将继续执行，
					continue;//本次循环值得是i==2 j==3的这次内循环
				}
				System.out.print("  i="+i+" j="+j);
			}
		}
		
		System.out.println();
		System.out.println("----------------------");
		aaa:for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(i==2&&j==3){
					//break aaa;//当前循环外循环
					continue aaa;//本次循环值得是i==2 这次外循环
				}
				System.out.print("  i="+i+" j="+j);
			}
		}

	}

}

```



```
import java.util.Scanner;


public class TestString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		//String属于引用数据类型，比较用 s.equals("");  基本数据类型比较用==
		if(s.equals("aaa")){
			System.out.println("是aaa");
		}else{  bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb
			System.out.println("不是aaa");
		}
		
		//求String 长度 s.length();
		System.out.println(s.length());

	}

}

```

作业：

作业1、打印出三位数的“水仙花数“

水仙花数是指一个 3 位数 ( n≥3 )，它的每个位上的数字的3次方等于它本身。（例如：1*1*1 + 5*5*5+ 3*3*3 = 153）  




作业2、一堆桃子，猴子吃的规则是：吃总数一半多一个，吃到第10天之后，还余1个，求总共多少个桃子？



作业3.乘法口诀表打印如下

                                                                     9*9=81
                                                             8*8=64  8*9=72
                                                     7*7=49  7*8=56  7*9=63
                                             6*6=36  6*7=42  6*8=48  6*9=54
                                     5*5=25  5*6=30  5*7=35  5*8=40  5*9=45
                             4*4=16  4*5=20  4*6=24  4*7=28  4*8=32  4*9=36
                      3*3=9  3*4=12  3*5=15  3*6=18  3*7=21  3*8=24  3*9=27
               2*2=4  2*3=6  2*4=8   2*5=10  2*6=12  2*7=14  2*8=16  2*9=18
        1*1=1  1*2=2  1*3=3  1*4=4   1*5=5   1*6=6   1*7=7   1*8=8   1*9=9



作业4：

小型计算器：

1．有简单运算选择界面

2．采用循环实现菜单显示

3．采用switch结构实现菜单的选择

4．运算对象为两个操作数，从键盘输入

5．运算结果输出

 

​							

## 数组：

数组是同种类型的具有固定长度的多个元素

1. 同种类型
2. 固定长度

例子：

```
package 数组;
/*
package 引包 说明当前文件所处的目录路径，创建的时候能自动生成
 */
public class TestArrays1 {
    public static void main(String[] args) {
        //数组的定义
        //定义一个长度为3的int类型的数组，里面只能放int类型的数据 3表示长度
        int[] arr=new int[3];
        //给数组里面的每个元素赋值
        //通过下标来表示数组中的每个元素 ，下标是从0开始的
        //元素的额赋值
        arr[0]=12;
        arr[1]=23;
        arr[2]=34;//最后一个元素的下标 长度-1
        System.out.println(arr);//直接输出的是内存地址
        //获取数组的长度  length
        System.out.println("数组的长度是："+arr.length);//3

        //表示数组里面的最后一个元素 长度-1
        System.out.println("最后一个元素是： "+arr[arr.length-1]);//34

        //arr[3]表示第4个元素，下标是从0开始的，但是数组长度是3，超过了数组的长度
        //报错ArrayIndexOutOfBoundsException: 数组下标越界异常
        //System.out.println(arr[3]);
        //对最后一个元素重新赋值
        arr[arr.length-1]=43;
        //对数组循环遍历，输出数组中的每一个元素
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();//换行

        //for each循环增强型for循环
        // int i表示数组中的每个元素  arr表示的是要循环遍历的数组对象
        //简单 方便 直接，缺点只能从左到右依次输出
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}

```

```
package 数组;

public class TestArrays2 {

    public static void main(String[] args) {
        //数组的其他定义方式
        //数组是具有固定长度的，必须要指明初始长度，没有初始值
        int[] arr1=new int[3];
        int[] arr2=new int[]{12,34,45};//定义一个具有初始值的数组
        int[] arr3={23,45,56};//比较原始的定义方式

        //当数组里面没有初始值的时候，取到的是默认值
        //说明int类型的默认值是0
        for(int i:arr1){
            System.out.print(i+" ");//0 0 0
        }
        //其他数据类型的默认初始值
        /*
        byte short int long 0
        float 0.0 double 0.0
        boolean false
        char  '' 空字符串
        String 默认初始值为null
         */
        float[] arr4=new float[3];
        System.out.println(arr4[2]);

        double[] arr5=new double[5];
        System.out.println(arr5[2]);

        boolean[] arr6=new boolean[5];
        System.out.println(arr6[0]);

        char[] arr7=new char[7];
        System.out.println(arr7[3]+"**");

        String[] arr8=new String[6];
        System.out.println(arr8[3]);
    }
}

```



作业：

给定一个数组 int[] arr={12,34,14,67,89,25,10,29};

要求：

1. 将数组里面的每个元素从左到右依次输出
2. 将数组里面的每个元素从右到左依次输出
3. 将数组里面的每个元素从左到右每隔一个依次输出
4. 将数组里面的每个元素从右到左每隔一个依次输出
5. 求最大值，最小值

```
package 数组;

public class TestArrays04 {

    public static void main(String[] args) {

        //二维数组： 数组里面的每个元素是个一维数组
        //定义 必须要指明数组的长度 new int[m][n] m表示二维数组的长度 n表示二维数组里面每个一维数组的长度  n可以不写
        int[][] arr=new int[3][];
        //给二维数组赋值
        arr[0]=new int[]{12,23};
        arr[1]=new int[]{34,27,67};
        arr[2]=new int[]{78,90};

        //重新赋值   78改成87 arr[i][j] i表示二维数组的索引  j表示二维数组里面的一维数组的索引
        arr[2][0]=87;

        //循环遍历二维数组
        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
        }

        System.out.println();

        //forEach增强型for循环
        for(int[] arryi:arr){
            for(int ele: arryi){
                System.out.print(ele+"  ");
            }
        }

    }
}

```



```
package 数组;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Test5 {

    public static void main(String[] args) {

        //常用的类库
       // java.lang.Math
        int i=-3;
        int abs = Math.abs(i);//求绝对值
        System.out.println(abs);

        double random = Math.random();//求随机数 生产0-1之间的随机数
        System.out.println("随机数是："+random);

        //生产1-10之间的随机数
        int num = (int) Math.ceil(Math.random() * 10);
        System.out.println(num);

        int max = Math.max(23, 10);
        System.out.println("最大值是："+max);

        double min = Math.min(23.45, 12.23);
        System.out.println("最小值是："+min);

        //java.util.Arrays
        int[] arr=new int[]{23,12,24,34,67,39,10};
        //查找数组中某个元素的索引
        int index = Arrays.binarySearch(arr, 39);
        System.out.println(index);//5  要查找元素的下标是5

        Arrays.sort(arr);//数组排序的方法 默认是升序排序

        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        int[] newarr = Arrays.copyOf(arr, 5);//复制指定长度的新数组

        for(int ele:newarr){
            System.out.print(ele+" ");
        }

        System.out.println();
       //日期时间 java.util.Date
        //获取系统当前时间
        Date date=new Date();
        System.out.println(date);

        //将时间格式化显示
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        String nowtime = sdf.format(date);
        System.out.println("当前时间是："+nowtime);

        long timeMillis = System.currentTimeMillis();
        Date date1=new Date(timeMillis);
        System.out.println(date1);

    }
}

```



### 方法：

例子：

```
package 方法;

public class TestFangFa {

    public static void main(String[] args) {
        //main方法是主方法，所有的程序必须放在main方法里面才能得以执行
        //aa();
        /*
        创建对象：
        类名 对象名=new 类名();
        class后面的叫类名，类名和文件名是默认保持一致的
         */
        TestFangFa f=new TestFangFa();
        //f.study();
        f.eat("葱爆羊肉");
        int sum=f.add();
        System.out.println(sum);
        //一般有返回值的方法使用一个变量来接收return返回值
        String str=f.pinjie("hello","world");
        System.out.println(str);

    }


    public static void aa(){
        System.out.println("aaaaaaaaaaaaaaaa");
    }

    //static 静态的，方法前面不加static，必须由对象来调用,必须先创建一个对象，如何创建对象，new关键字
    //没有返回值的方法，用void来表示
    //无参的方法
    public void study(){
        System.out.println("学生在学习");
    }
    /*
    public: 公共的，修饰符；表明该方法在任何地方都能被访问
    void: 空的，无效的；表示方法内部没有return返回值，就是void
     */
    //方法定义的时候传入的参数叫形参，调用的时候传入的参数叫实参；实参的个数和类型必须和形参保持一致
    public void eat(String meat){
        System.out.println("在吃"+meat);
    }

    //又返回值得方法，就是方法里面有return int表示返回值的类型
    //方法前面的返回值类型必须和return的值得类型保持一致
    //return之后的语句不会执行
    public int add(){
        return 12+13;
        //System.out.println("aaaaaaaaaaaaa");
    }

    //有参的并且有返回值的方法
    public String pinjie(String str1,String str2){
        return str1+"-"+str2;
    }


}

```



## 面向对象：


	万事万物皆对象


	public class  类名{

		属性；

			方法；
	}


​	

```
public class 测试类{

	public static void main(String[] args){
		类名 对象名=new 类名();
		对象名.属性
		对象名.方法（）
		
	}
}
```



例子：

```
package 面向对象;

public class Student {

    //属性  静态的内在的特征
    int stuNO;
    String name;
    int age;

    //普通方法 动态的 行为动作
    public void eat(){
        System.out.println("学生在吃饭");
    }

    public void study(){
        System.out.println("学生在学习");
    }

}

```

```
package 面向对象;

public class TestStudent {
    public static void main(String[] args) {
        //类是抽象的  对象是具体的
        Student s=new Student();
        // s就是对象名 也是一个变量 Student就是一个类
        //通过对象名打点调用属性或方法
        //给属性赋值
        s.stuNO=1001;
        s.name="张三";
        s.age=23;
        //取值
        System.out.println("学生编号："+s.stuNO+"学生姓名："+s.name+"学生年龄："+s.age);
        s.eat();
        s.study();

        Student s2=new Student();
        s2.stuNO=1002;
        s2.name="李四";
        s2.age=24;
        System.out.println("学生编号："+s2.stuNO+"学生姓名："+s2.name+"学生年龄："+s2.age);
        s2.eat();
        s2.study();

    }
}

```



### 面向对象的特征：



		1. 封装
			属性私有，访问属性通过公共的getter,setter方法来实现
	
		2. 继承
	
			子类能继承父类的属性和普通方法，构造方法不能被继承，单根继承
	
		3. 多态
	
			条件：
	
				1. 继承 2. 重写 3. 向上转型 父类的引用指向子类的实例	

### 关键字：

 修饰属性，方法，类的修饰符叫关键字



### 构造方法：



语法：

例子：

Worker:

```
package 构造方法;

public class Worker {

    //属性
    String name;//工人姓名
    int age;//年龄
    double salary;//薪资

    /**
     * 构造方法：
     * 1. 方法名和类名一致
     * 2. 前面没有返回值类型，也没有void
     * 3.他是在创建对象的时候使用的，new的时候调用的是构造方法
     * 4. 构造方法分为无参的和有参的构造方法
     * 5.当系统里面没有任何构造方法的时候，系统会默认提供一个无参的构造方法；
     * 如果有有参的构造方法，系统将不再默认提供无参的构造方法
     * 建议： 无参的构造方法和有参的构造方法都写上
     */
    //无参的构造方法
    public Worker(){
        System.out.println("Worker的无参的构造方法");
    }
    public Worker(String name,int age,double salary){
        System.out.println("Worker的有参构造方法");
        //当参数名和属性名有冲突时，在属性名前加上this区分；this表示当前对象
        this.name=name;
        this.age=age;
        this.salary=salary;
    }


    //普通方法
    public void work(){
        System.out.println("工人在工作");
    }
    public void sleep(){
        System.out.println("工人在休息");
    }
    public void getSalary(){
        System.out.println("工人在领工资");
    }
    public void show(){
        System.out.println("姓名："+name+"年龄："+age+"薪资："+salary);
    }
}

```



TestWorker:

```
package 构造方法;


public class TestWorker {
    public static void main(String[] args) {

        //无参的构造方法是创建一个对象，属性没有初始值，在后面可以赋值
        Worker w=new Worker();
        w.name="李四";
        w.show();
        //有参的构造方法能够实现创建对象+属性赋值 一块实现
        Worker w2=new Worker("张三",23,2345.5);
        w2.show();
    }
}

```



**作业：**

1.编写Java程序，模拟简单的计算器。
定义名为Number的类，其中有两个整型数据成员 属性 n1和n2。编写构造方法，赋予n1和n2初始值，再为该类定义加（addition）、减（subtration）、
乘（multiplication）、除（division）等公有成员方法，分别对两个成员变量执行加、减、乘、除的运算。
在main方法中创建Number类的对象，调用各个方法，并显示计算结果。


2.编写Java程序，用于显示人的姓名和年龄。
定义一个人类（Person），该类中应该有两个属性，姓名（name）和年龄（age）。定义构造方法，用来初始化数据成员。再定义显示（display）方法，
将姓名和年龄打印出来。
在main方法中创建人类的实例，然后将信息显示。



3.定义一个交通工具类（Vehicle）的类，其中有：

 	属性： 速度（speed） ，体积（size）等等
 	 方法： 移动（move()）, 设置速度（setSpeed(int speed)）, 加速（speedUp()）, 减速（speedDown()）等等

​	最后在测试类Test的main()里面实例化一个交通工具的对象，并通过构造方法给它初始化speed，size的值，
​	并且打印出来，另外通过加速，减速的方法对其速度进行改变

4.定义几个类  Animal(动物类)  Cat(猫类)  Dog(狗类)  里面自己定义若干属性和方法； 可以先暂不写构造方法；
最后测试类Test 类里面main方法里面调用测试上述类中的属性或方法



### this:


		this:
			用在本类当中
	
			1. this.属性
			2. this.方法()
			3. this()    调用无参的构造方法
			4. this("zhangsan",23); 调用有参的构造方法

代码：

```
package this关键字;

public class AAA {
    /*
    this关键字：
    用在本类里面，表示调用当前对象
    1. this.属性  当参数名和属性名有冲突的时候，在属性前加this加以区分
    2. this() 表示在另外一个构造方法里面调用无参的构造方法，必须写在第一行
    3. this.方法()  表示调用另外一个普通方法
    4.this(参数值，参数值) 表示在一个构造方法里面调用另外一个有参的构造方法，也必须写在第一行
     */

    String name;
    int age;

    public AAA(){
        this("李四",25);//表示调用另外一个有参的构造方法
        System.out.println("AAA的无参构造方法");

    }

    public AAA(String name,int age){
       // this();//调用无参的构造方法，必须写在第一行
        //当参数名和属性名有冲突时，属性前加this加以区分
        this.name=name;
        this.age=age;
        //this.aa();//调用普通方法
    }

    public void aa(){
        System.out.println("aaaaaaaaaaaaaaaaaaa");
    }

    public static void main(String[] args) {
        AAA a=new AAA("张三",23);
        AAA b=new AAA();
        System.out.println(b.name+" "+b.age);
    }
}

```



### 继承：



例子：

Animal:

```
package 继承;

public class Animal {

    String name;//名称
    int age;//年龄

    public void eat(){
        System.out.println("动物在吃东西");
    }
    public void climb(){
        System.out.println("动物在爬行");
    }
}

```

Cat：



```
package 继承;

public class Cat extends Animal {

//    String name;//名称
//    int age;//年龄
    String kind;//特有的属性

//    public void eat(){
//        System.out.println("动物在吃东西");
//    }
//    public void climb(){
//        System.out.println("动物在爬行");
//    }

    //特有的方法
    public void catMouse(){
        System.out.println("猫在抓老鼠");
    }
}

```

Dog:

```
package 继承;

public class Dog extends Animal {
/*

    String name;//名称
    int age;//年龄

    //所有动物共有的属性和方法
    public void eat(){
        System.out.println("动物在吃东西");
    }
    public void climb(){
        System.out.println("动物在爬行");
    }
*/

    //特有的方法
    public void guard(){
        System.out.println("狗在看家");
    }
}

```

Pig:

```
package 继承;

public class Pig  extends Animal{
    /*
   class 子类 extends 父类{}
   继承使用extends关键字，被继承的类叫父类，继承的哪个类叫子类；
   子类能够继承父类所有的属性和普通方法；注意：构造方法不能被继承
   继承只支持单根继承，一个子类只能有一个父类
     */
}

```

Monkey：

```
package 继承;

public class Monkey extends Animal{
}

```



Test:

```
package 继承;

public class Test {
    public static void main(String[] args) {
        Pig p=new Pig();
        p.name="佩奇";
        p.age=2;
        p.eat();
        p.climb();

        Dog d=new Dog();
        d.name="旺财";
        d.age=5;
        d.guard();
        d.climb();
        d.eat();
    }
}

```



**作业：**



1、继承
已有一个交通工具类vehicle，
属性包括：

​	速度speed 类别kind 颜色color。

方法包括:

​	设置速度，设置颜色，取得类别，取得颜色。


设计一个小车类car。继承自vehicle。

​	car中增加属性：座位数passenger，增加了设置和获取座位数的方法，创建car的对象，为其设置新速度和颜		色，并显示状态（所有属性。



2、定义一个名为Vehicles（交通工具）的父类，该类中应包含String类型的成员属性brand（商标）和color（颜色），还应包含成员方法run（行驶，在控制台显示“我已经开动了”）和showInfo（显示信息，在控制台显示商标和颜色），并编写构造方法初始化其成员属性。
编写Car（小汽车）类继承于Vehicles类，增加int型成员属性seats（座位），还应增加成员方法showCar（在控制台显示小汽车的信息），并编写构造方法。
编写Truck（卡车）类继承于Vehicles类，增加float型成员属性load（载重），还应增加成员方法showTruck（在控制台显示卡车的信息），并编写构造方法。
在main方法中测试以上各类。


### super:

​		super:
​			子类调用父类相应的属性或方法，用在子类里面
​	
​			1. super.属性
​			2，super.方法()
​			3. super()  

​                        4. super("zhangsan",23);	



例子：

Animal:

```
package super关键字;

public class Animal {
    String name;
    int age;

    public Animal(){
       // System.out.println("Animal的无参的构造方法");
    }

    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void eat(){
        System.out.println("动物在吃");
    }
}

```

Dog：

```
package super关键字;

public class Dog extends Animal {
    /*
    super关键字：代表父类对象；表示在子类里面调用父类相应的东西
    1. super.属性   表示子类调用父类相应的属性
    2.super.普通方法()  表示子类调用父类的普通方法
    3. super() 调用父类的无参构造方法,必须放在方法里面的第一行
    4.super(参数值1，参数值2，。。) 表示调用父类有参的构造方法，必须写在方法里面的第一行
     */
    String kind;//品种 特有的属性

    public Dog(){
        super();
        //System.out.println("aaaaaaaaaaaaaaa");

    }

    public Dog(String name,int age,String kind){
        /*this.name=name;
        this.age=age;*/
        super(name,age); //两种写法效果等效
        this.kind=kind;
    }

    public void shout(){
        //super.name  调用父类相应的属性名
        System.out.println(super.name+"狗在叫");
        super.eat();//调用父类的普通方法
    }
}

```

TestDog:

```
package super关键字;

public class TestDog {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.name="旺财";
        d.shout();

        Dog d2=new Dog("小黑",3,"金毛");
        System.out.println(d2.name+" "+d2.age+" "+d2.kind);
    }
}

```





​			

### package和import关键字：

		package:   引包 说明该文件所在的路径
		import：  导包  说明其他类所处的位置
			包名的命名规则： a.b.c
	
				一般小写；通常是域名反转  com.公司名.项目名.模块.子模块
	
		访问权限的修饰符：
	
			public 公共的     任何地方都能访问
			protected 受保护的  本包或者异包中的子类可以访问
			default 默认的  不写就是默认的  本包中可以
			private私有的   本类中可以访问

### 访问权限的修饰符：


		修饰属性，方法，类




​		public     protected		[default]		private   访问权限依次减小



		public：  公共的；  在该项目中任何地方都能访问
				一般用来修饰类，构造方法和绝大部分的成员方法		



		protected:  受保护的；  本包中和异包中子类可以访问
					属性或方法前加protected,异包中子类可以访问
	                
	    [default]:  默认的；   不写就是默认的； 只能在本包中访问
				一般前面什么都不写就是默认的
				
		private: 私有的；只能在本类中访问 ；	一般用来修饰属性



### 封装：

代码：

Beauty:

```
package 封装;

public class Beauty {

    /*
    封装： 属性私有，通过公共的settergetter方法来实现对属性的访问
    属性封装：属性私有
    方法封装：通过公共的settergetter方法来实现对属性的访问
     */

   private String name;
   private int age;

   //取值
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

    //设置值
    public void setAge(int age){
        this.age=age;
    }

    public void setName(String name){
        this.name=name;
    }



}

```

Test:

```
package 封装;

public class Test {
    public static void main(String[] args) {
        Beauty b=new Beauty();
        //b.name="貂蝉";
        b.setName("貂蝉");
        b.setAge(56);
        System.out.println("年龄："+b.getAge());
        System.out.println("姓名："+b.getName());
    }
}

```



作业：

```
1.定义一个人类（Person),找出人类共有属性。至少4个
2.定义一个学生类（Student),继承Person类，同时提供学生所特有的属性2个以上包含2个
3.定义一个教师类（Teacher),继承Person类，同时提供教师特有的属性2个以上包含2个
4.以上相关的类，所有的属性（如果有），提供相关getter和setter方法
		提示：
			考虑在父类中提供相关getter和setter而子类可以不定义（继承了）

5.父类提供2个以上普通方法（非getter和setter），
6.所有类必须加上包
	
			包的名称不能有java关键字
			com.int 错误
			名称中字符都是小写的
				com.Mypack.Oracle不推荐
				com.mypack.oracle


	//package import
	包名				类名
	com.mypack.entity		Person
	com.mypack.entity.sub		Student
	com.mypack.entity.sub2		Teacher
	com.mypack.test			Test

7.希望加上访问修饰符

8.体现出封装的思想
```

### 

### static:


​	
​		static:
​		
​			本类当中
​			静态属性和方法调用方式：  * 类名打点调用
​	
​			1. static 属性 ； 类变量，静态变量  和所有实例之间是一对多的关系
​	
​			2. static 方法；  public static void aa(){}  不能调用非静态变量或方法
​	

​                        3.static{}  静态块 ； 首次调用该类的时候自动执行  不能调用非静态变量或方法

代码：



```
package static关键字;

public class Student {
    /*
    static关键字： 静态的，可以修饰属性或方法
    static 属性： 属于类变量，属于该类所有
    可以通过对象名打点调用，也可以通过类名打点调用，建议通过类名打点调用
    static 方法： 方法里面不能调用非静态内容
    static{
        静态代码块
    }
    当第一次执行到该类的时候，他会自动执行；常用于做一些初始化工作
     */
    String name;//实例变量
    static String schoolName;//学校名称 类变量 属于该类所有，他和所有的实例之间是一对多关系，每个实例都对应他的同一个值

    static{
        System.out.println("我是静态块，我优先执行");
    }

    public void study(){
        System.out.println("学生在学习");
    }

    public static void show(){
        //不能调用非静态内容，包括非静态的属性和方法
        //System.out.println("学生姓名是："+name);
        System.out.println("学生的学校名称是："+schoolName);
        //study();
    }

    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="张三";
        s1.schoolName="北华大学";

        Student s2=new Student();
        s2.name="李四";
        s2.schoolName="聊城大学";

        //建议通过类名打点调用
        Student.schoolName="山东大学";

        s1.show();
        s2.show();
    }
}

```



### final:


		final:

			1. final 属性   常量 ；不能被重新赋值

			2. final 方法     不能被重写

			3. final 类        不能被继承

代码：

TestFinal:

```
package final关键字;

public class TestFinal {
    public static void main(String[] args) {
        final int i=3;
       // i=5; 报错
    }
    /*
    Final: 最终的
    final 属性： final修饰的变量是个常量，不能被重新赋值
    final 方法：final修饰的方法不能被重写
    final 类：final修饰的类不能被继承
     */
}
//final class FFF{
class FFF{
    String name;

    public final void say(){
        System.out.println("hello");
    }
}
class SSS extends FFF{
   /* public void say(){
        System.out.println("world");
    }*/
}

```



### 方法：

#### 构造方法：



	跟类名一致，没有返回值类型，用来定以用的； new 的时候来调用的

		建议都写上，或者都不写

		没有任何构造方法，系统会默认提供一个无参的；有有参的，将不再提供


#### 方法的重载：


​			overload:
​	
​			本类当中的
​			方法名称一致，参数列表不一致；跟返回值类型无关
​	
​			构造方法的重载和普通方法的重载



代码：

```
package 方法的重载;

public class AAAA {

    int id;
    String name;
    int age;
    /*
    方法的重载： 用在本类里面，同一个类里面的不同的方法
    普通方法的重载和构造方法的重载
    方法名称相同，参数列表（参数个数或者个数一致，但对应位置类型不一致）不同
    普通方法的重载跟返回值类型没有关系
     */

    //构造方法的重载
    public AAAA() {
    }

    public AAAA(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public AAAA(int id,String name){
        this.id=id;
        this.name=name;
    }

    public AAAA(String name,int age){
        this.name=name;
        this.age=age;
    }
    //普通方法的重载
    public void add(int num1,int num2){
        System.out.println(num1+num2);
    }

    public void add(int num1,int num2,int num3){
        System.out.println(num1+num2+num3);
    }

    public int add(int num1,int num2,int num3,int num4){
        return num1+num2+num3+num4;
    }
}

```


​		

#### 方法的重写：

		override：

		用在继承当中：

		方法名称，参数列表，返回值类型一致，方法里面的逻辑不一样

### 多态：



代码：

```
package 方法的重写和多态;

public class Animal {
    String name;

    public void eat(){
        System.out.println("动物在吃");
    }
}

```



```
package 方法的重写和多态;

public class Cat extends Animal{
    public void eat(){
        System.out.println("猫在吃");
    }

}

```



```
package 方法的重写和多态;

public class Dog extends Animal{
    /*
    方法的重写： 子类重写父类相应的方法
    override:
    方法的名称，参数列表，返回值类型相同，但是方法里面的逻辑的不一样
     */

    public void eat(){
        System.out.println("狗在吃");
    }
}

```

```
package 方法的重写和多态;

public class Test {

    public static void main(String[] args) {
//        Dog d=new Dog();
//        Animal a=d;
        //执行的是重写后的方法
       // d.eat();
        /*
        基本数据类型： 向上转型： 小类型自动转换为大类型
        byte<short<int <long<float <double
        父类属于大类型 子类属于小类型
         */
        //向上转型 小类型自动转换为大类型
        /*
        a指向了2个引用，定义的时候执向Animal,赋值的时候执向的是Dog
         */
        /*
        用父类来代表子类，通过父类来表现出子类不一样的状态，称之为多态
        多态实现的3个条件：
        1. 要有继承
        2.要有方法的重写
        3. 用父类的对象来执向子类的实例
         */
       Animal a=new Dog();
       a.eat();
       a=new Cat();
       a.eat();
    }
}

```



```
package 方法的重写和多态;

public class Feeder {
    //饲养员

   /* public void feed(Dog d){
        d.eat();
    }
    public void feed(Cat c){
        c.eat();
    }*/
    public void feed(Animal a){
        a.eat();
    }

    public static void main(String[] args) {
        Feeder f=new Feeder();
        Dog d=new Dog();
        f.feed(d);
        Cat c=new Cat();
        f.feed(c);
    }
}

```



### 抽象类


		1. abstract 修饰的类

		2. abstract 修饰的方法叫抽象方法；

		3. 抽象类里面不一定有抽象方法；有抽象方法的类必定是抽象类

		4. 不能直接实例化，被继承，必须重写抽象方法

		5. 侧重于属性



### 接口：


​		1. 定义的 interface AA{} 
​	
​		2. 接口里面只能有常量和抽象方法
​	
​		3. 接口不能实例化，实现类  class BB implements AA{}
​	
​		4. 实现接口，必须重写抽象方法
​	

	    5. 侧重于方法

代码：

```
package 抽象类和接口;

/*
抽象类： 类前面有abstract关键字
1. 抽象类不能直接实例化，抽象类要想使用，必须通过他的子类来实例化
2. abstract 方法：抽象方法：抽象方法前面有abstact关键字，抽象方法没有方法体，包括{}也没有
3. 抽象类的子类必须重写抽象类里面的抽象方法
4. 抽象类里面可以没有抽象方法，但是有抽象方法的类必定是抽象类

 */
public abstract class Person {

    int id;
    String name;

    public abstract void eat();
    /*{
        System.out.println("人在吃饭");
    }*/
}

```



```
package 抽象类和接口;

/*
运动员接口

接口： 使用interface 接口名{} 来声明
接口表示抽象的概念，也不能直接实例化，接口有他的实现类，可以通过实现类来实例化
接口里面只能定义常量和抽象方法,不能有普通方法
接口里面的抽象方法可以不加abstract关键字，但是没有方法体
一个类可以实现接口  implements 接口名{}
接口的实现类必须重写接口里面的抽象方法
一个子类可以同时继承一个父类和实现多个接口
 */
public interface Player {
    int i=3;
    public void play();
}

```

```
package 抽象类和接口;

public interface Singer {

    public void sing();
}

```



```
package 抽象类和接口;

public class Student extends Person implements Player,Singer {

    public void study(){
        System.out.println("学生在学习");
    }

    @Override
    public void eat() {
        System.out.println("学生在吃饭");
    }

    @Override
    public void play() {
        System.out.println("学生在运动");
    }

    @Override
    public void sing() {
        System.out.println("学生在唱歌");
    }
}

```

```
package 抽象类和接口;

public class Test {
    public static void main(String[] args) {
//        Person p=new Person();
//        p.eat();
        //可以使用多态的写法 用抽象类父类来执向子类，表现出来的重写后的逻辑
        Person s=new Student();
        s.eat();//只能调用重写后的方法
        //s.study();//特有的方法不能调用

        Player p=new Student();
        p.play();//可以调用重写后的方法
        //p.study();//特有的方法不能调用

        Singer singer=new Student();
        singer.sing();
        //singer.study();
    }
}

```



作业：

	学校管理系统的一个程序片段：
	  设计3个类
​	


			com.mypack.entity.Person
				>=2个属性  id
			
			com.mypack.entity.sub.Student
				除了父类的属性，自己再定义>=2属性
	
			com.mypack.entity.sub.Teacher
				除了父类的属性，自己再定义>=2属性
	
			构造方法，访问修饰符，getter，settter方法自己处理


		设计一个管理类
			com.mypack.service.PeopleManagement
				属性  Person[]  用于保存处理的对象  
			·		
	
				方法：
					保存某个人员 addOne(Person p)
					查询某个人   queryOne(int id)
					查询所有人	queryAll()
					删除某个人信息  deleteOne(int id)
					修改某个人信息 update(int id,String name)
	
				提示：用数组来完成
	
		设计一个测试类
	
			com.mypack.test.Test
	
				测试PeopleManagement里面的所有方法。
作业2：

	在昨天作业的基础上增加一下功能
	1. 写一个控制台显示的界面类
	
		com.mypack.ui.ConsoleUI
	
		要求操作的数据信息从键盘动态获取，并有一个简单的显示界面
	
		输入相应的值实现相应的功能
	
		最后直到输入0时实现退出


	2.最后在测试类里面调用并显示该界面



作业3：

在昨天作业的基础上增加一下功能



	1. 在PeopleManagement类前面挡一层接口；接口名称 com.mypack.service.PeopleManagementIF;
	2. Person 写成抽象类



## MVC模式：


​	
​	MVC模式：
​	
​	M Model 模型层  实体类
​	
​	V View  视图层   前台界面 需要调用后台的业务逻辑
​	
​	C Control 控制层  业务逻辑 操纵的是实体类



## String:


	String :

		java.lang.String

		定义：

		1. String s="sss";
		2. String s=new String("sss");


		常用的方法：

		1. equals("");  比较

		2. length()  大小，长度

		3. charAt(int i) 获取某个索引处的字符

		4.  indexOf(char ch)  获取某个字符的首次位置得到索引

		5. trim()   去空格

		6. replace(char old,char new);  替换制定字符

		7. split(String s) 拆分

		8. subString(int begin) subString(int begin,int end)截取

		9. replaceAll(String s1.String s2)  替换制定字符串



代码：

```
package 字符串;

public class TestString1 {

    public static void main(String[] args) {

        String str1="abcde";
        String str2=new String("abcdabedf");
        // char charAt(int index) 获取指定索引处的字符
        char ch = str2.charAt(3);//索引从0开始
        System.out.println(ch);
        //String concat(String str)  拼接2个字符串
        //直接使用+更方便，更直接
        String str3 = str1.concat("hello");
        System.out.println(str3);
        //boolean contains(CharSequence s)  判断是否包含指定的字符串
        boolean flag = str3.contains("hello");
        System.out.println("包含？"+flag);//true

        //boolean endsWith(String suffix) 判断是否以指定的额后缀结尾
        boolean flag2 = str3.endsWith("hello");
        System.out.println("是否以指定后缀结尾？"+flag2);//true

        //boolean startsWith(String str) 判断是否以指定的前缀结尾
        boolean flag3 = str3.startsWith("aaa");
        System.out.println("是否以指定前缀结尾？ "+flag3);//false

        String str4=new String("abcde");
        //字符串比较使用equals()比较
        boolean flag4 = str1.equals(str4);
        System.out.println("字符串比较？"+flag4);//true

        // == 比较的是是否是同一个对象，同一个内存地址 字符串比较使用equals()
        boolean flag5 = str1==str4;
        System.out.println("字符串比较？"+flag5);//false


    }
}

```



```
package 字符串;

public class TestString2 {
    public static void main(String[] args) {
        // boolean equalsIgnoreCase(String anotherString)  忽略大小写比较
        String str1="hello";
        String str2="Hello";
        boolean flag1= str1.equalsIgnoreCase(str2);
        System.out.println("忽略大小写比较？"+flag1);//true
        // int  indexOf(int ch)  返回某个字符第一次出现位置的索引
        String str3="abcabcabd";
        int index = str3.indexOf('b');//0
        System.out.println("b第一次出现的索引是："+index);//2
        //int indexOf(int ch, int fromIndex)  从指定的索引处开始找某个字符第一次出现的索引
        int index2=str3.indexOf('b',index+1);
        System.out.println("b第2次出现的索引是："+index2);//4

        //int length() 求字符串的长度
        int length=str1.length();
        System.out.println("字符串的长度是："+length);//5

        String str4=" ";
        //boolean isEmpty() 判断是否是空字符串
        boolean flag2=str4.isEmpty();
        System.out.println("空字符串？"+flag2);//false

        //String replace(char oldChar, char newChar)  替换指定的字符
        String str5 = str3.replace('a', 'A');
        System.out.println("替换之后的字符串是： "+str5);

        //String replaceAll(String regex, String replacement)  替换指定的字符串
        String  str6="abcghgabhhjabd";
        String str7 = str6.replaceAll("ab", "##");
        System.out.println("替换之后的字符串是： "+str7);


    }
}

```



```
package 字符串;

public class TestString3 {
    public static void main(String[] args) {
        String str1="aaa#bbb#ccc";
        //String[] split(String regex) 根据参数来拆分字符串
        String[] arr = str1.split("#");
        for (String s:arr) {
            System.out.println(s);
        }
        //String substring(int beginIndex)  从某个位置开始截取字符串
        String str2 = str1.substring(3);
        System.out.println(str2);

        //String substring(int beginIndex, int endIndex)截取两个索引中间的字符串
        String str3 = str1.substring(4, 7);
        System.out.println(str3);//bbb

        //char[] toCharArray()  吧字符串转换成字符数组
        char[] arr2 = str1.toCharArray();
        for (char ch :arr2){
            System.out.print(ch+" ");
        }
        System.out.println();

        String str4="sdFDFhGFJjk";
        //String toUpperCase() 全部转换成大写
        String str5 = str4.toUpperCase();
        System.out.println("转换成大写后的："+str5);
        //String toLowerCase()  全部转换成小写
        String str6 = str4.toLowerCase();
        System.out.println("转换成小写后的："+str6);
        //String trim() 去除空格 任何前导和尾随空格删除，中间空格不能被去除
        String  str7="  jjk jkjk ls ";
        String str8 = str7.trim();
        System.out.println(str8);
        System.out.println("去空格后的长度： "+str8.length());
        System.out.println("去空格前的长度： "+str7.length());
    }
}

```



```
package 字符串;

public class TestString4 {

    public static void main(String[] args) {
        // static String valueOf(Object obj)吧其他类型的数据转换成String类型
        //static静态方法，使用类名打点调用
        char[] arr={'h','e','l','l','o'};
        String str1 = String.valueOf(arr);
        System.out.println("字符串是："+str1);

        int i=100;
        //将int类型的数据转换成String类型
        String str2 = String.valueOf(i);
        System.out.println(str2+10);//10010

        //将boolean类型转换成String类型
       String str3= String.valueOf(false);
       System.out.println(str3);

       //如何对字符串非空判断
        //空字符串有2种写法 null和“”空字符串
        String s="";
        //非空判断的时候2种情形都需要考虑到
        if(s!=null&&!"".equals(s)){
            System.out.println(s);
        }else{
            System.out.println("字符串为空");
        }

    }
}


```



作业：

1.给定一个字符串String str="hgrh'[iyhwghl;hp'ghibjg";
要求：经过运算，把里面的字符反转输出



2.编写一个程序,利用数组求出”HELLO”,”JAVA”，”PROGRAM”三个字符串的平均长度

String[] arr={”HELLO”,”JAVA”,”PROGRAM”};





## 异常：



```
	java.lang.Exception

```

```
	处理异常的方式：

```

```
	1. try{}catch(Exception e) finally{}

```

```
	2. throws 异常类型；   方法签名后面

```

```
	主动制造一个异常：

```

```
		throw  异常的实例;

```





```
	自定义异常：

```

```
	class AAA extends Exception{
	}

```



代码：

```
package 异常;

public class Test1 {

	public static void main(String[] args) {
		/*异常： 程序代码在编译或者运行中出现的不正常现象；代码原因
		错误： Error 死机 断电 硬件故障  软件故障等等
		
		
		异常： java.lang.Exception
		
		程序中出现异常，代码会中断执行
*/
		//列举刹那关键的几种异常
		int[] arr=new int[3];
		//System.out.println(arr[3]);//java.lang.ArrayIndexOutOfBoundsException  数组下标越界异常
		System.out.println(1);
		
		String s=null;
		//int len=s.length();//java.lang.NullPointerException  空指针异常
		System.out.println(2);
		
		int m=10,n=0;
		//System.out.println(m/n);//java.lang.ArithmeticException: 数学异常
		System.out.println(3);
	}

}


```



```
package 异常;

public class Test2 {

	public static void main(String[] args) {
		// 处理异常的方式 必须靠经验来处理
		int[] arr=new int[3];
		if(3>arr.length-1){
			System.out.println("下标越界了");
		}else{
			System.out.println(arr[3]);
		}
		System.out.println(1);
		
		String s=null;
		if(s!=null){
			int len=s.length();
		}else{
			System.out.println("出现空指针异常了");
		}
		
		System.out.println(2);
		
		
		int m=10,n=0;
		if(n!=0){
			System.out.println(m/n);
		}else{
			System.out.println("除数不能为0");
			
		}

	}

}


```

```
package 异常;

public class Test3 {

	public static void main(String[] args) {
		/*异常： 程序代码在编译或者运行中出现的不正常现象；代码原因
		错误： Error 死机 断电 硬件故障  软件故障等等
		
		
		异常： java.lang.Exception
		
		程序中出现异常，代码会中断执行
*/
		//列举常见的的几种异常
		//java中处理异常的方式
	/*	try{异常代码}catch(异常类型 变量){ 对异常的处理}
	 * 
	 * 当异常代码和异常类型一致的异常时，才对异常进行处理；
	 * 当异常代码没有任何异常时，不进行处理，不执行catch块里的内容
	 * 
	 * */
		
		try{
			int[] arr=new int[3];
			System.out.println(arr[2]);//java.lang.ArrayIndexOutOfBoundsException  数组下标越界异常
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("数组下标越界了");
		}
		System.out.println(1);
		
		try {
			String s=null;
			int len=s.length();//java.lang.NullPointerException  空指针异常
		} catch (NullPointerException e) {
			System.out.println("出现空指针异常了");
		}
		System.out.println(2);
		
		try {
			int m=10,n=0;
			System.out.println(m/n);//java.lang.ArithmeticException: 数学异常
		} catch (Exception e) {
			System.out.println("分母不能为0");
		}
		System.out.println(3);
	}

}


```

```
package 异常;

public class Test4 {

	public static void main(String[] args) {
		//try{异常代码}catch(Exception e){ 对异常的处理}finally{ 最终都会执行的部分}
		//finally的功能很强大，即便在return之后也会执行；一般return之后的语句不会执行
		
		/*final:  修饰符 属性，方法，类
			
		finally: 用在异常当中
			
		finalize: 垃圾回收器回收垃圾的方式
		
		*
		*/
			int n=aa();
			System.out.println(n);
	}
	
	public static int aa(){
		try {
			int m=10,n=2;
			return m/n;
		} catch (Exception e) {
			System.out.println("分母不能为0");
		}finally{
			System.out.println("最终我一定会执行");
		}
		return 0;
	}

}


```

```
package 异常;

public class Test5 {

	public static void main(String[] args) {
		try {
			//System.out.println(10 / 0);// 2 3 4
			System.out.println(10 / 2);//5 1	3 4
			System.out.println(1);
		} catch (Exception e) {
			System.out.println(2);
		}finally{
			System.out.println(3);
		}
		System.out.println(4);

	}

}


```

```
package 异常;

public class Test6 {

	public static void main(String[] args) {
		//throw  异常的实例;  人为地制造一个异常  抛出一个异常到代码中， 使代码出现异常
		//编译期异常 和 运行期异常
		//e.printStackTrace();   打印异常出错的具体信息
		//e.getMessage();  获取异常出错的详细描述信息
		
		/*处理异常的两种方式：
		
		1. try..catch
		
		2. throws  异常类型； 写在方法的后面 */
		aa();
		try {
			bb();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	public static void aa(){
		
		try {
			throw new Exception("出现异常了");
		} catch (Exception e) {
			
			//System.out.println("处理我自己的异常");
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	
	public static void  bb() throws Exception{
		throw new Exception("出现异常了");
		
	}

}


```

```
package 异常;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		// 自定义异常类
		input();

	}
	
	public static void input(){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数：");
		int n=sc.nextInt();
		
		if(n==4){
			
			try {
				throw new MyException("您输入了不该输入的数");
			} catch (MyException e) {
				System.out.println(e.getMessage());
			}
			
		}else{
			System.out.println("输入的值是： "+n);
		}
		
	}

}

class MyException extends Exception{

	public MyException(String message) {
		super(message);
	
	}
	
	
}

```



作业1：

1.创建一个类，在main方法中实现:：在try块中抛出Exception类的一个对象。为这个对象的构造方法赋予一个字符串。在catch从句内捕获该异常，并打印出字符串e.getMessage()。
添加一个finally从句，并打印一条消息，证明自己真正到达那里。

1. 定义一个Student类，里面有若干属性和方法，包括int age；自己再定义两个异常

   > 150  AgeGT150Exception       <0  AgeLT0Exception；当age满足这两个异常时进行处理，最后测试类里测试关于年龄的方法


1. 写一个自定义异常类，里面写上该异常的构造方法和普通方法。接着在Test类里面写一个方法，抛出该异常对象，然后在main方法中调用该方法，并作适当处理


1. 编写程序，模拟分母为零的场景，并试着处理这种异常，使程序不至于异常中止

for(int i=-10;i<=10;i++){

```
int b=10/i;

```

}



## 集合：

什么地方存数数据？


	变量  只能存储某种类型的单个数据

	数组  只能存储同种类型的多个数据
	集合  存储任何类型的多个数据 Object






	数组：

​	1. 长度是固定的，不是动态的 

2. 数组只能存放同种类型的数据

  ​3.  没有现成的增删改查的方法，逻辑必须自己写、




	集合：
		1. 长度是动态的
	
		2. 可以存放任何类型的数据
	
		3. 里面有现成的增删改查的方法



```
java.util.* 包

Collection----->  List  （有序的，可以重复） Set接口（子接口（无序的）

	实现类：

	

	ArrayList:
   			 add(Object o)
			remove(int i) 
			remove(Object o) 
			get(int index)  
			set(int i,Object o)

			for while do while for each  迭代  

	HashSet:

			无顺序的，不重复

			add(Object o)
			remove(Object o)

			没有下标，普通循环不能使用
			for each
			迭代
				
                Iterator it=lst.iterator();
                for,while  +提示

Map  接口 放的是key value

	Map<Key,Value>  键值对  一个键只能对于一个值
	put(String,Object)   Object get(String key)

```





java.util.* 包里面



List：

​			List(接口，不能直接使用)-------》 ArrayList(实现类)

​			boolean add()

​			void clear()

​			boolean contains(Object obj)

​			E  get(int index)

​			boolean isEmpty()

​			E remove(int index)

​			boolean remove(Object o)

​			E   set(int index,Object newObj)

Set:

​			Set(接口，不能直接使用)-------》 HashSet(实现类)

​			add(E e)  添加元素

​			void clear()

​			boolean contains(Object obj)

​			boolean isEmpty()

​			Iterator`iterator()`  返回此集合中元素的迭代器。

​			boolean remove(Object obj)

​			int size( )  求集合大小

Map：              接口  使用实现类 HashMap

​		void  clear()

​		boolean isEmpty()

​		V  get(K k)                        根据键来取值

​		V put(K key,V value)    添加的额方法

​    V   remove(K key) 根据键来删除对应的值

 int size()   求集合元素大小



### 泛型：


​	
​	
​		在集合定义的时候后面<> 里面传入的类型，限定集合里面存放的类型
​	
​		ArrayList<Student> lst=new ArrayList<Student>();

### 包装类：


		byte short int long float double char boolean

		Byte Short Integer Long Float Double Character Boolean




	常用的方法：

		Object : toString()

		Integer: static int parseInt(String s)  static int valueOf(String s)

		Arrays: static void sort(int[] arr)

		Date:  Date d=new Date()  获取系统当前时间







包装类代码：

```
package 包装类;

public class TestBaoZhuang {

	public static void main(String[] args) {
		// 基本数据类型： byte short int long float double char boolean
		
		//引用数据类型 ： 数组 类 接口 String
		// 基本数据类型可以像类一样使用，可以调用里面的属性或方法
		//基本数据类型像类一样使用，得使用他们的包装类  8种基本数据类型都有对于的包装类
		// 包装类： java.lang.*
		// Byte Short Integer Long Float Double Character Boolean
		//基本数据类型和包装类之间可以互相自由转换
		//基本数据类型转换为包装类的过程叫自动装箱；反之叫自动拆箱
		TestBaoZhuang t=new TestBaoZhuang();
		t.cc();

		t.dd();
	}
	
	public Integer aa(){
		int i=3;
		return i;
	}
	
	public int bb(){
		Integer i=12;
		return i;
	}
	//String和int互相转换
	public void cc(){
		String s="100";
		//static int parseInt(String s)
		//static Integer valueOf(String s) 
		 
		//int i=Integer.parseInt(s);
		int i=Integer.valueOf(s);
		System.out.println(i+10);//110
	}
	
	public void dd(){
		int i=110;
		//static String toString(int i)  
		String s=Integer.toString(i);
		System.out.println(s+10);//11010
	}

}

```





```
package List集合;

import java.util.ArrayList;


public class TestArrayList1 {
	public static void main(String[] args) {
		//List的定义
		
		ArrayList lst=new ArrayList();
		//判断集合是否为空   boolean isEmpty() 
		 
		System.out.println(lst.isEmpty());
		
		// boolean add(E e)  添加元素 Object类型
		lst.add("aaa");
		lst.add(123);
		lst.add(false);
		lst.add(123.45);
		lst.add(2);
		lst.add('去');
		
		//int size()  求集合大小
		System.out.println("List大小为： "+lst.size());
		//内部结构是数组，有下标这个概念
		System.out.println("list==>"+lst);
		
		
		// E get(int index)  根据下标来取值  下标是从0开始的
		
		Integer i=(Integer) lst.get(1);
		Character e=(Character) lst.get(lst.size()-1);
		System.out.println(i);
		System.out.println(e);
		
		
		// E set(int index, E element)   修改某个元素
		lst.set(2, "zzz");
		System.out.println(lst);
		
		// E remove(int index) 根据下标来删除
		// boolean remove(Object o)  直接删除某个对象
		lst.remove(2);//删除下标
		System.out.println("删除后： "+lst);
		lst.remove((Object)2);//删除对象
		System.out.println("删除后： "+lst);
		
		//查询所有 遍历集合
		for (int j = 0; j < lst.size(); j++) {
			System.out.print(lst.get(j)+" ");
		}
		System.out.println();
		
		// for each
		
		for (Object o : lst) {
			System.out.print(o+" ");
		}
		//删除所有
		System.out.println();
		//因为集合长度是动态的，不能通过这种方式来删
		/*for (int j = 0; j <lst.size(); j++) {
			//lst.remove(j);
		}
		System.out.println(lst);*/
		
		//全部清空   void clear()  
		lst.clear();
		System.out.println(lst);
		System.out.println(lst.isEmpty());
		 
	}

}

```



```
package List集合;

public class Student {
	
	String name;
	int age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	public void show(){
		System.out.println("姓名： "+name+"年龄： "+age);
	}
	

}

```

```
package List集合;

import java.util.ArrayList;

public class TestArrayList2 {

	public static void main(String[] args) {


		ArrayList lst=new ArrayList();
		
		Student s1=new Student("aaa", 11);
		Student s2=new Student("bbb", 12);
		Student s3=new Student("sss", 13);
		Student s4=new Student("dsd", 14);
		
		//System.out.println(s1.name+" "+s1.age);
		//s1.show();
		
		lst.add(s1);
		lst.add(s2);
		lst.add(s3);
		lst.add(s4);
		
		for (int i = 0; i <lst.size(); i++) {
			
			Student s=(Student) lst.get(i);
			s.show();
			
		}

	}

}

```

```
package List集合;

import java.util.ArrayList;

public class TestArrayList3 {

	public static void main(String[] args) {


		ArrayList<Student> lst=new ArrayList<Student>();
		
		Student s1=new Student("aaa", 11);
		Student s2=new Student("bbb", 12);
		Student s3=new Student("sss", 13);
		Student s4=new Student("dsd", 14);
		
		//System.out.println(s1.name+" "+s1.age);
		//s1.show();
		
		lst.add(s1);
		lst.add(s2);
		lst.add(s3);
		lst.add(s4);
		
		for (int i = 0; i <lst.size(); i++) {
			
			Student s=lst.get(i);
			s.show();		
			
		}
	}

}

```

```
package day18;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList lst=new LinkedList();
		for (int i = 1; i <11; i++) {
			lst.add(i);
		}
		System.out.println(lst);
		//往头部加元素
		lst.addFirst(0);
		System.out.println("往头部加元素："+lst);
		
		//往尾部加元素
		lst.addLast(11);
		System.out.println("往尾部加元素："+lst);
		
		//取元素  getFirst  getLast
		System.out.println("头部元素： "+lst.getFirst());
		System.out.println("尾部元素： "+lst.getLast());
		
		//添加元素  offerFirst offerLast
		lst.offerFirst(-1);
		lst.offerLast(12);
		System.out.println("添加后： "+lst);
		
		//获取但并不移除头元素  peekFirst  peekLast
		System.out.println("头部元素： "+lst.peekFirst());
		System.out.println("尾部元素： "+lst.peekLast());
		System.out.println(lst);
		
		//获取并移除元素  pollFirst pollLast
		System.out.println("拉出头部元素： "+lst.pollFirst());
		System.out.println("拉出尾部元素： "+lst.pollLast());
		System.out.println(lst);
		
		//从集合中弹出第一个元素pop
		System.out.println("弹出第一个元素： "+lst.pop());
		System.out.println(lst);
		System.out.println("在此弹出第一个元素： "+lst.pop());
		System.out.println(lst);
		
		//向集合头部推入一个元素 push
		lst.push(1);
		System.out.println(lst);
		lst.push(0);
		System.out.println(lst);
		
		//显示集合中所元素
		for (int i = 0; i < lst.size(); i++) {
			System.out.print(lst.get(i)+" ");
		}
		System.out.println();
		for (Object o : lst) {
			System.out.print(o+" ");
		}
		
				
		
	}

}

```



```
package List集合;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		
		Student s1=new Student("aaa", 11);
		Student s2=new Student("bbb", 12);
		Student s3=new Student("sss", 13);
		Student s4=new Student("dsd", 14);
		
		//System.out.println(s1.name+" "+s1.age);
		//s1.show();
		
		Test t=new Test();
		t.addStu(s1);
		t.addStu(s2);
		t.addStu(s3);
		t.addStu(s4);
		
		t.queryAll();
		
		


	}
	
	ArrayList<Student> lst=new ArrayList<Student>();
	
	public  void addStu(Student s){
		lst.add(s);
	}
	
	public void queryAll(){
		for (int i = 0; i <lst.size(); i++) {
			
			Student s=lst.get(i);
			s.show();
			
			
		}
	}

}

```





作业：




	1设计工人类提供4个属性（基本属性）。从现实生活中各行业提取共性（抽象）
		com.mypack.entity.Worker
	
	2.设计
		普通工人，经理员工
		com.mypack.entity.sub.Employee
			年终奖
	
		com.mypack.entity.sub.Manager
			年终分红
			年终奖
	
	3.员工都有月薪。
	
	4设计一个业务处理类：com.mypack.service.impl.WorkerManagementImpl
		添加员工:addWorker
		删除员工：removeWorker
		调整工资：updateSalary
			规则：
				只能添加，不能降低
	
		查询员工所有员工
			queryAllWorkers
	
		查询单个员工
			
	5.最好这个业务类，前面挡一层接口(com.mypack.service.WorkerManagementIF)
	6. 最好有个控制台界面
	
	打印详细信息的时候，需要计算每个人的月薪，以及年薪（12月）,总收入
```
package Set集合;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {
		//所有的Collection集合都能使用迭代，包括他的子接口以及实现类（List和Set）都可以
		/*Collection 父接口-----》 子接口List 和Set-----> 实现类 ArrayList 和HashSet
		
		Map 接口-----》 实现类 HashMap*/
		
		HashSet<Integer> set=new HashSet<Integer>();
		//add(Object o) 添加元素
		set.add(12);
		set.add(15);
		set.add(11);
		set.add(12);
		set.add(17);
		set.add(15);
		set.add(null);
		set.add(0);
		
		//int size()  求集合大小
		//set集合不包含重复元素，允许有null值,不保证顺序
		int size=set.size();
		System.out.println("大小为： "+size);
		System.out.println(set);
		//删除boolean remove(Object o) 
		set.remove(17);
		System.out.println("删除后： "+set);
		
		//Set集合没有下标这个概念，没有取值的方法
		//遍历所有
		/*for (int i = 0; i < set.size(); i++) {
			
		}
		 */
		// for each
		for (Integer i : set) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		
		//迭代
		Iterator it=set.iterator();//返回一个对set集合进行迭代的迭代器
		while(it.hasNext()){//判断集合里面是否仍有元素，有的话为true,则进行迭代
			Integer o=(Integer) it.next();// 取出集合里面的下一个元素
			System.out.print(o+" ");
		}
		
		System.out.println();
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			Integer i = (Integer) iterator.next();
			System.out.print(i+" ");
			
		}
		

	}

}

```



TreeSet:

```
package day19;

import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		//TreeSet会对元素进行自动排序
		//自定义对象类型必须实现Comparable接口，才能放入TreeSet中
		TreeSet ts=new TreeSet();
		ts.add("b");
		ts.add("a");
		ts.add("z");
		ts.add("h");
		ts.add("g");
		System.out.println(ts);
		ts.clear();
		System.out.println(ts);
		
		Person p1=new Person("zhangsan",23);
		Person p2=new Person("lisi",26);
		Person p3=new Person("lisi",19);
		Person p4=new Person("zhaoliu",28);
		
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		ts.add(p4);
		
		System.out.println(ts);
		
		for (Object o : ts) {
			Person p=(Person)o;
			System.out.println(p.show());
		}
		

	}

}
class Person implements Comparable{
	String name;
	int age;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String show(){
		return this.name+" : "+this.age;
	}
	@Override
	public int compareTo(Object o) {
		int n=0;
		int result=0;
		if(o instanceof Person){
			Person p=(Person)o;
			n=this.name.compareTo(p.name);//比较name
			result=n==0?this.age-p.age:n;
		}
		return result;
	}
	public boolean equals(Object o){
		boolean bl=false;
		if(o instanceof Person){
			Person p=(Person)o;
			if(this.name.equals(p.name)&&this.age==p.age){
				bl=true;
			}
		}
		return bl;
	}
	
}
```

LinkedHashSet:

```
package day19;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		Set s=new LinkedHashSet();//不重复，按插入顺序迭代
		s.add(null);
		s.add(null);
		s.add(5);
		for (int i = 10; i >0; i--) {
			s.add(i);
		}
		s.add(3);
		System.out.println(s);
		for (Object o : s) {
			System.out.print(o+" ");
		}

	}

}

```



Vector:

```
package day19;

import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		Vector v=new Vector();//和List一样，有顺序
		v.add(3);
		v.add(1);
		v.add(4);
		v.add(null);
		v.add(4);
		v.add(3);
		System.out.println(v);

	}

}

```



```
package List集合;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class AA {
	
//	<>泛型：基本类型
	
//	map.put()是map集合的添加方法
//	map.size() 集合的长度
//map还是没有下角表
	
	public static void main(String[] args) {
		Map<String, Object>	  map=new HashMap<String, Object>(); 
		map.put("id", 12);
		map.put("name", "张三");
		map.put("age", 10);
        System.out.println(map.get("id"));
        System.out.println(map.get("name"));
        System.out.println(map.get("age"));
	
	}
}

```



HashMap:



```
package day19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		Map map=new HashMap();
		System.out.println(map.size());
		System.out.println(map.isEmpty());//true
		
		//添加元素 put
		map.put("a", "aaa");
		map.put("a", "bbb");
		map.put("a", "ccc");
		map.put("b", "ddd");
		map.put("c", "zzz");
		map.put("d", "zzz");
		//添加完毕 ，key ，value都是Object类型
		System.out.println(map);
		//map中key不能重复，是唯一的，value无所谓，只能有一个null值
		
		//查询
		String key="b";
		Object value=map.get(key);
		System.out.println(value);
		
		//查询所有元素   遍历
		Set keys=map.keySet();//Set keySet()  返回此映射中所有key的集合
		//通过键的集合keys取值
		for (Object k : keys) {
			value=map.get(k);
			System.out.print(" key = "+k+"  value = "+value);
		}
		System.out.println();
		//通过value的集合（set）取值
		Collection vs=map.values();// Collection<V> values() 返回此映射所包含的值的 Collection 视图。 
		for (Object vv : vs) {
			System.out.print(vv+" ");
		}
		System.out.println();
		//Set<Map.Entry<K,V>> entrySet()   返回此映射所包含的映射关系的 Set 视图。
		//通过键和值所组成的map类型的对象来遍历
		Set entrySet=map.entrySet();
		for (Object o : entrySet) {
			Map.Entry me=(Map.Entry)o;
			Object kk=me.getKey();//取键
			Object vv=me.getValue();//取值
			System.out.print(kk+" "+vv+" ");
		}
		System.out.println();
		//删除 remove（） 
		map.remove("a");
		System.out.println(map);
		System.out.println(map.size());
		
		//全部删除
		//map.clear();
		System.out.println(map);
		
		//测试某个键是否存在  
		boolean bl1=map.containsKey("b");
		boolean bl2=map.containsValue("zzz");
		System.out.println(bl1+" "+bl2);
	}

}

```



HashTable:

```
package day19;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class TestHashTable {

	public static void main(String[] args) {
		Map  map=new Hashtable();
		map.put("1", "aaa");
		map.put("2", "bbb");
		
		Object value =map.get("1");
		System.out.println(value);
		
		map.remove("2");
		map.clear();
		System.out.println(map);
		
		map.put("3", "ccc");
		map.put("4", "ddd");
		
		//取值 遍历
		Set<Map.Entry> s=map.entrySet();
		for (Map.Entry entry : s) {
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
		System.out.println("--------------------");
		Hashtable<String,String> t=(Hashtable<String, String>)map;
		Enumeration<String> keys=t.keys();
		while(keys.hasMoreElements()){
			String key=keys.nextElement();
			 value=t.get(key);
			 System.out.println(key+" = "+value);
		}
		System.out.println("----------------------");
		Enumeration<String> values=t.elements();
		while(values.hasMoreElements()){
			String vv=values.nextElement();
			System.out.println(vv+" ");
		}

	}

}

```

Properties:

```
package day19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) throws IOException {
		Properties props=new Properties();
		props.put("1", "aaa");
		props.put("2", "bbb");
		PrintWriter pw=new PrintWriter(new FileWriter("D:/2015.7.27初级班/day19/1.properties"));		
		props.list(pw);				
		pw.close();
		
		BufferedReader r=new BufferedReader(new FileReader("D:/2015.7.27初级班/day19/1.properties"));
		props.load(r);
		props.list(System.out);//把props对象中的名称值输出到控制台
		r.close();
		
		Enumeration keys=props.keys();
		while(keys.hasMoreElements()){
			String key=(String)keys.nextElement();
			System.out.print(key+" ");
		}
		//根据String键，取得String值
		System.out.println();
		String value=(String)props.get("1");
		System.out.println(value);
		
		String value2=props.getProperty("2");
		System.out.println(value2);
	}

}

```



## 内部类:



```
package 内部类;



public class Test1 {

	public static void main(String[] args) {
		Outer out=new Outer();
		Outer.Inner1 in1=out.new Inner1();//内部类的构造方式
		in1.sayB();
		
		Outer.Inner2 in2=out.new Inner2();
		in2.sayC();
		

	}

}
class Outer{
	private String name="zhangsan";
	private static String addr="shanghai";
	private int age=23;
	
	public void sayA(){
		System.out.println("OUTER SAY...........");
	}
	class Inner1{
		private String name="lisi";
		public void sayB(){
			System.out.println(Outer.this.name+this.name+"在说话。。"+age);
		}
	}
	class Inner2{
		public void sayC(){
			System.out.println(addr+name+"INNER2....");
			sayA();
			
		}
	}
}
/*成员内部类：
 * 
 * 内部类可以访问外部类的属性和方法
 * 构造方式： 外部类.内部类 内部类实例=外部类实例.new 内部类的构造方法
 * 当外部类和内部类属性一致时，加 外部类类名.this.属性  加以区分
 * 
 * */

```



```
package 内部类;

public class Test2 {

	public static void main(String[] args) {
		AA.BB bb=new AA.BB();//静态内部类的构造方式
		bb.sayB();

	}

}//静态内部类里面不能访问外部类里的非静态内容
class AA{
	private String name="zhangsan";
	private static String addr="shanghai";
	
	public static  void sayA(){
		System.out.println("OUTER...........");
	}
	static class BB{
		int age;
		public void sayB(){
			//System.out.println(name);会报错，静态内部类不能访问非静态内容
			System.out.println(addr+age);
			sayA();
		}
	}
}
```



```
package 内部类;

public class Test3 {

	public static void main(String[] args) {
		A a=new A();
		a.methodA();

	}

}
class A{
	public void methodA(){
		class B{
			public void methodB(){
				System.out.println("METHODB.....");
			}
		}
		B b=new B();
		b.methodB();//构造内部类的对象，并调用其方法
	}
}//方法内部类： 前面不能有访问修饰符
```



```
package 内部类;

public class Test4 {

	public static void main(String[] args) {
		/*Father f=new Son();
		f.say();
		Driver r=new Son();
		r.drive();*/
		//继承式的匿名内部类
		Father f=new Father(){
			public void say(){
				System.out.println("SON............");
			} 
		};
		f.say();//定义+构造+写方法体一块实现，最后再调用其方法
		//接口式的匿名内部类
		Driver r=new Driver(){
			public void drive(){
				System.out.println("Son drive........");
			}
		};
		r.drive();
	}

}
/*匿名内部类：
 * 只用到类的一个实例类非常小（4行代码一下）   给类命名并不会是你的代码更容易被理解
 * 
 * 原则： 匿名内部类不能有构造方法，内部不能定义任何静态成员和静态方法，
 * 不能是public，protected，private，static修饰的，自能创建类的一个实例
 * 匿名内部类一定实在new后面的，用其隐含实现一个接口或类
 * 
 * */
class Father{
	public void say(){
		System.out.println("FATHER　．．．．．．．");
	}
}
interface Driver{
	public void drive();
}
/*class Son extends Father implements Driver{
	public void say(){
		System.out.println("SON............");
	}
	public void drive(){
		System.out.println("Son drive........");
	}
}*/
```



##  文件：


	文件：

		File   java.io.File


		定义：

			File f=new File("文件路径");

			路径分隔符： / 或者\\

			文件： 包括物理文件或者目录


		方法：
			1. long length()   文件大小 字节个数
	
			2. getName()  获取文件名
	
			3. getParent() 获取父目录
	
			4. File[] listFiles()  列举子文件
	
			5. creatNewFile() 创建新文件
	
			6.  mkdir() 父目录必须存在  mkdirs()  创建制定目录



代码：

```
package 文件;

import java.io.File;

public class TestFile1 {

	public static void main(String[] args) {
		//文件   java.io.File
		
		/*File:
			
			1. 是通过路径名字符串来表示出来的
			2. 包括文件和目录（文件夹）
			3. 路径名分隔符表示方式是/ 或者  \\*/
		
		//File的定义：
		//File(String pathname) 通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
		
		File f1=new File("C:\\Users\\Lenovo\\Desktop\\20161219初级班\\课件\\day16\\作业.txt");//表示物理文件
		File f2=new File("C:/Users/Lenovo/Desktop/20161219初级班/课件/day16");//表示目录
		
		
/*		boolean canExecute() 
        测试应用程序是否可以执行此抽象路径名表示的文件。 
		boolean canRead() 
		        测试应用程序是否可以读取此抽象路径名表示的文件。 
		boolean canWrite() 
		        测试应用程序是否可以修改此抽象路径名表示的文件。*/ 
		System.out.println("可执行？"+f1.canExecute()+"可读？ "+f1.canRead()+"可写？ "+f1.canWrite());
		System.out.println("可执行？"+f2.canExecute()+"可读？ "+f2.canRead()+"可写？ "+f2.canWrite());
		
		
	/*	 boolean isDirectory() 
         测试此抽象路径名表示的文件是否是一个目录。 
		boolean isFile() 
		         测试此抽象路径名表示的文件是否是一个标准文件。 */
		
		System.out.println("目录？ "+f1.isDirectory()+" 物理文件? "+f1.isFile());
		System.out.println("目录？ "+f2.isDirectory()+" 物理文件? "+f2.isFile());
		
		// String getPath()  获取路径名字符串的String表示
		String path=f1.getPath();
		System.out.println(path);
		
		//String getName()  获取文件名称  不包含文件路径
		String name=f1.getName();
		System.out.println(name);
		
		// String getParent() File getParentFile()  获取父目录
		System.out.println(f1.getParent());
		System.out.println(f1.getParentFile().getParentFile());

	}

}

```

```
package 文件;

import java.io.File;
import java.io.IOException;

public class TestFile2 {

	public static void main(String[] args) {
		File f1=new File("C:\\Users\\Lenovo\\Desktop\\20161219初级班\\课件\\day16\\1.txt");//表示物理文件
		File f2=new File("C:/Users/Lenovo/Desktop/20161219初级班/课件/day16/aaa");//表示目录
		// boolean exists()  测试此抽象路径名表示的文件或目录是否存在。 
		System.out.println("存在？ "+f1.exists());
		
		// boolean createNewFile()  创建新文件
		boolean bl;
		try {
			bl = f1.createNewFile();
			System.out.println(bl);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// boolean delete()  删除文件或者空的目录
		System.out.println(f1.delete());
		System.out.println(f2.delete());
		
		// boolean mkdir()  前提父目录必须存在 boolean mkdirs() 父目录不存在则一并创建  创建指定目录
		File f3=new File("C:/Users/Lenovo/Desktop/20161219初级班/课件/day16/a/b/c/d");//表示目录
		File f4=new File("C:/Users/Lenovo/Desktop/20161219初级班/课件/day16/111");//表示目录
		//System.out.println(f3.mkdir());
		//System.out.println(f3.mkdirs());
		System.out.println(f4.mkdir());
		
		File f5=new File("C:\\Users\\Lenovo\\Desktop\\20161219初级班\\课件\\day16\\作业.txt");
		long len=f5.length();//文件字节个数
		System.out.println(len);
		
		File f6=new File("C:/Users/Lenovo/Desktop/20161219初级班/课件/day16");
		
		// String[] list()   File[] listFiles()  列举目录下的所有文件
		File[] files=f6.listFiles();
		for (int i = 0; i < files.length; i++) {
			File f=files[i];
			System.out.println(f.getName());
		}
		 
		
	}

}

```



递归：



	package 递归;

	public class Test1 {
	    public static void main(String[] args) {
	        jc();
	        System.out.println(ji(10));
	
	    }
	    // 10的阶乘
	    public static void jc(){
	        int res=1;
	        for (int i = 1; i <=10; i++) {
	            res=res*i;
	
	        }
	        System.out.println(res);//3628800
	    }
	
	    //在一个方法内部再次调用本方法
	    public static int ji(int n){
	        if(n==1){
	            return n;
	        }
	        return ji(n-1)*n;
	    }
	 }



```
package 递归;

import java.io.File;

public class Test2 {

	public static void main(String[] args) {
		File f=new File("C:/Users/Lenovo/Desktop/20161219初级班/课件/day16");
		//列举里面所有的物理文件
		lieju(f);

	}
	
	public static void lieju(File f){
		if(f.isDirectory()){
			File[] files=f.listFiles();
			if(files!=null&&files.length>0){
				for (int i = 0; i < files.length; i++) {
					File file=files[i];
					lieju(file);//不管是文件或目录都递归调用
				}
			}
		}else{
			System.out.println(f.getName());
		}
	}

}

```





作业2：

123 用递归来实现

1.给定一个目录文件，要求输出里面所有的java文件的文件名


2.给定一个目录，列举出来里面所有的物理文件 递归

 要求：

​	1.计算java文件有多少个

​	2.计算共有多少个目录





## IO流：


		java.io 包



输入流和输出流：相对于内存来说的

读取： 将数据文件里面到内存里面，进内存的，输入流、

写入： 将内存里面的数据写入到文件里面，出内存的，输出流

### 字节流：

数据是按字节方式来传输的，二进制编码，缺点： 不能处理中文问题，中文会出现乱码



		InputStream:  基本字节输入流

		OutputStream:  基本字节输出流
			都是抽象类，不能直接使用，使用他们的子类


	FileInputStream:   文件输入流


​	
​						专门处理从文件里面读取数据的流


​	
​	
​						构造方法：


​							FileInputStream(File file) 
​	         						 通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的 File 对象 file 指定。 
​	
​							FileInputStream(String name) 
​	        						  通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的路径名 name 指定。 


​	
​						普通方法：


​							 int read()  从此输入流中读取一个数据字节。


​							 void close()   关闭数据流


​	
​	          
​				FileOutputStream:  文件输出流


​						专门处理从文件里面写入数据的流
​	
​						构造方法：


​							FileOutputStream(File file) 
​	       							  	 创建一个向指定 File 对象表示的文件中写入数据的文件输出流。 
​							FileOutputStream(File file, boolean append) 
​	        							  创建一个向指定 File 对象表示的文件中写入数据的文件输出流。 
​	
​							FileOutputStream(String name) 
​	         							 创建一个向具有指定名称的文件中写入数据的输出文件流。 
​							FileOutputStream(String name, boolean append) 
​	       								   创建一个向具有指定 name 的文件中写入数据的输出文件流。


​	
​						普通方法：

​							 void write(int b)  将指定字节写入此文件输出流。
​	
​	 						void close()   关闭数据流  



代码：

```
package 字节流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TestIO {

	//字节流不能处理中文问题，中文会出现乱码
	public static void main(String[] args) throws IOException {
		
		/*1.  构建传输数据的流（管道）


		new  输入输出流的构造方法；



	2. 传输数据（读取或者写入数据）


		write(int i)  int read()


	3. 关闭资源，释放连接

		close()*/
		doRead();
		doWrite();

	}

	//往文件里面写入数据
	
	private static void doWrite() throws IOException {
		
		File f=new File("C:\\Users\\Lenovo\\Desktop\\20161219初级班\\课件\\day17\\1.txt");
		// 1. 构建一个输入输出流的管道
		OutputStream out=new FileOutputStream(f);
		//2. 写入数据
		out.write('a');
		out.write('1'); 
		out.write('g');
		out.write('&');
		out.write('去');
		//3. 关闭连接
		out.close();
		
		
	}

	//从文件里面读取数据
	private static void doRead() {
		File f=new File("C:\\Users\\Lenovo\\Desktop\\20161219初级班\\课件\\day17\\1.txt");
		// 1. 构建一个输入输出流的管道
		InputStream in=null;
		try {
			in = new FileInputStream(f);
			//2. 读取数据
			int one=in.read();
			int two=in.read();
			int three=in.read();
			int four=in.read();
			int five=in.read();
			
			System.out.println((char)one+" "+(char)two+" "+(char)three+" "+(char)four+" "+(char)five);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
		
		//3.关闭连接
		
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

```

​	            

```
package 字节流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TestIO2 {

	public static void main(String[] args) throws IOException {
		testWrite();
		testRead();

	}

	//一个文件有很多字节，不知道文件有多个,通过循环来实现
	private static void testRead() throws IOException {
		File f=new File("C:\\Users\\lenovo\\Desktop\\20161219初级班\\课件\\day17\\IO流\\src\\字节流\\TestIO.java");
		
		InputStream in=new FileInputStream(f);
		
		int data=0;//表示文件中的字节
		while((data=in.read())!=-1){
			System.out.print((char)data);
		}
		in.close();
		
	}

	//直接添加到文件末尾，而不是覆盖，须在FileOutputStream的构造方法后加参数true
	private static void testWrite() throws IOException {
		File f=new File("C:\\Users\\Lenovo\\Desktop\\20161219初级班\\课件\\day17\\2.txt");
		OutputStream out=new FileOutputStream(f,true);
		out.write('z');
		out.write('z');
		out.write('z');
		out.write('z');
		out.write('z');
		out.close();
		
		
		
	}

}

```

```
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class TestData {

	public static void main(String[] args) throws IOException {
		writeData();
		readData();

	}
	public static void writeData() throws IOException{
		OutputStream out=new FileOutputStream("D:\\2015.7.27初级班\\day17\\bbb.txt");
		DataOutputStream dos=new DataOutputStream(out);
		//过滤流，包装一个基本输入输出流，在基本IO流的基础上增加新的功能，提高效率
		//管道建立成功，接着传输数据
		//DataOutputStream dos2=new DataOutputStream(new FileOutputStream("D:\\2015.7.27初级班\\day17\\bbb.txt"));
		//也可以写成上面那样
		//写入8中基本数据类型
		byte b=1;
		short s=2;
		int i=3;
		long l=4;
		float f=5.0f;
		double d=6;
		char c='7';
		boolean bl=false;
		String str="开心点吧";
		dos.writeByte(b);
		dos.writeShort(s);
		dos.writeInt(i);
		dos.writeLong(l);
		dos.writeFloat(f);
		dos.writeDouble(d);
		dos.writeChar(c);
		dos.writeBoolean(bl);
		dos.writeUTF(str);
		
		dos.close();
	}
	public static void readData() throws IOException{
		InputStream in=new FileInputStream("D:\\2015.7.27初级班\\day17\\bbb.txt");
		DataInputStream  dis=new DataInputStream(in);//包装输入流
		
		//读取文件，一定要遵从当初写的顺序
		byte b=dis.readByte();
		short s=dis.readShort();
		int i=dis.readInt();
		long l=dis.readLong();
		float f=dis.readFloat();
		double d=dis.readDouble();
		char c=dis.readChar();
		boolean bl=dis.readBoolean();
		String str=dis.readUTF();
		
		System.out.println(b+" "+s+" "+i+" "+l+" "+f+" "+d+" "+c+" "+bl +" "+str);
		dis.close();
	}
}

```



```
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class TestObject {

	public static void main(String[] args) throws IOException {
		doWrite();
	}
	public static void doWrite() throws IOException{
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("d:/aaa.txt"));
		Student s1=new Student("zhangsan",23);
		Student s2=new Student("lisi",26);
		out.writeObject(s1);
		out.writeObject(s2);
		out.close();
	}

}
class Student implements Serializable{
	String name;
	int age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
//对象类型要实现写入到文件中，必须实现序列化接口（Serializable），
//这个过成叫序列化，反之叫反序列化
```



作业：

通过IO流来实现文件的复制效果

边读边写的过程



### 字符流：

以字符为单位传输的；可以传输中文，不会出现乱码

	Reader：基本字符输入流
	Writer： 基本字符输出流
	抽象类，不能直接使用，用子类
		子类：
	
		FileReader:
	
					构造方法：
						FileReader(File file) 
	          					在给定从中读取数据的 File 的情况下创建一个新 FileReader。 
		 
						FileReader(String fileName) 
	          					在给定从中读取数据的文件名的情况下创建一个新 FileReader。 
	
					普通方法：
						 int read() 读取单个字符。 
	
						close()


​		FileWriter:
​	
​					构造方法：
​						FileWriter(File file) 
​	         					 根据给定的 File 对象构造一个 FileWriter 对象。 
​						FileWriter(File file, boolean append) 
​	         					 根据给定的 File 对象构造一个 FileWriter 对象。 
​	
​						FileWriter(String fileName) 
​	        					  根据给定的文件名构造一个 FileWriter 对象。 
​						FileWriter(String fileName, boolean append) 
​	         					 根据给定的文件名以及指示是否附加写入数据的 boolean 值来构造 FileWriter 对象。 


​	
​	
​					普通方法：


​						void write(int c) 
​	          						写入单个字符。 
​	 					void write(String str) 
​	       							   写入字符串。 
​	
​						close()




包装流：

具有逐行读写的方法


​			
​				BufferedReader：  String readLine()
​	
​				PrintWriter:      println(String s)	



传输数据：


		1. new 流的构造方法
		2. read() 或者 write(int i)
	
		3. close();



代码：

```
package 字符流;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class TestReadAndWrite {

	public static void main(String[] args) throws IOException {
		testWrite();
		testRead();

	}

	private static void testRead() throws IOException {
		File f=new File("C:\\Users\\Lenovo\\Desktop\\20161219初级班\\课件\\day17\\主要内容.txt");
		Reader r=new FileReader(f);
		int data=0;
		while((data=r.read())!=-1){
			System.out.print((char)data);
		}
		
		r.close();
	}

	private static void testWrite() throws IOException {
		File f=new File("C:\\Users\\Lenovo\\Desktop\\20161219初级班\\课件\\day17\\3.txt");
		Writer w=new FileWriter(f,true);
		w.write('我');
		w.write("地方vhucghucsdhbkhd");
		w.write("过好多次挂号费电风扇");
		w.write("#$#%$$%^&&%*3565678^&^&*(");
		w.close();
		
		
	}

}

```



```
package 字符流;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;

public class TestReadandWriteLine {

	public static void main(String[] args) throws IOException {
		testReadLine();
		testWriteLine();

	}

	private static void testWriteLine() throws IOException {
		File f=new File("C:\\Users\\Lenovo\\Desktop\\20161219初级班\\课件\\day17\\4.txt");
		//PrintWriter pw=new PrintWriter(f);
		PrintWriter pw=new PrintWriter(new FileWriter(f,true));
		pw.println("sdvhbkhbjkgvsdfjhk");
		pw.println("光滑肌肤的设计禾嘉股份不舒服给客户");
		pw.println("54548875478");
		pw.println("￥%……&&*……*（）*&（o8-）");
		pw.println("那姐夫vkbj n");
		pw.close();
		
	}

	private static void testReadLine() throws IOException {
		File f=new File("C:\\Users\\Lenovo\\Desktop\\20161219初级班\\课件\\day17\\主要内容.txt");
		//包装流 在其他流的基础上增加了新的功能
        /*//		Reader r=new FileReader(f);
        //		BufferedReader br=new BufferedReader(r);
        */		
		BufferedReader br=new BufferedReader(new FileReader(f));//也可以连调
		String line=null;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		br.close();
	}

}

```









## 多线程：



​		

```
package 线程;

public class Test1 {

	public static void main(String[] args) {
		// 实现一边播放歌曲 一边调节音量的效果
		//传统的方式取法解决这种问题 main方法里面是有先后顺序
		Test1 t=new Test1();
		t.playMusic();
		t.testVoice();

	}
	public void playMusic(){
		
		for(int i=1;i<=100;i++){
			System.out.print(i+" ");
		}
	}
	public void testVoice(){
		
		for(char ch='a';ch<='z';ch++){
			System.out.print(ch+" ");
		}
	}

}

```



```
package 线程;

public class TestThread {

	public static void main(String[] args) {
	/*	线程： 程序执行流的最小单位
		程序： 磁盘上的应用程序  一个程序可能有多个进程组成
		进程： 正在运行中的程序  一个进程可能由多个线程组成
		
		线程： java.lang.Thread  多个线程可以同时并发执行
		定义线程的两种方式：都可以  但是都必须重写run方法
		
		调用方式不太一样
		
		class AA extends Thread{
		
			public void run(){}
		}
		
		start()
		
		class BB implements Runnable{
		
			public void run(){}
		}
		BB b=new BB();
		new Thread(b).start()
		
		*/
		
		
		Music m=new Music();
		m.start();//启动该线程 ，其实执行run() 方法中的逻辑
		Voice v=new Voice();
		new Thread(v).start();
		

	}

}

//继承Thread类
class Music extends Thread{
	
	@Override
	public void run() {
		//线程体 线程中的代码只有放在run() 方法中才能呢个执行
		for(int i=1;i<=100;i++){
			System.out.print(i+" ");
		}
	}
}

//实现Runnable接口
class Voice implements Runnable{

	@Override
	public void run() {
		for(char ch='a';ch<='z';ch++){
			System.out.print(ch+" ");
		}
		
	}
	
	
}

```





```
package 线程;

public class TestThread2 {

	public static void main(String[] args) {
/*		
		static Thread currentThread()  返回对当前正在执行的线程对象的引用。
		static void sleep(long millis)  在指定的毫秒数内让当前正在执行的线程休眠（暂停执行），
		 void start() 使该线程开始执行；Java 虚拟机调用该线程的 run 方法。
		  long getId()  返回该线程的标识符。
	 String getName() 返回该线程的名称。 
	  void setName(String name) 改变线程名称，使之与参数 name 相同。
	   int getPriority()   返回线程的优先级。
	    void setPriority(int newPriority)    更改线程的优先级。  
	     Thread.State getState() 返回该线程的状态  
	    
		 */
		ThreadA t=new ThreadA();
		t.setName("A线程");
		t.setPriority(1);
		t.start();

	}

}
class ThreadA extends Thread{
	
	
	@Override
	public void run() {
		System.out.println(1);
		System.out.println("id: "+Thread.currentThread().getId());
		System.out.println("name: "+Thread.currentThread().getName());
		System.out.println("优先级： "+Thread.currentThread().getPriority());
		System.out.println("state: "+Thread.currentThread().getState());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(2);
	}
}
```



```
/*java.lang.Thread 
 public static final int MAX_PRIORITY 10 
 public static final int MIN_PRIORITY 1 
 public static final int NORM_PRIORITY 5 
*/
//优先级1-10 最大优先级最先执行
public class Test9 {

	public static void main(String[] args) {
		ThreadB t1=new ThreadB();
		t1.setName("猫");
		t1.setPriority(Thread.MIN_PRIORITY);//1
		t1.start();
		
		ThreadB t2=new ThreadB();
		t2.setName("狗");
		t2.setPriority(Thread.MAX_PRIORITY);//10
		t2.start();
		
		ThreadB t3=new ThreadB();
		t3.setName("猪");
		t3.setPriority(Thread.NORM_PRIORITY);//5
		t3.start();
		

	}

}
class ThreadB extends Thread{
	public void run(){
		for (int i = 0; i <=5; i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
	}
}
```



```
//用join方法演示龟兔赛跑，实际上是两个线程之间的交互
public class TestJoin {

	public static void main(String[] args) throws InterruptedException {
		Thread a=new ThreadA();
		a.setName("乌龟");
		Thread b=new ThreadB();
		b.setName("兔子");
		ThreadB.t=a;
		b.start();
		//b.sleep(1);
		a.start();
	}

}
class ThreadA extends Thread{
	public void run(){
		for (int i = 1; i <=10; i++) {
			System.out.println(Thread.currentThread().getName()+"跑了 ："+(i*100)+"米");
		}
	}
}
class ThreadB extends Thread{
	static Thread t;
	public void run(){
		for (int i = 1; i <=10; i++) {
			if(i==3){
				try {
					t.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				System.out.println(Thread.currentThread().getName()+"跑了 ："+(i*100)+"米");
			
		}
	}
}
```

```
//线程中的锁机制 synochronized(o)
public class TestLock {

	public static void main(String[] args) {
		ThreadC t1=new ThreadC();
		t1.setName("A");
		ThreadC t2=new ThreadC();
		t2.setName("B");
		ThreadC t3=new ThreadC();
		t3.setName("C");
		t1.start();t2.start();t3.start();

	}

}
class ThreadC extends Thread{
	private static final Object o=new Object();
	
	public void run(){
		synchronized (o) {
			System.out.println(Thread.currentThread().getName()+"锁住了"+"\n");
			for (int i = 1; i <=20; i++) {
			System.out.print(Thread.currentThread().getName()+i+" ");
			}
			System.out.println(Thread.currentThread().getName()+"释放了"+"\n");
		}
		
	}
}
```

```
/*当两个线程互相等待对方释放锁的时候就会发生死锁
当出现死锁后，不会出现异常，不会出现提示，所有线程处于阻塞状态，无法继续
编程的时候要避免死锁的发生
解决方式： 按顺序访问；依靠线程间的通信*/
public class TestDeadLock {

	public static void main(String[] args) {
		new Thread1().start();
		new Thread2().start();

	}

}
class Lock{
	public static final Object lockA=new Object();
	public static final Object lockB=new Object();
}
class Thread1 extends Thread{
	public void run(){
		synchronized (Lock.lockA) {
			System.out.println("1");
			synchronized (Lock.lockB) {
				System.out.println("2");
			}
			
		}
	}
}
class Thread2 extends Thread{
	public void run(){
		synchronized (Lock.lockB) {
			System.out.println("a");
			synchronized (Lock.lockA) {
				System.out.println("b");
				
			}
			
		}
	}
}
```

```
//解决死锁的方法：线程间的通信  wait() notify() 等待，唤醒 他们和synchorized搭配使用
public class TestTX {

	public static void main(String[] args) throws InterruptedException {
		new ThreadE().start(); Thread.sleep(10);
		new ThreadF().start();

	}

}
class Suo {
	public static final Object o=new Object();
}
class ThreadE extends Thread{
	public void run(){
		synchronized (Suo.o) {
			System.out.println("1");
			System.out.println("2");
			//输出12之后，让他等待，他在等待时，会把当前锁给释放了
			try {
				Suo.o.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("3");
			System.out.println("4");
		}
		
	}
}
class ThreadF extends Thread{
	public void run(){
		synchronized (Suo.o) {
			System.out.println("a");
			System.out.println("b");
			System.out.println("c");
			System.out.println("d");
			Suo.o.notify();
			//通知对方线程，你需要的条件满足了，不用等了
		}
	}
}
```



作业：

1.火车票售票系统是一个常年运行的系统，为了保证乘客能购到票，一般设置多个窗口：


假设有100张票，4个窗口卖票，分别打印出每个窗口卖的票

2.建立3个线程，A线程打印10次A;B线程打印10次B；C线程打印10次C；

要求：  线程同时运行，交替打印10次ABC
ABCABC

```
/*火车票售票系统是一个常年运行的系统，为了保证乘客能购到票，一般设置多个窗口：
假设有100张票，4个窗口卖票，分别打印出每个窗口卖的票*/
public class Ex1 {

	public static void main(String[] args) {
		Ticket ticket=new Ticket();
		ThreadD tr=new ThreadD(ticket);
		Thread t1=new Thread(tr);
		t1.setName("窗口1");
		Thread t2=new Thread(tr);
		t2.setName("窗口2");
		Thread t3=new Thread(tr);
		t3.setName("窗口3");
		Thread t4=new Thread(tr);
		t4.setName("窗口4");
		t1.start();t2.start();t3.start();t4.start();
		
		

	}

}
class Ticket{
	private int amount;
	public Ticket(){
		amount=100;
	}
	public int getAmount(){
		return amount;
	}
	public void sale(){
		amount-=1;
	}
}
class ThreadD implements Runnable{
	private Ticket ticket;
	

	public ThreadD(Ticket ticket) {
		super();
		this.ticket = ticket;
	}


	@Override
	public void run() {
		while(true){
			synchronized (ticket) {
				if(ticket.getAmount()<1){
					System.out.println("票已经卖完了");
					break;
				}else{
					System.out.println(Thread.currentThread().getName()+"卖票"+ticket.getAmount()+"张票");
					ticket.sale();
					try {
						Thread.currentThread().sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		
	}
	
}
```



```

/*2.建立3个线程，A线程打印10次A;B线程打印10次B；C线程打印10次C；

要求：  线程同时运行，交替打印10次ABC
ABCABCABC
A执行，A把B唤醒，A等待；B执行，B再把C唤醒，B等待；C执行，C再把A唤醒，C等待；依次循环
*/
public class Ex2 {

	public static void main(String[] args) throws Exception {
		Object a=new Object();
		Object b=new Object();
		Object c=new Object();
		ThreadZ ta=new ThreadZ("A",c,a);
		ThreadZ tb=new ThreadZ("B",a,b);
		ThreadZ tc=new ThreadZ("C",b,c);
		ta.start();Thread.sleep(10);
		tb.start();Thread.sleep(10);
		tc.start();
		

	}

}
class ThreadZ extends Thread{
	private String name;
	private Object prev;//前一个锁，用于把后面的给唤醒
	private Object self;//自身的锁，用于执行，执行完之后把下一个给唤醒，自己等待
	public ThreadZ(String name, Object prev, Object self) {
		super();
		this.name = name;
		this.prev = prev;
		this.self = self;
	}
	
	public void run(){
		int count=10;
		while(count>0){
			synchronized (prev) {
				synchronized (self) {
					System.out.print(name);
					count--;
					self.notify();
				}
			
				try {
					prev.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
}
```



## 反射：



### 1、什么是反射

在了解反射之前，我们都是如何使用一个Java类的？

- 已知一个类的类名，以及类中的方法、属性和构造方法等
- 调用构造方法创建对象
- 使用对象调用方法或者属性

那么问题来了，如果我们只知道一个类的类名，能否动态得到类的信息，包括其方法和属性？

- 通过反射

所以反射的概念是：在运行状态中，对任意类都可知道其所有属性和方法，对任意对象都可调用其方法和属性。这种**动态获取信息以及动态调用对象方法的功能**，称之为Java的反射机制。

如Spring框架只需要通过xml文件描述类的基本信息，就可以利用反射机制动态装配对象。

### 2、反射的相关类

和反射相关的类主要包括  Class、Constructor、Method、Field等，除了Class，其他的类都位于java.lang.reflect包中。其中最重要的类是Class，可以说，反射的使用都是从Class开始的。

#### 2.1 Class类

##### **2.1.1 Class实例的获取**

把一个类封装成为Class类，Class实例主要有三种方式获取：

- //使用对象名获取
- String str = "hello";
- Class clazz = str.getClass();


- //使用类名获取，在类名加后缀 .class
- Class clazz = String.class;


- //使用类名获取，通过Class的静态方法forName()
- Class clazz = Class.forName("java.lang.String");

##### **2.1.2 Class类的主要方法**

Class类中的主要方法有：

- getMethod：返回类中某个方法的实例
- getMethods：返回类中所有方法的实例
- getField：返回类中某个属性的实例
- getFields：返回类中所有属性的实例
- getConstructor：返回类中的一个构造方法的实例
- getXXX：Class中还有若干get方法，获取类的基本信息

需要注意的是，以上涉及的获取Method或Field实例的方法，实际上还有一个类似的方法，不过名字中多个词**Declared**，如getDeclaredMethods()，区别在于：

- 包含Declared：它仅获取自身类声明的方法，包括公开的、私有的、保护的等
- 没有Delcared的普通get方法：会获取某个类所有的公开（public）成员，包括自己定义的和继承下来的



#### 2.2 Constructor类

##### **2.2.1 实例的获取**

Constructor类的对象是由Class对象获取，Class类中定义了如下方法：

- Constructor<T> getConstructor(Class...   parameterTypes)：通过指定参数类型，返回构造方法实例
- Constructor[] getConstructors()：返回该类的所有构造方法实例

这里所说的指定的参数类型，是指实际构造方法的形参。

该类可以通过getXXX的方法，获取构造方法的基本信息，如：

- getName：返回构造方法的名字
- getParameterTypes：返回构造方法的参数类型

##### **2.2.3 创建对象**

除了构造方法的基本信息，也可以通过该Constructor的实例创建对象：

- newInstance(Object... initargs);

示例：

```
Class stuClazz = Student.class;
Constructor stuCon = stuClazz.getConstructor(String.class);
Student stu = (Student)stuCon.newInstance("zhangsan");
```



#### 2.3 Method类

##### **2.3.1 Method的获取**

Method类的实例由Class对象获取：

- Method getMethod(String name, Class...   parameterTypes)：通过指定方法名，参数类型，返回Method实例
- Method[]   getMethods()：返回该类中所有方法的Method实例

##### **2.3.2 Method获取基本信息**

Method封装了类中的方法，可以动态获取方法的信息，如：

- getReturnType：获取方法的返回值类型
- getName：获得方法名
- getParameterTypes：获得方法参数类型

##### **2.3.3 Method动态调用方法**

除了动态获得方法信息，Method类还可以动态调用某个对象的具体方法：

- invoke(Object obj, Object...   args);





#### 2.4 Field类

**2.4.1 Field的获取**

获得Field实例，都是通过Class中的方法实现的：

- public Field getField(String name)  
- 通过指定Field的名字，返回Field实例
- 注意Field的访问权限

之前提到过，如果单纯地使用getField那么获取到的方法实例都是public的，如果要获取private方法，需要使用诸如getDeclaredField方法：



备注：

Java Field.get()取得对象的Field属性值，即field.get(Class  clazz)可以获取对象属性的值，类似于调用无限制的getter方法

### 3、反射的重要说明

反射实际上将**所有的类成分**映射成为对应的的Class对象，这里的Class对象其实可以堪称是一种类型。并不知只有类才能转换成Class对象。

也即是说，如果真的需要（比如某些方法中要求参数是Class类型），像基本的数据类型（boolean、byte、char、short、int、long、float、double）甚至关键字如  void 也可以表示为Class对象（形如 int.class）

比如某些方法，如果你要用反射表示，可能参数可能会写成如 (String.class, int.class)  这种形式，这是sun公司定义的规则，不需要深刻去理解为什么。

 

代码：

```
package 反射;

public final class Person {
	/*
	 * class Animal{}
	 * class Computer{}
	 * class Food{}
	 * 
	 * Class 类别    Field  属性  Method 普通方法   Constructor 构造方法
	 * 
	 */
	 int id;
	public String name;
	char sex;
	Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int id, String name, char sex) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	protected void show(){
		System.out.println("编号： "+id+"姓名： "+name+"性别： "+sex);
	}

}

```

```
package 反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, NoSuchMethodException, InstantiationException, IllegalAccessException {
		/*
		 * 反射： 
		 * Class: 获取Class对象的3种方式：
		 * 1. 对象.getClass();  p.getClass();
		 * 2. Class.forName("类的全限命名");
		 * 3. 类名.class
		 * 
		 */
		Person p=new Person();
		Class clazz1=p.getClass();
		Class clazz2=Class.forName("反射.Person");
		Class clazz3=Person.class;
		//通过3种方式获取的是同一个对象
		System.out.println(clazz1==clazz2);//true
		System.out.println(clazz2==clazz3);//true
		
		/*
		 * Class类中的主要方法有：

			•getMethod：返回类中某个方法的实例
			•getMethods：返回类中所有方法的实例
			•getField：返回类中某个属性的实例
			•getFields：返回类中所有属性的实例
			•getConstructor：返回类中的一个构造方法的实例
			•getXXX：Class中还有若干get方法，获取类的基本信息
			
			
			
			
			需要注意的是，以上涉及的获取Method或Field实例的方法，
			实际上还有一个类似的方法，不过名字中多个词Declared，如getDeclaredMethods()，
			区别在于：
			
			•包含Declared：它仅获取自身类声明的方法，包括公开的、私有的、保护的等
			•没有Delcared的普通get方法：会获取某个类所有的公开（public）成员，包括自己定义的和继承下来的
		 */
		//获取单个属性
		//Field field=clazz1.getField("id");
		Field field=clazz1.getDeclaredField("id");
		System.out.println(field);
		
		System.out.println("------------");
		//获取所有属性
		//Field[] fields=clazz1.getFields();
		Field[] fields=clazz1.getDeclaredFields();
		for (Field f : fields) {
			System.out.println(f);
		}
		
		System.out.println("-------------");
		//获取普通方法
		//Method[] methods=clazz2.getMethods();
		Method[] methods=clazz2.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		
		//获取制定的方法
		System.out.println("------------");
		Method me=clazz2.getDeclaredMethod("show", null);
		System.out.println(me);
		
		System.out.println("---------------------");
		//获取构造方法
		//Constructor[] cons=clazz3.getConstructors();
		Constructor[] cons=clazz3.getDeclaredConstructors();
		for (Constructor con: cons) {
			System.out.println(con);
		}
		
		System.out.println("----------------------");
		//获取制定的构造方法
		Constructor conn=clazz3.getConstructor(int.class,String.class,char.class);
		System.out.println(conn);
		
		System.out.println("------------------");
		//获取类名
		String leiName=clazz3.getName();
		System.out.println(leiName);
		//获取包名
		Package pack=clazz3.getPackage();
		System.out.println(pack);
		//获取修饰符
		int modifer=clazz3.getModifiers();
		System.out.println(modifer);
		
		//创建类的对象
		Person p2=(Person) clazz3.newInstance();
		p2.setId(3);
		p2.setName("李四");
		p2.setSex('男');
		
		p2.show();
	}

}

```



## JAVA8 新特性



本教程将Java8的新特新逐一列出，并将使用简单的代码示例来指导你如何使用默认接口方法，lambda表达式，方法引用以及多重Annotation，之后你将会学到最新的API上的改进，比如流，函数式接口，Map以及全新的日期API

 

“Java is still not dead—and people are starting to figure that out.”

本教程将用带注释的简单代码来描述新特性，你将看不到大片吓人的文字。

### 一、接口的默认方法

Java 8允许我们给接口添加一个非抽象的方法实现，只需要使用 default关键字即可，这个特征又叫做扩展方法，示例如下：

 代码如下:



```
public interface Formula {
    double calculate(int a);
    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}
```

 

Formula接口在拥有calculate方法之外同时还定义了sqrt方法，实现了Formula接口的子类只需要实现一个calculate方法，默认方法sqrt将在子类上可以直接使用。

代码如下:

```
  Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };
        System.out.println(formula.calculate(100));     // 100.0
        System.out.println(formula.sqrt(16));           // 4.0
```



文中的formula被实现为一个匿名类的实例，该代码非常容易理解，6行代码实现了计算 sqrt(a * 100)。在下一节中，我们将会看到实现单方法接口的更简单的做法。

译者注： 在Java中只有单继承，如果要让一个类赋予新的特性，通常是使用接口来实现，在C++中支持多继承，允许一个子类同时具有多个父类的接口与功能，在其他 语言中，让一个类同时具有其他的可复用代码的方法叫做mixin。新的Java 8 的这个特新在编译器实现的角度上来说更加接近Scala的trait。 在C#中也有名为扩展方法的概念，允许给已存在的类型扩展方法，和Java 8的这个在语义上有差别。

### 二、Lambda 表达式

首先看看在老版本的Java中是如何排列字符串的：

 

```
List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
Collections.sort(names, new Comparator<String>() {
    @Override
    public int compare(String a, String b) {
        return b.compareTo(a);
    }
});
```



只需要给静态方法 Collections.sort 传入一个List对象以及一个比较器来按指定顺序排列。通常做法都是创建一个匿名的比较器对象然后将其传递给sort方法。

在Java 8 中你就没必要使用这种传统的匿名对象的方式了，Java 8提供了更简洁的语法，lambda表达式：

```
Collections.sort(names, (String a, String b) -> {
    return b.compareTo(a);
});
```

看到了吧，代码变得更段且更具有可读性，但是实际上还可以写得更短：

```
Collections.sort(names, (String a, String b) -> b.compareTo(a));
```

对于函数体只有一行代码的，你可以去掉大括号{}以及return关键字，但是你还可以写得更短点：

 

```
Collections.sort(names, (a, b) -> b.compareTo(a));
```

 

ava编译器可以自动推导出参数类型，所以你可以不用再写一次类型。接下来我们看看lambda表达式还能作出什么更方便的东西来：

### 三、函数式接口

Lambda 表达式是如何在java的类型系统中表示的呢？每一个lambda表达式都对应一个类型，通常是接口类型。而“函数式接口”是指仅仅只包含一个抽象方法的 接口，每一个该类型的lambda表达式都会被匹配到这个抽象方法。因为 默认方法 不算抽象方法，所以你也可以给你的函数式接口添加默认方法。

我们可以将lambda表达式当作任意只包含一个抽象方法的接口类型，确保你的接口一定达到这个要求，你只需要给你的接口添加 @FunctionalInterface 注解，编译器如果发现你标注了这个注解的接口有多于一个抽象方法的时候会报错的。

示例如下：

```
@FunctionalInterface
public interface Converter<F, T> {
    T convert(F from);
}

Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
Integer converted = converter.convert("123");
System.out.println(converted);    // 123
```



需要注意如果@FunctionalInterface如果没有指定，上面的代码也是对的。

译者注 将lambda表达式映射到一个单方法的接口上，这种做法在Java 8之前就有别的语言实现，比如Rhino JavaScript解释器，如果一个函数参数接收一个单方法的接口而你传递的是一个function，Rhino 解释器会自动做一个单接口的实例到function的[适配器](https://www.baidu.com/s?wd=适配器&tn=24004469_oem_dg&rsv_dl=gh_pl_sl_csd)，典型的应用场景有 org.w3c.dom.events.EventTarget 的addEventListener 第二个参数 EventListener。

### 四、方法与构造函数引用

前一节中的代码还可以通过静态方法引用来表示：

```
Converter<String, Integer> converter = Integer::valueOf;
Integer converted = converter.convert("123");
System.out.println(converted);   // 123
```

Java 8 允许你使用 :: 关键字来传递方法或者构造函数引用，上面的代码展示了如何引用一个静态方法，我们也可以引用一个对象的方法：

```
  String something="Javaaaa";
        Converter<String,Boolean> converter = something::startsWith;
        Boolean converted = converter.convert("Java");
        System.out.println(converted);    // true

```

接下来看看构造函数是如何使用::关键字来引用的，首先我们定义一个包含多个构造函数的简单类：

```
class Person {
    String firstName;
    String lastName;
    Person() {}

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
```



接下来我们指定一个用来创建Person对象的对象工厂接口：

```
interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}
```

这里我们使用构造函数引用来将他们关联起来，而不是实现一个完整的工厂：

```
PersonFactory<Person> personFactory = Person::new;
Person person = personFactory.create("Peter", "Parker");
```

我们只需要使用 Person::new 来获取Person类构造函数的引用，Java编译器会自动根据PersonFactory.create方法的签名来选择合适的构造函数。

### 五、Lambda 作用域

在lambda表达式中访问外层作用域和老版本的匿名对象中的方式很相似。你可以直接访问标记了final的外层局部变量，或者实例的字段以及静态变量。

### 六、访问局部变量

我们可以直接在lambda表达式中访问外层的局部变量：

 

```
final int num = 1;
Converter<Integer, String> stringConverter =
        (from) -> String.valueOf(from + num);
stringConverter.convert(2);     // 3
```

但是和匿名对象不同的是，这里的变量num可以不用声明为final，该代码同样正确：

 

```
int num = 1;
Converter<Integer, String> stringConverter =
        (from) -> String.valueOf(from + num);
stringConverter.convert(2);     // 3
```

 

不过这里的num必须不可被后面的代码修改（即隐性的具有final的语义），例如下面的就无法编译：

```
int num = 1;
Converter<Integer, String> stringConverter =
        (from) -> String.valueOf(from + num);
num = 3;

```

在lambda表达式中试图修改num同样是不允许的。



## 网络编程：

网络编程：   针对网络

BS（浏览器服务器结构） IE 360  访问网站的内容
CS(客户端服务器结构)	QQ  暴风影音  通过客户端与服务器建立连接

主要是CS结构   BS在中级阶段主要讲这个

表示网络中的计算机：  计算机名（IP地址来表示）  网络中的一台计算机都有独立的IP地址

表示这台计算机上的某个应用 通过端口号来表示

定位计算机上的某个应用 ： IP地址+端口号

域名： www.baidu.com  为了方便使用，把网络上的计算机的IP地址用域名来表示

域名服务器： 作用：把域名转换为对应的IP地址

在java中，IP地址和端口号都是一个独立的类

计算机在网络中传输数据必须遵守协议：

TCP/IP 协议   UDP协议


网络中计算机之间传输数据：

1.建立连接 Socket
2.传输数据 IO流
3.关闭连接 关闭流,socket

TCP/IP协议：

建立连接通过Socket  getInputStream()  getOutputStream()  close()
服务器端监听 ServerSocket   接收连接	Socket accept()
传输数据 发送数据 new PrintWriter(s.getOutputStream())

接收数据  new BUfferedReader(new InputStreamReader(s.getInputStream()))



TCP/IP  相当于打电话  安全，可靠，数据不容易丢失，效率低
UDP     相当于发短信，投快递    不安全的，不可靠，数据容易出错，效率高


UDP编程：

DatagramSocket 相当于快递站	DatagramSocket(int port) send(dp) receive(dp)
DatagramPacket 。。。快递包
InetSocketAddress    快递单	InetSocketAddress(InetAddress addr, int port) 



```
package day22;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class HelloClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		//1.建立连接
		Socket client=new Socket("192.168.1.22",8888);
		//2.传输数据
		PrintWriter pw=new PrintWriter(client.getOutputStream());
		pw.print("hello! Server!!!");
		pw.flush();
		//3.关闭连接
		if(pw!=null){pw.close();}
		if(client!=null){client.close();}
	}

}

```

```
package day22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloServer {

	public static void main(String[] args) throws IOException {
		//1.监听连接
		ServerSocket server=new ServerSocket(8888);
		//2.接受并建立连接
		Socket s=server.accept();
		//3.交换数据
		BufferedReader reader=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str=reader.readLine();
		System.out.println("来自客户端的消息是： "+str);
		//4.关闭连接
		if(reader!=null){reader.close();}
		if(s!=null){s.close();}
	}

}

```



```
package day22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestTCPClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket client=new Socket("127.0.0.1",8889);
		//表示本机ip的表示方式： 1.实际IP  2. localhost  3.127.0.0.1
		//向服务器发消息
		PrintWriter pw=new PrintWriter(client.getOutputStream());
		pw.println("How are you !!! Server..");
		pw.flush();
		
		//接收来自服务器的消息
		BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
		System.out.println("来自服务器的消息是： "+br.readLine());
		
		if(pw!=null){pw.close();}
		if(br!=null){br.close();}
		if(client!=null){client.close();}

	}

}

```



```
package day22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TestTCPServer {

	public static void main(String[] args) throws IOException {
		ServerSocket server=new ServerSocket(8889);
		Socket s=server.accept();
		
		//接收来自客户端的消息
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str=br.readLine();
		System.out.println("来自客户端的消息是："+str);
		System.out.println("客户端的IP地址是： "+s.getInetAddress()+"端口号是： "+s.getPort());

		//向客户端回消息
		PrintWriter pw=new PrintWriter(s.getOutputStream());
		pw.println("I'm fine !Thank you ! client........");
		pw.flush();
		
		if(br!=null){br.close();}
		if(pw!=null){pw.close();}
		if(s!=null){s.close();}
	}

}

```



练习：

设服务器端程序监听端口为8629,当收到客户端信息后，首先判断是否是“BYE”，

若是，则立即向对方发送“BYE”，然后关闭监听，结束程序。
若不是，则在屏幕上输出收到的信息，并由键盘上输入发送到对方的应答信息。
请编写程序完成此功能。



```
package day22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/*设服务器端程序监听端口为8629,当收到客户端信息后，首先判断是否是“BYE”，
若是，则立即向对方发送“BYE”，然后关闭监听，结束程序。
若不是，则在屏幕上输出收到的信息，并由键盘上输入发送到对方的应答信息。
请编写程序完成此功能。*/


public class Ex_Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s=new Socket("localhost",8629);
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter pw=new PrintWriter(s.getOutputStream());
		String line=null;
		while(!"bye".equalsIgnoreCase(line)){
			System.out.println("发送： ");
			String datas=sc.nextLine();
			pw.println(datas);
			pw.flush();
			
			line=br.readLine();
			System.out.println("接收： "+line);
		}
		if(br!=null){br.close();}
		if(pw!=null){pw.close();}
		if(s!=null){s.close();}
	}

}

```

```
package day22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Ex_Server {

	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(8629);
		Socket s=ss.accept();
		
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter pw=new PrintWriter(s.getOutputStream());
		
		String line=null;
		while(!"bye".equalsIgnoreCase(line)){
			line=br.readLine();
			System.out.println("接收： "+line);
			System.out.println("发送：");
			String msg=sc.nextLine();
			pw.println(msg);
			pw.flush();
		}
		pw.println("bye");
		pw.flush();
		if(br!=null){br.close();}
		if(pw!=null){pw.close();}
		if(s!=null){s.close();}
	}

}

```



```
package day22;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class TestUDPServer {

	public static void main(String[] args) throws IOException {
		DatagramSocket socket=new DatagramSocket(8883);//构造一个接收的快递站，指明哪个快递站（带端口）
		byte[] buff=new byte[100];
		DatagramPacket dp=new DatagramPacket(buff,buff.length);//构造一个快递包，用来存放接受来的数据
		socket.receive(dp);//接收快递
		String str=new String(buff);//拆包，把数据组合成成品
		System.out.println("来自发送方的消息： "+str);
		
		if(socket!=null){socket.close();}//关闭连接

	}

}

```

```
package day22;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class TestUDPClient {
//UDP协议编程的发送方
	public static void main(String[] args) throws IOException {
		
		DatagramSocket socket=new DatagramSocket();//构造快递站
		String str="Hello !!! receiver.....";
		byte[] buff=str.getBytes();
		DatagramPacket dp=new DatagramPacket(buff,buff.length,new InetSocketAddress("localhost",8883));
		//将快递打包，贴上快递单
		socket.send(dp);//投递
		if(socket!=null){socket.close();}
	
	}

}

```



```
package day22;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class TestUDPSender {

	public static void main(String[] args) throws IOException {
		//发送消息
		DatagramSocket socket=new DatagramSocket();
		String str="Hello!!!  receiver.........";
		byte[] buff=str.getBytes();
		DatagramPacket dp=new DatagramPacket(buff,buff.length,new InetSocketAddress("localhost",8874));
		socket.send(dp);
		
		//接收消息
		byte[] buff2=new byte[30];
		DatagramPacket dp2=new DatagramPacket(buff2,buff2.length);
		socket.receive(dp2);
		String str2=new String(buff2);
		System.out.println("来自接收方的消息是： "+str2);
		
		if(socket!=null){socket.close();}
	}

}

```

```
package day22;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class TestUDPReceiver {

	public static void main(String[] args) throws IOException {
		
		//接收数据
		DatagramSocket socket =new DatagramSocket(8874);
		byte[] buff=new byte[30];
		DatagramPacket dp=new DatagramPacket(buff,buff.length);
		socket.receive(dp);
		String str=new String(buff);
		System.out.println("来自发送方的消息是： "+str);
		
		//发送消息
		String str2="Hello!!! sender..........";
		byte[] buff2=str2.getBytes();
		DatagramPacket dp2=new DatagramPacket(buff2,buff2.length,dp.getSocketAddress());
		socket.send(dp2);
		
		if(socket!=null){socket.close();}
	}

}

```





```
package day22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class TestURL {

	public static void main(String[] args) throws IOException {
		URL url=new URL("http://www.baidu.com");//定义一个网站
		URLConnection conn=url.openConnection();//建立连接
		BufferedReader br=new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String line=null;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}//读取网站内容
		if(br!=null){br.close();}//关闭连接

		/*BufferedInputStream in=new BufferedInputStream(conn.getInputStream());
		BufferedOutputStream out=new BufferedOutputStream(new FileOutputStream("D:\\2015.7.27初级班\\day22\\day22\\a.html"));
		int data=-1;
		while((data=in.read())!=-1){
			out.write(data);
		}
		if(in!=null){in.close();}
		if(out!=null){out.close();}*/
	}

}

```

