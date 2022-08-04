package com.example.demo.bjpowernode.mapper;


import com.example.demo.bjpowernode.pojo.Books;
import com.example.demo.bjpowernode.pojo.BooksExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface
BooksMapper {
    int countByExample(BooksExample example);

    int deleteByExample(BooksExample example);

    int deleteByPrimaryKey(Integer bookId);

    int insert(Books record);

    int insertSelective(Books record);

    List<Books> selectByExample(BooksExample example);

    Books selectByPrimaryKey(Integer bookId);

    int updateByExampleSelective(@Param("record") Books record, @Param("example") BooksExample example);

    int updateByExample(@Param("record") Books record, @Param("example") BooksExample example);

    int updateByPrimaryKeySelective(Books record);

    int updateByPrimaryKey(Books record);
}