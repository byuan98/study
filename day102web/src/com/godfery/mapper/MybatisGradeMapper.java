package com.godfery.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

import com.godfery.entity.Grade;

public interface MybatisGradeMapper {
    public List<Grade> getAllGrade();
    
    public Grade getGradeByGraid(Integer graid);
}
