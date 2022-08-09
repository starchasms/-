package com.example.demo.service.impl;

import com.example.demo.entity.Order;
import com.example.demo.mapper.OrderMapper;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;
    @Override
    public List<Order> selectall() {
        return orderMapper.selectall();
    }

    @Override
    public void deleteById(Integer id) {
        orderMapper.deleteById(id);
    }

    @Override
    public List<Order> selectbyorderid(Integer orderid) {
        return orderMapper.selectbyorderid(orderid);
    }
}
