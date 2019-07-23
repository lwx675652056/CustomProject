package com.lwx.custom.service;

import com.lwx.custom.dao.UserDaoMapper;
import com.lwx.custom.entity.UserEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Admin on 2019/7/22.
 */
@Service("id_UserServiceImpl")
public class UserService {

    @Resource
    private UserDaoMapper userDaoMapper;

    public UserEntity findUserById(String username,String password) {
        System.out.println("UserService.findUserById");
        return userDaoMapper.findUserById(username,password);
    }
}
