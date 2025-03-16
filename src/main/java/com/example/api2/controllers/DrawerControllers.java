package com.example.api2.controllers;
import com.example.api2.models.entities.Drawer;
import com.example.api2.services.IDrawerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@AllArgsConstructor
@RestController
@Controller
@RequestMapping("/Drawer")
public class DrawerControllers {
    @Autowired
    private IDrawerService drawerService;

    @GetMapping
    public String getDrawer(){
        return "hola";
    }
    @PostMapping
    public Drawer postDrawer(@RequestBody Drawer drawer){
        return drawerService.save(drawer);

    }
    @PutMapping
    public Drawer putDrawer(@RequestBody Drawer drawer, @PathVariable long id){

        return ;
    }
}
