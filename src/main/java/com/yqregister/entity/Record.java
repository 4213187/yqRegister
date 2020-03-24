package com.yqregister.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 小浩 www.404zyw.com
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Record implements Serializable {
    private Integer id;

    private String username;

    private String phone;

    private Integer action;

    private Integer siteId;

    private Date date;

    private String temperature;


}