package com.springboot.controller;

import com.springboot.domain.ClientUser;
import com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@EnableAutoConfiguration
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserByLoginName/{loginName}")
    @ResponseBody
    public Map<String,Object> getUserByName(@PathVariable String loginName){
        Map<String,Object> result = new HashMap<String, Object>();
        ClientUser user = userService.loadUserByUsername(loginName);
        result.put("name", user.getUsername());
        result.put("loginName", user.getAccessToken());
        return result;
    }

}
