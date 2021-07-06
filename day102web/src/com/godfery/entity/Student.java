package com.godfery.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable{
    private Integer stuid;//学生id
    private String stuname;//学生姓名
    private Integer graid;//年级id
    
//    实现n对1步骤一:定义引用记录一的一方
    private Grade grade;
    
}
