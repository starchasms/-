package com.example.demo;

import com.example.demo.controller.BookController;
import com.example.demo.controller.UserController;
import com.example.demo.service.UserService;
import com.example.demo.service.impl.BookServicelmpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.ModelMap;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    BookServicelmpl bookController=new BookServicelmpl();
    @Test
    void contextLoads() {
        System.out.println(bookController.selectList());
    }


    @Autowired
    UserService userController;
    @Test
    public void text(){
        System.out.println(userController.queryAllUser());
    }


}
