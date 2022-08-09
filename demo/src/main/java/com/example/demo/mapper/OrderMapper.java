package com.example.demo.mapper;

import com.example.demo.entity.Order;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface OrderMapper {
    List<Order> selectall();
    int deleteById(Integer id);
    List<Order> selectbyorderid(Integer orderid);
}
