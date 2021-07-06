package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Student;
import entity.Test;

public class TestOne {

    public static void main(String[] args) {
//        1、创建spring的上下文对象
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("configure/SpringConfigure.xml");
//        2、获取javabean对象
//        Student stu=(Student)context.getBean("student");
//        System.out.println(stu);
//        3、关闭context
        context.getBean("teacher");
//        Test test=(Test)context.getBean("test");
//        System.out.println(test);
        context.close();
    }
}
