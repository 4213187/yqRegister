package com.yqregister.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author 小浩 www.404zyw.com
 * @Date 2019/11/13 20:56
 * @Version 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultVo implements Serializable {
    private  boolean success;
    private  String message;

}
