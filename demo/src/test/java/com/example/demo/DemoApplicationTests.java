package com.example.demo;

import com.example.demo.controller.BookController;
import com.example.demo.controller.UserController;
import com.example.demo.entity.books;
import com.example.demo.mapper.BookMapper;
import com.example.demo.service.BookService;
import com.example.demo.service.UserService;
import com.example.demo.service.impl.BookServicelmpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.ModelMap;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    BookMapper bookController;
    @Test
    void contextLoads() {
        bookController.insert("北纬","陈丹燕","小说","浙江文艺出版社",1,1,"978753394648",39.0,"0");
    }


    @Autowired
    UserController userController;
    @Test
    public void text(){
        System.out.println(userController.addUser("7","1","1","1",1,1));
    }


}
