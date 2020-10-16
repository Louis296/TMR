package com.tmr.service;

import com.tmr.mapper.OrderMapper;
import com.tmr.po.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("orderService")
@Transactional
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> selectOrdersByUserId(Integer userId) {
        return orderMapper.selectOrdersByUserId(userId);
    }
}
