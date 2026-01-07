package com.user.services.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/api/test/")
public class UserController {
    //endpoint http://localhost:2222/user/api/test/message
    @GetMapping("message")
    public String getMessage(){
        return "this is user services part of microservoes ..";
    }

   // http://localhost:2222/user/api/test/get for spring booot port
   // http://localhost:8081/user/api/test/get for docker  port
    @GetMapping("get")
    public String setMessage(){
        return "this is user services part of microservoes from 2..";
    }
    //endpoint http://localhost:2222/user/api/test/one
    @GetMapping("one")
    public String testOne(){


        return "1";
    }
}
