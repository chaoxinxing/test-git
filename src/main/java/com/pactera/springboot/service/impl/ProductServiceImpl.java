package com.pactera.springboot.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pactera.springboot.mapper.ProductMapper;
import com.pactera.springboot.model.Product;
import com.pactera.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: Lance
 * @create: 2020-09-19
 **/
@Service
public class ProductServiceImpl extends BaseServiceImpl<Product> implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public BaseMapper<Product> getMapper() {
        return productMapper;
    }
}
