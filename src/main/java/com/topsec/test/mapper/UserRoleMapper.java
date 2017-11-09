package com.topsec.test.mapper;

import com.topsec.test.model.UserRole;

public interface UserRoleMapper {
    int insert(UserRole record);

    int insertSelective(UserRole record);
}