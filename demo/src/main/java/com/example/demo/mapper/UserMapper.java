package com.example.demo.mapper;

import org.apache.catalina.User;

import java.util.List;

public interface UserMapper {
   User getInfo(String userName, String password);
//增加用户
   int insertUser(User user);
//删除用户
   int deleteUser(Integer userId);
//更新用户
   int updateUser(User user);
//通过密码查询信息
   User selectUserByPassword(String password);
//查询所有用户
   List<User> getAllUser();

    List<User> findAll();

    void save(User phone);

    void updateByUser_id(User phone);
}
