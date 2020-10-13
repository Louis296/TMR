<%--
  Created by IntelliJ IDEA.
  User: Louis296
  Date: 2020/10/6
  Time: 0:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TMR登录</title>

</head>
<body>
<%--    下方的表单仅供参考，实际上controller层会返回对应的字符串来表示是否登录成功，可以使用ajax进行接收判断--%>
    <form>
        手机：<input type="text" id="phoneNumber"><br>
        密码：<input type="password" id="password"><br>
    </form>
    <a href="#" id="loginbtn">登录</a>
</body>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script>
    a = document.getElementById('phoneNumber');
    b = document.getElementById('password');
    btn = document.getElementById('loginbtn');
    btn.onclick = function () {
        if (a.value == '' || b.value == '') {
            alert('账号或密码不能为空！');
            return;
        }

        var list = [];
        list.push(a.value);
        list.push(b.value);
        $.ajax({
            url:'${pageContext.request.contextPath }/user/logincheck',
            type:'POST',
            traditional:true,
            // contentType:'application/json;charset=utf-8',
            data:{list:list},
            // dataType:'String',
            success:function (data) {
                // alert("查询成功");
                if(data==='success'){
                    alert("登录成功");
                    window.location.href="${pageContext.request.contextPath}/userPage.jsp";
                }
                else{
                    alert("用户名或密码错误，请重新登录");
                }
            }
        })

    };
</script>
</html>
