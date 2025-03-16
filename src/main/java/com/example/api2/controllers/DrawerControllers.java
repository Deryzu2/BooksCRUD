package com.example.api2.controllers;
import com.example.api2.exceptions.DrawerNotFoundException;
import com.example.api2.models.entities.Drawer;
import com.example.api2.services.IDrawerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<?> putDrawer(@RequestBody Drawer drawer, @PathVariable long id){
        try{
            this.drawerService.update(id, drawer);
            return ResponseEntity.ok("Drawer actualizado exitosamente");
        }catch (DrawerNotFoundException ex){
            return ResponseEntity.ok(ex.getMessage());
        }
    }
    @DeleteMapping("/drawer/d")
    public void deleteDrawer(@PathVariable long id){
        drawerService.delete(id);
    }
}
