package com5.example.socialmedia.controller;

import com5.example.socialmedia.Service.UserService;
import com5.example.socialmedia.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }
    @GetMapping
    public List<User> retrieveUsers(){
        return userService.getUsers();
    }
    @GetMapping("/{id}")
    public User retrieveUser(@PathVariable int id){
        return userService.findOne(id);
    }
    @PostMapping()
    public ResponseEntity<User> createUse(@RequestBody User user){
        User savedUser = userService.addUser(user);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();
        return ResponseEntity.created(uri).build();
    }
}
