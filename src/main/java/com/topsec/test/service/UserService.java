package com.topsec.test.service;

import com.topsec.test.model.User;

import java.util.Map;

/**
 * Created by jiyujing on 2017/11/9.
 */
public interface UserService {
    //根据条件查询用户信息
    User findUserByUserName(Map map);
}
