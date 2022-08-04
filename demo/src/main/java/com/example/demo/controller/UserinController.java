package com.example.demo.controller;



import com.example.demo.entity.Userin;
import com.example.demo.service.UserinService;
//import com.example.login.pojo.Userin;
//import com.example.login.service.UserinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")

public class UserinController {
    @Autowired
    UserinService userinService;

    @PostMapping("/login")
    public String login(Userin userin){
        return userinService.login(userin);
    }

    @PostMapping("/regist")
    public String regist(Userin userin){
        return userinService.regist(userin);
    }
}
