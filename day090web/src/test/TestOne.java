package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import entity.Student;

public class TestOne {

    public static void main(String[] args) {
//        1、创建spring的上下文对象
//        使用ClassPathXmlApplicationContext读取配置文件时,相对路径是src
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("configure/SpringConfigure.xml");

//        2、获取javabean对象
        Student stu1=(Student)context.getBean("stu1");
        System.out.println("stu1::"+stu1);
        Student stu2=(Student)context.getBean("stu2");
        System.out.println("stu2::"+stu2);
        Student stu3=(Student)context.getBean("stu3");
        System.out.println("stu3::"+stu3);
        
//        3、关闭context
        context.close();

    }
}

