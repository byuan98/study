package cn.godfery.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
public class Student implements Serializable{
    private Integer stuId; //学号
    private String stuName; //姓名
    private String stuSex; //性别
    private Integer stuAge; //年龄
    private Double stuScore; //分数
   
}
