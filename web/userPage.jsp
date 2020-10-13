<%--
  Created by IntelliJ IDEA.
  User: Louis296
  Date: 2020/10/13
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TMR个人界面</title>
</head>
<body>
    用户名:${empty user?"未登录":user.name}<br>
    <a href="${pageContext.request.contextPath}/user/logout">登出</a>
</body>
</html>
