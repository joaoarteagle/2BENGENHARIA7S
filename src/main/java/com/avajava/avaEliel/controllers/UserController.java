package com.avajava.avaEliel.controllers;


import com.avajava.avaEliel.model.Users;
import com.avajava.avaEliel.repositories.UsersRepository;
import com.avajava.avaEliel.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    UsersService usersService;

    @GetMapping
    public List<Users> getUsers(){
        return usersService.findAll();
    }

    @PostMapping
    public Users criarUser(@RequestBody Users user){
        return usersService.save(user);

    }
}
