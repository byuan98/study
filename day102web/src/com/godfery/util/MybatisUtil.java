package com.godfery.util;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {
    private static SqlSessionFactory factory;
    
    static {
        try {
            InputStream in=Resources.getResourceAsStream("com/godfery/config/MybatisConfig.xml");//读取src下的指定文件
            factory = new SqlSessionFactoryBuilder().build(in);//通过SqlSessionFactoryBuilder对象(builder)获取核心配置文件，以此来创建SqlSessionFactory对象
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    
    public static SqlSession getSqlSession() {
        return factory.openSession(true);
    }
    
    public static void main(String[] args) {
        System.out.println(getSqlSession());
    }
}
