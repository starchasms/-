package com.example.demo.service;

import com.example.demo.entity.Userin;
import com.example.demo.mapper.UserinMapper;
//import com.example.login.mapper.UserinMapper;
//import com.example.login.pojo.Userin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserinService {

    @Autowired
    UserinMapper userMapper;

    public String login(Userin userin){//TODO：登陆逻辑函数
        try {
            Userin userinExistN = userMapper.findByName(userin.getUser_name());
            if (userinExistN != null){
                String userExistP = userMapper.findPswByName(userin.getUser_name());
                if (userExistP.equals(userin.getPassword())){
                    return userin.getUser_name()+" 用户登录成功,欢迎您！";
                }else {
                    return "登陆失败,密码错误！";
                }
            }else {
                return "登陆失败，账户不存在";
            }
        }catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    public String regist(Userin userin){//TODO：注册判断逻辑函数
        try{
            Userin userinExist = userMapper.findByName(userin.getUser_name());
            if (userin.getUser_name().equals("")){
                return "账户名不能为空";
            }else if (userin.getPassword().equals("")){
                return "密码不能为空";
            }else if (userin.getEmail().equals("")){
                return "邮箱不能为空";
            }else if (userinExist != null){
                return "账户已经存在";
            }else {
                userMapper.save(userin);
                return "注册成功";
            }
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
