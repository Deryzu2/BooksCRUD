package com.example.api2.services.impl;

import com.example.api2.models.entities.Book;
import com.example.api2.models.entities.Drawer;
import com.example.api2.models.repositories.DrawerRepository;
import com.example.api2.services.IDrawerService;

public class DrawerServiceImpl implements IDrawerService {

    private final DrawerRepository drawerRepository;

    public DrawerServiceImpl(DrawerRepository drawerRepository) {
        this.drawerRepository = drawerRepository;
    }

    @Override
    public Drawer findById(Long id) {
        return drawerRepository.findById(id).orElse(null);
    }

    @Override
    public Drawer save(Drawer drawer) {
        return drawerRepository.save(drawer);
    }

    @Override
    public void delete(Long id){
        drawerRepository.deleteById(id);
    }
}
