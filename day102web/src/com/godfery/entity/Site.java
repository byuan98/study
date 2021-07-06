package com.godfery.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Site implements Serializable{//位置表
    private Integer sitid;//教室位置id
    private String sitname;//教室名称

}
