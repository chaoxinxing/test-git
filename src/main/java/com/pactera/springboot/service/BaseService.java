package com.pactera.springboot.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * @description: 基础service
 * @author: Lance
 * @create: 2020-10-23
 **/
public interface BaseService<T> {
    /**
     * 更新实体
     *
     * @param object
     */
    void update(T object);

    /**
     * 新增数据
     *
     * @param object
     */
    void insert(T object);

    /**
     * 查询数据
     *
     * @param primaryKey
     * @return
     */
    T findByPrimaryKey(String primaryKey);

    /**
     * 查询列表
     *
     * @return
     */
    List<T> select();
}
