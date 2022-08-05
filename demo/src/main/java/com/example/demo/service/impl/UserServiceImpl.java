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
    public int addUser(User user){
        int aFlag = userMapper.insertUser(user);
        return aFlag;
    }

    @Override
    public int dropUser(Integer userId){
        int dFlag = userMapper.deleteUser(userId);
        return dFlag;
    }

    @Override
    public int modifyUser(User user){
        int mFlag = userMapper.updateUser(user);
        return mFlag;
    }
    @Override
    public List<User> queryAllUser() {

        return userMapper.findAll();
    }
}
