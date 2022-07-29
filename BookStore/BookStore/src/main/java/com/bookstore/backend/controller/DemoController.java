package com.bookstore.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: world
 * @date: 2022/7/29 15:10
 * @description: 测试接口
 */
@RestController
@RequestMapping("")
public class DemoController {
    @RequestMapping("/demo")
    public Object getDemo(){
        return new Object();
    }

}
