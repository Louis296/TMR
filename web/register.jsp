<%--
  Created by IntelliJ IDEA.
  User: Louis296
  Date: 2020/10/6
  Time: 0:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TMR注册</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/user/register" method="post">
        用户名：<input type="text" name="name"><br>
        密  码：<input type="password" name="password"><br>
        手机号码：<input type="text" name="phoneNumber"><br>
        地  址：<input type="text" name="address"><br>
        类  型：<input type="text" name="type"><br>
        <input type="submit" value="注册">
        <input type="reset" value="重置">
    </form>
</body>
</html>
