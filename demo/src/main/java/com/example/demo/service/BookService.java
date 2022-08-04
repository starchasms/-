package com.example.demo.service;

import com.example.demo.entity.books;

import java.util.List;


public interface BookService {
    List<books> selectList();
    void insert(books books);

    List<books> selectbyisbn(String isbn);

    void deleteById(Integer id);

    void update(books books);
}
