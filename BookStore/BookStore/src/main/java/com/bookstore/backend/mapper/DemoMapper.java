package com.bookstore.backend.mapper;

import com.bookstore.backend.model.entity.Demo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author: world
 * @date: 2022/7/29 15:44
 * @description: DemoMapper的sql语句
 */
@Mapper
public interface DemoMapper {
    /**
     * 使用@select注解方式查询
     * @return
     */
    @Select("select * from demo")
    List<Demo> selectList();


    /**
     * 通过xml方式查询
     * @return
     */
    List<Demo> selectListXml();
}
