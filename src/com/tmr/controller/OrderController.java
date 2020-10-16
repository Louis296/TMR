package com.tmr.controller;

import com.tmr.po.Order;
import com.tmr.po.User;
import com.tmr.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("getOrders")
    public String getOrders(HttpSession session){
        User user=(User) session.getAttribute("user");
        List<Order> orderList=orderService.selectOrdersByUserId(user.getUserId());
        session.setAttribute("orderList",orderList);
        return "redirect:/showOrders.jsp";
    }
}
