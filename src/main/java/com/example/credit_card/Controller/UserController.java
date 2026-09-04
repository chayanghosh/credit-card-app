package com.example.credit_card.Controller;

import com.example.credit_card.Entity.UserEntity;
import com.example.credit_card.Service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/infoPage")
public class UserController {


    private UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/user")
    public void userInfo(@RequestBody UserEntity userInfo){
        userService.saveUser(userInfo);
    }
}
