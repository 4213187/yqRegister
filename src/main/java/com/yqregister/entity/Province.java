package com.yqregister.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Province implements Serializable {
    private Integer id;

    private String provinceid;

    private String province;


}