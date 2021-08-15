package com.sith.gerenciadordePonto.controller;

import com.sith.gerenciadordePonto.model.*;

import java.util.List;

import com.sith.gerenciadordePonto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/usuarios")
public class ControladorPrincipal {

        @Autowired
        UserService userService;

        @RequestMapping(value = "/home", method = RequestMethod.GET)
        public String getHome(){
            return "inicio";
        }

        @RequestMapping(value = "/login", method = RequestMethod.GET)
        public String getLogin(){
                return "login";
        }

        @RequestMapping(value = "/cadastrar", method = RequestMethod.GET)
        public String getCadastro(){
                return "cadastro";
        }


        @RequestMapping(value = "/cadastrar",method = RequestMethod.POST)
        public String cadastrar(Usuarios usuarios){
                userService.save(new Usuarios(usuarios.getNome(),usuarios.getSenha()));
                return "redirect:/usuarios/login";
        }
        @RequestMapping(value = "/login", method = RequestMethod.POST)
        public String login(Usuarios usuarios){
                List<Usuarios> usuariosList = userService.findAll();
                System.out.println(""+usuarios.getNome());
                try{
                        for(Usuarios a: usuariosList){
                                if(usuarios.getSenha().equals(a.getSenha())
                                        && usuarios.getNome().equals(a.getNome())){
                                        return "redirect:/usuarios/home";
                                }
                        }

                }catch (Exception e) {
                        return "redirect:/usuarios/login";
                }
                return "redirect:/usuarios/login";
        }

}
