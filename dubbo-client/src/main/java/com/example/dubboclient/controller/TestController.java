package com.example.dubboclient.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubboprovider.servicer.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Reference(version = "1.0.0" ,group = "test",interfaceClass = UserService.class)
    private UserService userService;

    @RequestMapping("/test")
   public String test() {
       return userService.getUserName(1);
   }

}
