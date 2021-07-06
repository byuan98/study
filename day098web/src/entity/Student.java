package entity;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable{//学生表
    private Integer stuid;//学生id
    private String stuname;//学生姓名
    private String graid;//所在年级id
    
    
}

