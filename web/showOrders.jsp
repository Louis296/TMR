<%@ page import="java.util.List" %>
<%@ page import="com.tmr.po.Order" %><%--
  Created by IntelliJ IDEA.
  User: Louis296
  Date: 2020/10/16
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TMR个人订单</title>
</head>
<body>
    <table border="1">
        <tr>
            <td>订单id</td>
            <td>日期</td>
            <td>费用</td>
            <td>商品id</td>
            <td>状态</td>
        </tr>

    <%
        List<Order> orderList=(List<Order>) session.getAttribute("orderList");
        if (orderList!=null){
            for (Order order:orderList){
    %>
        <tr>
            <td><%=order.getOrderId()%></td>
            <td><%=order.getDate()%></td>
            <td><%=order.getFee()%></td>
            <td><%=order.getContent()%></td>
            <td><%=order.getState()%></td>
        </tr>

    <%
            }
        }
    %>
    </table>
</body>
</html>
