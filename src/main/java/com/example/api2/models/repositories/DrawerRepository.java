package com.example.api2.models.repositories;

import com.example.api2.models.entities.Drawer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrawerRepository extends JpaRepository<Drawer, Long> {

}
