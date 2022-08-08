package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import org.springframework.stereotype.Repository;

import java.util.List;

import static org.springframework.http.HttpHeaders.FROM;

@Repository
@Mapper
public interface UserMapper {
   User getInfo(String userName, String password);
//增加用户
   int insertUser(String userName,String sex,String phone,String  password,Integer state,Integer administratir);
//删除用户
   int deleteUser(Integer userId);
//更新用户
   int updateUser(Integer userId, String state,String password);
//通过密码查询信息
   User selectUserByPassword(String password);
//查询所有用户
   List<User> getAllUser();

    List<User> findAll();

    void save(User phone);

    void updateByUser_id(User phone);
}
