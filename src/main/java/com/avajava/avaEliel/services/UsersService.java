package com.avajava.avaEliel.services;

import com.avajava.avaEliel.model.Users;
import com.avajava.avaEliel.repositories.UsersRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @PostMapping("")
    public ResponseEntity<Users> postNewUser(@RequestBody User user){
        return new ResponseEntity<Users>();
    }

}
