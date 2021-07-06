package com.godfery.entity;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Grade implements Serializable{//年级表与学生表是一对多关系
    private Integer graid;//年级id
    private String graname;//年级名称
    
//    实现1对n步骤一:定义一个集合记录多方(学生)
    private List<Student> stuList;
    
}
