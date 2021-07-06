package com.godfery.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.godfery.entity.Student;

public interface MybatisStudentMapper {
    
    @Select("select * from student")
    public List<Student> getAllStudent();
    
    public Student getOneStudentByid(Integer stuid);
}
