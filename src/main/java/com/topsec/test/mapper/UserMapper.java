package com.topsec.test.mapper;

import com.topsec.test.model.User;

import java.util.Map;

public interface UserMapper {
    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    //根据条件查询用户信息
    User findUserByUserName(Map map);
}