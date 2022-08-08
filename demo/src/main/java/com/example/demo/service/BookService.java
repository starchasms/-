package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.books;

import java.util.List;


public interface BookService extends IService<books> {
    List<books> selectList();
    void insert(String bookName,String author,String category,String press,Integer sum,Integer sumInw,String isbn,double price,String bookUrl);

    List<books> selectbyisbn(String isbn);

    void deleteById(Integer id);

    void update(String bookId,String bookName,String author,String category,String press,Integer sum,Integer sumInw,String isbn,double price,String bookUrl);
}
