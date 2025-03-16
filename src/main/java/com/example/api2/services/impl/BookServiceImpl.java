package com.example.api2.services.impl;
import com.example.api2.models.entities.Book;
import com.example.api2.models.repositories.BookRepository;
import com.example.api2.services.IBookService;

import java.util.List;

public class BookServiceImpl implements IBookService {



    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void delete(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public Book findById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }


}
