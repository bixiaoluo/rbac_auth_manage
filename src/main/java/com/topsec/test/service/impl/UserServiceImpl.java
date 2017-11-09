package com.topsec.test.service.impl;

import com.topsec.test.mapper.UserMapper;
import com.topsec.test.model.User;
import com.topsec.test.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by jiyujing on 2017/11/9.
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper mapper;

    @Override
    public User findUserByUserName(Map map) {
        return mapper.findUserByUserName(map);
    }
}
