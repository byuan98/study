package entity;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable{
    private Integer stuid;
    private String stuname;
    private String stusex;
    private Double stuscore;
    private Date stubirthday;
//    private Integer id;
//    private String name;
//    private String sex;
//    private Double score;
//    private Date birthday;
        
}

