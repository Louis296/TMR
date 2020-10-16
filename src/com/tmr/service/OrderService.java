package com.tmr.service;

import com.tmr.po.Order;

import java.util.List;

public interface OrderService {
    public List<Order> selectOrdersByUserId(Integer userId);
}
