package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Student;
import entity.StudentInter;

public class TestOne {

    public static void main(String[] args) {
//        创建spring的上下文对象
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("configure/SpringConfigure.xml");

        StudentInter si=(StudentInter)context.getBean("student");
        si.study();
        si.add(10.0, 23.0);
        si.sleep();
  
//        关闭context
        context.close();
    }
}
