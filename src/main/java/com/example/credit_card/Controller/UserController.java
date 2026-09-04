package com.example.credit_card.Controller;

import com.example.credit_card.Entity.UserEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/infoPage")
public class UserController {

    private UserEntity userEntity;
    public UserController(UserEntity userEntity){
        this.userEntity = userEntity;
    }

    @PostMapping("/user")
    public void userInfo(@RequestBody UserEntity userInfo){

    }
}
