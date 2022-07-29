package com.bookstore.backend.service.impl;

import com.bookstore.backend.mapper.DemoMapper;
import com.bookstore.backend.model.entity.Demo;
import com.bookstore.backend.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: world
 * @date: 2022/7/29 15:43
 * @description: Demo表的实现类
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoMapper demoMapper;

    /**
     * 查询列表
     * @return
     */
    @Override
    public List<Demo> selectList() {
        return null;
    }
}
