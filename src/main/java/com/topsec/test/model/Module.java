package com.topsec.test.model;

import lombok.Data;

import java.util.Date;
@Data
public class Module {
    private String id;

    private String moduleName;

    private String value;

    private String type;

    private String url;

    private String parentId;

    private Date createTime;

    private String creater;

    private Date updateTime;

    private String updater;

}