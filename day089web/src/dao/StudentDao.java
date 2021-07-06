package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import entity.Student;
import mapper.MybatisStudentMapper;
import util.MybatisUtil;

public class StudentDao implements MybatisStudentMapper{

    public List<Student> getAllStudent() {//获取全部学生
        SqlSession sqlSession=new MybatisUtil().getSqlSession();
        MybatisStudentMapper studentMapper=sqlSession.getMapper(MybatisStudentMapper.class);//获取指定接口的实现类对象
        return studentMapper.getAllStudent();

    }

    public Student getOneStudentById(Integer stuid) {//按指定学号获取指定学生
        SqlSession sqlSession=new MybatisUtil().getSqlSession();
        MybatisStudentMapper studentMapper=sqlSession.getMapper(MybatisStudentMapper.class);//获取指定接口的实现类对象
        return studentMapper.getOneStudentById(stuid);
    }
    
    public static void main(String[] args) {
//        测试获取所有学生
//        new StudentDao().getAllStudent();
    }
}