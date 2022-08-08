package com.example.demo.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.books;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface BookMapper extends BaseMapper<books> {
    int deleteById(Integer bookId);

    int insert(String bookName,String author,String category,String press,Integer sum,Integer sumInw,String isbn,double price,String bookUrl);
    int updateById(String bookId,String bookName,String author,String category,String press,Integer sum,Integer sumInw,String isbn,double price,String bookUrl);

}

