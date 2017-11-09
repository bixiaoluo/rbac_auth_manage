package com.topsec.test.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class User {
    private String id;

    private String userName;

    private String accout;

    private String password;

    private Integer sex;

    private Integer tel;

    private String email;

    private Date createTime;

    private String creater;

    private Date updateTime;

    private String updater;

    private Integer del;

    private List<Role> roles;

}