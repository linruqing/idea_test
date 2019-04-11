<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/8
  Time: 22:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
    <form method="post" action="/user/addUser">
        姓名:<input type="text" name="userName"/><br/>
        年龄:<input type="text" name="userAge"/><br/>
        <input type="submit" value="submit"/>
    </form>
</body>
</html>
