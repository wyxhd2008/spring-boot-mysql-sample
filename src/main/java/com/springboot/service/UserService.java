package com.springboot.service;

import com.springboot.domain.ClientUser;
import com.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface  UserService {
    public ClientUser loadUserByUsername(String username);
}
