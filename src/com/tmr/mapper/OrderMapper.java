package com.tmr.mapper;

import com.tmr.po.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository("orderMapper")
public interface OrderMapper {
    public List<Order> selectOrdersByUserId(Integer userId);
}
