package com.example.api2.services;

import com.example.api2.models.entities.Book;
import java.util.List;

public interface IBookService {
    Book save(Book book);
    void delete(Long id);
    Book findById(Long id);
}
