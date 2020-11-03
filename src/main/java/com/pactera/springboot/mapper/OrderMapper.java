package com.pactera.springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pactera.springboot.model.Order;
import com.pactera.springboot.model.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @description: 产品mapper
 * @author: Lance
 * @create: 2020-10-23
 **/
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

}
