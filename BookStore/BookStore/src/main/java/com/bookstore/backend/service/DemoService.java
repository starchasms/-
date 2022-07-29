package com.bookstore.backend.service;

import com.bookstore.backend.model.entity.Demo;

import java.util.List;

/**
 * @author: world
 * @date: 2022/7/29 15:39
 * @description: DemoService
 */
public interface DemoService {
    /**
     * 查询列表
     * @return
     */
    List<Demo> selectList();
}
