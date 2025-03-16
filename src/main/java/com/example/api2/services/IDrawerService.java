package com.example.api2.services;

import com.example.api2.models.entities.Book;
import com.example.api2.models.entities.Drawer;

public interface IDrawerService {

    Drawer findById(Long id);
    Drawer save(Drawer drawer);
    Drawer delete(long id);
}
