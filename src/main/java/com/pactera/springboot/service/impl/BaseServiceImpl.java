package com.pactera.springboot.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pactera.springboot.service.BaseService;

import java.util.List;

/**
 * @description:
 * @author: Lance
 * @create: 2020-10-23
 **/
public abstract class BaseServiceImpl<T> implements BaseService<T> {

    public abstract BaseMapper<T> getMapper();

    @Override
    public void update(T t) {
        getMapper().updateById(t);
    }

    @Override
    public void insert(T t) {
        getMapper().insert(t);
    }

    @Override
    public T findByPrimaryKey(String primaryKey) {
        return getMapper().selectById(primaryKey);
    }

    @Override
    public List<T> select() {
        return getMapper().selectList(null);
    }
}
