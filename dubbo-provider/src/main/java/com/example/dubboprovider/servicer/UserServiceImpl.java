package com.example.dubboprovider.servicer;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getUserName(int id) {
        return "Airlan";
    }
}
