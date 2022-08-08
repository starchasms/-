package com.example.demo.service.impl;

//import Mapper.UserMapper;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl extends UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User loginIn(String userName, String password){
        return (User) userMapper.getInfo(userName,password);
    }

    @Override
    public int addUser(String userName,String sex,String phone,String  password,Integer state,Integer administratir){
        int aFlag = userMapper.insertUser(userName,sex,phone,password,state,administratir);
        return aFlag;
    }

    @Override
    public int dropUser(Integer userId){
        int dFlag = userMapper.deleteUser(userId);
        return dFlag;
    }

    @Override
    public int modifyUser(Integer userId,String state,String password){
        int mFlag = userMapper.updateUser(userId,state,password);
        return mFlag;
    }
    @Override
    public List<User> queryAllUser() {

        return userMapper.findAll();
    }
}
