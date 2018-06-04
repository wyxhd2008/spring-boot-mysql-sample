package com.springboot.service.impl;

import com.springboot.domain.ClientUser;
import com.springboot.repository.UserRepository;
import com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository users;

    public ClientUser loadUserByUsername(String username) {
        Optional<ClientUser> optionalUser = users.findByUsername(username);
        return optionalUser.get();
    }
}
