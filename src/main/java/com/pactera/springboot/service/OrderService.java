package com.pactera.springboot.service;

import com.pactera.springboot.model.Order;

import java.util.List;

/**
 * @ClassName OrderService
 * @Description TODO
 * @Author fseve
 * @Date 2020/10/30 15:49
 * @Version 1.0
 **/
public interface OrderService extends BaseService<Order> {
    List<Order> findOrdersByMember(String memberCode);
}
