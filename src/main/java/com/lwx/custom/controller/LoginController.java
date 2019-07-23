package com.lwx.custom.controller;

import com.lwx.custom.entity.UserEntity;
import com.lwx.custom.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Admin on 2019/7/22.
 */
@Controller
@RequestMapping("login")
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("userlogin")
    public String userlogin(String username,String password) {
        System.out.println(username+"    "+password);
        UserEntity userEntity = userService.findUserById(username,password);
        if (userEntity != null) {
            System.out.println("111111111111     "+userEntity.toString());
            return "loginSuccess";
        } else {
            System.out.println("222222222222");
            return "loginFail";
        }
    }
}
