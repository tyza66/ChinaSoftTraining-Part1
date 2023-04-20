# web前端知识体系 



公司里面前后端分离，分成后台和前端技术



前后端协同开发，约定好前后端对接的接口，主要是 访问路径，传的参数以及请求方式



前端应该掌握i的技术栈：



html

javascript

css

jquery

ajax

vue

react

angularjs



easyui

ztree 

bootstarp

elementui

uniapp 小程序

 ES6新特性

NodeJS

webpack



------------------------------------------------------------------------------



html : 超文本标记语言

超文本： 不仅可以放普通文本，还可以有图片，音乐，视频，超链接等元素

普通文本： 放的是文字字符等



开发工具： 记事本开发工具 ，hbuilder  或者vscode

开发的时候使用的是记事本编辑工具，运行的时候事宜浏览器为载体的



基本代码结构：

```
<html>
	<head>
		<meta charset="UTF-8">
		<title>第一个html文件</title>
	</head>
	<body>
		你好，这是我的第一个html网页哈哈哈
	</body>
</html>
```



最外层是html标签，里面嵌套有head标签和body标签，分别有浏览器对应的范围；

html标签大部分都是双标签，有开始标签和结束标签，head标签里面可以嵌套title标签，表示网页的标题



html里面的标签是人家事先规定好的，不能自己随便定义，学习html就是学习里面的标签



标题标签： h1-h6   h1标题加粗  最大 h6最小； hn  n的值只能是1--6

```
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<body>
		<h1>标题1</h1>
		<h2>标题2</h2>
		<h3>标题3</h3>
		<h4>标题4</h4>
		<h5>标题5</h5>
		<h6>标题6</h6>
		
	</body>
</html>

```

 font标签  字体标签  可以有相应的属性

```
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<body>
		<!--html注释-->
		<!--font标签后面可以有相应的属性，属性名=属性值   size表示字号大小  color表示字体颜色-->
		<font size="8" color="green">基本语法</font>
	</body>
</html>

```



body标签的几个属性：

```
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<body bgcolor="#D8BFD8" align="right" background="img/chenchen.png" text="blue">
		
		<!--bgcolor 表示背景颜色  颜色可以用英文单词或者16进制的颜色来表示
			
			background表示背景图片    align 表示对其方式 值有 left/center/right 默认为left
		-->
		河南新华电脑学院
	</body>
</html>

```

​                                         

换行和段落标签：



```
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<body>
		
		<!--换行<br>或者<br/> 段落可以写成单标签或者双标签都可以-->
		基金会hi Ohio给hi哦女孩如果看过开机即可<br>
		给水浒Ohio给i哦敢说红歌会iOS<br/>
		公司如何hi哦i经过深入<p>hfghrghiohkiogij比较<p>简单交换机很快就好了</p>备货计划计划
		胡个人hi哦i给i
	</body>
</html>

```



水平线hr标签



```
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<body>
		
		<!--水平线hr 有多个属性  size 表示粗细  color 表示背景颜色 width 表示宽度 可以使用百分比
		align对其方式 默认值为center-->
		<hr width="60%"/>
		<hr size="12" color="red"/>
		<hr size="8" color="black" width="50%"/>
		<hr size="8" color="blue" width="50%" align="left"/>
		<hr size="8" color="orange" width="50%" align="right"/>
		<hr size="8" color="greenyellow" width="50%" align="center" />
	</body>
</html>

```



居中



```
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<!--<body align="center">-->
	<body>	
		<!--居中对其的方式 1. 标签本身align  2. body标签align 表示body里面所有内容居中
		3. 使用center标签-->
		<!--<h1 align="center">新华电脑学院</h1>-->
		<center>
		<h1>新华电脑学院</h1>
		</center>
	</body>
</html>

```



字体样式标识符

```
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<body>
		正常字体 <b>粗体</b> <i>斜体</i><u>下划线</u>
		<big>大字体</big> <small>小字体</small>
		<strike>删除线</strike> <s>删除线</s>
		<sub>下标</sub> <sup>上标</sup>
		<tt>固定宽度</tt>
	</body>
</html>

```

逻辑字符样式：

```

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<body>
		<address>北京市海定区黄河路</address>
		<city>郑州市</city>
		<code>public static void main(String[] args){}</code>
		<dfn>专门术语</dfn>
		<em>强调作业</em>
		<kbd>键盘输入</kbd>
		<samp>文本样式</samp>
		<strong>强调</strong>
		<var> var i=3;var j=4;</var>
	</body>
</html>

```

