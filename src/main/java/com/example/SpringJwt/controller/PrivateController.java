package com.example.SpringJwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Akash Deep
 **/

@RestController
public class PrivateController {

    @GetMapping
    public String getMessage(){
        return "Hello from private API controller";
    }
}
