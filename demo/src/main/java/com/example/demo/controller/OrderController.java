package com.example.demo.controller;

import com.example.demo.entity.Order;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;
    @RequestMapping("/load")
    public List<Order> load(){
        List<Order> list=orderService.selectall();
        return list;
    }
    @ResponseBody
    @RequestMapping("/selectbyorderid")
    public List<Order> selectbyorderid(Integer orderId){
        List<Order> list=orderService.selectbyorderid(orderId);
        return list;
    }
    @ResponseBody
    @RequestMapping(value = "/del")
    public Map<String, Object> deleteById(Integer id){ //PathVariable 表明它是前端传过来的一个参数
        orderService.deleteById(id);
        Map<String,Object> map = new HashMap<>();
        map.put("code",200);
        map.put("message","删除成功");
        return map;
    }

}
