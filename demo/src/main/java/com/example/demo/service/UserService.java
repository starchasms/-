package com.example.demo.service;


import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public class UserService {
public User loginIn(String userName, String password) {
        return null;
    }
//插入用户
public int addUser(String userName,String sex,String phone,String  password,Integer state,Integer administratir) {
        return 0;
    }
//删除用户
public int dropUser(Integer password) {
        return 0;
    }
//修改用户信息
public int modifyUser(Integer userId,String state,String password) {
        return 0;
    }
//根据id查询信息
public User queryUserByUserId(Integer userId) {
        return null;
    }
//查询所有用户

public List<User> queryAllUser() {

    return null;
    }
}
