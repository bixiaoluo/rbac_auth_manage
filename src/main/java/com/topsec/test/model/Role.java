package com.topsec.test.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Role {
    private String id;

    private String roleName;

    private String description;

    private Date createTime;

    private String creater;

    private Date updateTime;

    private String updater;

    private List<User> users;

}