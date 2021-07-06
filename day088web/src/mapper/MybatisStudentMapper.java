package mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import entity.Student;

public interface MybatisStudentMapper {
    @Select("select * from student where stuid=#{stuid}")
    Student getOne(Integer stuid);
    
    @Update("update student set stuscore=#{stuscore}")
    Integer update(Student stu);
    
    List<Student> getListByMinScoreSex(@Param("sex")String sx, @Param("score")Double sc);//获取大于某分数的男生/女生
}
