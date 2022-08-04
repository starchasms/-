package com.example.demo.controller;


import org.springframework.ui.Model;
import com.example.demo.entity.books;
import com.example.demo.service.impl.BookServicelmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookServicelmpl bookServicelmpl;

    @RequestMapping("/loogin")
    public  String main(Model model){
        List<books> list=bookServicelmpl.selectList();
        model.addAttribute("booklist",list);
        return "login";
    }

    //   根据id 删除书籍
    @RequestMapping("/del/{id}")
    public String deleteById(@PathVariable("id") int id){ //PathVariable 表明它是前端传过来的一个参数
        bookServicelmpl.deleteById(id);
        return "login";
    }

    @RequestMapping("/add")
    public String add(@PathVariable("books") books books){
        bookServicelmpl.insert(books);
        return "login";
    }

    @RequestMapping("selectbyisbn")
    public  String selectbyisbn(Model model,String isbn){
        List<books> list=bookServicelmpl.selectbyisbn(isbn);
        model.addAttribute("booklist",list);
        return "login";
    }

    @RequestMapping("/update")
    public String update(@PathVariable("books") books books){
        bookServicelmpl.update(books);
        return "login";
    }
}
