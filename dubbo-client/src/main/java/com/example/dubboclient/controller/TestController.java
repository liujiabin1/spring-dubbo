package com.example.dubboclient.controller;

import com.example.dubboprovider.servicer.UserService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Reference
    private UserService userService;

    @RequestMapping("/test")
   public String test() {
       return userService.getUserName(1);
   }

}
