package com.yqregister.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @author 小浩www.404zyw.com
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin implements Serializable {
    private Integer id;

    private String username;

    private String password;

    private Integer grade;

    private Integer siteId;


}