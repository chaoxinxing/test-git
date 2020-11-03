package com.pactera.springboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pactera.springboot.mapper.OrderMapper;
import com.pactera.springboot.mapper.ProductMapper;
import com.pactera.springboot.model.Order;
import com.pactera.springboot.model.Product;
import com.pactera.springboot.service.OrderService;
import com.pactera.springboot.service.ProductService;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: Lance
 * @create: 2020-09-19
 **/
@Service
public class OrderServiceImpl extends BaseServiceImpl<Order> implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public BaseMapper<Order> getMapper() {
        return orderMapper;
    }

    @Override
    public List<Order> findOrdersByMember(String memberCode) {
        return orderMapper.selectList(new LambdaQueryWrapper<Order>().eq(Order::getMemberCode,memberCode));
    }
}
