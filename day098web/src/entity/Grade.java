package entity;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Grade implements Serializable{//年级表
    private Integer graid;//年级id
    private String graname;//年级名称(大一,大二,大三,大四)
//    年级表与学生表是一对多关系
    private List<Student> stuList;
}
