package com.beboldervacation.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludo")
public class holaController {

    @GetMapping("/hola")
    public String saludo(){
        return "Hola andres";
    }
}
