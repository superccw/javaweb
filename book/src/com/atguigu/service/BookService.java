package com.atguigu.service;

import com.atguigu.pojo.Book;
import com.atguigu.pojo.Page;

import java.util.List;

public interface BookService {
    public void addBook(Book book);

    public void deleteBookById(Integer id);

    public void updateBook(Book book);

    public Book queryBookById(Integer id);

    public List<Book> queryBooks();
    //页面处理
    public Page<Book>page(int pageNo,int pageSize);

    //价格区间查询
    Page<Book> pageByPrice(int pageNo, int pageSize, int min, int max);
}
