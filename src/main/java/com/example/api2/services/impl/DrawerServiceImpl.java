package com.example.api2.services.impl;

import com.example.api2.exceptions.DrawerNotFoundException;
import com.example.api2.models.entities.Drawer;
import com.example.api2.models.repositories.DrawerRepository;
import com.example.api2.services.IDrawerService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public class DrawerServiceImpl implements IDrawerService {

    private final DrawerRepository drawerRepository;

    public DrawerServiceImpl(DrawerRepository drawerRepository) {
        this.drawerRepository = drawerRepository;
    }

    @Override
    public Drawer findById(Long id) {
            return drawerRepository.findById(id).orElseThrow(()-> new DrawerNotFoundException("Drawer not found"));
    }

    @Override
    public Drawer save(Drawer drawer) {
        return drawerRepository.save(drawer);
    }

    @Override
    public Drawer delete(long id) {
        return null;
    }

    @Override
    public Drawer update(Long id, Drawer drawerNew) {
        Drawer searchDrawer = drawerRepository.findById(id).orElseThrow(()-> new DrawerNotFoundException("Drawer not found"));
            searchDrawer.setCapacity(drawerNew.getCapacity());
            searchDrawer.setStatus(drawerNew.getStatus());
            if(searchDrawer.getName().equals("Hola")){
               throw new DrawerNotFoundException("Drawer not found");
            }
            return drawerRepository.save(searchDrawer);
    }

    @Override
    public void delete(Long id){
        drawerRepository.deleteById(id);
    }
}
