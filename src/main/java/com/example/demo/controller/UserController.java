package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {
    @GetMapping(value = "/getUser")
    public String getUser() {
        return "Simple-Root";
    }

    @PostMapping (value = "/saveUser")
    public String saveUser() {
        return "User-Saved";
    }

    @PutMapping(value = "/updateUser")
    public String updateUser() {
        return "User-Updated";
    }

    @DeleteMapping(value = "/deleteUser")
    public String deleteUser() {
        return "User-Deleted";
    }

}
