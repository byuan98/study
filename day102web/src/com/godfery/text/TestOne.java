package com.godfery.text;

import org.apache.ibatis.session.SqlSession;

import com.godfery.mapper.MybatisCommunityMapper;
import com.godfery.mapper.MybatisGradeMapper;
import com.godfery.mapper.MybatisStudentMapper;
import com.godfery.util.MybatisUtil;


public class TestOne {
    public static void main(String[] args) {
        SqlSession sqlSession=MybatisUtil.getSqlSession();
        MybatisCommunityMapper mybatisGradeMapper=sqlSession.getMapper(MybatisCommunityMapper.class);
        System.out.println(mybatisGradeMapper.getAllCommunity());
    }
}
