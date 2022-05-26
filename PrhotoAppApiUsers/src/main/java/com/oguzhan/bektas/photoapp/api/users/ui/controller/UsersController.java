package com.oguzhan.bektas.photoapp.api.users.ui.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {

    @GetMapping("/status/check")
    public ResponseEntity<?> status(){
        return ResponseEntity.ok("Working");
    }

}
