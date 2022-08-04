package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.entity.books;
import com.example.demo.mapper.BookMapper;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServicelmpl implements BookService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public List<books> selectList() {
        return bookMapper.selectList(null);


    }

    @Override
    public void insert(books books) {
        bookMapper.insert(books);
    }

    @Override
    public List<books> selectbyisbn(String isbn) {
        QueryWrapper<books> wrapper = new QueryWrapper<>();
        wrapper.eq("isbn",isbn);
        return bookMapper.selectList(wrapper);

    }

    @Override
    public void deleteById(Integer id) {
        bookMapper.deleteById(id);
    }

    @Override
    public void update(books books) {
        bookMapper.updateById(books);
    }
}
