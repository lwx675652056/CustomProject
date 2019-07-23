<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2019/7/22
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/login/userlogin" method="get">
    <div>
        账号：<input name="username" type="text">
    </div>
    <div>
        密码：<input name="password" type="text">
    </div>
    <div>
        <input type="submit" value="提交">
    </div>
</form>
</body>
</html>
