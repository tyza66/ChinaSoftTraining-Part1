<%--
  Created by IntelliJ IDEA.
  User: tyza66
  Date: 2023/6/2
  Time: 13:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="RegisterServlet" method="post">
    用户名:<input type="text" name="uname"/><br/>
    密码:<input type="password" name="pwd"/><br/>
    爱好:<input type="checkbox" name="hobby" value="抽烟"/>抽烟
    <input type="checkbox" name="hobby" value="喝酒"/>喝酒
    <input type="checkbox" name="hobby" value="烫头"/>烫头<br/>
    <input type="submit"/>
  </form>
  </body>
</html>
