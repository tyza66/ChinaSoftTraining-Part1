<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/6/1
  Time: 12:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  $END$
  <%--点击链接 发送get请求 <a href="映射地址名称">链接</a> 后端Servlet进行处理(接收请求) doGet()方法处理 --%>
  <a href="MyServlet">链接</a>

  <%--表单提交访问Servlet  通过action=“映射地址名称” method 如果不写 默认get请求  doGet()   method="post" post请求 doPost()--%>
  <form action="MyServlet" method="post">
    用户名：<input type="text"> <br>
    密码: <input type="password"> <br>
    <input type="submit" value="登录">
  </form>
  </body>
</html>
