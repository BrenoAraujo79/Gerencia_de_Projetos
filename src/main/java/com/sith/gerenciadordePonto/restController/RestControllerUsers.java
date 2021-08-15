package com.sith.gerenciadordePonto.restController;

import com.sith.gerenciadordePonto.model.Usuarios;
import com.sith.gerenciadordePonto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RestControllerUsers {

        @Autowired
        UserService userService;

        @GetMapping("/adm")
        public List<Usuarios> getAll(){
            return userService.findAll();
        }

        @PostMapping("/adm")
        public Usuarios savaUsuarios(@RequestBody Usuarios usuarios){
            System.out.println(usuarios.getNome());
            return userService.save(usuarios);
        }



}
