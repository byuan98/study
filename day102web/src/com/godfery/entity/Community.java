package com.godfery.entity;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Community implements Serializable{
    private Integer comid;//社团id
    private String comname;//社团名称
    
//    n对n解决方案:定义一个集合记录此社团的所有社员
    private List<Student> stuList;

}
