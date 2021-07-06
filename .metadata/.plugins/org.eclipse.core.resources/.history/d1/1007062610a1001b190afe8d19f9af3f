package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {
    public static SqlSession getSqlSession() {
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();//1、创建SqlSessionFactoryBuilder对象
        
        File file=new File("src/configure/MybatisConfigure.xml");
        SqlSessionFactory factory;
        try {
            factory = builder.build(new FileInputStream(file));//2、通过SqlSessionFactoryBuilder对象(builder)获取核心配置文件，以此来创建SqlSessionFactory对象
        } catch (FileNotFoundException e) {
            throw new RuntimeException();
        }
        SqlSession sqlSession=factory.openSession(true);//3、通过SqlSessionFactory(factory)对象获取SqlSession(类似于Jdbc中的connection);参数可选,如果为true则为自动提交
        return sqlSession;
    }
}
