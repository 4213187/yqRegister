package com.yqregister.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author 小浩
 * @Date 2020/3/21 16:55
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupAdmin implements Serializable {
    private Integer id;

    private String username;

    private String password;

    private Integer grade;

    private Integer siteId;

    private String name;

    private Integer provinceId;

    private Integer cityId;

    private Integer areaId;

    private String detailed;
}
