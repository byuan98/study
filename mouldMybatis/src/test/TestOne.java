package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import entity.Student;
import mapper.MybatisStudentMapper;
import util.MybatisUtil;

public class TestOne {
    public static void main(String[] args) throws FileNotFoundException {
        SqlSession sqlSession=new MybatisUtil().getSqlSession();
        MybatisStudentMapper studentMapper=sqlSession.getMapper(MybatisStudentMapper.class);//获取指定接口的实现类对象
        studentMapper.getAllStudent();
        studentMapper.getOneStudentById(1);
    }
}
