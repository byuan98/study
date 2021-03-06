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

public class TestOne {
    public static void main(String[] args) throws FileNotFoundException {
      SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();//1、创建SqlSessionFactoryBuilder对象
 
      File file=new File("src/configure/MybatisConfigure.xml");
      SqlSessionFactory factory=builder.build(new FileInputStream(file));//2、通过SqlSessionFactoryBuilder对象(builder)获取核心配置文件，以此来创建SqlSessionFactory对象
      
      SqlSession session=factory.openSession(true);//3、通过SqlSessionFactory(factory)对象获取SqlSession(类似于Jdbc中的connection);参数可选,如果为true则为自动提交
      
      MybatisStudentMapper studentMapper=session.getMapper(MybatisStudentMapper.class);//4、获取指定接口的实现类对象
      
//      5、Mybatis会根据Mapper接口对应的SQL映射文件创建一个此接口的实现类对象来实现接口中的方法

      System.out.println(studentMapper.update(new Student(null,null,null,98.9,null)));
      System.out.println(studentMapper.getOne(1));
      
//      6、关闭SqlSession(session)
      session.close(); 
    }
}
