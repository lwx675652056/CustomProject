package com.lwx.custom.dao;

import com.lwx.custom.entity.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Admin on 2019/7/22.
 */
@Repository("id_UserDaoMapper")
public interface UserDaoMapper {
    UserEntity findUserById(@Param("username") String username,@Param("password") String password);
}
