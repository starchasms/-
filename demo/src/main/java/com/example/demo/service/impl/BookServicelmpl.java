package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.books;
import com.example.demo.mapper.BookMapper;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServicelmpl extends ServiceImpl<BookMapper,books> implements BookService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public List<books> selectList() {
        return bookMapper.selectList(null);


    }

    @Override
    public void insert(String bookName,String author,String category,String press,Integer sum,Integer sumInw,String isbn,double price,String bookUrl) {
        bookMapper.insert(bookName,author,category,press,sum,sumInw,isbn,price,bookUrl);
    }

    @Override
    public List<books> selectbyisbn(String isbn) {
        QueryWrapper<books> wrapper = new QueryWrapper<>();
        wrapper.eq("isbn",isbn);
        return bookMapper.selectList(wrapper);

    }

    @Override
    public void deleteById(Integer bookId) {
        bookMapper.deleteById(bookId);
    }

    @Override
    public void update(String bookId,String bookName,String author,String category,String press,Integer sum,Integer sumInw,String isbn,double price,String bookUrl) {
        bookMapper.updateById(bookId,bookName,author,category,press,sum,sumInw,isbn,price,bookUrl);
    }
}
