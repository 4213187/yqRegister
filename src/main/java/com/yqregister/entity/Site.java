package com.yqregister.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author lenovo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Site implements Serializable {
    @JSONField(ordinal = 1)
    private Integer id;
    @JSONField(ordinal = 2)
    private String name;
    @JSONField(ordinal = 3)
    private Integer provinceId;
    @JSONField(ordinal = 4)
    private Integer cityId;
    @JSONField(ordinal = 5)
    private Integer areaId;
    @JSONField(ordinal = 6)
    private String detailed;



}