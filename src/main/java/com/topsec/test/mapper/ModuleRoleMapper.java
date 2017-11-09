package com.topsec.test.mapper;

import com.topsec.test.model.ModuleRole;

public interface ModuleRoleMapper {
    int insert(ModuleRole record);

    int insertSelective(ModuleRole record);
}