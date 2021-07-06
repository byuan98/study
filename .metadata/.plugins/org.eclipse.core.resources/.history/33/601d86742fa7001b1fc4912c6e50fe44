package mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import entity.Student;

public interface MybatisStudentMapper {
    @Select("select * from student")
    public List<Student> getAllStudent();
    
    @Select("select * from student where stuid=#{stuid}")
    public Student getOneStudentById(Integer stuid);
}
