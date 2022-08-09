package com.example.demo.service;

import com.example.demo.entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> selectall();
    void deleteById(Integer id);
    List<Order> selectbyorderid(Integer orderid);
}
