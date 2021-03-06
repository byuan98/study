package xml;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import entity.Student;

public interface MybatisStudentMapper {
    List<Student> getListByMinScoreSex(@Param("sex")String sx, @Param("score")Double sc);//获取大于某分数的男生/女生
}
