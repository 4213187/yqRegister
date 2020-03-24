package com.yqregister.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @Author 小浩
 * @Date 2020/3/21 23:03
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupRecord implements Serializable {
    private Integer id;

    private String username;

    private String phone;

    private Integer action;

    private String siteId;

    private Date date;

    private String temperature;

    private String name;

    private Timestamp beginDate;

    private Timestamp endDate;
}
