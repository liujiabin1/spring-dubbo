package com.example.dubboprovider.servicer;

import com.alibaba.dubbo.config.annotation.Service;

@Service(version = "1.0.0" ,group = "test",interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {

    @Override
    public String getUserName(int id) {
        return "Airlan";
    }
}
