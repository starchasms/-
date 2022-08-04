package com.example.demo.mapper;


import com.example.demo.entity.Userin;
//import com.example.login.pojo.Userin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserinMapper {
    List<Userin> findAll();
    Userin findByName(String name);
    String findPswByName(String UserName);
    void save(Userin userin);
}

